/**
 * 
 */
package com.cai.common.domain;

public class MatchAthleticsSort extends DBBaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long account_id;
	private int rank_type;
	private int player_level;
	private int red_score;
	private int silver_score;
	private int gold_score;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public int getRank_type() {
		return rank_type;
	}
	public void setRank_type(int rank_type) {
		this.rank_type = rank_type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof MatchAthleticsSort){
			MatchAthleticsSort info = (MatchAthleticsSort) obj;
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

}
