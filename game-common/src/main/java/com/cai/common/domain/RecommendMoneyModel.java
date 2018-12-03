package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每日统计推广员返现金额
 * 
 */

@Document(collection = "recommend_money_log")
public class RecommendMoneyModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1394584924497847771L;
	/**
	 * 日期
	 */
	@Indexed
	private Date create_time;
	/**
	 * 账号ID
	 */
	private long accountId;
	/**
	 * 推荐人账号ID
	 */
	private long targetAccountId;
	/**
	 * 行为：1注册，2推荐代理
	 */
	private int type; 
	/**
	 * 来源：1自己，2二级代理，3三级代理,4普通玩家
	 */
	private int comeType;
	/**
	 * 获利
	 */
	private int incomeMoney;

	
	public long getTargetAccountId() {
		return targetAccountId;
	}

	public void setTargetAccountId(long targetAccountId) {
		this.targetAccountId = targetAccountId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getComeType() {
		return comeType;
	}

	public void setComeType(int comeType) {
		this.comeType = comeType;
	}

	public int getIncomeMoney() {
		return incomeMoney;
	}

	public void setIncomeMoney(int incomeMoney) {
		this.incomeMoney = incomeMoney;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	



}
