package com.cai.common.domain;

import java.util.Date;

/**
 * 玩家参数记录
 * 
 * @author run
 *
 */
public class AccountParamModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8035268798474237938L;
	/**
	 * 账号id
	 */
	private long account_id;
	/**
	 * 类型编码
	 */
	private int type;
	/**
	 * 数值1
	 */
	private Integer val1;
	/**
	 * 字符串1
	 */
	private String str1;

	/**
	 * 长整型值1
	 */
	private Long long1;
	
	/**
	 * 日期值1
	 */
	private Date date1;
	
	
	/**
	 * 是否是新加的值
	 */
	private transient boolean isNewAddValue;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Integer getVal1() {
		return val1;
	}

	public void setVal1(Integer val1) {
		this.val1 = val1;
	}



	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public Long getLong1() {
		return long1;
	}

	public void setLong1(Long long1) {
		this.long1 = long1;
	}

	public boolean isNewAddValue() {
		return isNewAddValue;
	}

	public void setNewAddValue(boolean isNewAddValue) {
		this.isNewAddValue = isNewAddValue;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	

	
}
