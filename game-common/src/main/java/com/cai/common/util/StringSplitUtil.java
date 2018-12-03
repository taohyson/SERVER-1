package com.cai.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/9/10 14:43
 */
public class StringSplitUtil {

	/**
	 * 日志
	 */
	private static final Logger logger = LoggerFactory.getLogger(StringSplitUtil.class);

	private static final int[] EMPTY_INT_ARR = new int[0];

	private static final int[][] EMPTY_INT_ARR2 = new int[0][0];

	public static int[][] splitToInt2(String data) {
		return splitToInt2(data, "\\|", ",");
	}

	public static int[][] splitToInt2(String data, String spStr1, String spStr2) {
		if (data == null || data.trim().length() == 0)
			return EMPTY_INT_ARR2;

		try {
			String[] strs = data.split(spStr1);
			int len = splitToInt(strs[0], spStr2).length;
			int[][] result = new int[strs.length][len];
			for (int i = 0; i < strs.length; i++) {
				result[i] = splitToInt(strs[i], spStr2);
				if (result[i] == null) {
					return null; // 解析错误
				}
			}
			return result;
		} catch (Exception e) {
			logger.error("splitToInt2 error ", e);
			return EMPTY_INT_ARR2;
		}
	}

	/**
	 * 默认逗号分隔，可自定义分隔
	 */
	public static int[] splitToInt(String str, String spStr) {
		if (str == null || str.trim().length() == 0)
			return EMPTY_INT_ARR;

		try {
			String[] temps = str.split(spStr);
			int len = temps.length;
			int[] results = new int[len];
			for (int i = 0; i < len; i++) {
				results[i] = Integer.parseInt(temps[i].trim());
			}
			return results;
		} catch (Exception e) {
			logger.error("splitToInt ", e);
			return EMPTY_INT_ARR;
		}
	}
}
