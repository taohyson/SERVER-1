package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.define.EWxHeadimgurlType;
import com.cai.common.util.WxUtil;

public class AgentRecommendModel implements Serializable {

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
	 * 目标账号名字
	 */
	private String target_name;
	
	/**
	 * 目标账号icon
	 */
	private String target_icon;
	
	
	private int target_gold;
	
	/**
	 * 成为推广员时间
	 */
	private String update_time;
	/**
	 * 推广员级别
	 */
	private int agent_level;
	
	
	
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
		return WxUtil.changHeadimgurl(target_icon, EWxHeadimgurlType.S46);
	}

	public void setTarget_icon(String target_icon) {
		this.target_icon = target_icon;
	}

	/**
	 * @param gold
	 */
	public void setTarget_gold(long gold) {
		this.target_gold = (int)target_gold;
	}

	public int getTarget_gold() {
		return target_gold;
	}

	public void setTarget_gold(int target_gold) {
		this.target_gold = target_gold;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public int getAgent_level() {
		return agent_level;
	}

	public void setAgent_level(int agent_level) {
		this.agent_level = agent_level;
	}

	
	

}
