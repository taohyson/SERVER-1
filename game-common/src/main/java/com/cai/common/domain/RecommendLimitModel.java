package com.cai.common.domain;

import java.util.Date;

/**
 * 推广员限制
 * @author tang
 *
 */
public class RecommendLimitModel {
	private int id;
	private long account_id;
	private int agent_num_limit;//推广员的直属代理人数限制
	private int recom_num_limit;//下级推广员人数限制
	private int recom_receive_per;//下级推广员返利比
	private int agent_receive_per;//直属代理返利比
	private int two_gen_agent_receive_per;//下级推广员或者下下级的代理返利比
	private int two_gen_recom_receive_per;//下级的下级推广员返利比
	private Date create_time;
	
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
	public int getAgent_num_limit() {
		return agent_num_limit;
	}
	public void setAgent_num_limit(int agent_num_limit) {
		this.agent_num_limit = agent_num_limit;
	}
	public int getRecom_num_limit() {
		return recom_num_limit;
	}
	public void setRecom_num_limit(int recom_num_limit) {
		this.recom_num_limit = recom_num_limit;
	}
	public int getRecom_receive_per() {
		return recom_receive_per;
	}
	public void setRecom_receive_per(int recom_receive_per) {
		this.recom_receive_per = recom_receive_per;
	}
	public int getAgent_receive_per() {
		return agent_receive_per;
	}
	public void setAgent_receive_per(int agent_receive_per) {
		this.agent_receive_per = agent_receive_per;
	}
	public int getTwo_gen_agent_receive_per() {
		return two_gen_agent_receive_per;
	}
	public void setTwo_gen_agent_receive_per(int two_gen_agent_receive_per) {
		this.two_gen_agent_receive_per = two_gen_agent_receive_per;
	}
	public int getTwo_gen_recom_receive_per() {
		return two_gen_recom_receive_per;
	}
	public void setTwo_gen_recom_receive_per(int two_gen_recom_receive_per) {
		this.two_gen_recom_receive_per = two_gen_recom_receive_per;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	
}
