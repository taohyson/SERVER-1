package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 任务组
 * 
 * @author chansonyan 2018年7月26日
 */
public class ActivityMissionGroupModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String group_name;

	private String mission_ids;

	private int group_type;

	private List<Integer> missionList = new ArrayList<>(10);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getMission_ids() {
		return mission_ids;
	}

	public void setMission_ids(String mission_ids) {
		this.mission_ids = mission_ids;
	}

	public int getGroup_type() {
		return group_type;
	}

	public void setGroup_type(int group_type) {
		this.group_type = group_type;
	}

	public List<Integer> getMissionList() {
		return missionList;
	}

	public void setMissionList(List<Integer> missionList) {
		this.missionList = missionList;
	}

}
