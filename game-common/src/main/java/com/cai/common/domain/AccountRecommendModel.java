package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.define.EWxHeadimgurlType;
import com.cai.common.util.WxUtil;

public class AccountRecommendModel implements Serializable {
	
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
	 * 获得的金币数
	 */
	private int gold_num;
	
	//扩展
	/**
	 * 目标账号名字
	 */
	private String target_name;
	
	/**
	 * 目标账号icon
	 */
	private String target_icon;
	
	
	private int target_gold;
	
	
	private int target_consum;
	/**
	 * 成为推广员时间
	 */
	private String update_time;
	/**
	 * 推广员级别
	 */
	private int recommend_level;
	
	private int target_total_consum;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public long getTarget_account_id() {
		return target_account_id;
	}

	public void setTarget_account_id(long target_account_id) {
		this.target_account_id = target_account_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}



	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getGold_num() {
		return gold_num;
	}

	public void setGold_num(int gold_num) {
		this.gold_num = gold_num;
	}

	public String getTarget_name() {
		return target_name;
	}

	public void setTarget_name(String target_name) {
		this.target_name = target_name;
	}

	public String getTarget_icon() {
		return WxUtil.changHeadimgurl(target_icon, EWxHeadimgurlType.S132);
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


	public int getTarget_total_consum() {
		return target_total_consum;
	}

	public void setTarget_total_consum(int target_total_consum) {
		this.target_total_consum = target_total_consum;
	}

	public int getTarget_gold() {
		return target_gold;
	}

	public void setTarget_gold(int target_gold) {
		this.target_gold = target_gold;
	}

	public int getTarget_consum() {
		return target_consum;
	}

	public void setTarget_consum(int target_consum) {
		this.target_consum = target_consum;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public int getRecommend_level() {
		return recommend_level;
	}

	public void setRecommend_level(int recommend_level) {
		this.recommend_level = recommend_level;
	}
	
	

}
