package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.domain.activity.MainPrizes;

/**
 * 邀请好友活动
 * 
 * @author wuhaoran
 */
public class InviteFriendsActivityModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id; // 主键
	private int max_invite_person; // 最大邀请人数
	private String invite_prize; // 成功邀请奖励
	private int activity_id; // 关联的活动,默认关联新手豪礼
	private int open_user; // 活动开房用户(0所有用户1新用户2代理3推广员)
	private String remark; // 备注
	private String share_icon; // 分享图
	private Date start_time; // 开始时间
	private Date end_time; // 结束时间
	private MainPrizes mainPrize; // 解析json格式
	private int state; // 活动状态，0下线，1上线
	private int max_activity_person; // 活动最大邀请人数

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMax_invite_person() {
		return max_invite_person;
	}

	public void setMax_invite_person(int max_invite_person) {
		this.max_invite_person = max_invite_person;
	}

	public String getInvite_prize() {
		return invite_prize;
	}

	public void setInvite_prize(String invite_prize) {
		this.invite_prize = invite_prize;
	}

	public int getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}

	public int getOpen_user() {
		return open_user;
	}

	public void setOpen_user(int open_user) {
		this.open_user = open_user;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShare_icon() {
		return share_icon;
	}

	public void setShare_icon(String share_icon) {
		this.share_icon = share_icon;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public MainPrizes getMainPrize() {
		return mainPrize;
	}

	public void setMainPrize(MainPrizes mainPrize) {
		this.mainPrize = mainPrize;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getMax_activity_person() {
		return max_activity_person;
	}

	public void setMax_activity_person(int max_activity_person) {
		this.max_activity_person = max_activity_person;
	}

}
