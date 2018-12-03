package com.cai.common.domain.sdk;

import java.io.Serializable;
import java.util.Date;

/**
 * SDK在线日志
 * @author chansonyan
 *
 */
public class SdkOnlineLogModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	
	private long appId;
	
	private long openId;
	
	//在线开始时间
	private Date startTime;
	
	//在线结束时间
	private Date endTime;
	
	//在线时长，精确到秒
	private long online;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public long getOpenId() {
		return openId;
	}

	public void setOpenId(long openId) {
		this.openId = openId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public long getOnline() {
		return online;
	}

	public void setOnline(long online) {
		this.online = online;
	}
	
}
