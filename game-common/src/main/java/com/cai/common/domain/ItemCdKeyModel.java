package com.cai.common.domain;

import java.util.Date;

public class ItemCdKeyModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int item_id;
	private String cdkey;
	private int state;
	private Date start_time;
	private Date end_time;
	private String attachMsg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getCdkey() {
		return cdkey;
	}
	public void setCdkey(String cdkey) {
		this.cdkey = cdkey;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getAttachMsg() {
		return attachMsg;
	}
	public void setAttachMsg(String attachMsg) {
		this.attachMsg = attachMsg;
	}
	
}
