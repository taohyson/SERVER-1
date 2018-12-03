package com.cai.common.domain.activity;

import java.io.Serializable;

/**
 * 活动抽样随机奖励
 * 
 * @author chansonyan 2018年6月7日
 */
public class NewActivityPrizeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int count;
	private int prize_type;
	private int total_toplimit;
	private int everyday_toplimit;
	private String prize_name;
	private String icon;
	private String prize_desc;
	private String remark;
	private int item_id;
	private int active_id;
	// 是否限量，1代表限量， 2代表不限量
	private int is_limit;
	// 奖品每一次送出的数量
	private int single_prize_num;
	private int active_group;
	private int day;
	private int is_set_top;

	public int getIs_set_top() {
		return is_set_top;
	}

	public void setIs_set_top(int is_set_top) {
		this.is_set_top = is_set_top;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrize_type() {
		return prize_type;
	}

	public void setPrize_type(int prize_type) {
		this.prize_type = prize_type;
	}

	public int getTotal_toplimit() {
		return total_toplimit;
	}

	public void setTotal_toplimit(int total_toplimit) {
		this.total_toplimit = total_toplimit;
	}

	public int getEveryday_toplimit() {
		return everyday_toplimit;
	}

	public void setEveryday_toplimit(int everyday_toplimit) {
		this.everyday_toplimit = everyday_toplimit;
	}

	public int getActive_id() {
		return active_id;
	}

	public void setActive_id(int active_id) {
		this.active_id = active_id;
	}

	public String getPrize_name() {
		return prize_name;
	}

	public void setPrize_name(String prize_name) {
		this.prize_name = prize_name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPrize_desc() {
		return prize_desc;
	}

	public void setPrize_desc(String prize_desc) {
		this.prize_desc = prize_desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getIs_limit() {
		return is_limit;
	}

	public void setIs_limit(int is_limit) {
		this.is_limit = is_limit;
	}

	public int getSingle_prize_num() {
		return single_prize_num;
	}

	public void setSingle_prize_num(int single_prize_num) {
		this.single_prize_num = single_prize_num;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getActive_group() {
		return active_group;
	}

	public void setActive_group(int active_group) {
		this.active_group = active_group;
	}

}
