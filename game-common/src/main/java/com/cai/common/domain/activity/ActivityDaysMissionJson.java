package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 
 * 按天任务组
 *
 * @author tang date: 2018年8月14日 下午2:55:18 <br/>
 */
public class ActivityDaysMissionJson implements Serializable {
	private static final long serialVersionUID = 1L;
	//// [{"taskName":"第一天任务","dayMissionId":"1"},{"taskName":"第二天任务","dayMissionId":"2"},{"taskName":"第三天任务","dayMissionId":"3"}]
	private String dayMissionId;
	private String taskName;

	public String getDayMissionId() {
		return dayMissionId;
	}

	public void setDayMissionId(String dayMissionId) {
		this.dayMissionId = dayMissionId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
