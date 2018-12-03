package com.cai.common.domain.activity;

/**
 * 活动开启类型
 * @author chansonyan
 * 2018年6月5日
 */
public enum ActivityStartTypeEnum {
	AUTO(1, "生效自动开启"),
	MANUAL(2, "手动开启");
	
	
	private ActivityStartTypeEnum(int id, String tag) {
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
