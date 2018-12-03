package com.cai.common.domain;

import java.io.Serializable;


public class EveryDayRobotOpenRoomRankResult implements Serializable {
	
	private Integer notes_date;
	private long account_id;
	private int goldTotal;
	
	public Integer getNotes_date() {
		return notes_date;
	}
	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}
	
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	
	public int getGoldTotal() {
		return goldTotal;
	}
	public void setGoldTotal(int goldTotal) {
		this.goldTotal = goldTotal;
	}
	
}
