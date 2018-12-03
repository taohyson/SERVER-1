/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.vo;

import java.io.Serializable;

/**
 * 钻石兑换VO
 * @author chansonyan
 * 2018年9月11日
 */
public final class SdkDiamondExchangeDataVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private long accountId;

	private long appId;
	
	private String itemId;
	
	private double amount;
	
	// SDK订单ID
	private String orderId;
	
	//cp 订单ID
	private String cpOrderId;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCpOrderId() {
		return cpOrderId;
	}

	public void setCpOrderId(String cpOrderId) {
		this.cpOrderId = cpOrderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
