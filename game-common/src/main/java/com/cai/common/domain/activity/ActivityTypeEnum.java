package com.cai.common.domain.activity;

/**
 * 精彩活动类型
 * @author Tang
 * 2018年4月17日
 */
public enum ActivityTypeEnum {
	TEXT(1, "文字"),
	PICTURE(2, "图片"),
	WEBPAGE(3, "网页"),
	REDPACKET(4, "红包限时活动"),
	TASK(5, "任务包限时活动"),
	DRAGON_BOAT(6, "端午节活动"),
	CHINESE_VALENTINE_DAY(7, "七夕活动"),
	NEW_USER_ACTIVITY(8, "新手豪礼"),
	NEW_GAME_ACTIVITY(9, "新游戏区域推广活动"),
	NATIONAL_DAY(10, "国庆"),
	MJ_WELFARE(11, "麻将福利中心"),
	EVERY_DAY_ACTIVE(12,"每日活跃");
	
	
	private ActivityTypeEnum(int id, String tag) {
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
