package com.cai.common.define;

/**
 * 短信签名枚举
 * 
 * @author tang
 *
 */
public enum ESmsSignType {

	XYYX_SIGN(1, "【闲逸游戏】"), WYJ_SIGN(2, "【玩一局】");

	private int id;

	private String desc;

	ESmsSignType(int id, String desc) {
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
