package com.cai.common.constant.game.mj;

public interface Constants_BaoDingBaZhang {
	int RULE_DIAN_PAO_DA_BAO = 1; // 点炮大包
	int RULE_DIAN_PAO_SAN_JIA_CHU = 2; // 点炮三家出
	int RULE_DIAN_PAO_XIAO_BAO = 3; // 点炮小包
	int RULE_FENG_DING_40 = 4; // 封顶-40
	int RULE_FENG_DING_80 = 5; // 封顶-80
	int RULE_FENG_DING_120 = 6; // 封顶-120
	int RULE_BU_DAI_FENG = 7; // 不带风
	int RULE_KOU_PAI = 8; // 扣牌
	int RULE_DA_JIANG = 9; // 大将
	int RULE_YI_MEN_PAI_BA_ZHANG_QI_HU = 10; // 一门牌八张起胡
	int RULE_DAI_ZHUANG_XIAN = 11; // 带庄闲
	int RULE_HUN_YI_SE = 12; // 混一色
	int RULE_GEN_ZHUANG = 13; // 跟庄
	int RULE_GANG_SUI_YING_JIA = 14; // 杠随赢家

	int HU_CARD_ZI_MO = 1; // 自摸胡
	int HU_CARD_JIE_PAO = 2; // 接炮胡
	int HU_CARD_QIANG_GANG = 3; // 抢杠胡

	int CHR_ZI_MO = 0x00000001; // 自摸
	int CHR_JIE_PAO = 0x00000002; // 接炮
	int CHR_FANG_PAO = 0x00000004; // 放炮
	int CHR_PING_HU = 0x00000008; // 平胡
	int CHR_QI_DUI = 0x00000010; // 七对
	int CHR_HUN_YI_SE = 0x00000020; // 混一色
	int CHR_QING_YI_SE = 0x00000040; // 清一色
	int CHR_HAO_HAO_QI_DUI = 0x00000080; // 豪华七对
	int CHR_FENG_YI_SE = 0x00000100; // 风一色
	int CHR_SHI_SAN_YAO = 0x00000200; // 十三幺
	int CHR_CHAO_HAO_HUA_QI_DUI = 0x00000400; // 超豪华七对
	int CHR_CHAO_CHAO_HAO_HUA_QI_DUI = 0x00000800; // 超超豪华七对
	int CHR_ZUO_ZHUANG = 0x00001000; // 坐庄
	int CHR_QIANG_GANG = 0x00002000; // 抢杠
	int CHR_BEI_QIANG_GANG = 0x00004000; // 被抢杠
	int CHR_DA_JIANG = 0x00008000; // 大将
	int CHR_KOU_PAI = 0x00010000; // 扣牌
}
