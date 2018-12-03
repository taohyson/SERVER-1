package com.cai.common.define;

/**
 * 推送时间方式
 * 
 * @author tang
 *
 */
public enum ETimePushType {
	TIME_JOB(1,"定时推送"),
	MATCH_START(2,"赛前推送");
	
	private int id;

	private String desc;

	ETimePushType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
}
