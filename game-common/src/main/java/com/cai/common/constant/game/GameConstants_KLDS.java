/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

/**
 * 
 * 窟窿带神麻将常量类
 * @author WalkerGeek 
 */
public class GameConstants_KLDS extends GameConstants {
	
	
	public static final int GAME_RULE_KLDS_BUHUANSHEN = 1;   //不换神
	public static final int GAME_RULE_KLDS_HUANSHEN = 2;  // 换神
	public static final int GAME_RULE_KLDS_BUFENTONYI = 3;  //优先同意
	public static final int GAME_RULE_KLDS_QUANBUTONGYI = 4;  //全部同意
	public static final int GAME_RULE_KLDS_DI1 = 5; //底分1
	public static final int GAME_RULE_KLDS_DI5 = 6; //底分5
	public static final int GAME_RULE_KLDS_XIAPAO  = 7;  //下跑
	public static final int GAME_RULE_KLDS_BUPAO  = 8;  //不跑
	
	
	public static final int GAME_RULE_DI_FENG_KEY  = 203;
	
	public static final int GAME_CARD_DISPATCH_NUM = 20000;   //弃牌堆中弃神牌的角标
	
	
	public static final int CHR_HENAN_KLDS_XIAO = 0x00010000; // 小窟窿
	public static final int CHR_HENAN_KLDS_ZHONG = 0x00020000; // 中窟窿
	public static final int CHR_HENAN_KLDS_DA = 0x00040000; // 大窟窿
	
	public static final int DING_SHENG_DEFAULT = 8;
	
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

	            0x31, 0x31, 0x31, 0x31, // 东风
		        0x32, 0x32, 0x32, 0x32, // 西风
		        0x33, 0x33, 0x33, 0x33, // 南风
		        0x34, 0x34, 0x34, 0x34, // 北风
		        0x35, 0x35, 0x35, 0x35, // 红中
		        0x36, 0x36, 0x36, 0x36, // 绿发
		        0x37, 0x37, 0x37, 0x37, // 白板
	 };
	
}
