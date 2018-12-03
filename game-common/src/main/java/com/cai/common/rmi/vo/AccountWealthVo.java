/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

import com.cai.common.define.EGoldOperateType;
import com.cai.common.define.EWealthCategory;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月28日 下午9:09:41 <br/>
 */
public final class AccountWealthVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final long accountId;
	private final long newValue;
	private final EWealthCategory category;
	private final EGoldOperateType opType;

	public static AccountWealthVo newVo(long accountId, long newValue, EWealthCategory category) {
		return new AccountWealthVo(accountId, newValue, category, null);
	}

	public static AccountWealthVo newVo(long accountId, long newValue, EWealthCategory category, EGoldOperateType opType) {
		return new AccountWealthVo(accountId, newValue, category, opType);
	}

	/**
	 * 
	 * @param accountId
	 * @param newValue
	 * @param category
	 */
	private AccountWealthVo(long accountId, long newValue, EWealthCategory category, EGoldOperateType opType) {
		this.accountId = accountId;
		this.newValue = newValue;
		this.category = category;
		this.opType = opType;
	}

	public long getAccountId() {
		return accountId;
	}

	public long getNewValue() {
		return newValue;
	}

	public EWealthCategory getCategory() {
		return category;
	}

	public EGoldOperateType getOpType() {
		return opType;
	}

}
