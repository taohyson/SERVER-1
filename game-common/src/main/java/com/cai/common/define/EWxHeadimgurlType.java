package com.cai.common.define;

/**
 * 微信头像大小
 * @author run
 *
 */
public enum EWxHeadimgurlType {
	
	S0(0,"640*640"),
	S46(46,"46*46"),
	S64(64,"64*64"),
	S96(96,"96*96"),
	S132(132,"132*132"); 
	
	private int id;
	
	private String desc;
	
	EWxHeadimgurlType(int id,String desc){
		this.id = id;
		this.desc = desc;
	}
	
	
	public static EWxHeadimgurlType getEMsgType(int id)
	{
		for (EWxHeadimgurlType c : EWxHeadimgurlType.values())
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
