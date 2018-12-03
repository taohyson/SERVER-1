/**
 * 
 */
package com.cai.common.domain;

import java.util.Date;

public class MatchAthleticsRecord extends DBBaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long account_id;
	private int player_level;
	private int red_score;
	private int silver_score;
	private int gold_score;
	private int game_rank;
	private int global_rank;
	private int reward_money;
	private int withdraw_num;
	private int exchange_num;
	private String account_name;
	private String identity_num;
	private String bank_name;
	private String bank_num;
	private Date op_time;
	private String phone_num;
	
	private String nickname;
	private String headUrl;
	
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public int getPlayer_level() {
		return player_level;
	}
	public void setPlayer_level(int player_level) {
		this.player_level = player_level;
	}
	public int getRed_score() {
		return red_score;
	}
	public void setRed_score(int red_score) {
		this.red_score = red_score;
	}
	public int getSilver_score() {
		return silver_score;
	}
	public void setSilver_score(int silver_score) {
		this.silver_score = silver_score;
	}
	public int getGold_score() {
		return gold_score;
	}
	public void setGold_score(int gold_score) {
		this.gold_score = gold_score;
	}
	public int getGame_rank() {
		return game_rank;
	}
	public void setGame_rank(int game_rank) {
		this.game_rank = game_rank;
	}
	public int getGlobal_rank() {
		return global_rank;
	}
	public void setGlobal_rank(int global_rank) {
		this.global_rank = global_rank;
	}
	public int getReward_money() {
		return reward_money;
	}
	public void setReward_money(int reward_money) {
		this.reward_money = reward_money;
	}
	public int getWithdraw_num() {
		return withdraw_num;
	}
	public void setWithdraw_num(int withdraw_num) {
		this.withdraw_num = withdraw_num;
	}
	public int getExchange_num() {
		return exchange_num;
	}
	public void setExchange_num(int exchange_num) {
		this.exchange_num = exchange_num;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getIdentity_num() {
		return identity_num;
	}
	public void setIdentity_num(String identity_num) {
		this.identity_num = identity_num;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_num() {
		return bank_num;
	}
	public void setBank_num(String bank_num) {
		this.bank_num = bank_num;
	}
	public Date getOp_time() {
		return op_time;
	}
	public void setOp_time(Date op_time) {
		this.op_time = op_time;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

}
