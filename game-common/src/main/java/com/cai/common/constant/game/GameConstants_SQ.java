/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

/**
 * 
 * 商丘麻将常量类
 * @author WalkerGeek 
 * date: 2017年10月24日 下午6:44:55 <br/>
 */
public class GameConstants_SQ extends GameConstants {
	
	
	public static final int GAME_RULE_SQ_FOUR = 1;   //四人场
	public static final int GAME_RULE_SQ_THREE = 25;  // 三人场
	public static final int GAME_RULE_SQ_YOU_HUA_WU_SHU = 3;  //有花无树
	public static final int GAME_RULE_SQ_YOU_SHU_WU_HUA = 4;  //有树无花
	public static final int GAME_RULE_SQ_WU_HUA_WU_SHU = 5; //无花无树
	public static final int GAME_RULE_SQ_AN_GANG_SUO_SI = 6; //暗杠锁死
	public static final int GAME_RULE_SQ_QING_YI_SE = 7 ;    //清一色，断两门
	public static final int GAME_RULE_SQ_BU_DAI_FENG = 8;   //不带风
	public static final int GAME_RULE_SQ_BAO_TING = 9;  // 报听
	public static final int GAME_RULE_SQ_KE_HU_QI_DUI = 10;  //可胡七对
	public static final int GAME_RULE_SQ_YING_KOU = 11;  //硬扣
	public static final int GAME_RULE_SQ_LIANG_SI_DA_YI = 12; //亮四打一
	public static final int GAME_RULE_SQ_XIA_PAO = 13; //下跑
	public static final int GAME_RULE_SQ_JUE_MEN = 14 ;    //绝门
	public static final int GAME_RULE_SQ_QIA_ZHANG = 15;   //掐张
	public static final int GAME_RULE_SQ_MEN_QING = 16;  // 门清
	public static final int GAME_RULE_SQ_AN_KA = 17;  //暗卡
	public static final int GAME_RULE_SQ_ZIMO_JIA_CHENG = 18;  //自摸加成
	
	
	public static final int GAME_LIANG_ZHANG = 4;
	
	public static final int DISPATCHCARD_TYPE_BU_HUA = 2;   //补花发牌
	
	public static final int SEND_OTHER_TYPE1 = 1; //只发亮牌
	
	public static final int SEND_OTHER_TYPE2 = 2; //只发花牌
	
	public static final int SEND_OTHER_TYPE3 = 3; //花牌亮牌都发
	
	// 万条筒
	public static final int CARD_DATA_DEFAULT[] = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	
	};
	
	//风牌
	public static final int CARD_DATA_FEN[] = new int[]{
			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
	};
	
	
	//花牌
	public static final int CARD_DATA_HUA[] = new int[]{
			0x38, // 春
			0x39, // 夏
			0x41, // 秋
			0x42, // 冬
			0x43, // 梅
			0x44, // 兰
			0x45, // 竹
			0x46, // 菊
	};
	
	
}
