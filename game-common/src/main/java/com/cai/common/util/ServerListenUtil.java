package com.cai.common.util;

import java.nio.charset.Charset;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * 系统监听
 * @author run
 * @date 2013-6-12
 */
public class ServerListenUtil {

	private static final Logger logger = LoggerFactory.getLogger(ServerListenUtil.class);

	/**
	 * 系统相关详细信息
	 */
	public static void sysInfo() {
		String dir = System.getProperties().getProperty("user.dir");
		String timezone = System.getProperties().getProperty("user.timezone");
		String defaultCharset = Charset.defaultCharset().toString();//本地编码
		int maxMemory =  ((Long) (Runtime.getRuntime().maxMemory() / (1024 * 1024))).intValue();
		StringBuilder buf = new StringBuilder();
		buf.append("\r\n=================系统信息==========================");
		buf.append("\r\n	启动时间 => " + new Date());
		buf.append("\r\n	hostAddress =>" + RuntimeOpt.getHostAddress());
		buf.append("\r\n	rmiAddress =>" + RuntimeOpt.getRmiHostAddress());
		buf.append("\r\n	user.dir =>" + dir);
		buf.append("\r\n	defaultCharset =>" + defaultCharset);
		buf.append("\r\n	maxMemory =>" + maxMemory + "M");
		buf.append("\r\n	user.timezone =>" + timezone);
		
		buf.append("\r\n=================================================");
		logger.info(buf.toString());
	}
	public static void main(String[] args) {
		sysInfo();
	}

}
