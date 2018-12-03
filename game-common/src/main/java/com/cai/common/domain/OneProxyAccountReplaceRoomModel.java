package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 上级代理统计下一线代理代开房
 * @author run
 *
 */
@Document(collection="one_proxy_account_replace_room")
public class OneProxyAccountReplaceRoomModel implements Serializable{

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
	 * 下线所有代理代开房的总消耗
	 */
	private int today_consume;
	
	/**
	 * 下线所有代理的id
	 */
	private String lower_proxy_account_ids;
	
	/**
	 * 返利的倍利
	 */
	private double rebate;
	
	/**
	 * 分为单位
	 */
	private double money;
	
	/**
	 * 推荐人id
	 */
	private long invait_account_id;
	


	public long getInvait_account_id() {
		return invait_account_id;
	}

	public void setInvait_account_id(long invait_account_id) {
		this.invait_account_id = invait_account_id;
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

	public String getLower_proxy_account_ids() {
		return lower_proxy_account_ids;
	}

	public void setLower_proxy_account_ids(String lower_proxy_account_ids) {
		this.lower_proxy_account_ids = lower_proxy_account_ids;
	}

	public double getRebate() {
		return rebate;
	}

	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	
	

}
