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
public final class CertificationRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;

	private String realName;

	private String realId;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRealId() {
		return realId;
	}

	public void setRealId(String realId) {
		this.realId = realId;
	}

	@Override
	public String toString() {
		return "CertificationRMIVo [accountId=" + accountId + ", realName=" + realName + ", realId=" + realId + "]";
	}

}
