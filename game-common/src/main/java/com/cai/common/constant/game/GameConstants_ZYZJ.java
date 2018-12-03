package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_ZYZJ extends GameConstants {

	public static final int GAME_RULE_FOUR_ZYZJ = 1; // 四人
	public static final int GAME_RULE_THREE_ZYZJ = 2; // 三人
	public static final int GAME_RULE_TWO_ZYZJ = 3;   // 二人
	public static final int GAME_RULE_EDG_ZYZJ = 4; // 二丁拐
	public static final int GAME_RULE_SDG_ZYZJ = 5; // 三丁拐
	public static final int GAME_RULE_FAN_ZYZJ = 6;   // 翻鸡
	public static final int GAME_RULE_XQ_ZYZJ = 7;    // 星期鸡
	public static final int GAME_RULE_YB_ZYZJ = 8;    // 摇摆鸡
	public static final int GAME_RULE_BEN_ZYZJ = 9;   // 本鸡
	public static final int GAME_RULE_WG_ZYZJ = 10;    // 乌骨鸡
	public static final int GAME_RULE_SWAP_ZYZJ = 11; // 换三张
	public static final int GAME_RULE_LIANZHUANG_ZYZJ = 12; // 连庄
	public static final int GAME_RULE_QUANSHAAO_ZYZJ = 13; // 一烧全烧
	public static final int GAME_RULE_ZIMO1_ZYZJ = 14; // 自摸+1
	public static final int GAME_RULE_ZIMO2_ZYZJ = 15; // 自摸+2
	public static final int GAME_RULE_ZIMO_FAN_ZYZJ = 16; // 自摸翻倍
	public static final int GAME_RULE_GUMAI_ZYZJ = 17; // 估买
	public static final int GAME_RULE_LAIZI_ZYZJ = 18; // 癞子鸡


	public static final int YJ_CARD = 0x11; // 幺鸡
	public static final int WU_TONG_CARD = 0x25; // 五筒
	public static final int BA_TONG_CARD = 0x28; // 八筒
	public static final int YI_TONG_CARD = 0x21; // 一筒

	public static final int CHONG_FENG_JI_BIAO_ZHI = 10000;
	public static final int OutCard_Type_Di_Hu = 200;
	public static final int DispatchCard_Type_Noraml = 0x10000000;// 普通发牌
	public static final int DispatchCard_Type_Tian_Hu = 0x20000000;// 第一张牌

	public static final int WIK_CHONG_FENG_JI = 0x400; // 冲锋鸡(动画效果)
	public static final int WIK_DING_WANG = 0x800; // 万
	public static final int WIK_DING_TONG = 0x1000; // 筒
	public static final int WIK_DING_TIAO = 0x2000; // 条

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 0x00000008; // 杠开
	public static final int HU_CARD_TYPE_RE_PAO = 0x00000010; // 热炮

	public static final int CHR_DA_DUI_ZI = 0x00000010; // 大对子
	public static final int CHR_XIAO_QI_DUI = 0x00000020; // 小七对
	public static final int CHR_QING_YI_SE = 0x00000040; // 清一色
	public static final int CHR_QING_DA_DUI = 0x00000080; // 清大对
	public static final int CHR_SHUANG_QING = 0x00000100; // 双请
	public static final int CHR_QING_QI_DUI = 0x00000200; // 清七对
	public static final int CHR_LONG_QI_DUI = 0x00000400; // 龙七对
	public static final int CHR_QING_LONG_BEI = 0x00000800; // 清龙背
	public static final int CHR_RE_PAO = 0x00001000; // 杠上炮
	public static final int CHR_QING_GANG_HU = 0x00002000; // 抢杠胡
	public static final int CHR_DAN_DIAO = 0x00004000;// 单吊
	public static final int CHR_GNAG_KAI = 0x00008000; // 杠开
	public static final int CHR_TIAN_HU = 0x000010000; // 天胡 硬报
	public static final int CHR_DI_HU = 0x000020000; // 地胡 硬报
	public static final int CHR_KA_DIAN = 0x000040000; // 边卡吊
	public static final int CHR_DA_KUAN_ZHNAG = 0x000080000; // 大宽张
	public static final int CHR_QING_DAN = 0x0000100000; // 清单吊

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
