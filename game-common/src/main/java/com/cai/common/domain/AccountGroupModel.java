/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xwy
 *
 */
public class AccountGroupModel implements Serializable {

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private long account_id;

	private String groupId;

	private Date date;

	private int val;
	
	/**
	 * 目标账号名字
	 */
	private String target_name;
	
	/**
	 * 目标账号icon
	 */
	private String target_icon;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public String getTarget_name() {
		return target_name;
	}

	public void setTarget_name(String target_name) {
		this.target_name = target_name;
	}

	public String getTarget_icon() {
		return target_icon;
	}

	public void setTarget_icon(String target_icon) {
		this.target_icon = target_icon;
	}

}
