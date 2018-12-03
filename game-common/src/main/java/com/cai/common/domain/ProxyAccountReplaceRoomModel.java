package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每天代理代开房消耗统计
 * @author run
 *
 */
@Document(collection="proxy_account_replace_room")
public class ProxyAccountReplaceRoomModel implements Serializable{

	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
	private Integer notes_date;
	
	/**
	 * 代理id
	 */
	@Indexed(name = "index_account_id")
	private long account_id;
	
	/**
	 * 代开房消耗
	 */
	private int today_consume;
	
	
	private String nickName;
	
	private String heardUrl;
	
	/**
	 * 邀请人id
	 */
	private long invait_account_id;
	

	public String getHeardUrl() {
		return heardUrl;
	}

	public void setHeardUrl(String heardUrl) {
		this.heardUrl = heardUrl;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

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

	public int getToday_consume() {
		return today_consume;
	}

	public void setToday_consume(int today_consume) {
		this.today_consume = today_consume;
	}

	public long getInvait_account_id() {
		return invait_account_id;
	}

	public void setInvait_account_id(long invait_account_id) {
		this.invait_account_id = invait_account_id;
	}
	
	
	

}
