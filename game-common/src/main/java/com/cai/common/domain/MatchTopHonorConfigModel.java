package com.cai.common.domain;

public class MatchTopHonorConfigModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int game_id;
	private String honor_name;
	private String name_url;
	private String lable_url;
	private String medal_url;
	private String effects_animation;
	private String tip;
	private int vaild_day;
	private int min_rank;
	private int max_rank;
	private String reward_msg;
	private String table_animation;
	private int level;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public String getHonor_name() {
		return honor_name;
	}
	public void setHonor_name(String honor_name) {
		this.honor_name = honor_name;
	}
	public String getName_url() {
		return name_url;
	}
	public void setName_url(String name_url) {
		this.name_url = name_url;
	}
	public String getLable_url() {
		return lable_url;
	}
	public void setLable_url(String lable_url) {
		this.lable_url = lable_url;
	}
	public String getMedal_url() {
		return medal_url;
	}
	public void setMedal_url(String medal_url) {
		this.medal_url = medal_url;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getVaild_day() {
		return vaild_day;
	}
	public void setVaild_day(int vaild_day) {
		this.vaild_day = vaild_day;
	}
	public int getMin_rank() {
		return min_rank;
	}
	public void setMin_rank(int min_rank) {
		this.min_rank = min_rank;
	}
	public int getMax_rank() {
		return max_rank;
	}
	public void setMax_rank(int max_rank) {
		this.max_rank = max_rank;
	}
	public String getReward_msg() {
		return reward_msg;
	}
	public void setReward_msg(String reward_msg) {
		this.reward_msg = reward_msg;
	}
	public String getEffects_animation() {
		return effects_animation;
	}
	public void setEffects_animation(String effects_animation) {
		this.effects_animation = effects_animation;
	}
	public String getTable_animation() {
		return table_animation;
	}
	public void setTable_animation(String table_animation) {
		this.table_animation = table_animation;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
