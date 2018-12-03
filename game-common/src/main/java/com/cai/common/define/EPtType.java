package com.cai.common.define;

/**
 * 平台
 * @author run
 *
 */
public enum EPtType {
	
	WX("WX","微信"),
	SELF("SELF","自有平台"),
	EJ("EJ","易接平台");
	
	
	private String id;
	
	private String desc;
	
	EPtType(String id,String desc){
		this.id = id;
		this.desc = desc;
	}
	
	
	public static EPtType getEMsgType(String id)
	{
		for (EPtType c : EPtType.values())
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
