package com.cai.common.domain;

import java.util.Date;

import com.google.common.base.Objects;

/**
 * 
 *
 * @author zhanglong date: 2018年7月13日 下午2:49:52
 */
public class ClubRuleRecordModel extends DBBaseModel {

	/**
	 *   
	 */
	private static final long serialVersionUID = 1L;

	private int clubId;

	private int ruleId;

	private Date recordDate;

	private int isTotal;

	private int gameCount;

	private long exclusiveGold;

	private long gold;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		if (this.clubId == clubId) {
			return;
		}
		setNeedDB(true);
		this.clubId = clubId;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		if (this.ruleId == ruleId) {
			return;
		}
		setNeedDB(true);
		this.ruleId = ruleId;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		if (Objects.equal(recordDate, this.recordDate)) {
			return;
		}
		setNeedDB(true);
		this.recordDate = recordDate;
	}

	public int getIsTotal() {
		return isTotal;
	}

	public void setIsTotal(int isTotal) {
		if (this.isTotal == isTotal) {
			return;
		}
		setNeedDB(true);
		this.isTotal = isTotal;
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		if (this.gameCount == gameCount) {
			return;
		}
		setNeedDB(true);
		this.gameCount = gameCount;
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

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		if (this.gold == gold) {
			return;
		}
		setNeedDB(true);
		this.gold = gold;
	}

}
