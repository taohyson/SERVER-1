package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

/**
 * 红中赖子杠
 * 
 * @author yu
 *
 */
public class GameConstants_HZLZG extends GameConstants {

	public static final int RULE_TYPE_JIN_DING_10 = 1; // 金顶 10
	public static final int RULE_TYPE_JIN_DING_20 = 2; // 金顶20
	public static final int RULE_TYPE_JIN_DING_50 = 3; // 金顶 50
	public static final int RULE_TYPE_JIN_DING_100 = 4; // 金顶100
	public static final int RULE_TYPE_QIANG_GANG_HU = 5; // 抢杠胡

	public static final int GANG_TYPE_AN_GANG = 1;
	public static final int GANG_TYPE_JIE_GANG = 2;
	public static final int GANG_TYPE_ADD_GANG = 3;
	public static final int GAME_TYPE_SPEC_GANG = 4; // 红中赖子杠

	public static final int DispatchCard_Type_Tian_Hu = 0x10000000; // 摸第一张牌
	public static final int DispatchCard_Type_Noraml = 0x20000000;// 普通发牌
	public static final int OutCard_Type_Noraml = 0x40000000;// 普通出牌
	public static final int OutCard_Type_Di_Hu = 0x80000000;

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 0x00000008; // 杠开

	public static final int CHR_PENG_PENG_HU = 0x00000001; // 碰碰
	public static final int CHR_QING_YI_SE = 0x00000002; // 清一色
	public static final int CHR_JIANG_YI_SE = 0x00000004; // 将一色
	public static final int CHR_FENG_YI_SE = 0x00000008; // 风一色
	public static final int CHR_GANG_KAI_HUA = 0x00000010; // 杠上开花
	public static final int CHR_HAI_DI_HU = 0x00000020; // 海底捞月
	public static final int CHR_QIANG_GANG_HU = 0x00000040; // 抢杠胡
	public static final int CHR_HUNAN_QI_XIAO_DUI = 0x00000080; // 七小对
	public static final int CHR_QUAN_QIU_REN = 0x00000100; // 全求人
	public static final int CHR_JING_DING = 0x00000200; // 金顶

	public static final int WIK_BAO_QING = 0x20000; // 报清
	public static final int BAO_QING = 1; // 报清
	public static final int WIK_BAO_JIANG = 0x40000; // 报将
	public static final int BAO_JIANG = 2; // 报将
	public static final int BAO_GUO = 3; // 报将
}
