package com.yasen.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JWT工具类
 */
public class JwtUtil {

	/** 默认密钥（生产环境建议通过配置文件注入） */
	private static final String DEFAULT_SECRET = "yasen-esports-club-jwt-secret-key-2026-must-be-at-least-256-bits";

	/** 默认过期时间：24小时 */
	private static final long DEFAULT_EXPIRATION = 24 * 60 * 60 * 1000L;

	private static SecretKey getSecretKey(String secret) {
		return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
	}

	/**
	 * 生成JWT Token
	 *
	 * @param userId     用户ID
	 * @param userName   用户名
	 * @param roleKey    角色标识
	 * @param secret     密钥
	 * @param expiration 过期时间（毫秒）
	 * @return token字符串
	 */
	public static String generateToken(Integer userId, String userName, String roleKey,
										String secret, long expiration) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("userId", userId);
		claims.put("userName", userName);
		claims.put("roleKey", roleKey);

		Date now = new Date();
		Date expireDate = new Date(now.getTime() + expiration);

		return Jwts.builder()
				.claims(claims)
				.subject(userName)
				.issuedAt(now)
				.expiration(expireDate)
				.signWith(getSecretKey(secret))
				.compact();
	}

	/**
	 * 使用默认密钥和过期时间生成Token
	 */
	public static String generateToken(Integer userId, String userName, String roleKey, String secret) {
		return generateToken(userId, userName, roleKey, secret, DEFAULT_EXPIRATION);
	}

	/**
	 * 解析Token，获取Claims
	 *
	 * @param token  token字符串
	 * @param secret 密钥
	 * @return Claims对象
	 */
	public static Claims parseToken(String token, String secret) {
		return Jwts.parser()
				.verifyWith(getSecretKey(secret))
				.build()
				.parseSignedClaims(token)
				.getPayload();
	}

	/**
	 * 从Token中获取用户ID
	 */
	public static Integer getUserId(String token, String secret) {
		Claims claims = parseToken(token, secret);
		return claims.get("userId", Integer.class);
	}

	/**
	 * 从Token中获取用户名
	 */
	public static String getUserName(String token, String secret) {
		Claims claims = parseToken(token, secret);
		return claims.getSubject();
	}

	/**
	 * 从Token中获取角色标识
	 */
	public static String getRoleKey(String token, String secret) {
		Claims claims = parseToken(token, secret);
		return claims.get("roleKey", String.class);
	}

	/**
	 * 验证Token是否有效（未过期且签名正确）
	 */
	public static boolean validateToken(String token, String secret) {
		try {
			parseToken(token, secret);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
