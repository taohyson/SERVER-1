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
@IConfig(tag = EnumConfig.MONGO)
public final class MongoStruct implements Config {

	private String hostNode;
	private String passwd;
	private String dataName;
	private int connectionsPerHost;
	private int threadsAllowedToBlockForConnectionMultiplier;
	private int connectTimeout;
	private int maxWaitTime;
	private boolean autoConnectRetry;
	private boolean socketKeepAlive;
	private int socketTimeout;
	private boolean slaveOk;

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

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public int getConnectionsPerHost() {
		return connectionsPerHost;
	}

	public void setConnectionsPerHost(int connectionsPerHost) {
		this.connectionsPerHost = connectionsPerHost;
	}

	public int getThreadsAllowedToBlockForConnectionMultiplier() {
		return threadsAllowedToBlockForConnectionMultiplier;
	}

	public void setThreadsAllowedToBlockForConnectionMultiplier(int threadsAllowedToBlockForConnectionMultiplier) {
		this.threadsAllowedToBlockForConnectionMultiplier = threadsAllowedToBlockForConnectionMultiplier;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getMaxWaitTime() {
		return maxWaitTime;
	}

	public void setMaxWaitTime(int maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	public boolean isAutoConnectRetry() {
		return autoConnectRetry;
	}

	public void setAutoConnectRetry(boolean autoConnectRetry) {
		this.autoConnectRetry = autoConnectRetry;
	}

	public boolean isSocketKeepAlive() {
		return socketKeepAlive;
	}

	public void setSocketKeepAlive(boolean socketKeepAlive) {
		this.socketKeepAlive = socketKeepAlive;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}

	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	public boolean isSlaveOk() {
		return slaveOk;
	}

	public void setSlaveOk(boolean slaveOk) {
		this.slaveOk = slaveOk;
	}

	@Override
	public String toString() {
		return "MongoStruct [hostNode=" + hostNode + ", passwd=" + passwd + ", dataName=" + dataName
				+ ", connectionsPerHost=" + connectionsPerHost + ", threadsAllowedToBlockForConnectionMultiplier="
				+ threadsAllowedToBlockForConnectionMultiplier + ", connectTimeout=" + connectTimeout + ", maxWaitTime="
				+ maxWaitTime + ", autoConnectRetry=" + autoConnectRetry + ", socketKeepAlive=" + socketKeepAlive
				+ ", socketTimeout=" + socketTimeout + ", slaveOk=" + slaveOk + "]";
	}

}
