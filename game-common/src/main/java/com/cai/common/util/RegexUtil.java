package com.cai.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则
 * @author run
 * @date 2013-5-29
 */
public class RegexUtil {

	public static boolean isboolIP(String ipAddress){
		if(ipAddress==null || "".equals(ipAddress))
			return false;
		
		String ip="(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";
		Pattern pattern = Pattern.compile(ip);
		Matcher matcher = pattern.matcher(ipAddress);
		return matcher.matches();
	}
	
	
	public static boolean isNum(String num){
		String pat="^[0-9]*[1-9][0-9]*$";//正整数
		Pattern pattern = Pattern.compile(pat);
		Matcher matcher = pattern.matcher(num);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
