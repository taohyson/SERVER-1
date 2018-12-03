package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class ActivityRedpacketPoolModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int min_money;//最小提现金额(单位为:分)
	private int clear_cycle;//红包池清零周期(以天为单位)
	private Date begin_time;//红包池开始生效时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMin_money() {
		return min_money;
	}
	public void setMin_money(int min_money) {
		this.min_money = min_money;
	}
	public int getClear_cycle() {
		return clear_cycle;
	}
	public void setClear_cycle(int clear_cycle) {
		this.clear_cycle = clear_cycle;
	}
	public Date getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}
	
}
