package com.cai.common.constant.game;

public class Constants_YZCHZ {
	public static final int GAME_RULE_FAN_XING = 1; // 翻醒
	public static final int GAME_RULE_SUI_XING = 2; // 随醒
	public static final int GAME_RULE_PEI_5 = 3; // 王牌赔5分
	public static final int GAME_RULE_PEI_10 = 4; // 王牌赔10分
	public static final int GAME_RULE_PEI_15 = 5; // 王牌赔15分
	
	public static final int CHR_ZI_MO = 0x0001; // 自摸胡
	public static final int CHR_JIE_PAO = 0x0002; // 接炮
	public static final int CHR_FANG_PAO = 0x0004; // 放炮
	public static final int CHR_HONG_HU = 0x0008; // 红胡
	public static final int CHR_ONE_HONG = 0x0010; // 一点红
	public static final int CHR_HEI_HU = 0x0020; // 黑胡
	public static final int CHR_WANG_DIAO = 0x0040; // 王钓
	public static final int CHR_WANG_DIAO_WANG = 0x0080; // 王钓王
	public static final int CHR_WANG_CHUANG = 0x0100; // 王闯
	public static final int CHR_ALL_HONG = 0x0200; // 全红
	public static final int CHR_TIAN_HU = 0x0400; // 天胡，庄家起手21张胡牌
	public static final int CHR_CHI_HU = 0x0800; // 胡
	
	public static final int HU_CARD_ZI_MO = 1; // 自摸
	public static final int HU_CARD_FAN_PAI = 2; // 翻牌
	public static final int HU_CARD_JIE_PAO = 3; // 接炮
	
	public static final int MAX_CHZ_INDEX = 21; // 加王牌的最大索引是21
	
	public static final int MAGIC_CARD_INDEX = 20; // 王牌的索引从0开始计算
	
	public static final int CARD_COUNT_YZCHZ = 82; // 80+2张王牌
	public static final int[] CARD_FOR_YZCHZ = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
			0x21, 0x21, // 王牌
	};
}
