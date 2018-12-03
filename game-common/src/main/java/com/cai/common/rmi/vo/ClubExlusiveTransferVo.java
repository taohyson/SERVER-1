/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 俱乐部专属豆转让
 *
 * @author wu_hc date: 2017年12月28日 下午9:09:41 <br/>
 */
public final class ClubExlusiveTransferVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final long selfAccountId;
	private final long tagetAccountId;
	private long value;

	// 返回
	private int status;
	private String desc;

	/**
	 * 游戏
	 */
	private int gameId;

	/**
	 * 
	 * @param selfAccountId
	 * @param tagetAccountId
	 * @return
	 */
	public static final ClubExlusiveTransferVo newVo(long selfAccountId, long tagetAccountId, long value) {
		return new ClubExlusiveTransferVo(selfAccountId, tagetAccountId, value);
	}

	/**
	 * @param selfAccountId
	 * @param tagetAccountId
	 */
	private ClubExlusiveTransferVo(long selfAccountId, long tagetAccountId, long value) {
		this.selfAccountId = selfAccountId;
		this.tagetAccountId = tagetAccountId;
		this.value = value;
	}

	public long getSelfAccountId() {
		return selfAccountId;
	}

	public long getTagetAccountId() {
		return tagetAccountId;
	}

	public long getValue() {
		return value;
	}

	public int getGameId() {
		return gameId;
	}

	public ClubExlusiveTransferVo setGameId(int gameId) {
		this.gameId = gameId;
		return this;
	}

	public int getStatus() {
		return status;
	}

	public ClubExlusiveTransferVo setStatus(int status) {
		this.status = status;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public ClubExlusiveTransferVo setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public ClubExlusiveTransferVo setValue(long value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return "ClubExlusiveTransferVo [selfAccountId=" + selfAccountId + ", tagetAccountId=" + tagetAccountId + ", value=" + value + ", status="
				+ status + ", desc=" + desc + ", gameId=" + gameId + "]";
	}

}
