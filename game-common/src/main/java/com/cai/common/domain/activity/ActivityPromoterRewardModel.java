package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 活动推广用户
 *
 * @author tang date: 2018年8月20日 <br/>
 */
@Document(collection = "activity_promote_reward_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}") })
public class ActivityPromoterRewardModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String _id;
	private long accountId;
	private int activityId;
	private Date create_time;
	private int newUserActReward;// 参加新用户活动获得的红包金额

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getNewUserActReward() {
		return newUserActReward;
	}

	public void setNewUserActReward(int newUserActReward) {
		this.newUserActReward = newUserActReward;
	}

}
