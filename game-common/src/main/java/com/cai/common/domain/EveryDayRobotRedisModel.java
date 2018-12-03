/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;

/**
 * @author xwy
 *
 */
public class EveryDayRobotRedisModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3387042296051343375L;
	
	/**
	 * 日期
	 */
	private Integer notes_date;

	/**
	 * 群ID
	 */
	private String groupId;

	/**
	 * 扣费帐号ID
	 */
	private long account_id;

	/**
	 * 花费的房卡总数
	 */
	private int goldTotal;
	
	
	private int brandtotal;


	public Integer getNotes_date() {
		return notes_date;
	}


	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}


	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}


	public long getAccount_id() {
		return account_id;
	}


	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}


	public int getGoldTotal() {
		return goldTotal;
	}


	public void setGoldTotal(int goldTotal) {
		this.goldTotal = goldTotal;
	}


	public int getBrandtotal() {
		return brandtotal;
	}


	public void setBrandtotal(int brandtotal) {
		this.brandtotal = brandtotal;
	}


}
