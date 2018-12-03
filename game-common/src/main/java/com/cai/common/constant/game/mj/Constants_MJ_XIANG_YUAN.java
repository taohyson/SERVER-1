package com.cai.common.constant.game.mj;

public class Constants_MJ_XIANG_YUAN {

	public static final int GAME_RULE_ZIMOHU = 1; // 自模胡(只能自摸)
	public static final int GAME_RULE_DIAN_PAO_HU = 2; // 点炮胡（可自摸，可点炮）
	public static final int GAME_RULE_PLAY_2 = 3; // 2人
	public static final int GAME_RULE_PLAY_3 = 4; // 3人
	public static final int GAME_RULE_PLAY_4 = 5; // 4人

	public static final int GAME_RULE_PIAO_ZHANG = 6; // 飘张
	public static final int GAME_RULE_NO_PAIO = 7; // 不飘
	public static final int GAME_RULE_LUN_ZHUANG = 8; // 轮庄
	public static final int GAME_RULE_BA_KAO = 9; // 八靠
	public static final int GAME_RULE_DA_HU = 10; // 大胡
	public static final int GAME_RULE_LI_ZHUANG_LI_KOU = 11; // 离庄离扣
	public static final int GAME_RULE_YING_KAO = 12; // 硬靠
	public static final int GAME_RULE_RUAN_KAO = 13; // 软靠

	public static final int CHR_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int CHR_TYPE_DIAN_PAO = 0x00000002; // 点炮胡
	public static final int CHR_TYPE_QIANG_GANG = 0x00000004; // 抢杠胡

	public static final int CHR_QI_XIAO_DUI = 0x00000010; // 七小对
	public static final int CHR_PING_HU = 0x00000020; // 平胡
	public static final int CHR_HHQXD = 0x00000040;// 豪华七小对
	public static final int CHR_QING_YI_SE = 0x00000080; // 清一色

	public static final int CHR_RUAN_KAO = 0x00000100; // 软靠
	public static final int CHR_YING_KAO = 0x00000200; // 硬靠
	public static final int CHR_FANG_PAO = 0x00000400; // 放炮
	public static final int CHR_JIE_PAO = 0x00000800;// 接炮

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸的牌
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 点炮胡的牌
	public static final int HU_CARD_TYPE_QIANG_GANG_HU = 3; // 抢杠胡的牌

	public static final int WIK_LZLK_ACTION = 0x10000; // 离庄离扣按钮
	public static final int WIK_DGBW_ACTION = 0x20000; // 带杠把外按钮
	// 全部的麻将数据136张
	public static final int CARD_DATA_DAI_FENG[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
