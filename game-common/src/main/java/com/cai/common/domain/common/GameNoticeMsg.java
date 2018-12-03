package com.cai.common.domain.common;

import java.io.Serializable;

public class GameNoticeMsg implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;
	
	private int type;
	private int typeId;
	
	private String name;
	
	public GameNoticeMsg(long accountId,int type, int typeId, String name) {
		this.accountId = accountId;
		this.type = type;
		this.typeId = typeId;
		this.name = name;
	}
	
	public GameNoticeMsg(int type, int typeId, String name) {
		this.type = type;
		this.typeId = typeId;
		this.name = name;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
