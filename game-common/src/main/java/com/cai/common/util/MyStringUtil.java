package com.cai.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStringUtil {

	public static final Logger logger = LoggerFactory.getLogger(MyStringUtil.class);
	
	/**
	 * 获取字符串的长度，如果有中文，则每个中文字符计为2位*
	 */
	public static int length(String value) {
		int valueLength = 0;
		String chinese = "[\u0391-\uFFE5]";
		/* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
		for (int i = 0; i < value.length(); i++) {
			/* 获取一个字符 */
			String temp = value.substring(i, i + 1);
			/* 判断是否为中文字符 */
			if (temp.matches(chinese)) {
				/* 中文字符长度为2 */
				valueLength += 2;
			} else {
				/* 其他字符长度为1 */
				valueLength += 1;
			}
		}
		return valueLength;
	}

	/**
	 * 截取长度,中文为两个字符，英文为一个
	 * @param str
	 * @param length
	 * @return
	 */
	public static String substringByLength(String str, int length) {
		
		String chinese = "[\u0391-\uFFE5]";
		StringBuilder buf = new StringBuilder();
		
		try{
			int valueLength = 0;
			/* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
			for (int i = 0; i < str.length(); i++) {
				/* 获取一个字符 */
				String temp = str.substring(i, i + 1);
				/* 判断是否为中文字符 */
				if (temp.matches(chinese)) {
					/* 中文字符长度为2 */
					valueLength += 2;
				} else {
					/* 其他字符长度为1 */
					valueLength += 1;
				}
				if(valueLength>length)
					break;
				buf.append(temp);
			}
		}catch(Exception e){
			logger.error("error",e);
			return str;
		}
		
		
		return buf.toString();
	}

	// 字符串的截取测试
	public static void main(String[] args) {

		String str1 = "字符串的截取";
		String str2 = "字符串的截取test";

		System.out.println(substringByLength(str2, 4));

	}
}
