/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 
 * 
 * @author wu_hc date: 2017年11月9日 上午9:45:16 <br/>
 */
public class GateServerModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private int server_id;

	/**
	 * 代理服名字
	 */
	private String server_name;
	/**
	 * 描述
	 */
	private String server_desc;
	/**
	 * 外网ip
	 */
	private String public_ip;
	/**
	 * 内网ip
	 */
	private String inner_ip;
	/**
	 * socket端口
	 */
	private int socket_port;

	/**
	 * rmi端口
	 */
	private int rmi_port;

	/**
	 * 安全码
	 */
	private String safe_code;
	/**
	 * 是否开放
	 */
	private int open;
	/**
	 * 程序位置
	 */
	private String software_location;

	public int getServer_id() {
		return server_id;
	}

	public void setServer_id(int server_id) {
		this.server_id = server_id;
	}

	public String getServer_name() {
		return server_name;
	}

	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}

	public String getServer_desc() {
		return server_desc;
	}

	public void setServer_desc(String server_desc) {
		this.server_desc = server_desc;
	}

	public String getPublic_ip() {
		return public_ip;
	}

	public void setPublic_ip(String public_ip) {
		this.public_ip = public_ip;
	}

	public String getInner_ip() {
		return inner_ip;
	}

	public void setInner_ip(String inner_ip) {
		this.inner_ip = inner_ip;
	}

	public int getSocket_port() {
		return socket_port;
	}

	public void setSocket_port(int socket_port) {
		this.socket_port = socket_port;
	}

	public int getRmi_port() {
		return rmi_port;
	}

	public void setRmi_port(int rmi_port) {
		this.rmi_port = rmi_port;
	}

	public String getSafe_code() {
		return safe_code;
	}

	public void setSafe_code(String safe_code) {
		this.safe_code = safe_code;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public String getSoftware_location() {
		return software_location;
	}

	public void setSoftware_location(String software_location) {
		this.software_location = software_location;
	}

}
