package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

/**
 * 
 * 常量类
 * @author WalkerGeek 
 */
public class GameConstants_SYZP extends GameConstants {
	

	//游戏玩法
	public static final int GAME_RULE_PLAYER_SYZP_XI3 = 1; // 三息一囤
	public static final int GAME_RULE_PLAYER_SYZP_XI5 = 2; //5息一囤
	public static final int GAME_RULE_PLAYER_SYZP_ZIMO_DOUBLE = 3; //自摸翻倍
	public static final int GAME_RULE_PLAYER_SYZP_ZIMO_JIAYITUN = 4; //自摸加一囤
	@Deprecated
	public static final int GAME_RULE_PLAYER_SYZP_DIAN_PAO = 5; //点炮胡
	public static final int GAME_RULE_PLAYER_SYZP_DIAN_PAO_BI_HU = 6; //点炮必胡
	public static final int GAME_RULE_PLAYER_SYZP_YOU_PAO_BI_HU = 7; //强制胡牌
	public static final int GAME_RULE_PLAYER_SYZP_BI_HU_WU = 8; //无必胡
	public static final int GAME_RULE_PLAYER_SYZP_ZIMO_WU = 9; //自摸不加分
	public static final int GAME_RULE_PALYER_SYZP_THREE = 10; //三人场
	public static final int GAME_RULE_PLAYER_SYZP_FOUR = 11;  //四人场
	public static final int GAME_RULE_PLAYER_SYZP_XI1 = 12;  //一息一囤
	public static final int GAME_RULE_PALYER_SYZP_HONHEIDIAN = 13; //红黑点
	
	
	
	
	public static final int CARD_DATA_PHZ_DEFAULT[] = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
	};
}
