package com.cai.common.domain.activity.statistics;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 活动主要统计项
 * @author chansonyan
 * 2018年6月8日
 */
@Document(collection = "activity_main_statistics")
public class NewActivityMainStatisticsModel {
	
	@Id
	private String id;
	
	//活动ID
	private int activityId;
	
	//手动开始总数
	private AtomicInteger manualStartTotal = new AtomicInteger(0);
	
	//领奖总次数
	private AtomicInteger takeAwardTotal = new AtomicInteger(0);
	
	private Date updateTime = new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public AtomicInteger getManualStartTotal() {
		return manualStartTotal;
	}

	public void setManualStartTotal(AtomicInteger manualStartTotal) {
		this.manualStartTotal = manualStartTotal;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public AtomicInteger getTakeAwardTotal() {
		return takeAwardTotal;
	}

	public void setTakeAwardTotal(AtomicInteger takeAwardTotal) {
		this.takeAwardTotal = takeAwardTotal;
	}
	
}
