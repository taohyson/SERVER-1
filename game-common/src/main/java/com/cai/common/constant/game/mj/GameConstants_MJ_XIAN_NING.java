package com.cai.common.constant.game.mj;


public class GameConstants_MJ_XIAN_NING{
	
	public static final int GAME_RULE_BOTTOM_SCORE_1 = 1; // 1分
	public static final int GAME_RULE_BOTTOM_SCORE_2 = 2; // 2分
	public static final int GAME_RULE_BOTTOM_SCORE_5 = 3; // 5分
	public static final int GAME_RULE_HZLZKG = 4; // 红中癞子可打
	public static final int GAME_RULE_KQAG= 5; // 可抢暗杠
	public static final int GAME_RULE_THREE_DOOR_CARD = 6; // 三门牌
	public static final int GAME_RULE_TWO_DOOR_CARD = 7; // 两门牌
	public static final int GAME_RULE_BOTTOM_SCORE_HALF = 8; // 0.5分

	public static final int HZ_MAGIC_CARD = 0x35; // 红中
	public static final int HZ_INDEX = 31; // 红中
	public static final int YT_MAGIC_CARD = 0x21; // 一同


	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_QIANG_GANG = 2; // 抢杠
	public static final int HU_CARD_TYPE_JIE_PAO = 3; // 接炮
	public static final int HU_CARD_TYPE_GANG_KAI = 4; // 杠开花
	
	public static final int WIK_CAI_GANG = 0x400; // 暗杠猜胡
	public static final int WIK_DA_CHU = 0x10000; // 打出
	public static final int WIK_DA_CHU_GANG = 0x10001; // 杠
	
	public static final int CHR_ZI_MO = 				0x00000001; // 自摸
	public static final int CHR_QIANG_GANG = 			0x00000002; // 抢杠胡
	public static final int CHR_JIE_PAO = 				0x00000004; // 接炮
	public static final int CHR_JIANG_YI_SE = 			0x00000008; // 将一色
	public static final int CHR_QING_YI_SE = 			0x00000010; // 清一色
	public static final int CHR_PENG_PENG_HU = 			0x00000020; // 碰碰胡
	public static final int CHR_YING_HU = 				0x00000040; // 硬胡
	public static final int CHR_QUAN_QIU_REN = 			0x00000080; // 全求人
	public static final int CHR_FANG_PAO = 				0x00000100; // 放炮
	public static final int CHR_HAI_DI_LAO = 			0x00000200; // 海底捞
	public static final int CHR_GANG_KAI_HUA = 			0x00000400; // 杠开花
	public static final int CHR_BEI_QIANG_GNAG = 		0x00000800; // 被抢杠
	public static final int CHR_CAI_GNAG = 				0x00001000; // 猜杠胡



	public static final int CARD_DATA_MJ_XIAN_NING[] = new int[] { 
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
			
			0x35, 0x35, 0x35, 0x35, // 红中
	};
	
	//两门牌
	public static final int CARD_DATA_MJ_XIAN_NING_2[] = new int[] { 
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		
		0x35, 0x35, 0x35, 0x35, // 红中
	};
}