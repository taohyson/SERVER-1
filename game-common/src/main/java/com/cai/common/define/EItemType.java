package com.cai.common.define;

/**
 * 道具类别
 * 
 * @author yu
 *
 */
public enum EItemType {

	TYPE_ORDINARY(1, "普通道街"), TYPE_ONLINE_MATCH(2, "普通参赛券"), TYPE_OFFLINE_MATCH(3, "线下参赛券");

	private int id;

	private String desc;

	EItemType(int id, String desc) {
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
