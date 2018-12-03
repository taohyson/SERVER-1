package com.cai.common.define;

/**
 * 系统消息
 * @author run
 *
 */
public enum ESysMsgType {

	/**
	 * 弹窗类型
	 */
	NONE(1,"普通消息"),
	/**
	 * 飘字类型
	 */
	INCLUDE_ERROR(2,"包含错误码的提示信息"),
	TEXT_ERROR(3,"文本提示"),
	MONEY_ERROR(4,"金币不足"),
	_ERROR(5,"闲逸豆不足"),
	GLOBAL_ERROR(6,"全局错误信息，带错误码");

	private int id;

	private String desc;

	ESysMsgType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public static ESysMsgType getEMsgType(int id) {
		for (ESysMsgType c : ESysMsgType.values()) {
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
