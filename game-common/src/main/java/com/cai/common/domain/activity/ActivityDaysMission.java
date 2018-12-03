package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 按天任务组
 *
 * @author tang date: 2018年8月14日 下午2:51:18 <br/>
 */
public class ActivityDaysMission implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int day_index;
	private String mission_ids;
	private String remark;
	private List<Integer> missionList = new ArrayList<>(10);

	public List<Integer> getMissionList() {
		return missionList;
	}

	public void setMissionList(List<Integer> missionList) {
		this.missionList = missionList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDay_index() {
		return day_index;
	}

	public void setDay_index(int day_index) {
		this.day_index = day_index;
	}

	public String getMission_ids() {
		return mission_ids;
	}

	public void setMission_ids(String mission_ids) {
		this.mission_ids = mission_ids;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
