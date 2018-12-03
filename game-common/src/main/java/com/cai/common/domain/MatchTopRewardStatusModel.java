package com.cai.common.domain;

public class MatchTopRewardStatusModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private String date_key;
	private String status;
	
	public String getDate_key() {
		return date_key;
	}
	public void setDate_key(String date_key) {
		this.date_key = date_key;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
