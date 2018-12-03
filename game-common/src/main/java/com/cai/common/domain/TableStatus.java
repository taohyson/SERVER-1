package com.cai.common.domain;

import com.cai.common.constant.GameConstants;

public class TableStatus {
	// 出牌信息
	
	public int _out_card_player = GameConstants.INVALID_SEAT; // 出牌用户
	public int _out_card_data = GameConstants.INVALID_VALUE; // 出牌扑克
	public int _out_card_count = GameConstants.INVALID_VALUE; // 出牌数目
	public int _all_card_len=0;
	
	public int _banker_select = GameConstants.INVALID_SEAT;
	
	// 运行变量
	public int _provide_card = GameConstants.INVALID_VALUE; // 供应扑克
	public int _resume_player = GameConstants.INVALID_SEAT; // 还原用户
	public int _current_player = GameConstants.INVALID_SEAT; // 当前用户
	public int _provide_player = GameConstants.INVALID_SEAT; // 供应用户
		
	// 状态变量
	public boolean _status_send; // 发牌状态
	public boolean _status_gang; // 抢杆状态
	public boolean _status_gang_hou_pao; // 杠后炮状态
	
	public int _game_status;
	
	public int _send_card_data = GameConstants.INVALID_VALUE; // 发牌扑克
	public int _send_card_count = GameConstants.INVALID_VALUE; // 发牌数目
	
	public TableStatus(){
		
		
	}
	
	//发牌状态
	public void status_send_card(){
		_out_card_data = GameConstants.INVALID_VALUE;
		_out_card_player = GameConstants.INVALID_SEAT;
		_send_card_data = GameConstants.INVALID_VALUE;
		
	}
}
