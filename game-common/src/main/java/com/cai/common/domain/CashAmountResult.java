package com.cai.common.domain;

import java.io.Serializable;

/**
 * 
 * @author xwy
 * @date 2016年11月9日 -- 下午3:23:19
 *
 *收款帐号售卡统计
 */
public class CashAmountResult implements Serializable {
	
	private static final long serialVersionUID = 5849699393563449329L;
	
	private String cashAccountName;
	
	private String ossName;
	
	/**
	 * 总量-RMB
	 */
	private int total;
	
	
	private int sendTotal;
	
	
	private int shopId;
	
	
	private int sellType;
	
	
	public String getCashAccountName() {
		return cashAccountName;
	}
	public void setCashAccountName(String cashAccountName) {
		this.cashAccountName = cashAccountName;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getOssName() {
		return ossName;
	}
	public void setOssName(String ossName) {
		this.ossName = ossName;
	}
	public int getSendTotal() {
		return sendTotal;
	}
	public void setSendTotal(int sendTotal) {
		this.sendTotal = sendTotal;
	}
	public int getSellType() {
		return sellType;
	}
	public void setSellType(int sellType) {
		this.sellType = sellType;
	}
	
	
}
