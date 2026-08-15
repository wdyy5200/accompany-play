package com.yasen.service;

import com.yasen.entity.result.ResultVo;
import com.yasen.entity.vo.CaptchaVO;
import com.yasen.entity.vo.LoginDTO;
import com.yasen.entity.vo.WxLoginDTO;

/**
 * 认证服务接口
 */
public interface AuthService {

	/**
	 * 获取图形验证码
	 * @return 验证码key和Base64图片
	 */
	CaptchaVO getCaptcha();

	/**
	 * PC端登录（用户名+密码+图形验证码）
	 * @param loginDTO 登录参数
	 * @return 包含JWT Token的登录结果
	 */
	ResultVo pcLogin(LoginDTO loginDTO);

	/**
	 * 微信小程序登录
	 * @param wxLoginDTO 微信登录参数（含code）
	 * @return 包含JWT Token的登录结果
	 */
	ResultVo wxLogin(WxLoginDTO wxLoginDTO);
}
