package com.cai.common.domain;

import java.util.Date;
/**
 * 比赛奖励配置
 */
public class MatchPrizeModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int match_id;
	//比赛奖励配置,minRank，maxRank排名范围,minRank=maxRank表示一个排名
	//包含内容[{minRank:1,maxRank:1,coins:1000,gold:100,prizeExattr:[{prizeId:100011,prizeName:"奖品1",count:1},{prizeId:100012,prizeName:"奖品2",count:1}]}]
	private String prize_detail;
	private String prize_float_detail;
	
	private Date create_time;
	
	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getPrize_detail() {
		return prize_detail;
	}

	public void setPrize_detail(String prize_detail) {
		this.prize_detail = prize_detail;
	}

	public MatchPrizeModel(MatchModel model) {
		super();
		this.id = 0;
		this.match_id = model.getMatch_id();
		this.prize_detail = model.getPrize_detail();
		this.create_time = model.getCreate_time();
		this.prize_float_detail = model.getPrize_float_detail();
	}

	public MatchPrizeModel(){}

	public String getPrize_float_detail() {
		return prize_float_detail;
	}

	public void setPrize_float_detail(String prize_float_detail) {
		this.prize_float_detail = prize_float_detail;
	}
	
}
