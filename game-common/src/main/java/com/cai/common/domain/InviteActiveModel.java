package com.cai.common.domain;

import java.util.Date;

/**
 * 邀请送红包活动
 * 
 * @author tang
 *
 */
public class InviteActiveModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String active_name;
	private String active_desc;
	private Date begin_time;
	private Date end_time;
	private int pay;//被邀请获利金额，分为单位
	private int invite_pay;//邀请获利
	private int max_limit;//能获利的最大推广人数
	private int state ;//活动状态
	private int time_limit;//限制注册天数
	private int brand_limit;//参与的局数限制
	private String prize_json;//活动礼品列表[{"name":"iphonex",pic:""}],pic图片地址
	private int openTime;//弹出时间，0标识不弹出，1，2，3表示每隔多久弹出一次
	private int total_redpacket;//活动期间的红包总个数
	private String active_desc_bg_img;//背景
	
	
	public String getActive_desc_bg_img() {
		return active_desc_bg_img;
	}
	public void setActive_desc_bg_img(String active_desc_bg_img) {
		this.active_desc_bg_img = active_desc_bg_img;
	}
	public int getTotal_redpacket() {
		return total_redpacket;
	}
	public void setTotal_redpacket(int total_redpacket) {
		this.total_redpacket = total_redpacket;
	}
	public int getOpenTime() {
		return openTime;
	}
	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}
	public String getPrize_json() {
		return prize_json;
	}
	public void setPrize_json(String prize_json) {
		this.prize_json = prize_json;
	}
	public int getInvite_pay() {
		return invite_pay;
	}
	public void setInvite_pay(int invite_pay) {
		this.invite_pay = invite_pay;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getTime_limit() {
		return time_limit;
	}
	public void setTime_limit(int time_limit) {
		this.time_limit = time_limit;
	}
	public int getBrand_limit() {
		return brand_limit;
	}
	public void setBrand_limit(int brand_limit) {
		this.brand_limit = brand_limit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActive_name() {
		return active_name;
	}
	public void setActive_name(String active_name) {
		this.active_name = active_name;
	}
	public String getActive_desc() {
		return active_desc;
	}
	public void setActive_desc(String active_desc) {
		this.active_desc = active_desc;
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getMax_limit() {
		return max_limit;
	}
	public void setMax_limit(int max_limit) {
		this.max_limit = max_limit;
	}
	
	
}
