package com.cai.common.constant.game;

public class MJConstants_HuNan_XiangTan {

	public static final int GAME_RULE_HUNAN_SHANG_WANG = 1; // 上王
	public static final int GAME_RULE_HUNAN_XIA_WANG = 2; // 下王
	public static final int GAME_RULE_HUNAN_SHANG_XIA_WANG = 3; // 上下王

	public static final int GAME_RULE_HUNAN_XUAN_MEI_2 = 4; // 选2美
	public static final int GAME_RULE_HUNAN_XUAN_MEI_3 = 5; // 选3美
	public static final int GAME_RULE_HUNAN_XUAN_MEI_4 = 6; // 选4美

	public static final int GAME_RULE_HUNAN_ZHUA_NIAO_2 = 7; // 抓2鸟
	public static final int GAME_RULE_HUNAN_ZHUA_NIAO_4 = 8; // 抓4鸟
	public static final int GAME_RULE_HUNAN_ZHUA_NIAO_6 = 9; // 抓6鸟

	public static final int COUNT_OF_MEI_2 = 2; // 2美
	public static final int COUNT_OF_MEI_3 = 3; // 3美
	public static final int COUNT_OF_MEI_4 = 4; // 4美

	public static final int COUNT_OF_NIAO_2 = 2; // 2鸟
	public static final int COUNT_OF_NIAO_4 = 4; // 4鸟
	public static final int COUNT_OF_NIAO_6 = 6; // 6鸟

	public static final int CHR_ZI_MO = 0x00000001; // 自摸胡
	public static final int CHR_JIE_PAO = 0x00000002; // 炮胡
	public static final int CHR_QI_SHOU_HU = 0x00000004; // 起手胡
	public static final int CHR_PING_HU = 0x00000008; // 平胡

	public static final int CHR_MEN_QING = 0x00000010; // 门清
	public static final int CHR_PENG_PENG_HU = 0x00000020; // 碰碰胡
	public static final int CHR_QI_XIAO_DUI = 0x00000040; // 七小对
	public static final int CHR_QING_YI_SE = 0x00000080; // 清一色

	public static final int CHR_GANG_KAI = 0x00000100; // 选美 自摸（杠上开花）
	public static final int CHR_QIANG_GANG_HU = 0x00000200; // 选美 炮胡（抢杠胡）
	public static final int CHR_FANG_PAO = 0x00000400; // 放炮

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸的牌
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 炮胡的牌
	public static final int HU_CARD_TYPE_GANG_KAI = 3; // 开杠选美自摸的牌（杠上开花）
	public static final int HU_CARD_TYPE_QIANG_GANG_HU = 4; // 开杠选美炮胡的牌（抢杠胡）
	public static final int HU_CARD_TYPE_QI_SHOU_HU = 5; // 起手胡的牌
}
