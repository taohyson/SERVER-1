package com.cai.common.domain.activity;

/**
 * 任务奖励随机类型
 * @author chansonyan
 * 2018年6月5日
 */
public enum ActivityRewardRandomEnum {
	SHARDING(0, "按份额"),
	RANDOM(1, "随机");
	
	
	private ActivityRewardRandomEnum(int id, String tag) {
		this.id = id;
		this.tag = tag;
	}
	
	private int id;
	
	private String tag;
	
	
	public int getId() {
		return id;
	}

	public String getTag() {
		return tag;
	}

	
}
