package com.cai.common.domain;

/**
 * 比赛场
 */
public class MatchLevelModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int level_id;
	private String name;
	private int red_score;
	private int silver_score;
	private int gold_score;
	
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

}
