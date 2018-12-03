package com.cai.common.constant.game.mj;

public interface Constants_FanJin {
	int RULE_ZI_MO_HU = 1; // 自摸胡
	int RULE_DIAN_PAO_HU = 2; // 点炮胡
	int RULE_FAN_JIN = 3; // 翻金
	int RULE_DAI_FENG_PAI = 4; // 带风牌
	int RULE_SU_PAI = 5; // 素牌
	int RULE_JIN_DIAO_YU = 6; // 金钓鱼
	int RULE_JIN_DIAO_JIN = 7; // 金钓金
	int RULE_SHANG_PAO = 8; // 上跑
	int RULE_GANG_PAO = 9; // 杠跑

	int HU_ZI_MO = 1; // 自摸
	int HU_JIE_PAO = 2; // 接炮
	int HU_GANG_KAI = 3; // 杠开
	int HU_QIANG_GANG = 4; // 抢杠

	int CHR_ZI_MO = 0x00000001; // 自摸
	int CHR_JIE_PAO = 0x00000002; // 接炮
	int CHR_QIANG_GANG = 0x00000004; // 抢杠
	int CHR_BEI_QIANG_GANG = 0x00000008; // 被抢杠
	int CHR_GANG_KAI = 0x00000010; // 杠开
	int CHR_PING_HU = 0x00000020; // 平胡
	int CHR_QI_DUI = 0x00000040; // 七对
	int CHR_HAO_HUA_QI_DUI = 0x00000080; // 豪华七对
	int CHR_SI_JIN = 0x00000100; // 四金
	int CHR_SU_PAI = 0x00000200; // 素牌
	int CHR_JIN_DIAO_YU = 0x00000400; // 金钓鱼
	int CHR_JIN_DIAO_JIN = 0x00000800; // 金钓金
	int CHR_FANG_PAO = 0x00001000; // 放炮
}
