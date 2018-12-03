/**
 * 
 */
package com.cai.common.domain;

/**
 * @author xwy
 *
 */

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每日机器人统计
 * 
 * @author run
 *
 */

@Document(collection = "every_day_robot")
public class EveryDayRobotModel implements Serializable {

	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
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

	/**
	 * 
	 */
	private String msg;
	
	/**
	 * 扣费帐号ID
	 */
	private long recommend_id;

	public Integer getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}


	public int getGoldTotal() {
		return goldTotal;
	}

	public void setGoldTotal(int goldTotal) {
		this.goldTotal = goldTotal;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

	public int getBrandtotal() {
		return brandtotal;
	}

	public void setBrandtotal(int brandtotal) {
		this.brandtotal = brandtotal;
	}

	public long getRecommend_id() {
		return recommend_id;
	}

	public void setRecommend_id(long recommend_id) {
		this.recommend_id = recommend_id;
	}

	

}
