package com.cai.common.domain.statistics;

import java.util.Date;

public class AccountBrandModel {
	private long account_id;
	private int notes_date;
	private int type;
	private Date registerTime;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(int notes_date) {
		this.notes_date = notes_date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	
}
