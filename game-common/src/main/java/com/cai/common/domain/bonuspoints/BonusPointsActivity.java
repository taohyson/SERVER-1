package com.cai.common.domain.bonuspoints;

import java.util.Date;

/**
 * 积分活动
 *
 */
public class BonusPointsActivity {

	private int id;
	private String activity_name;
	private String remark;
	private String operator;// 操作者
	private int agent_rate;// 普通代理返还积分比（默认100%）
	private int silver_rate;// 白银推广员返还积分比
	private int gold_rate;// 黄金
	private int diamond_rate;// 钻石
	private int state;// 1立即生效，2定时生效
	private Date begin_time;// 生效时间
	private Date end_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getAgent_rate() {
		return agent_rate;
	}

	public void setAgent_rate(int agent_rate) {
		this.agent_rate = agent_rate;
	}

	public int getSilver_rate() {
		return silver_rate;
	}

	public void setSilver_rate(int silver_rate) {
		this.silver_rate = silver_rate;
	}

	public int getGold_rate() {
		return gold_rate;
	}

	public void setGold_rate(int gold_rate) {
		this.gold_rate = gold_rate;
	}

	public int getDiamond_rate() {
		return diamond_rate;
	}

	public void setDiamond_rate(int diamond_rate) {
		this.diamond_rate = diamond_rate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

}
