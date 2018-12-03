package com.cai.common.domain;

import java.util.Date;

/**
 * 客户端包更新定时任务开启标志
 * 
 * @author Tang
 *
 */
public class ReloadControlModel {
	private int id;
	private int state;
	private String ossadmin;
	private Date operate_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getOssadmin() {
		return ossadmin;
	}
	public void setOssadmin(String ossadmin) {
		this.ossadmin = ossadmin;
	}
	public Date getOperate_time() {
		return operate_time;
	}
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}
	
	
}
