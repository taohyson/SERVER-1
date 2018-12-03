package com.cai.common.domain.statistics;

import java.io.Serializable;
import java.util.Date;

/**
 * 每日金币兑换统计
 * @author chansonyan
 * 2018年7月3日
 */
public class DailyCoinExchangeStatistics implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date current_date;
	private int exchange_coin;
	//关联money_shop的名字
	private String name;
	//兑换人数去重
	private int dist_account;
	//兑换次数
	private int count;
	
	
	public Date getCurrent_date() {
		return current_date;
	}
	public void setCurrent_date(Date current_date) {
		this.current_date = current_date;
	}
	public int getExchange_coin() {
		return exchange_coin;
	}
	public void setExchange_coin(int exchange_coin) {
		this.exchange_coin = exchange_coin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDist_account() {
		return dist_account;
	}
	public void setDist_account(int dist_account) {
		this.dist_account = dist_account;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
