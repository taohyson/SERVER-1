package com.cai.common.domain;

import java.io.Serializable;

public class RedPackageActivityModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;						//主键
	private String activity_time;			//活动时间(格式1970-01-01 00:00:00~1970-01-01 23:59:59|1970-01-01 00:00:00~1970-01-01 23:59:59)				
	private int activity_type;				//活动类型(1红包雨红包2运财童子红包)
	private String game_id;					//子游戏ID(用逗号分隔)
	private int small_roundNum;			//小局数
	private int big_roundNum;				//大局数
	private int room_redPackage_num;		//单个房间号最多只能获得多少次红包雨
	private int player_redPackage_num;		//玩家在活动期间累计获得红包次数
	private String red_package_content;		//红包内容(档次,概率,金额)
	private int lottery_num;				//每日抽奖次数
	private int interval_time;				//抽奖间隔时间(以分钟为单位)
	private int state;
	private int prize_count;//红包总数
	
	
	
	
	public int getPrize_count() {
		return prize_count;
	}
	public void setPrize_count(int prize_count) {
		this.prize_count = prize_count;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getActivity_time() {
		return activity_time;
	}
	public void setActivity_time(String activity_time) {
		this.activity_time = activity_time;
	}
	
	public int getActivity_type() {
		return activity_type;
	}
	public void setActivity_type(int activity_type) {
		this.activity_type = activity_type;
	}
	
	public String getGame_id() {
		return game_id;
	}
	public void setGame_id(String game_id) {
		this.game_id = game_id;
	}
	
	public int getSmall_roundNum() {
		return small_roundNum;
	}
	public void setSmall_roundNum(int small_roundNum) {
		this.small_roundNum = small_roundNum;
	}
	
	public int getBig_roundNum() {
		return big_roundNum;
	}
	public void setBig_roundNum(int big_roundNum) {
		this.big_roundNum = big_roundNum;
	}
	
	public int getRoom_redPackage_num() {
		return room_redPackage_num;
	}
	public void setRoom_redPackage_num(int room_redPackage_num) {
		this.room_redPackage_num = room_redPackage_num;
	}
	
	public int getPlayer_redPackage_num() {
		return player_redPackage_num;
	}
	public void setPlayer_redPackage_num(int player_redPackage_num) {
		this.player_redPackage_num = player_redPackage_num;
	}
	
	public String getRed_package_content() {
		return red_package_content;
	}
	public void setRed_package_content(String red_package_content) {
		this.red_package_content = red_package_content;
	}
	
	public int getLottery_num() {
		return lottery_num;
	}
	public void setLottery_num(int lottery_num) {
		this.lottery_num = lottery_num;
	}
	
	public int getInterval_time() {
		return interval_time;
	}
	public void setInterval_time(int interval_time) {
		this.interval_time = interval_time;
	}
}
