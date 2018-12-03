/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config.struct;

import com.cai.common.config.EnumConfig;
import com.cai.common.config.IConfig;

/**
 *
 * @author wu_hc
 */
@IConfig(tag = EnumConfig.REDIS)
public final class RedisStruct implements Config {

	/**
	 * 
	 */
	private String hostNode;

	private String passwd;

	private int maxIdle;

	private int maxActive;

	private int maxWait;

	private boolean testOnBorrow;

	/**
	 * 
	 */
	public RedisStruct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hostNode
	 * @param passwd
	 * @param maxIdle
	 * @param maxActive
	 * @param maxWait
	 * @param testOnBorrow
	 */
	public RedisStruct(String hostNode, String passwd, int maxIdle, int maxActive, int maxWait, boolean testOnBorrow) {
		super();
		this.hostNode = hostNode;
		this.passwd = passwd;
		this.maxIdle = maxIdle;
		this.maxActive = maxActive;
		this.maxWait = maxWait;
		this.testOnBorrow = testOnBorrow;
	}

	public String getHostNode() {
		return hostNode;
	}

	public void setHostNode(String hostNode) {
		this.hostNode = hostNode;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public int getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}

	public boolean getTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	@Override
	public String toString() {
		return "RedisStruct [hostNode=" + hostNode + ", passwd=" + passwd + ", maxIdle=" + maxIdle + ", maxActive="
				+ maxActive + ", maxWait=" + maxWait + ", testOnBorrow=" + testOnBorrow + "]";
	}

}
