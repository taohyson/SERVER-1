package com.cai.common.domain;

import java.util.Date;
import java.util.List;

/**
 * 比赛报名
 */
public class MatchPlayerModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private int itemId;//参赛券id
	private int groupId;
	private int accountId;
	private int sign_seq;
	//[{area:0,state:0,tableNum:1,seatNum:1,score:0}]
	private String update_state;//晋级状态,area阶段，0表示报名入场阶段,state进场状态0未进场，1入场，2晋级
	private int cur_area;//当前阶段
	private int seat_state;//当前桌子是否分配
	private Date operate_time;// 后台操作时间
	private Date create_time;//
	private String operator;
	
	
	private List<MatchUpgradeModel> upgradeList;
	
	
	
	public int getSign_seq() {
		return sign_seq;
	}
	public void setSign_seq(int sign_seq) {
		this.sign_seq = sign_seq;
	}
	public List<MatchUpgradeModel> getUpgradeList() {
		return upgradeList;
	}
	public void setUpgradeList(List<MatchUpgradeModel> upgradeList) {
		this.upgradeList = upgradeList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getUpdate_state() {
		return update_state;
	}
	public void setUpdate_state(String update_state) {
		this.update_state = update_state;
	}
	public int getCur_area() {
		return cur_area;
	}
	public void setCur_area(int cur_area) {
		this.cur_area = cur_area;
	}
	public int getSeat_state() {
		return seat_state;
	}
	public void setSeat_state(int seat_state) {
		this.seat_state = seat_state;
	}
	public Date getOperate_time() {
		return operate_time;
	}
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
}
