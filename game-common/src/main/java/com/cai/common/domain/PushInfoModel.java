package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;


public class PushInfoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;						//主键
	private int way;						//推送方式(1app推送2短信推送)
	//EPushType
	private int type;						//推送类型(1签到推送2分享推送3俱乐部推送4赛事推送5自定义推送6绑定手机推送7比赛开始推送8代理闲逸豆不足推送)
	
	private int time_type;					//推送时间方式(1定时推送2赛前推送)
	private String time;					//推送时间
	//EAccountType
	private int player_identity;			//玩家身份
	private Date last_login_begin_time;		//最近一次登录开始时间
	private Date last_login_end_time;		//最近一次登录截止时间
	private String title;					//推送标题
	private String content;					//推送内容
	private Date start_time;				//推送有效期开始时间
	private Date end_time;					//推送有效期截止时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWay() {
		return way;
	}
	public void setWay(int way) {
		this.way = way;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTime_type() {
		return time_type;
	}
	public void setTime_type(int time_type) {
		this.time_type = time_type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPlayer_identity() {
		return player_identity;
	}
	public void setPlayer_identity(int player_identity) {
		this.player_identity = player_identity;
	}
	public Date getLast_login_begin_time() {
		return last_login_begin_time;
	}
	public void setLast_login_begin_time(Date last_login_begin_time) {
		this.last_login_begin_time = last_login_begin_time;
	}
	public Date getLast_login_end_time() {
		return last_login_end_time;
	}
	public void setLast_login_end_time(Date last_login_end_time) {
		this.last_login_end_time = last_login_end_time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
}
