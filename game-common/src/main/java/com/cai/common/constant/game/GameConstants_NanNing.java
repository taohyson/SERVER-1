package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_NanNing extends GameConstants {

	public static final int GAME_RULE_PLAYER_3 = 1; // 3人场
	public static final int GAME_RULE_PLAYER_4 = 2; // 4人场
	public static final int GAME_RULE_MAI_MA_0 = 3; // 不买码
	public static final int GAME_RULE_MAI_MA_2 = 4; // 买2码
	public static final int GAME_RULE_MAI_MA_4 = 5; // 买4码
	public static final int GAME_RULE_MAI_MA_6 = 6; // 买6码
	public static final int GAME_RULE_SI_SHUANG = 7; // 死双

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI = 0x00000008; // 杠开
	public static final int HU_CARD_TYPE_GANG_PAO = 0x00000010; // 杠上炮
	public static final int HU_CARD_QUAN_BAO = 0x00000020; // 全包
	public static final int OutCard_Type_Di_Hu = 0x00000040;
	public static final int DispatchCard_Type_Tian_Hu = 0x00000080;

	public static final int CHR_ZI_MO = 0x00000001; // 自摸
	public static final int CHR_JIE_PAO = 0x00000002; // 接炮
	public static final int CHR_FANG_PAO = 0x00000004; // 放炮
	public static final int CHR_JI_BEN_HU = 0x00000008; // 基本胡
	public static final int CHR_XIAO_QI_DUI = 0x00000010; // 小七对
	public static final int CHR_MEN_QING = 0x00000020; // 门清
	public static final int CHR_QUAN_QIU_REN = 0x00000040; // 全求人
	public static final int CHR_QIANG_GANG_HU = 0x00000080; // 抢杠胡
	public static final int CHR_GANG_KAI = 0x00000100; // 杠上开花
	public static final int CHR_GANG_SHANG_PAO = 0x00000200; // 杠上炮
	public static final int CHR_SHUANG_QI_XIAO_DUI = 0x00000400; // 双七小对
	public static final int CHR_SAN_QI_XIAO_DUI = 0x00000800; // 三七小对
	public static final int CHR_PENG_PENG_HU = 0x00001000; // 碰碰胡
	public static final int CHR_QING_YI_SE = 0x00002000; // 清一色
	public static final int CHR_HAO_HUA_QI_XIAO_DUI = 0x00004000; // 豪华七小对
	public static final int CHR_HUNAN_TIAN_HU = 0x00008000; // 天胡
	public static final int CHR_HUNAN_DI_HU = 0x000010000; // 地胡
	public static final int CHR_QUAN_BAO = 0x000020000; // 全包
	public static final int CHR_QUAN_QIU_PAO = 0x000040000; // 全求炮
}
