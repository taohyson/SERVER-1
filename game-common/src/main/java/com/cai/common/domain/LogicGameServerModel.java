package com.cai.common.domain;

import com.cai.common.define.EServerStatus;

/**
 * 逻辑计算服
 * 
 * @author run
 *
 */
public class LogicGameServerModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3196614861154761724L;
	/**
	 * 逻辑计算服id
	 */
	private int logic_game_id;
	/**
	 * 逻辑服名字
	 */
	private String logic_game_name;
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

	// ===========扩展===========

	/**
	 * 状态
	 */
	private transient EServerStatus status;

	/**
	 * 最后检测的时间
	 */
	private transient long lastPingTime;

	public int getLogic_game_id() {
		return logic_game_id;
	}

	public void setLogic_game_id(int logic_game_id) {
		this.logic_game_id = logic_game_id;
	}

	public String getLogic_game_name() {
		return logic_game_name;
	}

	public void setLogic_game_name(String logic_game_name) {
		this.logic_game_name = logic_game_name;
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

	/**
	 * @return the status
	 */
	public EServerStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(EServerStatus status) {
		this.status = status;
	}

	/**
	 * @return the lastPingTime
	 */
	public long getLastPingTime() {
		return lastPingTime;
	}

	/**
	 * @param lastPingTime
	 *            the lastPingTime to set
	 */
	public void setLastPingTime(long lastPingTime) {
		this.lastPingTime = lastPingTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogicGameServerModel [logic_game_id=" + logic_game_id + ", logic_game_name=" + logic_game_name + ", public_ip=" + public_ip
				+ ", inner_ip=" + inner_ip + ", socket_port=" + socket_port + ", rmi_port=" + rmi_port + ", safe_code=" + safe_code + ", open=" + open
				+ ", software_location=" + software_location + ", status=" + status + ", lastPingTime=" + lastPingTime + "]";
	}

}
