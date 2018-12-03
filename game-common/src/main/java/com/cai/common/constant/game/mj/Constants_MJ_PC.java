package com.cai.common.constant.game.mj;


public class Constants_MJ_PC {

	public static final int GAME_RULE_PLAYER_4 = 1; // 四人场
	public static final int GAME_RULE_PLAYER_3 = 2; // 三人场
	public static final int GAME_RULE_PLAYER_2 = 3; // 二人场
	public static final int GAME_RULE_DIAN_PAO = 4; // 点炮胡（抢杠算自摸）
	public static final int GAME_RULE_ZI_MO = 5; // 自摸胡（大胡可点炮胡）
	public static final int GAME_RULE_QUAN_KAI_FANG = 6; // 全开放
	public static final int GAME_RULE_QUAN_KAI_FANG_HZJ = 7; // 全开放红中金
	public static final int GAME_RULE_ONLY_HZJ = 8; // 红中金大规则
	public static final int GAME_RULE_QI_XIAO_DUI = 9; // 七小对 玩家手牌全是对子，且没有吃碰杠；
	public static final int GAME_RULE_QI_DA_DUI = 10; // 七大对 碰碰胡，手牌除了一对将之外均有杠或者刻子组成；
	public static final int GAME_RULE_QING_YI_SE = 11; // 清一色
	public static final int GAME_RULE_HH_QI_XIAO_DUI = 12; // 豪华七小对 玩家在七小对牌型基础上，有两个对子一样；
	public static final int GAME_RULE_TIANDIHU = 13; // 天地胡
	public static final int GAME_RULE_QING_YI_SE_QI_XIAO_DUI = 14; // 清一色七小对
	public static final int GAME_RULE_QING_YI_SE_QI_DA_DUI = 15; // 清一色七大对
	public static final int GAME_RULE_QING_YI_SE_HH_QI_XIAO_DUI = 16; // 清一色豪华七小对
	public static final int GAME_RULE_HZJ = 17; // 红中金(红中做癞子)
	public static final int GAME_RULE_FEI_0 = 18; // 飞苍蝇不飞
	public static final int GAME_RULE_FEI_ZHUANG_1 = 19; // 庄飞一只
	public static final int GAME_RULE_FEI_ZHUANG_2 = 20; // 庄飞两只
	public static final int GAME_RULE_FEI_EVERY_1 = 21; // 每人飞一只
	public static final int GAME_RULE_FEI_EVERY_2 = 22; // 每人飞两只
	public static final int GAME_RULE_FEI_EVERY_4 = 23; // 每人飞四只
	public static final int GAME_RULE_SHAO_ZHUANG = 24; // 会烧庄
	public static final int GAME_RULE_NO_SHAO_ZHUANG = 25; // 不会烧庄
	public static final int GAME_RULE_OVERTIME_NO = 26; // 永不超时托管
	public static final int GAME_RULE_OVERTIME_10S = 27; // 时间10s
	public static final int GAME_RULE_OVERTIME_1M = 28; // 超时托管时间1分钟
	public static final int GAME_RULE_OVERTIME_5M = 29; // 超时托管时间5分钟
	public static final int GAME_RULE_FEI_ZHUANG_4 = 30; // 庄飞四只
	
	
	public static final int HONG_ZHONG_INDEX = 31;
	public static final int HONG_ZHONG_DATA = 0x35;
	
	

	public static final int HU_CARD_TYPE_ZI_MO 	= 1; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	
	
	public static final int CHR_ZI_MO 							= 0x00000001; // 自摸
	public static final int CHR_BEI_QIANG_GANG 					= 0x00000002; // 被抢杠
	public static final int CHR_DIAN_PAO_HU 					= 0x00000004; // 点炮胡
	public static final int CHR_FANG_PAO 						= 0x00000008; // 放炮
	public static final int CHR_QI_XIAO_DUI 					= 0x00000010; // 七小对
	public static final int CHR_QI_DA_DUI 						= 0x00000020; // 七大对
	public static final int CHR_QING_YI_SE 						= 0x00000040; // 清一色
	public static final int CHR_HH_QI_XIAO_DUI 					= 0x00000080; // 豪华七小对
	public static final int CHR_QING_YI_SE_QI_XIAO_DUI 			= 0x00000100; // 清一色七小对
	public static final int CHR_QING_YI_SE_QI_DA_DUI			= 0x00000200; // 清一色七大对
	public static final int CHR_QING_YI_SE_HH_QI_XIAO_DUI 		= 0x00000400; // 清一色豪华七小对
	public static final int CHR_TIAN_HU 						= 0x00000800; // 天胡
	public static final int CHR_DI_HU 							= 0x000001000; // 地胡
	public static final int CHR_PING_HU 						= 0x000002000; // 平胡
	public static final int CHR_QING_GANG_HU 					= 0x000004000; // 抢杠胡
}
