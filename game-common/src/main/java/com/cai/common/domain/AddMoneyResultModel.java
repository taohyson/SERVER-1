package com.cai.common.domain;

import java.io.Serializable;

public class AddMoneyResultModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 是否成功
	 */
	private boolean success;
	
	/**
	 * 提示
	 */
	private String msg;
	
	/**
	 * 刷新
	 */
	private AccountModel accountModel;
	
	/**
	 * 微信名
	 */
	private String wxNickName;
	
//	/**
//	 * 实际操作值
//	 */
//	private long realMoney;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public AccountModel getAccountModel() {
		return accountModel;
	}

	public void setAccountModel(AccountModel accountModel) {
		this.accountModel = accountModel;
	}

	public String getWxNickName() {
		return wxNickName;
	}

	public void setWxNickName(String wxNickName) {
		this.wxNickName = wxNickName;
	}

//	public long getRealMoney() {
//		return realMoney;
//	}
//
//	public void setRealMoney(long realMoney) {
//		this.realMoney = realMoney;
//	}
	
	
	
	
}
