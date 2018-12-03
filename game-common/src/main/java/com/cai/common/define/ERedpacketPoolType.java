package com.cai.common.define;

/**
 * 红包操作
 * @author tang
 *
 */
public enum ERedpacketPoolType {
	PUT(1,"添加红包"),
	TAKE(2,"领取红包"),
	CLEAR(3,"清空红包"),
	DETAIL(4,"我的红包池详情"),
	EXCHANGE(5,"兑换红包");
	private int id;
	
	private String desc;
	
	ERedpacketPoolType(int id,String desc){
		this.id = id;
		this.desc = desc;
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
