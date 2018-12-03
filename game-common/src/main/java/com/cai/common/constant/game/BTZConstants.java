package com.cai.common.constant.game;

public class BTZConstants {
	//手牌数
	public static final int HAND_CARD_COUNT = 2;
	
	
	
	public static final int BTZ_RULE_BASE = 1; 
	public static final int BTZ_RULE_TWO_EIGHT = 2; //二八杠
	public static final int BTZ_RULE_ZHUANG_WIN = 3; //打和庄家赢
	public static final int BTZ_RULE_DA_HE = 4; //牌型可以打和
	public static final int BTZ_RULE_QIANG_ZHUANG = 6; // 抢庄
	public static final int BTZ_RULE_FANG_ZHU_ZHUANG = 7;//房主庄
	public static final int BTZ_RULE_DOULE_ZHUANG = 8;//豹子庄
	public static final int BTZ_RULE_BU_LEI = 9;//不垒
	public static final int BTZ_RULE_24_LEI = 10;//封顶24
	public static final int BTZ_RULE_48_LEI = 11;//封顶48
	public static final int BTZ_RULE_LEI = 12;//不封底
	public static final int BTZ_RULE_FOUR = 13; //4人场
	public static final int BTZ_RULE_FIVE = 14; // 6人场
	public static final int BTZ_RULE_EIGHT = 15; // 8人场
	public static final int BTZ_RULE_BASE_SCORE_ONE = 16; // 底分一分
	public static final int BTZ_RULE_BASE_SCORE_TWO = 17; // 底分两分
	public static final int BTZ_RULE_BASE_SCORE_THREE = 18; // 底分三分
	public static final int TB_RULE_THREE = 20; // 八点2倍/九点3倍/对子4倍
	public static final int TB_RULE_FOUR = 21; // 九点半2倍/对子3倍/幺鸡对4倍
	public static final int TB_RULE_LUN = 22; // 轮庄
	public static final int TB_RULE_BU_GUA_PAI = 23; // 不刮牌
	public static final int TB_RULE_NOT_TO_ENTER = 24; // 不可进
	public static final int BTZ_RULE_12_LEI = 25; // 封顶12
	
	//牌型胜负
	public static final int WIN = 1; 
	public static final int LOSE = -1;
	public static final int SAME = 0;
	
	public static final int[] CARD_DATAS = {
			0x11,0x11,0x11,0x11,
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};
	
	/**
	 * 推筒子
	 */
	public static final int[] TUO_TONG_ZI = {
			0x35,0x35,0x35,0x35,
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};
	
	
	//协议
	public static final int RESPONSE_GAME_START = 1001;//// 1007 开始(gameStart)
	public static final int RESPONSE_RECONNECT_DATA = 1002;	//断线重连
	public static final int RESPONSE_GAME_END = 1003;
	
	public static final int RESPONSE_SEND_CARD = 1100; //用户发牌
	public static final int RESPONSE_OPEN_CARD    =  1101;//用户开牌
	public static final int RESPONSE_CALL_BANKER  =   1102;	//用户叫庄
	public static final int RESPONSE_ADD_JETTON	  =   1103;	//用户下注
	public static final int RESPONSE_SELECT_BANKER = 1104;	//选择庄家
	public static final int RESPONSE_TRUSTEE = 1105; // 托管
	public static final int RESPONSE_TRUSTEE_RE = 1106; // 托管重连
}
