package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_BD extends GameConstants {

	public static final int GAME_RULE_PLAYER_3 = 1; // 3人场
	public static final int GAME_RULE_PLAYER_4 = 2; // 4人场
	public static final int GAME_RULE_DIAN_PAO_DA_HU = 3; // 点炮大胡
	public static final int GAME_RULE_DIAN_PAO_XIAO_HU = 4; // 点炮小胡
	public static final int GAME_RULE_DIAN_PAO_3_CHU = 5; // 点炮三家出
	public static final int GAME_RULE_FENG_DING_50 = 6;// 封顶50
	public static final int GAME_RULE_FENG_DING_100 = 7;// 封顶100
	public static final int GAME_RULE_FENG_DING_150 = 8;// 封顶150
	public static final int GAME_RULE_KOU_PAI = 9; // 扣牌
	public static final int GAME_RULE_DA_JIANG = 10; // 大将
	public static final int GAME_RULE_1_MEN_8_ZHANG = 11; // 一门八张起胡
	public static final int GAME_RULE_ZHUAN_XIAN = 12; // 庄闲
	public static final int GAME_RULE_GANG_SUI_WIN = 13; // 杠随赢家
	public static final int GAME_RULE_FENG_YI_SE = 14; // 风一色
	public static final int GAME_RULE_HUN_YI_SE = 15; // 混一色
	public static final int GAMR_RULE_GUO_PENG = 16; // 过手碰

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 0x00000008; // 杠开

	public static final int WIK_KOU = 0x400; // 扣
	public static final int WIK_GEN_ZHUANG = 0x800; // 跟庄

	public static final int CARD_ESPECIAL_TYPE_KOU = 14000; // 扣的牌

	public static final int CHR_YI_TIAO_LONG = 0x00000010;
	public static final int CHR_XIAO_QI_DUI = 0x00000020;
	public static final int CHR_HAO_HUA_QI_DUI = 0x00000040;
	public static final int CHR_QING_YI_SE = 0x00000080;
	public static final int CHR_HUN_YI_SE = 0x00000100;
	public static final int CHR_SHI_SAN_YAO = 0x00000200;
	public static final int CHR_FENG_YI_SE = 0x00000400;
	public static final int CHR_QING_GANG_HU = 0x00002000; // 抢杠胡
	public static final int CHR_GNAG_KAI = 0x00008000; // 杠开
}
