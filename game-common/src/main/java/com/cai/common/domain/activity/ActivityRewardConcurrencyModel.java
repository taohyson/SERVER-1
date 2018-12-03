package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 全服活动奖励并发项
 * 针对并发需要单独处理
 * @author chansonyan
 * 2018年4月18日
 */
@Document(collection = "activity_reward_concurrency")
@CompoundIndexes({ @CompoundIndex(name = "index_activityId", def = "{'activityId': 1}")})
public class ActivityRewardConcurrencyModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//配置活动ID
	private int activityId;
	
	//奖励类型，0为主奖励，1为辅助奖励
	private int rewardType;
	
	//奖励项目
	private String reward;
	
	private Date updateTime;
	
	private Date createTime;

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getRewardType() {
		return rewardType;
	}

	public void setRewardType(int rewardType) {
		this.rewardType = rewardType;
	}
	
}
