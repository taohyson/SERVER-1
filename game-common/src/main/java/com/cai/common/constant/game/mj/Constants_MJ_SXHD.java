package com.cai.common.constant.game.mj;

public class Constants_MJ_SXHD {

	public static final int GAME_RULE_ZIMOHU = 1; // 自模胡(只能自摸)
	public static final int GAME_RULE_DIAN_PAO_HU = 2; // 点炮胡（可自摸，可点炮）
	public static final int GAME_RULE_PLayer2 = 3; // 两人玩法
	public static final int GAME_RULE_PLayer3 = 4; // 三人玩法
	public static final int GAME_RULE_PLayer4 = 5; // 四人玩法
	public static final int GAME_RULE_PING_HU = 6; // 平胡
	public static final int GAME_RULE_PING_HU_NO_CAN_HU_PH = 7; // 平胡（不可胡屁胡）
	public static final int GAME_RULE_QING_YI_SE = 8; // 清一色
	public static final int GAME_RULE_DJWHFB = 9; // 大将王黑风报（清一色）
	public static final int GAME_RULE_DWDJB = 10; // 对王大将报（清一色）
	public static final int GAME_RULE_MIAN_PENG = 11; // 免碰

	public static final int CHR_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int CHR_TYPE_DIAN_PAO = 0x00000002; // 点炮胡
	public static final int CHR_TYPE_QIANG_GANG = 0x00000004; // 抢杠胡
	public static final int CHR_TYPE_GANG_SHANG_KAI_HUA = 0x00000008; // 杠上开花

	public static final int CHR_PING_HU = 0x00000010; // 平胡
	public static final int CHR_QI_DUI = 0x00000020; // 七对
	public static final int CHR_DIAO_WANG = 0x00000040;// 吊王
	public static final int CHR_QING_YI_SE = 0x00000080; // 清一色

	public static final int CHR_CHUN_YI_SE = 0x00000100; // 纯一色
	public static final int CHR_ZI_YI_SE = 0x00000200; // 字一色
	public static final int CHR_YI_TIAO_LONG = 0x00000400; // 一条龙
	public static final int CHR_LOU_SHANG_LOU = 0x00000800; // 楼上楼

	public static final int CHR_DA_SAN_YUAN = 0x00001000; // 大三元
	public static final int CHR_ZHUANG_JIA = 0x00002000; // 庄家
	public static final int CHR_HEI_SAN_FENG = 0x00004000; // 黑三风
	public static final int CHR_ZHONG_FA_BAI = 0x00008000; // 中发白
	public static final int CHR_YING_KOU = 0x000010000; // 硬扣

	public static final int CHR_YI_KOU = 0x00010000; // 硬扣
	public static final int CHR_FANG_PAO = 0x00020000; // 放炮
	public static final int CHR_JIE_PAO = 0x00040000; // 接炮

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸的牌
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 点炮胡的牌
	public static final int HU_CARD_TYPE_QIANG_GANG_HU = 3; // 抢杠胡的牌
	public static final int HU_GANG_SHANG_KAI_HUA = 4; // 杠上开花的牌

	public static final int WIK_YING_KOU = 0x20000; // 硬扣
	public static final int WIK_XUAN_WANG = 0x40000; // 选王

	public static final int HAND_CARD_MAX_COUNT = 14; // 最大手牌数量
	public static final int CARD_STATUS_YING_KOU = 4; // 硬扣

	public static final int CARD_DATA_MAX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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

	};

}
