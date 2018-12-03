package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_KWX extends GameConstants {

	public static final int GAME_RULE_DI_FEN_1 = 1; // 1底分
	public static final int GAME_RULE_DI_FEN_2 = 2; // 2底分
	public static final int GAME_RULE_DI_FEN_3 = 3; // 3底分
	public static final int GAME_RULE_DI_FEN_5 = 4; // 5底分
	public static final int GAME_RULE_DI_FEN_10 = 5; // 10底分
	public static final int GAME_RULE_PLAYER_NUM_3 = 6; // 3人
	public static final int GAME_RULE_PLAYER_NUM_2 = 7; // 2人
	public static final int GAME_RULE_BAN_PIN_DAO = 8; // 半频道
	public static final int GAME_RULE_QUAN_PIN_DAO = 9; // 全频道
	public static final int GAME_RULE_KA_WU_XING = 10; // 卡五星X4
	public static final int GAME_RULE_PENG_PENG_HU = 11; // 碰碰胡
	public static final int GAME_RULE_GANG_SHANG_HUA = 12; // 杠上花
	public static final int GAME_RULE_SHOU_ZHUA_YI = 13; // 手抓一
	public static final int GAME_RULE_FENG_DING_8 = 14; // 封顶8
	public static final int GAME_RULE_FENG_DING_16 = 15; // 封顶16
	public static final int GAME_RULE_NON_PIAO = 16; // 不飘
	public static final int GAME_RULE_DING_PIAO = 17; // 定飘
	public static final int GAME_RULE_NON_MA = 18; // 不买马
	public static final int GAME_RULE_ZI_MO_MA = 19; // 自摸买马
	public static final int GAME_RULE_LIANG_DAO_ZI_MO_MA = 20; // 亮倒自摸买马
	public static final int GAME_RULE_MEI_JU_PIAO = 21; // 每局飘
	public static final int GAME_RULE_CHU_ZI = 22; // 出子
	public static final int GAME_RULE_NON_CHU_ZI = 23; // 不出子
	public static final int GAME_RULE_SHU_KAN = 24; // 数坎
	public static final int GAME_RULE_NON_SHU_KAN = 25; // 不坎
	public static final int GAME_RULE_AUTO_10 = 26; // 十秒自动操作
	public static final int GAME_RULE_MING_SI_GUI_YI_4 = 27; // 明四归一四番
	public static final int GAME_RULE_MAI_MA_JD = 28; // 经典买马
	public static final int GAME_RULE_MAI_MA_147 = 29; // 147买马

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 0x00000008; // 杠开

	public static final int CHR_PAO_GANG_GANG = 0x00000001;
	public static final int CHR_PAO_GANG_GANG_GANG = 0x00000002;
	public static final int CHR_PAO_GANG_GANG_GANG_GANG = 0x00000004;
	public static final int CHR_SHUANG_LONG_QI_DUI = 0x00000008; // 双龙七对
	public static final int CHR_LONG_QI_DUI = 0x00000010; // 龙七对
	public static final int CHR_XIAO_QI_DUI = 0x00000020; // 七小对
	public static final int CHR_GANG_SHANG_PAO = 0x00000040; // 杠上炮
	public static final int CHR_SAN_LONG_QI_DUI = 0x00000100; // 三龙七对
	public static final int CHR_HU_DA_SAN_YUAN = 0x00000200; // 大三元
	public static final int CHR_HU_XIAO_SAN_YUAN = 0x00000800; // 小三元
	public static final int CHR_QING_GANG_HU = 0x00002000; // 抢杠胡
	public static final int CHR_GNAG_KAI = 0x00008000; // 杠开
	public static final int CHR_SI_GUI_HU = 0x00010000; // 四鬼胡
	public static final int CHR_HAI_DI_HU = 0x00020000; // 海底胡
	public static final int CHR_KA_WU_XING = 0x00040000; // 卡五星
	public static final int CHR_HU_PENG_PENG = 0x00080000; // 碰碰胡
	public static final int CHR_HU_MING_SI_GUI_YI = 0x000100000; // 明四归一
	public static final int CHR_LIANG_ZHANG = 0x000200000; // 亮张
	public static final int CHR_HU_AN_SI_GUI_YI = 0x000400000; // 暗四归一
	public static final int CHR_SHOU_ZHUA_YI = 0x000800000; // 手抓一
	public static final int CHR_MENG_MENG = 0x0004000000;// 猛上猛
	public static final int CHR_MENG_MENG_MENG = 0x0008000000;// 猛上猛
	public static final int CHR_QING_YI_SE = 0x00000400; // 清一色
	public static final int CHR_SD_DH = 0x00001000; // 闪电吃胡动画

	public static final int LIANG_MAGIC_CARD = 0x1000; // 亮牌特殊
	public static final int CARD_ESPECIAL_TYPE_NON_OUT = 10000; // 不能打的牌
	public static final int CARD_ESPECIAL_TYPE_ZI = 20000; // 子
	public static final int CARD_ESPECIAL_TYPE_LIANG = 30000; // 亮
	public static final int HZ_MAGIC_CARD = 0x35; // 红中
	public static final int FC_MAGIC_CARD = 0x36; // 发财
	public static final int BB_MAGIC_CARD = 0x37; // 白板

	// 带风带万
	public static final int[] CARD_DATA_DEFAULT = new int[] { 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
}
