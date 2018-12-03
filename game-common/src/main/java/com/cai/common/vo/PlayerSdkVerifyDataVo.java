/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.vo;

import java.io.Serializable;

/**
 * 返回SDK viewer
 * @author chansonyan
 * 2018年8月31日
 */
public final class PlayerSdkVerifyDataVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private long accountId;

	private String token;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
