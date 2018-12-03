/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

/**
 * @author wu_hc date: 2018/9/14 17:48 <br/>
 */
public final class FraudUtil {

	private static String ciphertext = "***";

	public static String getCiphertext() {
		return ciphertext;
	}

	public static void setCiphertext(String ciphertext) {
		FraudUtil.ciphertext = ciphertext;
	}

	private FraudUtil() {
	}

}
