package com.cai.common.define;

/**
 * 数据库选择
 * 
 * @author run
 *
 */
public enum DbStoreType {

	PUBLIC(100,"公共库"),
	PUBLIC_DATA(101,"公共基础库"),
	GAME(102,"游戏库");

	private int id;

	private String desc;

	DbStoreType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public static DbStoreType getEMsgType(int id) {
		for (DbStoreType c : DbStoreType.values()) {
			if (c.id == id)
				return c;
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
