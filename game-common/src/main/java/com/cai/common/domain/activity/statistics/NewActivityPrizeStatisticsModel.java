package com.cai.common.domain.activity.statistics;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 活动奖励表统计
 * @author chansonyan
 * 2018年6月9日
 */
@Document(collection = "activity_prize_statistics")
public class NewActivityPrizeStatisticsModel {
	
	@Id
	private String id;
	
	//活动ID
	private int activityId;
	
	//奖励ID
	private int prizeId;
	
	//领取总人数
	private AtomicInteger takeTotal = new AtomicInteger(0);
	
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

	public int getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(int prizeId) {
		this.prizeId = prizeId;
	}

	public AtomicInteger getTakeTotal() {
		return takeTotal;
	}

	public void setTakeTotal(AtomicInteger takeTotal) {
		this.takeTotal = takeTotal;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
