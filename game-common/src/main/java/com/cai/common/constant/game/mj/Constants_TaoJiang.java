package com.cai.common.constant.game.mj;

public class Constants_TaoJiang {

	public static final int GAME_RULE_PLAYER_TWO = 1; // 二人场
	public static final int GAME_RULE_PLAYER_THREE = 2; // 三人场
	public static final int GAME_RULE_PLAYER_FOUR = 3; // 四人场

	public static final int GAME_RULE_GANG_CARD_TWO = 4; // 开杠牌数2
	public static final int GAME_RULE_GANG_CARD_THREE = 5; // 开杠牌数3

	public static final int GAME_RULE_HAO_HUA_QI_DUI = 6; // 可胡豪华七对
	public static final int GAME_RULE_EIGHT_JOKER = 7; // 八个王

	public static final int GAME_RULE_ONE_BIRD = 8; // 抓1鸟
	public static final int GAME_RULE_TWO_BIRD = 9; // 抓2鸟
	public static final int GAME_RULE_THREE_BIRD = 10; // 抓3鸟
	public static final int GAME_RULE_NO_BIRD = 11; // 不抓鸟

	public static final int GAME_RULE_MULTIPLE_ONE = 12; // 1倍率
	public static final int GAME_RULE_MULTIPLE_TWO = 13; // 2倍率
	public static final int GAME_RULE_MULTIPLE_THREE = 14; // 3倍率
	public static final int GAME_RULE_MULTIPLE_FIVE = 15; // 5倍率
	public static final int GAME_RULE_MULTIPLE_TEN = 16; // 10倍率

	public static final int GAME_RULE_BEI_LV = 17; // 倍率

	public static final int GAME_RULE_AN_GANG_KE_QIANG = 18; // 暗杠可抢
	public static final int GAME_RULE_SHOW_DI_PAI = 19; // 是否特殊标识地牌

	public static final int GAME_RULE_PIAO = 20; // 飘分
	public static final int GAME_RULE_159_ZHONG_NIAO = 21; // 159中鸟
	public static final int GAME_RULE_DAN_ZHONG_NIAO = 22; // 单数中鸟
	public static final int GAME_RULE_ALL_ZHONG_NIAO = 23; // 必中
	
	public static final int GAME_RULE_PH_2_ZM_2 = 24; // 炮胡2自摸2
	public static final int GAME_RULE_PH_2_ZM_3 = 25; // 炮胡2自摸3
	public static final int GAME_RULE_PH_2_ZM_4 = 26; // 炮胡2自摸4
	public static final int GAME_RULE_PH_3_ZM_2 = 27; // 炮胡3自摸2--之前默认的

	public static final int CHR_ZI_MO = 0x00000001; // 自摸胡
	public static final int CHR_JIE_PAO = 0x00000002; // 接炮
	public static final int CHR_FANG_PAO = 0x00000004; // 放炮
	public static final int CHR_GANG_KAI = 0x00000008; // 杠上开花
	public static final int CHR_QIANG_GANG = 0x00000010; // 抢杠胡
	public static final int CHR_PING_HU = 0x00000020; // 平胡
	public static final int CHR_QING_YI_SE = 0x00000040; // 清一色
	public static final int CHR_PENG_PENG_HU = 0x00000080; // 碰碰胡
	public static final int CHR_JIANG_JIANG_HU = 0x00000100; // 将将胡
	public static final int CHR_QI_XIAO_DUI = 0x00000200; // 七小对
	public static final int CHR_ONE_HH_QI_XIAO_DUI = 0x00000400; // 豪华七对
	public static final int CHR_TWO_HH_QI_XIAO_DUI = 0x00000800; // 双豪华七对
	public static final int CHR_THREE_HH_QI_XIAO_DUI = 0x00001000; // 三豪华七对
	public static final int CHR_DI_HU = 0x00002000; // 地胡
	public static final int CHR_DI_DI_HU = 0x00004000; // 地地胡
	public static final int CHR_HEI_TIAN_HU = 0x00008000; // 黑天胡
	public static final int CHR_TIAN_HU = 0x00010000; // 天胡
	public static final int CHR_TIAN_TIAN_HU = 0x00020000; // 天天胡 --
															// 可以有4-8个王的天天胡
	public static final int CHR_DAO_DI_HU = 0x00040000; // 倒地胡
	public static final int CHR_BAO_TING = 0x00080000; // 报听
	public static final int CHR_YING_ZHUANG = 0x00100000; // 硬庄
	public static final int CHR_GANG_HU = 0x00200000; // 杠胡

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸胡
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮胡
	public static final int HU_CARD_TYPE_GANG_KAI = 3; // 杠开
	public static final int HU_CARD_TYPE_QIANG_GANG = 4; // 抢杠
	public static final int HU_CARD_TYPE_GANG_HU = 5; // 杠胡

	public static final int CARDS_LEFT_DRAW_FENCE = 8; // 剩余8张牌时流局

	public static final int[] CARD_DATA = { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
	};
}
