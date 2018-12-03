package com.cai.common.domain;

import java.util.Date;

import com.google.common.base.Objects;

/**
 * 
 * 俱乐部专属豆-账号相关
 *
 * @author wu_hc date: 2017年12月5日 下午4:13:27 <br/>
 */
public final class ClubExclusiveGoldModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;
	private int gameId;
	private long usedCount;
	private long exclusiveGold;
	private Date exclusiveBeginDate;
	private Date exclusiveEndDate;

	// 设置
	private int settings;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public long getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(long usedCount) {
		if (this.usedCount == usedCount) {
			return;
		}
		setNeedDB(true);
		this.usedCount = usedCount;
	}

	public long getExclusiveGold() {
		return exclusiveGold;
	}

	public void setExclusiveGold(long exclusiveGold) {
		if (this.exclusiveGold == exclusiveGold) {
			return;
		}
		setNeedDB(true);
		this.exclusiveGold = exclusiveGold;
	}

	public Date getExclusiveBeginDate() {
		return exclusiveBeginDate;
	}

	public void setExclusiveBeginDate(Date exclusiveBeginDate) {
		if (Objects.equal(this.exclusiveBeginDate, exclusiveBeginDate)) {
			return;
		}
		setNeedDB(true);
		this.exclusiveBeginDate = exclusiveBeginDate;
	}

	public Date getExclusiveEndDate() {

		return exclusiveEndDate;
	}

	public void setExclusiveEndDate(Date exclusiveEndDate) {
		if (Objects.equal(this.exclusiveEndDate, exclusiveEndDate)) {
			return;
		}
		setNeedDB(true);
		this.exclusiveEndDate = exclusiveEndDate;
	}

	public int getSettings() {
		return settings;
	}

	public void setSettings(int settings) {
		if (settings == this.settings) {
			return;
		}
		setNeedDB(true);
		this.settings = settings;
	}

	@Override
	public String toString() {
		return "ClubExclusiveGoldModel [accountId=" + accountId + ", gameId=" + gameId + ", usedCount=" + usedCount + ", exclusiveGold="
				+ exclusiveGold + ", exclusiveBeginDate=" + exclusiveBeginDate + ", exclusiveEndDate=" + exclusiveEndDate + "]";
	}

}
