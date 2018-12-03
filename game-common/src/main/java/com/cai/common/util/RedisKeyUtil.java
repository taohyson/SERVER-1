package com.cai.common.util;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年10月30日 下午4:44:00 <br/>
 */
public final class RedisKeyUtil {

	/**
	 * 
	 * @param clubId
	 * @param ruleId
	 * @return
	 */
	public static String clubRoomKey(int clubId, int ruleId) {
		return String.format("CLUB:%d:%d", clubId, ruleId);
	}

	/**
	 * 
	 * @param roomId
	 * @param index
	 * @return
	 */
	public static String clubRoomFiled(int roomId, int index) {
		return String.format("%d-%d", roomId, index);
	}

	/**
	 * 绑定
	 * 
	 * @param phone
	 * @param identifyCode
	 * @return
	 */
	public static String phoneBind(String phone) {
		return String.join(":", "phone:bind", phone);
	}

	/**
	 * 解绑
	 * 
	 * @param phone
	 * @param identifyCode
	 * @return
	 */
	public static String phoneUnBind(String phone) {
		return String.join(":", "phone:unbind", phone);
	}

	/**
	 * 登陆
	 * 
	 * @param phone
	 * @param identifyCode
	 * @return
	 */
	public static String phoneLogin(String phone) {
		return String.join(":", "phone:login", phone);
	}

	/**
	 * 俱乐部解散验证码
	 * 
	 * @param phone
	 * @return
	 */
	public static String phoneClubDisband(String phone) {
		return String.join(":", "phone:club:disband", phone);
	}

	/**
	 * 俱乐部转让
	 * 
	 * @param phone
	 * @return
	 */
	public static String phoneClubAssignment(String phone) {
		return String.join(":", "phone:club:transfer", phone);
	}
	
	/**
	 * 背包物品使用
	 * 
	 */
	public static String itemUse(String phone) {
		return String.join(":", "phone:item:use", phone);
	}

	private RedisKeyUtil() {
	}
}
