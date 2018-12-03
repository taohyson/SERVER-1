package com.cai.common.define;

/**
 * 消息id
 * @author run
 *
 */
public enum EMsgIdType {
	
	ROOM_ERROR(1,"普通牌局错误"),
	
	
	;
	
	
	
	private int id;
	
	private String desc;
	
	EMsgIdType(int id,String desc){
		this.id = id;
		this.desc = desc;
	}
	
	
	public static EMsgIdType getEMsgType(int id)
	{
		for (EMsgIdType c : EMsgIdType.values())
		{
			if(c.id==id)
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
