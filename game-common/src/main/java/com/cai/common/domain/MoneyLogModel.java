package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每日金币统计前多少名
 * 
 */

@Document(collection = "money_log")
public class MoneyLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1851513447504893604L;

	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
	private Integer notes_date;

	/**
	 * 今日数量
	 */
	private int today_count;

	/**
	 * 账号ID
	 */
	private long accountId;

	/**
	 * 玩家名
	 */
	private String name;
	
	/**
	 * EAccountParamType desc
	 */
	private String desc;
	
	
	private int typeID;

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public Integer getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}

	public int getToday_count() {
		return today_count;
	}

	public void setToday_count(int today_count) {
		this.today_count = today_count;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}



}
