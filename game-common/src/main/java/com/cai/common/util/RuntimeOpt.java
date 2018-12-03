/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @author wu_hc
 *
 */
public final class RuntimeOpt {

	/**
	 * 机器核心数
	 */
	private static final int availableProcessors;

	/**
	 * 当前系统主机名
	 */
	private static String hostName;

	/**
	 * 当前系统IP地址
	 */
	private static String hostAddress;

	/**
	 * java.rmi.server.hostname
	 */
	private static String rmiHostAddress;

	private static String usrDir;

	static {
		availableProcessors = Runtime.getRuntime().availableProcessors();
		try {
			hostName = InetAddress.getLocalHost().getHostName();
			hostAddress = InetAddress.getLocalHost().getHostAddress();
			rmiHostAddress = System.getProperty("java.rmi.server.hostname");
			usrDir = System.getProperties().getProperty("user.dir");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 返回机器核心数
	 * 
	 * @return
	 */
	public static int availableProcessors() {
		return availableProcessors;
	}

	public static String getHostName() {
		return hostName;
	}

	public static String getHostAddress() {
		return hostAddress;
	}

	public static String getRmiHostAddress() {
		return rmiHostAddress;
	}

	public static String getUsrDir() {
		return usrDir;
	}

	public static void main(String[] args) {
		System.out.println(RuntimeOpt.availableProcessors);
		System.out.println(RuntimeOpt.hostAddress);
		System.out.println(RuntimeOpt.hostName);
		System.out.println(RuntimeOpt.rmiHostAddress);
		System.out.println(RuntimeOpt.usrDir);
	}
}
