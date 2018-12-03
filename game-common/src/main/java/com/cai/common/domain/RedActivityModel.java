/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;

/**
 *
 *	紅包雨活動奖励记录
 * @author WalkerGeek 
 * date: 2017年9月8日 下午3:26:22 <br/>
 */
public class RedActivityModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long account_id;	 //账号id
	
	private int all_money; 		 //全部红包金额/分
	
	private int receive_money;	 //领取红包金额/分

	/**
	 * @return the account_id
	 */
	public long getAccount_id() {
		return account_id;
	}

	/**
	 * @param account_id the account_id to set
	 */
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}


	/**
	 * @return the all_money
	 */
	public int getAll_money() {
		return all_money;
	}

	/**
	 * @param all_money the all_money to set
	 */
	public void setAll_money(int all_money) {
		this.all_money = all_money;
	}

	/**
	 * @return the receive_money
	 */
	public int getReceive_money() {
		return receive_money;
	}

	/**
	 * @param receive_money the receive_money to set
	 */
	public void setReceive_money(int receive_money) {
		this.receive_money = receive_money;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
