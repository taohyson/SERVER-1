package com.cai.common.domain;

import com.cai.common.define.EServerStatus;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年9月15日 下午2:30:43 <br/>
 */
public class ClubGameServerModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private int index;
	/**
	 * 名字
	 */
	private String game_name;
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

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index
	 *            the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the game_name
	 */
	public String getGame_name() {
		return game_name;
	}

	/**
	 * @param game_name
	 *            the game_name to set
	 */
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	/**
	 * @return the public_ip
	 */
	public String getPublic_ip() {
		return public_ip;
	}

	/**
	 * @param public_ip
	 *            the public_ip to set
	 */
	public void setPublic_ip(String public_ip) {
		this.public_ip = public_ip;
	}

	/**
	 * @return the inner_ip
	 */
	public String getInner_ip() {
		return inner_ip;
	}

	/**
	 * @param inner_ip
	 *            the inner_ip to set
	 */
	public void setInner_ip(String inner_ip) {
		this.inner_ip = inner_ip;
	}

	/**
	 * @return the socket_port
	 */
	public int getSocket_port() {
		return socket_port;
	}

	/**
	 * @param socket_port
	 *            the socket_port to set
	 */
	public void setSocket_port(int socket_port) {
		this.socket_port = socket_port;
	}

	/**
	 * @return the rmi_port
	 */
	public int getRmi_port() {
		return rmi_port;
	}

	/**
	 * @param rmi_port
	 *            the rmi_port to set
	 */
	public void setRmi_port(int rmi_port) {
		this.rmi_port = rmi_port;
	}

	/**
	 * @return the safe_code
	 */
	public String getSafe_code() {
		return safe_code;
	}

	/**
	 * @param safe_code
	 *            the safe_code to set
	 */
	public void setSafe_code(String safe_code) {
		this.safe_code = safe_code;
	}

	/**
	 * @return the open
	 */
	public int getOpen() {
		return open;
	}

	/**
	 * @param open
	 *            the open to set
	 */
	public void setOpen(int open) {
		this.open = open;
	}

	/**
	 * @return the software_location
	 */
	public String getSoftware_location() {
		return software_location;
	}

	/**
	 * @param software_location
	 *            the software_location to set
	 */
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
		return "ClubGameServerModel [index=" + index + ", game_name=" + game_name + ", public_ip=" + public_ip + ", inner_ip=" + inner_ip
				+ ", socket_port=" + socket_port + ", rmi_port=" + rmi_port + ", safe_code=" + safe_code + ", open=" + open + ", software_location="
				+ software_location + ", status=" + status + ", lastPingTime=" + lastPingTime + "]";
	}

}
