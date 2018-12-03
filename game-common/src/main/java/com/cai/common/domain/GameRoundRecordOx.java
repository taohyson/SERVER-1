package com.cai.common.domain;

/**
 * 
 */

import com.cai.common.constant.GameConstants;
import com.cai.common.domain.Player;

public class GameRoundRecordOx {
	public int cur_round;
	public int cards_data[][];
	public int jetton_player[];
	public int end_score[];
	public int area_status[];
	public int banker_seat;
	public int card_type[]; 
	public int card_times[];
	public int buy_jetton_value[];
	public int buy_jetton_area[];
	public boolean player_status[];
	public int  call_banker[];
	public Player player[];
	
	public GameRoundRecordOx(int max_index,int max_card,int max_area) {
		cards_data = new int[max_index][max_card];
		jetton_player = new int[max_index];
		
		for(int i =0 ;i<max_index;i++)
		{
			cards_data[i] = new int[max_card];
		}
		end_score = new int[max_index];
		area_status  = new int[max_index];
		banker_seat = GameConstants.INVALID_SEAT;
		card_type = new int[max_index]; 
		card_times = new int[max_index];
		buy_jetton_value = new int[max_index];
		buy_jetton_area = new int[max_index];
		player_status = new boolean[max_index];
		call_banker = new int[max_index];
		player = new Player[max_index];
			
	}

}
