package com.cai.common.constant.game.mj;


import com.cai.common.constant.GameConstants;

public class GameConstants_YGFB extends GameConstants {

	public static final int GAME_RULE_DAI_BAO_HU= 1; // 带宝胡
	public static final int GAME_RULE_JIAN_BAO_FEI = 2; // 见宝飞

	
	public static final int CHR_HENAN_DAN_DIAO = 0x00040000; // 单吊
	public static final int CHR_HENAN_DE_GUO = 0x00080000; // 德国
	public static final int CHR_HUNAN_QX_SHI_SAN_LAN = 0x00000040; // 七星十三烂
	public static final int CHR_JEI_PAO_HU_CHD = 0x08000000; // 接炮胡
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

			0x31, 0x31, 0x31, 0x31, // 东风
			0x32, 0x32, 0x32, 0x32, // 西风
			0x33, 0x33, 0x33, 0x33, // 南风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
}
