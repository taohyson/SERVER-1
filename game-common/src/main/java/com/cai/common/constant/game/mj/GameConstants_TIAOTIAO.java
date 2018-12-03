package com.cai.common.constant.game.mj;

import com.cai.common.constant.GameConstants;

/**
 * 江西宜丰跳跳麻将常量
 * @author WalkerGeek 
 */
public class GameConstants_TIAOTIAO extends GameConstants {

	public static final int GAME_RULE_SI_REN = 1; // 四人麻将
	public static final int GAME_RULE_SAN_REN = 2; // 三人麻将
	public static final int GAME_RULE_ER_REN = 3; // 二人麻将
	
	public static final int GAME_RULE_KE_HU_QI_DUI = 20; // 可胡7对
	public static final int GAME_RULE_KE_QIANG_GANG_HU = 4; // 可抢杠胡
	public static final int GAME_RULE_KE_DIAN_PAO = 5; // 可点炮胡
	public static final int GAME_RULE_ZHUA_NIAO0 = 6; // 不抓鸟
	public static final int GAME_RULE_ZHUA_NIAO2 = 7; // 抓2鸟
	public static final int GAME_RULE_ZHUA_NIAO4 = 8; // 抓4鸟
	public static final int GAME_RULE_ZHUA_NIAO6 = 9;// 抓6鸟
	public static final int GAME_RULE_YI_MA_QUAN_NIAO = 10;// 一码全鸟
	public static final int GAME_RULE_BU_JIANG_NIAO = 11;// 不奖
	public static final int GAME_RULE_JIANG_NIAO1 = 12;// 多奖1鸟
	public static final int GAME_RULE_JIANG_NIAO2 = 13;// 多奖2鸟
	public static final int GAME_RULE_DUO_ZHUA_NIAO1 = 14;// 多抓1鸟
	public static final int GAME_RULE_DUO_ZHUA_NIAO2 = 15;// 多抓2鸟
	public static final int GAME_RULE_HONG_ZHONG_NIAO_ALL = 16;//4红中算全鸟
	public static final int GAME_RULE_BU_PIAO = 17;//不飘
	public static final int GAME_RULE_DUI_PIAO = 18;//对飘
	public static final int GAME_RULE_BU_DUI_PIAO = 19;//不对飘
	
	
	public static final int CARD_DATA_MAX[] = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x35, 0x35, 0x35, 0x35,  // 红中
	};
}
