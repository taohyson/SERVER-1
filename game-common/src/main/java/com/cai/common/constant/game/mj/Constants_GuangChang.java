package com.cai.common.constant.game.mj;


public class Constants_GuangChang{

	public static final int GAME_RULE_PEOPLE_COUNT_4 = 1; // 人数4人
	public static final int GAME_RULE_PEOPLE_COUNT_3 = 2; // 3人
	public static final int GAME_RULE_PEOPLE_COUNT_2 = 3; // 2人
	public static final int GAME_RULE_YES_DUAN_YAO_JIU = 4; // 有断幺九
	public static final int GAME_RULE_NO_DUAN_YAO_JIU = 5; // 无断幺九
	public static final int GAME_RULE_YES_QUAN_YAO_JIU = 6; // 有全幺九
	public static final int GAME_RULE_NO_QUAN_YAO_JIU = 7; // 无全幺九
	public static final int GAME_RULE_AN_GANG_SCORE_2 = 8; // 暗杠2子（分）
	public static final int GAME_RULE_AN_GANG_SCORE_1 = 9; // 暗杠1子（分）
	public static final int GAME_RULE_ROOM_SCORE_1 = 10; // 房间分1分
	public static final int GAME_RULE_ROOM_SCORE_2 = 11; // 2分
	public static final int GAME_RULE_ROOM_SCORE_5 = 12; // 5分

	//public static final int WIK_GEN_ZHUANG = 0x800; // 烧庄

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_QIANG_GANG = 2; // 抢杠胡
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 3; // 杠开花
	public static final int HU_CARD_TYPE_GANG_SHANG_PAO = 4; // 杠上炮
	public static final int HU_CARD_TYPE_DIAN_PAO = 4; // 点炮胡
	public static final int HU_CARD_TYPE_TIAN_HU = 5; // 天胡
	public static final int HU_CARD_TYPE_DI_HU = 6; // 地胡
	
	public static final int CHR_ZI_MO = 				0x00000001; // 自摸2倍
	public static final int CHR_QIANG_GANG = 			0x00000002; // 抢杠胡1分
	public static final int CHR_GANG_KAI_HUA = 			0x00000004; // 杠开花2倍
	public static final int CHR_FANG_GANG = 			0x00000008; // 被抢杠1分
	public static final int CHR_DIAN_PAO = 				0x00000010; // 点炮胡2倍
	public static final int CHR_FANG_PAO = 				0x00000020; // 放炮2倍
	public static final int CHR_QUAN_QIU_REN = 			0x00000040; // 全求人4分
	public static final int CHR_SHI_SAN_LAN = 			0x00000080; // 十三烂1分
	public static final int CHR_QX_SHI_SAN_LAN = 		0x00000100; // 七星十三烂2分
	public static final int CHR_DA_QI_DUI = 			0x00000200; // 大七对2
	public static final int CHR_XAIO_QI_DUI = 			0x00000400; // 小七对3
	public static final int CHR_YAO_JIU =	 			0x00000800; // 幺九2
	public static final int CHR_DUAN_YAO_JIU = 		    0x00001000; // 断幺九2
	public static final int CHR_YJ_DA_QI_DUI = 			0x00002000; // 幺九大七对4
	public static final int CHR_YJ_XIAO_QI_DUI = 		0x00004000; // 幺九小七对6
	public static final int CHR_YJ_QUAN_QIU_REN = 		0x00008000; // 幺九全求人8
	public static final int CHR_HH_XIAO_QI_DUI = 		0x00010000; // 豪华小七对6
	public static final int CHR_2HH_XIAO_QI_DUI = 		0x00020000; // 双豪华小七对12
	public static final int CHR_3HH_XIAO_QI_DUI = 		0x00040000; // 三豪华小七对24
	public static final int CHR_AC_DA_QI_DUI = 			0x00080000; // 暗藏大七对4
	public static final int CHR_XS_XIAO_QI_DUI = 		0x00100000; // 潇洒小七对6
	public static final int CHR_TIAN_HU = 				0x00200000; // 天胡10
	public static final int CHR_DI_HU = 				0x00400000; // 地胡5
	public static final int CHR_QING_YI_SE = 			0x00800000; // 清一色2倍
	public static final int CHR_WP_QING_YI_SE = 		0x01000000; // 清一色（无碰）4分
	public static final int CHR_GANG_SHANG_PAO = 		0x02000000; // 杠上炮2倍
	public static final int CHR_PING_HU = 				0x04000000; // 平胡
	public static final int CHR_QING_YI_SE_JIA_HU = 	0x08000000; // 清一色假胡

}