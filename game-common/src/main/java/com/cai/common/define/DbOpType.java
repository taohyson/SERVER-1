package com.cai.common.define;

/**
 * 数据库操作类型
 * 
 * @author run
 *
 */
public enum DbOpType {

	INSERT(1, "插入"),
	DELETE(2, "删除"),
	UPDATE(3, "更新"),
	BATCH_INSERT(4, "批量插入"),
	BATCH_DELETE(5, "批量删除"),
	BATCH_UPDATE(6, "批量更新"),
	
	;

	private int id;

	private String desc;

	DbOpType(int id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public static DbOpType getEMsgType(int id) {
		for (DbOpType c : DbOpType.values()) {
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
