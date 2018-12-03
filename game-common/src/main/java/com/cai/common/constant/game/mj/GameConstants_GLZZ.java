package com.cai.common.constant.game.mj;

import com.cai.common.constant.GameConstants;

/**
 * 丰城麻将常量
 * 
 * @author WalkerGeek
 */
public class GameConstants_GLZZ extends GameConstants {

	public static final int GAME_RULE_KE_HU_QI_DUI = 1; // 可胡七对
	public static final int GAME_RULE_QIANG_ZHI_HU_PAI = 2; // 强制胡牌
	public static final int GAME_RULE_YI_PAO_DUO_XIANG = 3; // 一炮多响
	public static final int GAME_RULE_YUN_XU_CHONG_XING3 = 4; // 三醒连翻
	
	public static final int GAME_RULE_SHANG_XING = 5; // 上醒
	public static final int GAME_RULE_ZHONG_XING = 6; // 中醒
	public static final int GAME_RULE_XIA_XING = 7; // 下醒
	public static final int GAME_RULE_SUIJI = 8; // 首局随机庄
	public static final int GAME_RULE_FANGZHU = 9;// 首局房主庄
	public static final int GAME_RULE_YUN_XU_CHONG_XING4 = 10; // 四醒连翻

	// 全部的麻将数据
	public static final int CARD_DATA_MAX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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