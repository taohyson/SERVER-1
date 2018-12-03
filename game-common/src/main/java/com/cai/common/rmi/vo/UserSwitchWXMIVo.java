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
public final class UserSwitchWXMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;

	private String phone;

	private String wxCode;

	/**
	 * 
	 * @param accountId
	 * @param phone
	 * @param wxCode
	 * @return
	 */
	public static final UserSwitchWXMIVo newVo(long accountId, String phone, String wxCode) {
		return new UserSwitchWXMIVo(accountId, phone, wxCode);
	}

	private UserSwitchWXMIVo(long accountId, String phone, String wxCode) {
		this.accountId = accountId;
		this.phone = phone;
		this.wxCode = wxCode;
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

	public String getWxCode() {
		return wxCode;
	}

	public void setWxCode(String wxCode) {
		this.wxCode = wxCode;
	}

	@Override
	public String toString() {
		return "UserSwitchWXMIVo [accountId=" + accountId + ", phone=" + phone + ", wxCode=" + wxCode + "]";
	}

}
