package com.cai.common.constant.game.mj;



public class Constants_MJ_ZHANG_ZHOU{

	public static final int GAME_RULE_BOTTOM_SCORE_ONE = 1; // 1分
	public static final int GAME_RULE_BOTTOM_SCORE_TWO = 2; // 2分
	public static final int GAME_RULE_BOTTOM_SCORE_FIVE = 3; // 5分
	public static final int GAME_RULE_CAN_EAT_CARD = 4; // 可吃牌
	public static final int GAME_RULE_CAN_PENG_CARD = 5; // 可碰牌
	public static final int GAME_RULE_EAT_PENG_DOUBLE_SWIM = 6; // 吃碰双游
	public static final int GAME_RULE_IDLE_ONE_BANKER_TWO = 7; // 闲1庄2
	public static final int GAME_RULE_IDLE_TWO_BANKER_THREE = 8; // 闲2庄3
	public static final int GAME_RULE_IDLE_THREE_BANKER_FOUR = 9; // 闲3庄4
	public static final int GAME_RULE_IDLE_FOUR_BANKER_FIVE = 10; // 闲4庄5
	public static final int GAME_RULE_FOUR_GAME = 11; // 4局
	public static final int GAME_RULE_EIGHT_GAME = 12; // 8局
	public static final int GAME_RULE_ONE_CIRCLE = 13; // 1圈
	public static final int GAME_RULE_TWO_CIRCLE = 14; // 2圈
	
	public static final int WIK_SAN_JIN_DAO = 0x10001; // 三金倒
	public static final int WIK_QIANG_JIN = 0x10004; // 抢金
	public static final int WIK_SWIM_JIN = 0x10005; // 游金
	public static final int WIK_TWO_SWIM = 0x10006; // 双游
	public static final int WIK_THREE_SWIM = 0x10007; // 三游
	
	public static final int ACTION_OUT_FLOWER_CARD = 0x10002; // 出花牌的动画值
	
	public static final int BAI_CARD_DATA = 0x37;
	public static final int BAI_CARD_INDEX = 33;
	
	
	


	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_QIANG_GANG = 2; // 抢杠胡
	public static final int HU_CARD_TYPE_DIAN_PAO = 3; // 点炮胡
	public static final int HU_CARD_TYPE_GANG_SHANG_HUA = 4; // 杠上花
	public static final int HU_CARD_TYPE_TIAN_HU = 5; // 天胡
	
	
	public static final int MAX_HAND_CARD_COUNT = 17; // 最大手牌
	public static final int MAX_WEAVE = 5; // 最大组合 = 17
	
	public static final int CHR_ZI_MO = 				0x00000001; // 自摸
	public static final int CHR_QIANG_GANG = 			0x00000002; // 抢杠胡
	public static final int CHR_DIAN_PAO_HU = 			0x00000004; // 点炮胡
	public static final int CHR_FANG_PAO = 				0x00000008; // 放炮
	public static final int CHR_SWIN_GOLD = 			0x00000010; // 游金
	public static final int CHR_TWO_SWIM = 				0x00000020; // 双游
	public static final int CHR_THREE_SWIM = 			0x00000040; // 三游
	public static final int CHR_THREE_GOLD_INVERTED = 	0x00000080; // 三金倒
	public static final int CHR_BEI_QIANG_GANG = 		0x00000100; // 被抢杠
	public static final int CHR_TIAN_HU = 				0x00000200; // 天胡
	public static final int CHR_QIANG_JIN = 			0x00000400; // 抢金
	public static final int CHR_GANG_SHANG_PAO = 		0x00000800; // 杠上炮
	public static final int CHR_GANG_SHANG_HUA = 		0x00001000; // 杠上花
	
	// 全部的麻将数据
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

		0x31, 0x31, 0x31, 0x31, // 东风
		0x32, 0x32, 0x32, 0x32, // 西风
		0x33, 0x33, 0x33, 0x33, // 南风
		0x34, 0x34, 0x34, 0x34, // 北风
		0x35, 0x35, 0x35, 0x35, // 红中
		0x36, 0x36, 0x36, 0x36, // 绿发
		0x37, 0x37, 0x37, 0x37, // 白板

		0x38, // 春
		0x39, // 夏
		0x41, // 秋
		0x42, // 冬
		0x43, // 梅
		0x44, // 兰
		0x45, // 竹
		0x46, // 菊
	};
	
}