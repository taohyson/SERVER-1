/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

/**
 * 
 * 河南焦作麻将常量类
 * @author WalkerGeek 
 */
public class GameConstants_JZ extends GameConstants {
	
	
	public static final int GAME_RULE_JZ_DAI_PAO = 1;   //带跑
	public static final int GAME_RULE_JZ_BUDAIPAO = 2;  // 不带跑
	public static final int GAME_RULE_JZ_DU_TING = 3;  //独听
	public static final int GAME_RULE_JZ_BAO_TING = 4;  //报听
	public static final int GAME_RULE_JZ_HU_BIANG_KA = 5; //只胡边坎吊
	public static final int GAME_RULE_JZ_LIANG_69 = 6; //连6连9
	public static final int GAME_RULE_JZ_515  = 7;  //515场
	public static final int GAME_RULE_JZ_ZIMO_BU_FANG_BEI  = 8;  //自摸不翻倍
	public static final int GAME_RULE_JZ_QIN_YI_SE_FAN_BEI  = 9;  //清一色翻倍
	public static final int GAME_RULE_JZ_GANG_KAI_FAN_BEI  = 10;  //杠花翻倍
	public static final int GAME_RULE_JZ_QI_DUI_FAN_BEI  = 11;  //七对翻倍
	public static final int GAME_RULE_JZ_GUO_SHOU_HU  = 12;  //碰牌后跟张打不可胡
	public static final int GAME_RULE_JZ_GUO_HU_ZI_MO = 13; //过胡自摸玩法
	public static final int GAME_RULE_JZ_GANG_PAO = 14;  //杠跑
	public static final int GAME_RULE_JZ_ZHUANG_XIAN = 15; //庄闲
	
	
	
	public static final int CHR_HENAN_LIANG6 = 0x00002000;
	
	public static final int CHR_HENAN_LIANG9 = 0x00004000;
	
	public static final int CHR_HENAN_BIAN_ZHANG_JZ = 0x4000000; // 边张
	
	
	public static final int CARD_DATA[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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

	 };
	
}
