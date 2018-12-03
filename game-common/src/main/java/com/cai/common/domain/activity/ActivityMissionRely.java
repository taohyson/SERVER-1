package com.cai.common.domain.activity;

import java.io.Serializable;

public class ActivityMissionRely implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int mission_type_enum;
	
	private int relyId;
	
	public int getMission_type_enum() {
		return mission_type_enum;
	}
	public void setMission_type_enum(int mission_type_enum) {
		this.mission_type_enum = mission_type_enum;
	}
	public int getRelyId() {
		return relyId;
	}
	public void setRelyId(int relyId) {
		this.relyId = relyId;
	}
	
}
