/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

/**
 * 用于加强服务器到中心服注册的机制
 *
 * @author wu_hc date: 2017年10月13日 上午9:46:50 <br/>
 */
public final class ServerInfo {

	private final String safeCode;
	private final String rmiHostName;
	private final int serverIndex;

	/**
	 * 
	 * @param safeCode
	 * @param rmiHostName
	 * @param serverIndex
	 * @return
	 */
	public static ServerInfo of(String safeCode, String rmiHostName, int serverIndex) {
		return new ServerInfo(safeCode, rmiHostName, serverIndex);
	}

	/**
	 * 
	 * @param serverIndex
	 * @return
	 */
	public static ServerInfo of(String rmiHostName, int serverIndex) {
		return new ServerInfo("DFASE##@546654", rmiHostName, serverIndex);
	}

	/**
	 * @param safeCode
	 * @param rmiHostName
	 * @param serverIndex
	 */
	private ServerInfo(String safeCode, String rmiHostName, int serverIndex) {
		this.safeCode = safeCode;
		this.rmiHostName = rmiHostName;
		this.serverIndex = serverIndex;
	}

	public String getSafeCode() {
		return safeCode;
	}

	public String getRmiHostName() {
		return rmiHostName;
	}

	public int getServerIndex() {
		return serverIndex;
	}

	@Override
	public String toString() {
		return "ServerRegInfo [safeCode=" + safeCode + ", rmiHostName=" + rmiHostName + ", serverIndex=" + serverIndex + "]";
	}

}
