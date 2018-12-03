/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月25日 上午11:35:23 <br/>
 */
public final class UserPhoneRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 1绑定 2解绑 3更换 4是否绑定
	 */
	private final int type;

	private long accountId;

	private String phone;

	public int getType() {
		return type;
	}

	public static UserPhoneRMIVo newVo(int type, long accountId, String phone) {
		return new UserPhoneRMIVo(type, accountId, phone);
	}

	private UserPhoneRMIVo(int type, long accountId, String phone) {
		this.type = type;
		this.accountId = accountId;
		this.phone = phone;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserPhoneRMIVo [type=" + type + ", accountId=" + accountId + ", phone=" + phone + "]";
	}

}
