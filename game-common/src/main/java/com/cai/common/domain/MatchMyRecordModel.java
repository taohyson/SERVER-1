package com.cai.common.domain;

public class MatchMyRecordModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private long account_id;
	private String rank_msg;
	private String summary_msg;
	private String game_msg;
	private String account_type_msg;
	
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public String getRank_msg() {
		return rank_msg;
	}
	public void setRank_msg(String rank_msg) {
		this.rank_msg = rank_msg;
	}
	public String getSummary_msg() {
		return summary_msg;
	}
	public void setSummary_msg(String summary_msg) {
		this.summary_msg = summary_msg;
	}
	public String getGame_msg() {
		return game_msg;
	}
	public void setGame_msg(String game_msg) {
		this.game_msg = game_msg;
	}
	public String getAccount_type_msg() {
		return account_type_msg;
	}
	public void setAccount_type_msg(String account_type_msg) {
		this.account_type_msg = account_type_msg;
	}
	
}
