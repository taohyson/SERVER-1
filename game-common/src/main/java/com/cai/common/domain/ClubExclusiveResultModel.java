package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.define.ExclusiveCost;

/**
 * @author wu_hc date: 2017年12月18日 下午12:30:17 <br/>
 */
public final class ClubExclusiveResultModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final int status;

	private int gameId;
	private long oldValue;
	private long newValue;
	private String desc;
	private long accountId;

	// 如果是来自后台
	private Date exclusiveBeginDate;
	private Date exclusiveEndDate;

	/**
	 * @param status
	 * @return
	 */
	public static ClubExclusiveResultModel newModel(int status) {
		return new ClubExclusiveResultModel(status);
	}

	private ClubExclusiveResultModel(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public int getGameId() {
		return gameId;
	}

	public ClubExclusiveResultModel setGameId(int gameId) {
		this.gameId = gameId;
		return this;
	}

	public long getOldValue() {
		return oldValue;
	}

	public ClubExclusiveResultModel setOldValue(long oldValue) {
		this.oldValue = oldValue;
		return this;
	}

	public long getNewValue() {
		return newValue;
	}

	public ClubExclusiveResultModel setNewValue(long newValue) {
		this.newValue = newValue;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public ClubExclusiveResultModel setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public long getAccountId() {
		return accountId;
	}

	public ClubExclusiveResultModel setAccountId(long accountId) {
		this.accountId = accountId;
		return this;
	}

	public Date getExclusiveBeginDate() {
		return exclusiveBeginDate;
	}

	public ClubExclusiveResultModel setExclusiveBeginDate(Date exclusiveBeginDate) {
		this.exclusiveBeginDate = exclusiveBeginDate;
		return this;
	}

	public Date getExclusiveEndDate() {
		return exclusiveEndDate;
	}

	public ClubExclusiveResultModel setExclusiveEndDate(Date exclusiveEndDate) {
		this.exclusiveEndDate = exclusiveEndDate;
		return this;
	}

	@Override
	public String toString() {
		return "ClubExclusiveResultModel [status=" + status + ", gameId=" + gameId + ", oldValue=" + oldValue + ", newValue=" + newValue + ", desc="
				+ desc + ", accountId=" + accountId + ", exclusiveBeginDate=" + exclusiveBeginDate + ", exclusiveEndDate=" + exclusiveEndDate + "]";
	}

}
