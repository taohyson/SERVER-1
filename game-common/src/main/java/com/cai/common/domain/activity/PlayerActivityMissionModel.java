package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 玩家活动任务项
 * 
 * @author chansonyan 2018年4月17日
 */
@Document(collection = "player_activity_mission")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_missionId", def = "{'missionId': 1}"),
		@CompoundIndex(name = "index_activitymission", def = "{'activityId':-1, 'resetType':1}") })
public class PlayerActivityMissionModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Indexed
	private String id;

	private Long accountId;

	// 重置类型，用于批量处理重置任务
	private int resetType;

	// 配置任务ID
	private int missionId;

	// 配置活动ID
	private int activityId;

	// 当前完成次数
	private int currentCount;

	// 是否完成任务
	private boolean isFinish;

	// 是否领取奖励
	private boolean isTaken;

	// 最后一次更新时间
	private Date updateTime;

	// 重置时间
	private Date resetTime;

	private int dayIndex;// 第几天的任务

	private int activityType;//// ActivityTypeEnum

	private int liveness;// 任务奖励的活跃度

	public int getLiveness() {
		return liveness;
	}

	public void setLiveness(int liveness) {
		this.liveness = liveness;
	}

	public int getActivityType() {
		return activityType;
	}

	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}

	// 记录的被推荐人ID
	private List<Long> beRecommendList;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public int getMissionId() {
		return missionId;
	}

	public void setMissionId(int missionId) {
		this.missionId = missionId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public boolean isFinish() {
		return isFinish;
	}

	public void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getResetTime() {
		return resetTime;
	}

	public void setResetTime(Date resetTime) {
		this.resetTime = resetTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}

	public int getResetType() {
		return resetType;
	}

	public void setResetType(int resetType) {
		this.resetType = resetType;
	}

	public List<Long> getBeRecommendList() {
		if (null == beRecommendList) {
			this.beRecommendList = new ArrayList<>(10);
		}
		return beRecommendList;
	}

	public void setBeRecommendList(List<Long> beRecommendList) {
		this.beRecommendList = beRecommendList;
	}

	public int getDayIndex() {
		return dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

}
