package com.cai.common.domain;

import java.io.Serializable;

/**
 * 
 *
 *       每日比赛统计
 */
public class DayMatchResult implements Serializable {

	private static final long serialVersionUID = -1L;
	private long costGold;
	private long applyCount;
	private long matchSuccess;
	private long prizeGold;
	
	public long getCostGold() {
		return costGold;
	}
	public void setCostGold(long costGold) {
		this.costGold = costGold;
	}
	public long getApplyCount() {
		return applyCount;
	}
	public void setApplyCount(long applyCount) {
		this.applyCount = applyCount;
	}
	public long getMatchSuccess() {
		return matchSuccess;
	}
	public void setMatchSuccess(long matchSuccess) {
		this.matchSuccess = matchSuccess;
	}
	public long getPrizeGold() {
		return prizeGold;
	}
	public void setPrizeGold(long prizeGold) {
		this.prizeGold = prizeGold;
	}

	
	
}
