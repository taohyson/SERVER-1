package com.cai.common.domain.activity.statistics;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 活动任务完成统计
 * @author chansonyan
 * 2018年6月11日
 */
@Document(collection = "activity_mission_statistics")
public class NewActivityMissionStatisticsModel {
	
	@Id
	private String id;
	
	//活动ID
	private int activityId;
	
	//任务ID
	private int missionId;
	
	//完成总次数
	private AtomicInteger finishTotal = new AtomicInteger(0);

	private Date createTime = new Date();
	
	public NewActivityMissionStatisticsModel(int activityId, int missionId) {
		super();
		this.activityId = activityId;
		this.missionId = missionId;
	}

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

	public AtomicInteger getFinishTotal() {
		return finishTotal;
	}

	public void setFinishTotal(AtomicInteger finishTotal) {
		this.finishTotal = finishTotal;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getMissionId() {
		return missionId;
	}

	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}
	
}
