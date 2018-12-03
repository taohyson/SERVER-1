package com.cai.common.domain.sdk.statstics;

import java.io.Serializable;

/**
 * SDK每日在线统计
 * @author chansonyan
 * 2018年11月5日
 */
public class SdkDailyOnlineStastics implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long appId;
	
	//APP点击次数
	private int click;
	
	//点击次数去重
	private int clickDistinct;
	
	private int totalOnline;
	
	private int totalPlayer;
	
	private int avgOnline;

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public int getTotalOnline() {
		return totalOnline;
	}

	public void setTotalOnline(int totalOnline) {
		this.totalOnline = totalOnline;
	}

	public int getAvgOnline() {
		return avgOnline;
	}

	public void setAvgOnline(int avgOnline) {
		this.avgOnline = avgOnline;
	}

	public int getTotalPlayer() {
		return totalPlayer;
	}

	public void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
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
	
	
}
