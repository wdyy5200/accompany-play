package com.yasen.utils;

import com.wf.captcha.SpecCaptcha;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 图形验证码工具类
 * 使用内存存储验证码（生产环境建议改用Redis）
 */
public class CaptchaUtil {

	/** 验证码存储（key -> code），有效期5分钟 */
	private static final ConcurrentHashMap<String, CaptchaEntry> CAPTCHA_CACHE = new ConcurrentHashMap<>();

	/** 验证码有效期：5分钟 */
	private static final long CAPTCHA_EXPIRE_MS = 5 * 60 * 1000L;

	/**
	 * 生成验证码，返回captchaKey和Base64图片
	 *
	 * @return String[]{captchaKey, base64Img}
	 */
	public static String[] generate() {
		SpecCaptcha captcha = new SpecCaptcha(130, 48, 4);
		String code = captcha.text().toLowerCase();
		String base64 = captcha.toBase64();

		String key = StringTools.getRandomString(32);

		// 存入缓存
		CAPTCHA_CACHE.put(key, new CaptchaEntry(code, System.currentTimeMillis() + CAPTCHA_EXPIRE_MS));

		// 定期清理过期验证码
		cleanExpired();

		return new String[]{key, base64};
	}

	/**
	 * 校验验证码（校验后立即删除，防止重复使用）
	 *
	 * @param key  验证码key
	 * @param code 用户输入的验证码
	 * @return 是否匹配
	 */
	public static boolean verify(String key, String code) {
		if (StringTools.isEmpty(key) || StringTools.isEmpty(code)) {
			return false;
		}
		CaptchaEntry entry = CAPTCHA_CACHE.remove(key);
		if (entry == null) {
			return false;
		}
		// 检查是否过期
		if (System.currentTimeMillis() > entry.expireTime) {
			return false;
		}
		return entry.code.equalsIgnoreCase(code.trim());
	}

	/**
	 * 清理过期的验证码
	 */
	private static void cleanExpired() {
		long now = System.currentTimeMillis();
		CAPTCHA_CACHE.entrySet().removeIf(entry -> now > entry.getValue().expireTime);
	}

	/**
	 * 验证码缓存条目
	 */
	private static class CaptchaEntry {
		final String code;
		final long expireTime;

		CaptchaEntry(String code, long expireTime) {
			this.code = code;
			this.expireTime = expireTime;
		}
	}
}
