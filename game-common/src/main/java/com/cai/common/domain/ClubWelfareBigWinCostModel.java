package com.cai.common.domain;

import java.io.Serializable;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/11/6 15:10
 */
public class ClubWelfareBigWinCostModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private int minValue;

	private int maxValue;

	private int cost;

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
