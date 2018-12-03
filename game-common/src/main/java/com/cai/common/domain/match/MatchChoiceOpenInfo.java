package com.cai.common.domain.match;

import java.io.Serializable;

public class MatchChoiceOpenInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int is_accumulate;					//免费次数是否累积
	private int show_time;						//比赛列表提前几天显示
	private int first_round_play_card_time;	//首轮首出玩家出牌时间

	public int getIs_accumulate() {
		return is_accumulate;
	}
	public void setIs_accumulate(int is_accumulate) {
		this.is_accumulate = is_accumulate;
	}
	public int getShow_time() {
		return show_time;
	}
	public void setShow_time(int show_time) {
		this.show_time = show_time;
	}
	public int getFirst_round_play_card_time() {
		return first_round_play_card_time;
	}
	public void setFirst_round_play_card_time(int first_round_play_card_time) {
		this.first_round_play_card_time = first_round_play_card_time;
	}

}
