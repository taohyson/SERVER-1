package com.cai.common.define;

/**
 * 消息类型
 * 
 * @author run
 *
 */
public enum EMsgType {

	PROXY_MSG(0, "代理服消息"), LOGIC_MSG(1, "逻辑服消息");

	private int id;

	private String desc;

	EMsgType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public static EMsgType getEMsgType(int id) {
		for (EMsgType c : EMsgType.values()) {
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
