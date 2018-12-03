package com.cai.common.domain.activity.dice;

/**
 * 骰子格类型
 * @author chansonyan
 * 2018年11月23日
 */
public enum DicePrizeTypeEnum {
	
	NONE(0, "空格"),
	PRIZE(1, "奖励格"),
	MISSION(2, "任务格"),
	DRAW_PRIZE(3, "免费次数格");
	
	private int v;
	
	private String desc;

	private DicePrizeTypeEnum(int v, String desc) {
		this.v = v;
		this.desc = desc;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
