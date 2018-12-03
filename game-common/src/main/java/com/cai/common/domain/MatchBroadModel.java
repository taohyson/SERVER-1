package com.cai.common.domain;

import java.io.Serializable;

/**
 * 比赛场获奖公告
 * 
 * @author run
 *
 */
public class MatchBroadModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;					//主键
	private int match_union_id;		//联赛ID
	private int match_id;			//比赛ID
	private int broad_type;			//播放类型(1比赛场界面播放2APP内播放)
	private int broad_num;			//播放次数
	private String notice_content;		//公告内容
	//【公告】恭喜玩家【#nickname#】在【#matchUnionAndmatchName#】中凭借高超牌技荣获冠军,获得【#prizeNameAndcount#】奖励!
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatch_union_id() {
		return match_union_id;
	}
	public void setMatch_union_id(int match_union_id) {
		this.match_union_id = match_union_id;
	}
	public int getMatch_id() {
		return match_id;
	}
	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	public int getBroad_type() {
		return broad_type;
	}
	public void setBroad_type(int broad_type) {
		this.broad_type = broad_type;
	}
	public int getBroad_num() {
		return broad_num;
	}
	public void setBroad_num(int broad_num) {
		this.broad_num = broad_num;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	
	

}
