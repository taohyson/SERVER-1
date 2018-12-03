/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 红包池
 *
 * @author tang 
 */
public final class RedpacketPoolRMIVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ERedpacketPoolType
	 */
	private final int type;
	
	private long accountId;

	private int money;

	public int getType() {
		return type;
	}

	public static RedpacketPoolRMIVo newVo(int type, long accountId, int money) {
		return new RedpacketPoolRMIVo(type, accountId, money);
	}

	private RedpacketPoolRMIVo(int type, long accountId, int money) {
		this.type = type;
		this.accountId = accountId;
		this.money = money;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "RedpacketPoolRMIVo [type=" + type + ", accountId=" + accountId + ", money=" + money + "]";
	}

}
