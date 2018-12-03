package com.cai.common.constant.game;

/**
 * 陕西麻将
 * 
 * @author admin
 *
 */
public interface Constants_ShanXi {

	int GAME_RULE_PING_TONG_PING_HU = 1;// 普通平胡
	int GAME_RULE_ZHI_ZHA_BU_HU = 2;// 只炸不胡（自摸胡，不可以点炮胡）
	int GAME_RULE_DAI_FENG_PAI = 3;// 带风牌
	int GAME_RULE_HONG_ZHONG_LAI_ZI = 4;// 红中癞子
	int GAME_RULE_258_YING_JIANG = 5;// 258硬将
	int GAME_RULE_HU_258_JIA_FAN = 6;// 胡258加番
	int GAME_RULE_JIANG_258_JIA_FAN = 7;// 将258加番
	int GAME_RULE_QI_DUI_KE_HU_JIA_FAN = 8;// 七对可胡加番
	int GAME_RULE_QI_DUI_KE_HU_BU_JIA_FAN = 9;// 七对可胡(不加番)
	int GAME_RULE_QI_YI_SE_JIA_FAN = 10;// 清一色加番
	int GAME_RULE_0_PAO = 11;// 0炮
	int GAME_RULE_1_PAO = 12;// 1炮
	int GAME_RULE_2_PAO = 13;// 2炮
	int GAME_RULE_3_PAO = 14;// 3炮
	int GAME_RULE_4_PAO = 15;// 4炮
	int GAME_RULE_ZIYOU_PAO = 16;// 自由炮
	int GAME_RULE_1_DI_FEN = 17;// 底分x1
	int GAME_RULE_2_DI_FEN = 18;// 底分x2
	int GAME_RULE_5_DI_FEN = 19;// 底分x5

	int CHR_ZI_MO = 0x00000001; // 自摸
	int CHR_JIE_PAO = 0x00000002; // 接炮
	int CHR_FANG_PAO = 0x00000004; // 放炮
	int CHR_BEI_ZI_MO = 0x00000008; // 被自摸
	int CHR_BEI_QIANG_GANG = 0x00000020; // 被抢杠
	int CHR_PI_HU = 0x00000040; // 屁和
	int CHR_QI_DUI = 0x00000100;// 七对
	int CHR_QING_YI_SE = 0x00000200; // 清一色
	int CHR_GANG_SHANG_KAI_HUA = 0x00000400; // 杠开花
	int CHR_QIANG_GANG = 0x00000800; // 抢杠胡
	int CHR_HU_258_JIA_FAN = 0x00001000; // 胡258加番
	int CHR_JIANG_258_JIA_FAN = 0x00002000; // 将258加番

	int HONG_ZHONG_CARD = 0x35; // 红中赖子

	int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	int HU_CARD_TYPE_JIE_PAO = 2; // 放炮
	int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	int HU_CARD_TYPE_GANG_KAI = 4; // 杠开花
	int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮
}
