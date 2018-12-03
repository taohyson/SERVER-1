package com.cai.common.domain.sdk.statstics;

import java.io.Serializable;

/**
 * SDK充值兑换每日统计
 * @author chansonyan
 * 2018年11月5日
 */
public class SdkDailyOrderStastics implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long appId;
	
	//总充值
	private double totalAmount;
	
	//充值人数去重
	private int distinctPlayer;
	
	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getDistinctPlayer() {
		return distinctPlayer;
	}

	public void setDistinctPlayer(int distinctPlayer) {
		this.distinctPlayer = distinctPlayer;
	}

}
