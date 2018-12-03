/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.domain;

/**
 * 
 * 子游戏指定逻辑服
 *
 * @author wu_hc date: 2017年8月31日 上午9:21:30 <br/>
 */
public final class LogicServerBalanceModule extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 游戏id ,大id
	 */
	private int gameId;

	/**
	 * 0关闭 1启用
	 */
	private int open;

	/**
	 * 对应的逻辑服编号，格式:2,4,6,3
	 */
	private String serverIndexs;

	/**
	 * 是否独占
	 */
	private int occupy;

	/**
	 * 
	 */
	private String description;

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getOpen() {
		return open;
	}

	public void setOpen(int open) {
		this.open = open;
	}

	public String getServerIndexs() {
		return serverIndexs;
	}

	public void setServerIndexs(String serverIndexs) {
		this.serverIndexs = serverIndexs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOccupy() {
		return occupy;
	}

	public void setOccupy(int occupy) {
		this.occupy = occupy;
	}

	@Override
	public String toString() {
		return "LogicServerBalanceModule [gameId=" + gameId + ", open=" + open + ", serverIndexs=" + serverIndexs + ", occupy=" + occupy
				+ ", description=" + description + "]";
	}

}
