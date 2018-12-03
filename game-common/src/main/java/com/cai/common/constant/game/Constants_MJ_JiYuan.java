package com.cai.common.constant.game;

public class Constants_MJ_JiYuan {
	// 单选
	public static final int GAME_RULE_123_CHANG = 1; // 123场
	public static final int GAME_RULE_515_CHANG = 2; // 515场
	// 复选
	public static final int GAME_RULE_DAI_FENG = 3; // 带风
	public static final int GAME_RULE_ZI_MO_HU = 4; // 自摸胡
	// 单选
	public static final int GAME_RULE_ZI_YOU_PAO_0_4 = 5; // 自由跑-0-4跑
	public static final int GAME_RULE_ZI_YOU_PAO_1_4 = 6; // 自由跑-1-4跑
	public static final int GAME_RULE_ZI_YOU_PAO_2_4 = 7; // 自由跑-2-4跑
	public static final int GAME_RULE_NO_PAO = 8; // 不跑
	// 单选
	public static final int GAME_RULE_GU_DING_PAO_1 = 9; // 固定跑-1
	public static final int GAME_RULE_GU_DING_PAO_2 = 10; // 固定跑-2
	public static final int GAME_RULE_GU_DING_PAO_3 = 11; // 固定跑-3
	public static final int GAME_RULE_GU_DING_PAO_4 = 12; // 固定跑-4

	public static final int END = 20; // 带风牌20时结束

	public static final int CHR_ZI_MO = 0x00100000; // 自摸
	public static final int CHR_JIE_PAO = 0x0002; // 接炮
	public static final int CHR_BA_TOU_GANG = 0x0004; // 拔头杠
	public static final int CHR_DA_HU = 0x0008; // 大胡
	public static final int CHR_FANG_PAO = 0x0010; // 放炮
	public static final int CHR_QIANG_GANG_HU = 0x0020; // 抢杠胡
	public static final int CHR_GANG_SHANG_HUA = 0x0080; // 杠上开花
	public static final int CHR_MEN_QING = 0x0800; // 门清
	public static final int CHR_XIAO_QI_DUI = 0x00100000; // 七小对 也是自摸 没有其他特殊显示

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI = 4; // 杠开
	public static final int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮
}
