package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class AccountProxyModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	/**
	 * 玩家id
	 */
	private long account_id;
	
	/**
	 * 目标玩家
	 */
	private long target_account_id;
	/**
	 * 创建时间
	 */
	private Date create_time;
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 1-同意 0-申请中
	 */
	private int apply;
	
	/**
	 * 目标的代理等级
	 */
	private int target_proxy_level;
	
	//扩展
	/**
	 * 目标账号名字
	 */
	private String target_name;
	
	/**
	 * 目标账号icon
	 */
	private String target_icon;
	
	/**
	 *下级代理剩余卡
	 */
	private long target_gold;
	
	/**
	 *下级代理累计
	 */
	private long target_total_consum;
	
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

	public long getTarget_account_id() {
		return target_account_id;
	}

	public void setTarget_account_id(long target_account_id) {
		this.target_account_id = target_account_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getApply() {
		return apply;
	}

	public void setApply(int apply) {
		this.apply = apply;
	}

	public long getTarget_gold() {
		return target_gold;
	}

	public void setTarget_gold(long target_gold) {
		this.target_gold = target_gold;
	}

	public long getTarget_total_consum() {
		return target_total_consum;
	}

	public void setTarget_total_consum(long target_total_consum) {
		this.target_total_consum = target_total_consum;
	}

	public int getTarget_proxy_level() {
		return target_proxy_level;
	}

	public void setTarget_proxy_level(int target_proxy_level_) {
		this.target_proxy_level = target_proxy_level_;
	}
	
	

}
