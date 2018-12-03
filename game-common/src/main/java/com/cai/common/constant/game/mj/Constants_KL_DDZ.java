package com.cai.common.constant.game.mj;

/**
 * 快乐斗地主
 * 
 * @author admin
 *
 */
public class Constants_KL_DDZ {
	public static final int GAME_RULE_FEMH_DING = 1; // 不封顶
	public static final int GAME_RULE_16_FENG_DING = 2; // 16倍封顶
	public static final int GAME_RULE_32_FENG_DING = 3; // 32倍封顶
	public static final int GAME_RULE_JIAO_FEN_WAN_FA = 4; // 叫分玩法
	public static final int GAME_RULE_QIANG_DI_ZHU_WAN_FA = 5; // 抢地主玩法
	public static final int GAME_RULE_WU_LAI_ZI = 6; // 无癞子
	public static final int GAME_RULE_SUI_JI_LAI_ZI = 7; // 随机癞子
	public static final int GAME_RULE_GU_DING_HUA_PAI_LAI_ZI = 8; // 固定花牌癞子
	public static final int GAME_RULE_BU_PIAO = 9; // 不飘
	public static final int GAME_RULE_DUI_PIAO = 10; // 对飘
	public static final int GAME_RULE_BU_DUI_PIAO = 11; // 不对飘
	public static final int GAME_RULE_3_BU_NENG_DAI = 12; // 3张不能带
	public static final int GAME_RULE_3_DAI_1 = 13; // 3带1
	public static final int GAME_RULE_3_DAI_2_DUI_ZI = 14; // 3带2对子
	public static final int GAME_RULE_BU_NENG_DAI = 15; // 4张不能带
	public static final int GAME_RULE_DAI_2_DAN_ZHANG = 16; // 4带2
	public static final int GAME_RULE_DAI_2_DUI_ZI = 17; // 4带2对子
	public static final int GAME_RULE_WIN_CALL_BANKER = 18; // 赢家先叫
	public static final int GAME_RULE_RAND_CALL_BANKER = 19; // 随机叫牌

	public static final int KLDDZ_MAX_COUT = 21;// 手牌
	public static final int KLDDZ_DI_PAI_COUNT_JD_LAI_ZI = 4; // 底牌数量
	public static final int KLDDZ_DI_PAI_COUNT_JD = 3; // 底牌数量

	// 扑克牌值
	public static final int CARD_DATA_DDZ_KL[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
			// A
			// -
			// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			// A
			// -
			// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			// A
			// -
			// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D,

			0x4E, 0x4F, };

	// 扑克牌值
	public static final int CARD_DATA_DDZ_KL_LAI_ZI[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
			0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			// A
			// -
			// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			// A
			// -
			// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			// A
			// -
			// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D,

			0x4E, 0x4F, 0x5E };
}