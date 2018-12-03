package com.cai.common.constant.game;


public class GameConstants_GD_HUNDRED{

	public static final int GAME_RULE_QIANG_GANG_HU = 1; // 抢杠胡
	public static final int GAME_RULE_QIANG_GANG_QUAN_BAO = 26;// 抢杠全包
	public static final int GAME_RULE_GANG_BAO_QUAN_BAO = 2; // 杠爆全包
	public static final int GAME_RULE_HU_QI_DUI = 3; // 七对可胡
	public static final int GAME_RULE_GEN_ZHUANG = 4; // 跟庄
	public static final int GAME_RULE_MAI_MA = 5; // 买马
	public static final int GAME_RULE_MA_GEN_DI_FEN = 6; // 马跟底分
	public static final int GAME_RULE_MA_GEN_GANG = 7; // 马跟杠
	public static final int GAME_RULE_GUI_PAI = 8; // 鬼牌
	public static final int GAME_RULE_SI_GUI_HU = 9; // 四鬼可胡
	public static final int GAME_RULE_YI_MA_QUAN_ZHONG = 27; // 一码一分
	public static final int GAME_RULE_DAI_ZHONG_DAI_WAN = 23; // 红中玩法
	public static final int GAME_RULE_WU_GUI_JIA_BEI = 10; // 无鬼2倍
	public static final int GAME_RULE_SI_GUI_JIA_BEI = 11; // 4鬼2胡
	public static final int GAME_RULE_PENG_HU_JIA_BEI = 12; // 碰碰胡2倍
	public static final int GAME_RULE_HUN_YI_SE_JIA_BEI = 13; // 混一色2倍
	public static final int GAME_RULE_QING_YI_SE_SI_BEI = 14; // 清一色4倍
	public static final int GAME_RULE_YAO_JIU_LIU_BEI = 15; // 幺九6倍
	public static final int GAME_RULE_QUAN_FENG_BA_BEI = 16; // 全风8倍
	public static final int GAME_RULE_SHI_SAN_YAO_BA_BEI = 17; // 十三幺8倍
	public static final int GAME_RULE_MA_2 = 18; // 买2马
	public static final int GAME_RULE_MA_4 = 19; // 买4马
	public static final int GAME_RULE_MA_6 = 20; // 买6马
	public static final int GAME_RULE_BB_GUI = 22; // 白板鬼
	public static final int GAME_RULE_FAN_GUI = 24; // 翻鬼
	public static final int GAME_RULE_HUANG_GANG = 25; // 荒庄荒杠

	public static final int HZ_MAGIC_CARD = 0x35; // 红中癞子
	public static final int BB_MAGIC_CARD = 0x37; // 白板赖子

	public static final int WIK_GEN_ZHUANG = 0x800; // 跟庄

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_QIANG_GANG = 2; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 3; // 杠开
	public static final int HU_CARD_TYPE_JIE_GANG = 4; // 接杠
	
	public static final int CHR_ZI_MO = 				0x00000001; // 自摸
	public static final int CHR_QIANG_GANG = 			0x00000002; // 抢杠
	public static final int CHR_GANG_KAI = 				0x00000004; // 杠开
	public static final int CHR_XIAO_QI_DUI = 			0x00000008; // 小七对
	public static final int CHR_QING_YI_SE = 			0x00000010; // 清一色
	public static final int CHR_HUN_YI_SE = 			0x00000020; // 混一色
	public static final int CHR_SHI_SAN_YAO = 			0x00000040; // 十三幺
	public static final int CHR_FENG_YI_SE = 			0x00000080; // 全风
	public static final int CHR_YAO_JIU = 				0x00000100; // 幺九
	public static final int CHR_SI_GUI_HU = 			0x00000400; // 四鬼胡
	public static final int CHR_WU_GUI_HU = 			0x00000800; // 无鬼胡
	public static final int CHR_PENG_PENG_HU = 			0x00001000; // 碰碰胡
	public static final int CHR_FANG_PAO = 				0x00002000; // 被抢杠


	/** 不带万 */
	public static final int CARD_DATA_NON_DAI_WAN[] = new int[] { 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 南风
			0x33, 0x33, 0x33, 0x33, // 西风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};

	/** 带中带万 红中玩法 */
	public static final int CARD_DATA_DAI_ZHONG_DAI_WAN[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
}