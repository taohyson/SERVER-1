package com.cai.common.define;

/**
 * 系统消息级别
 * @author run
 *
 */
public enum ESysLogLevelType {
	
	NONE("none","普通日志"),
	WARN("warn","警告日志"),
	ERROR("error","错误日志")
	;
	
	
	
	private String id;
	
	private String desc;
	
	ESysLogLevelType(String id,String desc){
		this.id = id;
		this.desc = desc;
	}
	
	
	public static ESysLogLevelType getEMsgType(String id)
	{
		for (ESysLogLevelType c : ESysLogLevelType.values())
		{
			if(c.id==id)
				return c;
		}
		return null;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	
	
}
