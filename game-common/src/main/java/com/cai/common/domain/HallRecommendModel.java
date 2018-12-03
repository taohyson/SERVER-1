package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class HallRecommendModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
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
	 * 成为推广员时间
	 */
	private String update_time;
	/**
	 * 推广员级别
	 */
	private int recommend_level;
	/**
	 * 代理级别
	 */
	private int proxy_level;
	/**
	 * 钻石+的用户id
	 */
	private long top_id;

	private String target_name;

	private String target_icon;

	private int office_id;

	private int source;// 开通代理来源

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
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

	public long getTop_id() {
		return top_id;
	}

	public void setTop_id(long top_id) {
		this.top_id = top_id;
	}

	public HallRecommendModel() {
	}

	public HallRecommendModel(long account_id, long target_account_id) {
		super();
		this.account_id = account_id;
		this.target_account_id = target_account_id;
	}

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

	public int getProxy_level() {
		return proxy_level;
	}

	public void setProxy_level(int proxy_level) {
		this.proxy_level = proxy_level;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

}
