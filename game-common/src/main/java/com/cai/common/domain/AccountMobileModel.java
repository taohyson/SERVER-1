/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月1日 下午3:16:09 <br/>
 */
public class AccountMobileModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long account_id;

	private String mobile_phone;

	/**
	 * 上一次解绑时间
	 */
	private long lastBindTime;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public long getLastBindTime() {
		return lastBindTime;
	}

	public void setLastBindTime(long lastBindTime) {
		this.lastBindTime = lastBindTime;
	}

	@Override
	public String toString() {
		return "AccountMobileModel [account_id=" + account_id + ", mobile_phone=" + mobile_phone + ", lastBindTime=" + lastBindTime + "]";
	}

}
