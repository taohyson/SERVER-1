package com.cai.common.constant.game.mj;


public class Constants_WanZai{

	public static final int GAME_RULE_PEOPLE_COUNT_2 = 1; // 人数2人
	public static final int GAME_RULE_PEOPLE_COUNT_3 = 2; // 3人
	public static final int GAME_RULE_PEOPLE_COUNT_4 = 3; // 4人
	public static final int GAME_RULE_TIAN_DI_HU_SCORE_10 = 4; // 天地胡10分起
	public static final int GAME_RULE_ON_FIRE= 5; // 对火
	public static final int GAME_RULE_NO_FIRE = 6; // 不对火
	public static final int GAME_RULE_ON_WIND = 7; // 对飘
	public static final int GAME_RULE_NO_WIND = 8; // 不对飘
	public static final int GAME_RULE_ON_CHASE = 9; // 可追庄
	public static final int GAME_RULE_NO_CHASE = 10; // 不可追庄
	public static final int GAME_RULE_ON_EAT_CARD = 11; // 可吃牌
	public static final int GAME_RULE_NO_EAT_CARD = 12; // 不可吃牌

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_QIANG_GANG = 2; // 抢杠胡
	public static final int HU_CARD_TYPE_GANG_SHANG_KAI_HUA = 3; // 杠开花
	public static final int HU_CARD_TYPE_GANG_SHANG_PAO = 4; // 杠上炮
	public static final int HU_CARD_TYPE_DIAN_PAO_HU = 8; // 点炮胡
	public static final int HU_CARD_TYPE_TIAN_HU = 5; // 天胡
	public static final int HU_CARD_TYPE_DI_HU = 6; // 地胡
	
	public static final long CHR_ZI_MO = 				0x0000000000000001L; // 自摸1倍
	public static final long CHR_PING_HU = 				0x0000000000000002L; // 平胡1分
	public static final long CHR_QIANG_GANG_HU = 		0x0000000000000004L; // 抢杠胡1分
	public static final long CHR_BEI_QIANG_GANG = 		0x0000000000000008L; // 被抢杠1分
	public static final long CHR_GANG_SHANG_KAI_HUA = 	0x0000000000000010L; // 杠上开花1倍
	public static final long CHR_GANG_SHANG_PAO = 		0x0000000000000020L; // 杠上炮1倍
	public static final long CHR_DIAN_PAO_HU = 			0x0000000000000040L; // 点炮胡1倍
	public static final long CHR_FANG_PAO = 			0x0000000000000080L; // 放炮1倍
	public static final long CHR_SHI_SAN_LAN = 			0x0000000000000100L; // 十三烂2分
	public static final long CHR_DA_DUI = 				0x0000000000000200L; // 大对3
	public static final long CHR_QX_SHI_SAN_LAN = 		0x0000000000000400L; // 七星十三烂4分
	public static final long CHR_QING_YI_SE = 			0x0000000000000800L; // 清一色4分
	public static final long CHR_ZI_YI_SE = 			0x0000000000001000L; // 字一色4分
	public static final long CHR_QI_DUI = 				0x0000000000002000L; // 七对5
	public static final long CHR_QYS_DA_DUI = 			0x0000000000004000L; // 清一色大对7
	public static final long CHR_QYS_QI_DUI = 			0x0000000000008000L; // 清一色七对9
	public static final long CHR_HH_QI_DUI = 			0x0000000000010000L; // 豪华七对10
	public static final long CHR_DI_HU = 				0x0000000000020000L; // 地胡10
	public static final long CHR_TIAN_HU = 				0x0000000000040000L; // 天胡10
	public static final long CHR_ZYS_DA_DUI = 			0x0000000000080000L; // 字一色大对13
	public static final long CHR_QYS_HH_QI_DUI = 		0x0000000000100000L; // 清一色豪华七对14
	public static final long CHR_ZYS_QI_DUI = 			0x0000000000200000L; // 字一色七对15
	public static final long CHR_2HH_QI_DUI = 			0x0000000000400000L; // 双豪华七对20
	public static final long CHR_ZYS_HH_QI_DUI = 		0x0000000000800000L; // 字一色豪华七对20
	public static final long CHR_QYS_2HH_QI_DUI = 		0x0000000001000000L; // 清一色双豪华七对24
	public static final long CHR_3HH_QI_DUI = 			0x0000000002000000L; // 三豪华七对40
	public static final long CHR_ZYS_2HH_QI_DUI = 		0x0000000004000000L; // 字一色双豪华七对40
	public static final long CHR_QYS_3HH_QI_DUI = 		0x0000000008000000L; // 清一色三豪华七对44
	public static final long CHR_ZYS_3HH_QI_DUI = 		0x0000000010000000L; // 字一色三豪华七对80
	public static final long CHR_QUAN_QIU_REN = 		0x0000000020000000L; // 全求人2倍

}