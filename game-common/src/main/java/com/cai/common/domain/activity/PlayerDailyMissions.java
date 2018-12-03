package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 每日任务组及完成情况
 *
 * @author tang date: 2018年8月21日 <br/>
 */
@Document(collection = "player_daily_missions_state")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_activityId", def = "{'activityId': 1}") })
public class PlayerDailyMissions implements Serializable {
	private static final long serialVersionUID = 1L;
	@Indexed
	private String _id;
	private long accountId;
	private int state;//// 任务组奖励领取状态，0激活状态,1完成,2未激活
	@Transient
	private List<PlayerActivityMissionModel> missionList;
	private int dayIndex;
	private int activityId;
	private Date create_time;
	private Date update_time;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public List<PlayerActivityMissionModel> getMissionList() {
		return missionList;
	}

	public void setMissionList(List<PlayerActivityMissionModel> missionList) {
		this.missionList = missionList;
	}

	public int getDayIndex() {
		return dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

}
