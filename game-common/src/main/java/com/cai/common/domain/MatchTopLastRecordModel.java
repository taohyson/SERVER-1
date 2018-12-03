package com.cai.common.domain;

import java.util.Date;

import com.cai.common.domain.json.MatchPrizeDetailModel.MatchPrizeRankModel;
import com.cai.common.util.JsonUtil;

public class MatchTopLastRecordModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private long record_id;
	private int match_id;
	private int rank_type;
	private int rank_index;
	private long account_id;
	private String head_url;
	private String nick_name;
	private int score;
	private String reward_msg;
	private Date reward_time;
	
	private MatchPrizeRankModel prizeModel;
	
	public long getRecord_id() {
		return record_id;
	}
	public void setRecord_id(long record_id) {
		this.record_id = record_id;
	}
	public int getMatch_id() {
		return match_id;
	}
	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	public int getRank_type() {
		return rank_type;
	}
	public void setRank_type(int rank_type) {
		this.rank_type = rank_type;
	}
	public int getRank_index() {
		return rank_index;
	}
	public void setRank_index(int rank_index) {
		this.rank_index = rank_index;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public String getHead_url() {
		return head_url;
	}
	public void setHead_url(String head_url) {
		this.head_url = head_url;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getReward_msg() {
		return reward_msg;
	}
	public void setReward_msg(String reward_msg) {
		this.reward_msg = reward_msg;
	}
	public Date getReward_time() {
		return reward_time;
	}
	public void setReward_time(Date reward_time) {
		this.reward_time = reward_time;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof MatchTopLastRecordModel){
			MatchTopLastRecordModel info = (MatchTopLastRecordModel) obj;
			if(info.getAccount_id() == account_id){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
	    int result = 1;
	    result = (int) (PRIME * result + getAccount_id());
		return result;
	}
	
	public MatchPrizeRankModel getPrizeModel() {
		return prizeModel;
	}
	public void setPrizeModel(MatchPrizeRankModel prizeModel) {
		this.prizeModel = prizeModel;
	}
	
	public void init(){
		if(reward_msg != null && reward_msg.length() > 0){
			prizeModel = JsonUtil.parseJsonObject(reward_msg, MatchPrizeRankModel.class);
		}
	}
	
	public void transfer(){
		reward_msg = "";
		if(prizeModel != null){
			reward_msg = JsonUtil.toJsonString(prizeModel);
		}
	}
	
}
