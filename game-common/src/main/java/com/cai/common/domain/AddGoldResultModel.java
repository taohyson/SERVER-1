package com.cai.common.domain;

import java.io.Serializable;

public class AddGoldResultModel implements Serializable {

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

	private Object attament;

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

	public Object getAttament() {
		return attament;
	}

	public void setAttament(Object attament) {
		this.attament = attament;
	}

}
