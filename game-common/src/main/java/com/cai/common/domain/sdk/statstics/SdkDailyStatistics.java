package com.cai.common.domain.sdk.statstics;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sdk_daily_statistics")
public class SdkDailyStatistics implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;

	private long appId;

	// APP点击次数
	private int click;

	// 点击次数去重
	private int clickDistinct;

	// 总在线时长（秒）
	private int totalOnline;

	// 在线玩家
	private int totalPlayer;

	// 平均在线
	private int avgOnline;

	// 总充值
	private double totalAmount;

	// 充值人数去重
	private int distinctPlayer;
	
	//统计时间（按天）
	private Date currrentTime;

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}

	public int getClickDistinct() {
		return clickDistinct;
	}

	public void setClickDistinct(int clickDistinct) {
		this.clickDistinct = clickDistinct;
	}

	public int getTotalOnline() {
		return totalOnline;
	}

	public void setTotalOnline(int totalOnline) {
		this.totalOnline = totalOnline;
	}

	public int getTotalPlayer() {
		return totalPlayer;
	}

	public void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}

	public int getAvgOnline() {
		return avgOnline;
	}

	public void setAvgOnline(int avgOnline) {
		this.avgOnline = avgOnline;
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

	public Date getCurrrentTime() {
		return currrentTime;
	}

	public void setCurrrentTime(Date currrentTime) {
		this.currrentTime = currrentTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
