package com.yasen.service.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.yasen.entity.enums.ResponseCodeEnum;
import com.yasen.entity.pojo.TbRole;
import com.yasen.entity.pojo.TbUser;
import com.yasen.entity.result.ResultVo;
import com.yasen.entity.vo.CaptchaVO;
import com.yasen.entity.vo.LoginDTO;
import com.yasen.entity.vo.TokenVO;
import com.yasen.entity.vo.WxLoginDTO;
import com.yasen.exception.BusinessException;
import com.yasen.mappers.TbUserMapper;
import com.yasen.service.AuthService;
import com.yasen.service.TbRoleService;
import com.yasen.utils.CaptchaUtil;
import com.yasen.utils.JwtUtil;
import com.yasen.utils.StringTools;
import jakarta.annotation.Resource;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 认证服务实现
 */
@Service("authService")
public class AuthServiceImpl implements AuthService {

	private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

	@Resource
	private TbUserMapper<TbUser, Object> tbUserMapper;

	@Resource
	private TbRoleService tbRoleService;

	@Value("${jwt.secret:yasen-esports-club-jwt-secret-key-2026-must-be-at-least-256-bits}")
	private String jwtSecret;

	@Value("${jwt.expiration:86400000}")
	private long jwtExpiration;

	@Value("${wechat.mini.appid:}")
	private String wxAppId;

	@Value("${wechat.mini.secret:}")
	private String wxAppSecret;

	private final OkHttpClient httpClient = new OkHttpClient();

	@Override
	public CaptchaVO getCaptcha() {
		String[] result = CaptchaUtil.generate();
		return new CaptchaVO(result[0], result[1]);
	}

	@Override
	public ResultVo pcLogin(LoginDTO loginDTO) {
		// 1. 参数校验
		if (StringTools.isEmpty(loginDTO.getUserName()) || StringTools.isEmpty(loginDTO.getPassword())) {
			return ResultVo.error(ResponseCodeEnum.CODE_600);
		}
		if (StringTools.isEmpty(loginDTO.getCaptchaCode()) || StringTools.isEmpty(loginDTO.getCaptchaKey())) {
			return ResultVo.error(ResponseCodeEnum.CODE_600);
		}

		// 2. 校验图形验证码
		if (!CaptchaUtil.verify(loginDTO.getCaptchaKey(), loginDTO.getCaptchaCode())) {
			return ResultVo.error(ResponseCodeEnum.CODE_602);
		}

		// 3. 查询用户
		TbUser user = tbUserMapper.selectByUserName(loginDTO.getUserName());
		if (user == null) {
			return ResultVo.error(ResponseCodeEnum.CODE_603);
		}

		// 4. 校验密码（SHA-256加盐）
		String inputPassword = DigestUtils.sha256Hex(loginDTO.getPassword() + user.getUserName());
		if (!inputPassword.equals(user.getPassword())) {
			return ResultVo.error(ResponseCodeEnum.CODE_603);
		}

		// 5. 检查账号状态
		if ("0".equals(user.getStatus())) {
			return ResultVo.error(ResponseCodeEnum.CODE_604);
		}

		// 6. 如果指定了角色，校验用户是否有该角色
		String roleKey = loginDTO.getRoleKey();
		if (!StringTools.isEmpty(roleKey)) {
			List<TbRole> roles = tbRoleService.findRolesByUserId(user.getId());
			boolean hasRole = roles.stream().anyMatch(r -> roleKey.equals(r.getRoleKey()));
			if (!hasRole) {
				return new ResultVo(ResponseCodeEnum.CODE_403.getCode(), "该用户没有" + roleKey + "角色权限", null);
			}
		}

		// 7. 获取用户角色信息
		List<TbRole> roles = tbRoleService.findRolesByUserId(user.getId());
		String primaryRoleKey = "user";
		String primaryRoleName = "普通用户";
		if (!roles.isEmpty()) {
			// 如果指定了roleKey，使用指定的；否则使用第一个角色
			if (!StringTools.isEmpty(roleKey)) {
				primaryRoleKey = roleKey;
				primaryRoleName = roles.stream()
						.filter(r -> roleKey.equals(r.getRoleKey()))
						.map(TbRole::getRoleName)
						.findFirst().orElse(primaryRoleName);
			} else {
				primaryRoleKey = roles.get(0).getRoleKey();
				primaryRoleName = roles.get(0).getRoleName();
			}
		}

		// 8. 更新最后登录时间
		TbUser updateUser = new TbUser();
		updateUser.setLastLoginTime(new Date());
		tbUserMapper.updateById(updateUser, user.getId());

		// 9. 生成JWT Token
		String token = JwtUtil.generateToken(user.getId(), user.getUserName(), primaryRoleKey, jwtSecret, jwtExpiration);

		// 10. 构建返回结果
		TokenVO tokenVO = new TokenVO();
		tokenVO.setToken(token);
		tokenVO.setUserId(user.getId());
		tokenVO.setUserName(user.getUserName());
		tokenVO.setRoleName(user.getRoleName());
		tokenVO.setRoleKey(primaryRoleKey);
		tokenVO.setRoleNameDisplay(primaryRoleName);
		tokenVO.setAvatar(user.getOpenImg());

		return ResultVo.Ok(tokenVO);
	}

	@Override
	public ResultVo wxLogin(WxLoginDTO wxLoginDTO) {
		// 1. 参数校验
		if (StringTools.isEmpty(wxLoginDTO.getCode())) {
			return ResultVo.error(ResponseCodeEnum.CODE_600);
		}

		// 2. 调用微信code2Session接口
		String url = String.format(
				"https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code",
				wxAppId, wxAppSecret, wxLoginDTO.getCode()
		);

		String responseBody;
		try {
			Request request = new Request.Builder().url(url).get().build();
			try (Response response = httpClient.newCall(request).execute()) {
				if (response.body() == null) {
					return new ResultVo(ResponseCodeEnum.CODE_605.getCode(), "微信接口返回为空", null);
				}
				responseBody = response.body().string();
			}
		} catch (IOException e) {
			logger.error("调用微信code2Session接口失败", e);
			return new ResultVo(ResponseCodeEnum.CODE_605.getCode(), "调用微信接口失败: " + e.getMessage(), null);
		}

		// 3. 解析微信返回
		JSONObject wxResult = JSON.parseObject(responseBody);
		if (wxResult.containsKey("errcode") && wxResult.getIntValue("errcode") != 0) {
			String errmsg = wxResult.getString("errmsg");
			logger.error("微信登录失败: {}", errmsg);
			return new ResultVo(ResponseCodeEnum.CODE_605.getCode(), "微信登录失败: " + errmsg, null);
		}

		String openId = wxResult.getString("openid");
		String sessionKey = wxResult.getString("session_key");

		if (StringTools.isEmpty(openId)) {
			return new ResultVo(ResponseCodeEnum.CODE_605.getCode(), "微信登录失败：未获取到openId", null);
		}

		// 4. 根据openId查找用户
		TbUser user = tbUserMapper.selectByOpenId(openId);

		// 5. 如果用户不存在，自动注册
		if (user == null) {
			user = new TbUser();
			user.setOpenId(openId);
			user.setUserName("wx_" + openId.substring(0, Math.min(8, openId.length())) + System.currentTimeMillis() % 10000);
			user.setRoleName(StringTools.isEmpty(wxLoginDTO.getNickName()) ? "微信用户" : wxLoginDTO.getNickName());
			user.setOpenImg(wxLoginDTO.getAvatarUrl());
			user.setStatus("1");
			user.setCreateTime(String.valueOf(new Date().getTime()));
			user.setLastLoginTime(new Date());
			// 密码设为随机值（微信用户不使用密码登录）
			user.setPassword(DigestUtils.sha256Hex(openId + System.currentTimeMillis()));

			tbUserMapper.insert(user);

			// 默认分配普通用户角色（role_id=1）
			// 注意：这里需要直接操作tb_user_role表，可以通过TbUserRoleService
		} else {
			// 6. 更新用户信息和登录时间
			TbUser updateUser = new TbUser();
			updateUser.setLastLoginTime(new Date());
			if (!StringTools.isEmpty(wxLoginDTO.getNickName())) {
				updateUser.setRoleName(wxLoginDTO.getNickName());
			}
			if (!StringTools.isEmpty(wxLoginDTO.getAvatarUrl())) {
				updateUser.setOpenImg(wxLoginDTO.getAvatarUrl());
			}
			tbUserMapper.updateById(updateUser, user.getId());
		}

		// 7. 获取用户角色
		List<TbRole> roles = tbRoleService.findRolesByUserId(user.getId());
		String roleKey = "user";
		String roleNameDisplay = "普通用户";
		if (!roles.isEmpty()) {
			roleKey = roles.get(0).getRoleKey();
			roleNameDisplay = roles.get(0).getRoleName();
		}

		// 8. 生成JWT Token
		String token = JwtUtil.generateToken(user.getId(), user.getUserName(), roleKey, jwtSecret, jwtExpiration);

		// 9. 构建返回结果
		TokenVO tokenVO = new TokenVO();
		tokenVO.setToken(token);
		tokenVO.setUserId(user.getId());
		tokenVO.setUserName(user.getUserName());
		tokenVO.setRoleName(user.getRoleName());
		tokenVO.setRoleKey(roleKey);
		tokenVO.setRoleNameDisplay(roleNameDisplay);
		tokenVO.setAvatar(user.getOpenImg());

		return ResultVo.Ok(tokenVO);
	}
}
