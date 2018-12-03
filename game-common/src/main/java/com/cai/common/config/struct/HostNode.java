/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config.struct;

/**
 *
 * @author wu_hc
 */
public class HostNode {

	private int index;
	private String host;
	private int status;

	/**
	 * 
	 */
	public HostNode() {
	}

	/**
	 * @param index
	 * @param host
	 * @param status
	 */
	public HostNode(int index, String host, int status) {
		super();
		this.index = index;
		this.host = host;
		this.status = status;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "HostNode [host=" + host + ", status=" + status + "]";
	}

}
