package com.cai.common.domain.json;

import java.io.Serializable;

public class MatchBaseScoreJsonModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int COMMON_BOOM_BASE = 4;

	private int time;
	
	private int outScore;
	
	private int base;  //基数
	
	private int baseScore; //底分
	 
	private int times; //倍数
	
	private int boomBase = 10; //炸弹基础分  默认10

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getBaseScore() {
		return baseScore;
	}

	public void setBaseScore(int baseScore) {
		this.baseScore = baseScore;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getOutScore() {
		return outScore;
	}

	public void setOutScore(int outScore) {
		this.outScore = outScore;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getBoomBase() {
		return boomBase;
	}

	public void setCommonBoomBase() {
		this.boomBase = COMMON_BOOM_BASE;
	}
	
}
