package com.cai.common.domain;

public class MatchConfigModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private String s_key;
	private String s_value;
	
	public String getS_key() {
		return s_key;
	}
	public void setS_key(String s_key) {
		this.s_key = s_key;
	}
	public String getS_value() {
		return s_value;
	}
	public void setS_value(String s_value) {
		this.s_value = s_value;
	}
	
}
