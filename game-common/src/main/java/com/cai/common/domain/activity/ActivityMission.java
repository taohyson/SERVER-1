package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 任务条件
 *
 * @author tang 
 * date: 2018年4月18日 下午6:35:18 <br/>
 */
public class ActivityMission implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//	{"taskName":"俱乐部定时赛","activityMissionIds":"1,2,3","minLimit":3,"turnType":1}
//	{任务关联ids,任务名，限制条件,任务完成跳转界面}
	private int minLimit;
	private String taskName;
	/**
	 * ActivityMissionTypeEnum 任务项id
	 */
	private String activityMissionIds;
	
	private int activityMissionGroup;
	
	public int getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getActivityMissionIds() {
		return activityMissionIds;
	}
	public void setActivityMissionIds(String activityMissionIds) {
		this.activityMissionIds = activityMissionIds;
	}
	public int getActivityMissionGroup() {
		return activityMissionGroup;
	}
	public void setActivityMissionGroup(int activityMissionGroup) {
		this.activityMissionGroup = activityMissionGroup;
	}
	
}
