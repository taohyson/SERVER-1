package com.cai.common.constant.game;

public class TDZConstants {
	
	public static final int HAND_CARD_COUNT = 2; // 手牌数
	public static final int TIMER_ID = 3008; // 定时ID

	public static final int TDZ_RULE_BASE_50 = 9; // 50底分
	public static final int TDZ_RULE_BASE_100 = 10; // 100底分
	public static final int TDZ_RULE_ZHUANG_WIN = 1; // 打和庄家赢
	public static final int TDZ_RULE_DA_HE = 2; // 打和
	public static final int TDZ_RULE_QIANG_ZHUANG = 7; // 抢庄
	public static final int TDZ_RULE_FANG_ZHU_ZHUANG = 8;// 房主庄
	public static final int TDZ_RULE_FOUR = 4; // 4人场
	public static final int TDZ_RULE_SIX = 6; // 6人场

	// 牌型胜负
	public static final int WIN = 1;
	public static final int LOSE = -1;
	public static final int SAME = 0;

	/**
	 * 推对子
	 */
	public static final int[] TUI_DUI_ZI = { 
			0x35, 0x35, 0x35, 0x35, 
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};

	// 协议
	public static final int RESPONSE_GAME_START = 1001;//// 1007 开始(gameStart)
	public static final int RESPONSE_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_GAME_END = 1003;
	public static final int RESPONSE_SEND_BANKER = 1004;

	public static final int RESPONSE_SEND_CARD = 1100; // 用户发牌
	public static final int RESPONSE_OPEN_CARD = 1101;// 用户开牌
	public static final int RESPONSE_CALL_BANKER = 1102; // 用户叫庄
	public static final int RESPONSE_ADD_JETTON = 1103; // 用户下注
	public static final int RESPONSE_SELECT_BANKER = 1104; // 选择庄家
	public static final int RESPONSE_SEND_TOUZI = 1105; // 发送骰子值
}