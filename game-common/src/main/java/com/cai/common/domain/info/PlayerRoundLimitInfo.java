package com.cai.common.domain.info;

import java.io.Serializable;

public class PlayerRoundLimitInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 包间Id
	 */
	private int ruleId;

	/**
	 * 限制的局数
	 */
	private int limitRound;

	/**
	 * 玩家玩的局数
	 */
	private int playRound;

	public PlayerRoundLimitInfo() {

	}

	public PlayerRoundLimitInfo(int ruleId, int limitRound, int playRound) {
		this.ruleId = ruleId;
		this.limitRound = limitRound;
		this.playRound = playRound;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public int getLimitRound() {
		return limitRound;
	}

	public void setLimitRound(int limitRound) {
		this.limitRound = limitRound;
	}

	public int getPlayRound() {
		return playRound;
	}

	public void setPlayRound(int playRound) {
		this.playRound = playRound;
	}

}
