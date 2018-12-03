package com.cai.common.domain;

import java.util.Date;

public class MatchAccountTypeSecretModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private String secret_code;
	private int account_type;
	private int state;
	private long use_account_id;
	private Date use_time;
	
	
	public String getSecret_code() {
		return secret_code;
	}
	public void setSecret_code(String secret_code) {
		this.secret_code = secret_code;
	}
	public int getAccount_type() {
		return account_type;
	}
	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public long getUse_account_id() {
		return use_account_id;
	}
	public void setUse_account_id(long use_account_id) {
		this.use_account_id = use_account_id;
	}
	public Date getUse_time() {
		return use_time;
	}
	public void setUse_time(Date use_time) {
		this.use_time = use_time;
	}
}
