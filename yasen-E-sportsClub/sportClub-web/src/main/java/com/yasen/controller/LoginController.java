package com.yasen.controller;

import com.yasen.entity.result.ResultVo;
import com.yasen.entity.vo.LoginDTO;
import com.yasen.entity.vo.WxLoginDTO;
import com.yasen.service.AuthService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器（统一处理PC登录和微信小程序登录）
 */
@RestController
@RequestMapping("/auth")
public class LoginController {

	@Resource
	private AuthService authService;

	/**
	 * PC端登录（用户名+密码+图形验证码）
	 * 支持三种角色登录：admin（管理员）、booster（打手）、user（普通用户）
	 *
	 * @param loginDTO 登录参数（userName, password, captchaCode, captchaKey, roleKey）
	 * @return JWT Token和用户信息
	 */
	@PostMapping("/pc/login")
	public ResultVo pcLogin(@RequestBody LoginDTO loginDTO) {
		return authService.pcLogin(loginDTO);
	}

	/**
	 * 微信小程序登录
	 * 小程序端调用wx.login获取code，传给后端换取JWT Token
	 *
	 * @param wxLoginDTO 微信登录参数（code, nickName, avatarUrl）
	 * @return JWT Token和用户信息
	 */
	@PostMapping("/wx/login")
	public ResultVo wxLogin(@RequestBody WxLoginDTO wxLoginDTO) {
		return authService.wxLogin(wxLoginDTO);
	}

	/**
	 * 获取当前登录用户信息（测试用）
	 */
	@GetMapping("/info")
	public ResultVo getUserInfo(@RequestAttribute("userId") Integer userId,
								@RequestAttribute("userName") String userName,
								@RequestAttribute("roleKey") String roleKey) {
		java.util.Map<String, Object> info = new java.util.HashMap<>();
		info.put("userId", userId);
		info.put("userName", userName);
		info.put("roleKey", roleKey);
		return ResultVo.Ok(info);
	}
}
