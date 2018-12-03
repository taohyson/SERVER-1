package com.cai.common.util;

import java.util.regex.Pattern;

import com.google.common.base.Strings;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月8日 上午11:49:58 <br/>
 */
public final class MobileUtil {

	static final String DEFAULT = "00000000000";

	/**
	 * 正则表达式：验证手机号
	 */
	// public static final String REGEX_MOBILE = "^1[3|4|5|7|8][0-9]{9}$"; //
	public static final String REGEX_MOBILE = "^1[0-9]{10}$";

	static final Pattern p = Pattern.compile(REGEX_MOBILE);

	/**
	 * 是否有效
	 * 
	 * @param mobile
	 * @return
	 */
	public static boolean isValid(String mobile) {
		return p.matcher(mobile).matches();
	}

	/**
	 * 判断是不是手机为默认状态
	 * 
	 * @param mobile
	 * @return
	 */
	public static boolean isMobileNull(String mobile) {
		return Strings.isNullOrEmpty(mobile) || DEFAULT.equals(mobile);
	}

	/**
	 * 验证码
	 * @param mobile
	 * @param identifyCode
	 * @param type
	 * @return
	 */
	public static boolean identifyCodeVaild(String mobile, String identifyCode, int type) {
		return false;
	}
}
