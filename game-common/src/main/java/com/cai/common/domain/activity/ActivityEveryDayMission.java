package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.List;

import com.cai.common.domain.ActivityMissionModel;

/**
 * 
 * 按天任务组
 *
 * @author tang date: 2018年8月14日 下午2:57:18 <br/>
 */
public class ActivityEveryDayMission implements Serializable {
	private static final long serialVersionUID = 1L;
	private int day_index;
	private String taskName;
	private List<Integer> missionIds;
	private List<ActivityMissionModel> dayMissions;

	public int getDay_index() {
		return day_index;
	}

	public void setDay_index(int day_index) {
		this.day_index = day_index;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public List<ActivityMissionModel> getDayMissions() {
		return dayMissions;
	}

	public void setDayMissions(List<ActivityMissionModel> dayMissions) {
		this.dayMissions = dayMissions;
	}

	public List<Integer> getMissionIds() {
		return missionIds;
	}

	public void setMissionIds(List<Integer> missionIds) {
		this.missionIds = missionIds;
	}

}
