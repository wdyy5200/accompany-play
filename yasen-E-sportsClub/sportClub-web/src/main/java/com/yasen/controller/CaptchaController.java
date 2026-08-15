package com.yasen.controller;

import com.yasen.entity.result.ResultVo;
import com.yasen.entity.vo.CaptchaVO;
import com.yasen.service.AuthService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码控制器
 */
@RestController
@RequestMapping("/auth")
public class CaptchaController {

	@Resource
	private AuthService authService;

	/**
	 * 获取图形验证码
	 * 返回验证码key和Base64编码的图片
	 *
	 * @return captchaKey（登录时需要传回）和 captchaImg（Base64图片，直接用于img标签src）
	 */
	@GetMapping("/captcha")
	public ResultVo getCaptcha() {
		CaptchaVO captchaVO = authService.getCaptcha();
		return ResultVo.Ok(captchaVO);
	}
}
