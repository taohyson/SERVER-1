package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_GY extends GameConstants {

	public static final int GAME_RULE_TYPE_SWING_JI = 1; // 摇摆鸡
	public static final int GAME_RULE_TYPE_BEN_JI = 2; // 本鸡
	public static final int GAME_RULE_WEEK_JI = 3; // 星期鸡
	public static final int GAME_RULE_BLOW_JI = 4; // 吹风鸡
	public static final int GAME_RULE_MAN_TANG_JI = 5; // 满堂鸡
	public static final int GAME_RULE_WU_GU_JI = 6; // 乌骨鸡
	public static final int GAME_RULE_CONTINUE_BANKER = 7; // 连庄
	public static final int GAME_RULE_1_KOU_2 = 8; // 一扣二
	public static final int GAME_RULE_TONG_3 = 9; // 通三
	public static final int GAME_RULE_PLAYER_4 = 10; // 四人场
	public static final int GAME_RULE_PLAYER_3 = 11; // 三人场
	public static final int GAME_RULE_PLAYER_2 = 12; // 二人场
	public static final int GAME_RULE_PLAYER_3_DING_GUAI = 13; // 三定拐
	public static final int GAME_RULE_PLAYER_2_DING_GUAI = 14; // 二定拐
	public static final int GAME_RULE_ER_FANG_PAI = 15; // 二房牌

	public static final int YJ_CARD = 0x11; // 幺鸡
	public static final int WU_TONG_CARD = 0x25; // 五筒
	public static final int BA_TONG_CARD = 0x28; // 八筒

	public static final int OutCard_Type_Di_Hu = 200;
	public static final int DispatchCard_Type_Noraml = 0x10000000;// 普通发牌
	public static final int DispatchCard_Type_Tian_Hu = 0x20000000;// 第一张牌

	public static final int WIK_CHONG_FENG_JI = 0x400; // 冲锋鸡(动画效果)
	public static final int WIK_DING_WANG = 0x800; // 万
	public static final int WIK_DING_TONG = 0x1000; // 筒
	public static final int WIK_DING_TIAO = 0x2000; // 条
	public static final int WIK_ZE_REN_JI = 0x4000; // 责任鸡(动画效果)
	public static final int WIK_YING_BAO_XIAN = 0x80000; // 闲家硬报按钮

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 0x00000008; // 杠开
	public static final int HU_CARD_TYPE_RE_PAO = 0x00000010; // 热炮
	public static final int HU_CARD_TYPE_SHA_BAO = 0x00000020; // 杀报

	public static final int CHR_DA_DUI_ZI = 0x00000010; // 大对子
	public static final int CHR_XIAO_QI_DUI = 0x00000020; // 小七对
	public static final int CHR_QING_YI_SE = 0x00000040; // 清一色
	public static final int CHR_QING_DA_DUI = 0x00000080; // 请大对
	public static final int CHR_SHUANG_QING = 0x00000100; // 双请
	public static final int CHR_QING_QI_DUI = 0x00000200; // 请七对
	public static final int CHR_LONG_QI_DUI = 0x00000400; // 龙七对
	public static final int CHR_QING_LONG_BEI = 0x00000800; // 清龙背
	public static final int CHR_RE_PAO = 0x00001000; // 热炮
	public static final int CHR_QING_GANG_HU = 0x00002000; // 抢杠胡
	public static final int CHR_DAN_DIAO = 0x00004000;// 单吊
	public static final int CHR_GNAG_KAI = 0x00008000; // 杠开
	public static final int CHR_TIAN_HU = 0x000040000; // 天胡 硬报
	public static final int CHR_DI_HU = 0x000080000; // 地胡 硬报

	public static final int PLAYER_END_11_STATUS_ZI_MO = 1; // 自摸
	public static final int PLAYER_END_11_STATUS_JIE_PAO = 2; // 接炮
	public static final int PLAYER_END_11_STATUS_QIANG_GANG = 3; // 抢杠
	public static final int PLAYER_END_11_STATUS_GANG_KAI = 4; // 杠开
	public static final int PLAYER_END_11_STATUS_FANG_PAO = 5; // 放炮
	public static final int PLAYER_END_11_STATUS_RE_PAO = 6; // 放炮

	/**
	 * 万条筒--108张
	 */
	public static final int CARD_DATA_TIAO_TONG[] = new int[] { 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
	};
}
