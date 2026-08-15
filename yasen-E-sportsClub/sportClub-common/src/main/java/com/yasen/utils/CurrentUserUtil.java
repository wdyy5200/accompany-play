package com.yasen.utils;

/**
 * 当前登录用户信息工具类（基于ThreadLocal）
 */
public class CurrentUserUtil {

	private static final ThreadLocal<CurrentUser> currentUser = new ThreadLocal<>();

	public static void set(Integer userId, String userName, String roleKey) {
		currentUser.set(new CurrentUser(userId, userName, roleKey));
	}

	public static CurrentUser get() {
		return currentUser.get();
	}

	public static Integer getUserId() {
		CurrentUser user = currentUser.get();
		return user != null ? user.getUserId() : null;
	}

	public static String getUserName() {
		CurrentUser user = currentUser.get();
		return user != null ? user.getUserName() : null;
	}

	public static String getRoleKey() {
		CurrentUser user = currentUser.get();
		return user != null ? user.getRoleKey() : null;
	}

	public static void remove() {
		currentUser.remove();
	}

	/**
	 * 当前用户信息
	 */
	public static class CurrentUser {
		private final Integer userId;
		private final String userName;
		private final String roleKey;

		public CurrentUser(Integer userId, String userName, String roleKey) {
			this.userId = userId;
			this.userName = userName;
			this.roleKey = roleKey;
		}

		public Integer getUserId() {
			return userId;
		}

		public String getUserName() {
			return userName;
		}

		public String getRoleKey() {
			return roleKey;
		}
	}
}
