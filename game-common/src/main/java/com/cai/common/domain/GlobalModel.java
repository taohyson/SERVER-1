package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;
/**
 * 全局常量
 * @author run
 *
 */
public class GlobalModel implements Serializable{
	
	/**
	 * 系统停服准备  true时表示系统进入关服倒计时
	 */
	private boolean systemStopReady;
	
	/**
	 * 指定停服时间,systemStopReady=true时才有效
	 */
	private Date stopDate;
	
	/**
	 * 系统停服准备结算任务
	 */
	private ScheduledFuture systemStopFuture;
	
	/**
	 * 系统停服准备通知任务
	 */
	private ScheduledFuture systemStopNoticeFuture;
	
	

	public boolean isSystemStopReady() {
		return systemStopReady;
	}

	public void setSystemStopReady(boolean systemStopReady) {
		this.systemStopReady = systemStopReady;
	}

	public Date getStopDate() {
		return stopDate;
	}

	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}

	public ScheduledFuture getSystemStopFuture() {
		return systemStopFuture;
	}

	public void setSystemStopFuture(ScheduledFuture systemStopFuture) {
		this.systemStopFuture = systemStopFuture;
	}

	public ScheduledFuture getSystemStopNoticeFuture() {
		return systemStopNoticeFuture;
	}

	public void setSystemStopNoticeFuture(ScheduledFuture systemStopNoticeFuture) {
		this.systemStopNoticeFuture = systemStopNoticeFuture;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
