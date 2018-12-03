package com.cai.common.util;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.google.common.base.Strings;

public class IpUtil {

	private final static Set<String> whiteIps = new HashSet<>();

	/**
	 * 阿里监控ip段
	 */
	private final static Set<String> aliMonitorIpPref = new HashSet<>();

	static {
		// 公司ip
		whiteIps.add("183.14.133.161");
		whiteIps.add("218.17.70.202");
		whiteIps.add("120.78.33.20");
		whiteIps.add("183.14.31.178");
	
		/**
		 * 具体包含的IP地址段是： 10.158.0.0/16，10.159.0.0./16，10.49.0.0/16，100.64.0.0/10，
		 * 100.109.0.0/16，100.97.0.0/16，100.116.0.0/15
		 * 为了确保您对外服务的可用性，请确保对上述地址的访问配置放行规则
		 */
		aliMonitorIpPref.add("10.158");
		aliMonitorIpPref.add("10.159");
		aliMonitorIpPref.add("10.49");
		aliMonitorIpPref.add("100.64");
		aliMonitorIpPref.add("100.109");
		aliMonitorIpPref.add("100.97");
		aliMonitorIpPref.add("100.116");
		aliMonitorIpPref.add("100.117");
		
		//阿里高防回源ip
		aliMonitorIpPref.add("39.108.196");
		aliMonitorIpPref.add("120.78.41");
		aliMonitorIpPref.add("120.78.42");
		aliMonitorIpPref.add("120.78.43");
		aliMonitorIpPref.add("120.78.44");
		aliMonitorIpPref.add("120.76.16");
		aliMonitorIpPref.add("192.168.1");
			
		/**
		 * 华为
		 * 119.188.199.0/24
140.249.12.0/24
183.2.197.0/24
183.131.207.0/24
183.146.215.0/24
49.4.56.0/24
139.159.208.0/24
159.138.14.224/27
180.101.77.0/24
122.112.208.0/24
117.78.24.0/24
117.25.137.0/24
		 */
		aliMonitorIpPref.add("119.188.199");
		aliMonitorIpPref.add("140.249.12");
		aliMonitorIpPref.add("183.2.197");
		aliMonitorIpPref.add("183.131.207");
		aliMonitorIpPref.add("183.146.215");
		aliMonitorIpPref.add("49.4.56");
		aliMonitorIpPref.add("139.159.208");
		aliMonitorIpPref.add("159.138.14");
		aliMonitorIpPref.add("180.101.77");
		aliMonitorIpPref.add("122.112.208");
		aliMonitorIpPref.add("117.78.24");
		aliMonitorIpPref.add("117.25.137");
		
	}

	/**
	 * 白名单ip
	 * 
	 * @param ip
	 * @return
	 */
	public static boolean isWhiteIp(String ip) {
		if (Strings.isNullOrEmpty(ip)) {
			return false;
		}
		return isAliMonitorIp(ip)  ;
	}

	/**
	 * 阿里监控的ip
	 * 
	 * @param ip
	 * @return
	 */
	public static boolean isAliMonitorIp(String ip) {
		if (Strings.isNullOrEmpty(ip)) {
			return false;
		}
		for (final String ipPre : aliMonitorIpPref) {
			if (ip.startsWith(ipPre)) {
				return true;
			}
		}

		for (final String ipPre : whiteIps) {
			if (Objects.equals(ip, ipPre)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		for(int i=0;i<255;i++) {
			System.out.println("61.160.55."+i+",");
		}
		
		
//		System.out.println(isWhiteIp("100.116.82.2"));
	}
}
