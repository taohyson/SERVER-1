package com.cai.common.domain.activity.dice;

import java.io.Serializable;

/**
 * 骰子网格奖励
 * @author chansonyan
 * 2018年11月23日
 */
public class DiceGridPrizeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int dice_activity_id;
	private int grid;
	private String prize_name;
	private String icon;
	private String everyday_toplimit;
	private String prize_desc;
	private int item_id;
	private int is_limit;
	// 奖品每一次送出的数量
	private int single_prize_num;
	private int active_group;
	private int day;
	private int is_set_top;
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDice_activity_id() {
		return dice_activity_id;
	}
	public void setDice_activity_id(int dice_activity_id) {
		this.dice_activity_id = dice_activity_id;
	}
	public int getGrid() {
		return grid;
	}
	public void setGrid(int grid) {
		this.grid = grid;
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
	public String getEveryday_toplimit() {
		return everyday_toplimit;
	}
	public void setEveryday_toplimit(String everyday_toplimit) {
		this.everyday_toplimit = everyday_toplimit;
	}
	public String getPrize_desc() {
		return prize_desc;
	}
	public void setPrize_desc(String prize_desc) {
		this.prize_desc = prize_desc;
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
	public int getActive_group() {
		return active_group;
	}
	public void setActive_group(int active_group) {
		this.active_group = active_group;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getIs_set_top() {
		return is_set_top;
	}
	public void setIs_set_top(int is_set_top) {
		this.is_set_top = is_set_top;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
