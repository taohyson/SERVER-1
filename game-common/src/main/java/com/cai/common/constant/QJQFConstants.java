package com.cai.common.constant;

public class QJQFConstants {

	public static final int ERROR = -1; // 错误类型
	public static final int PASS = 0; // 过
	public static final int SINGLE = 1; // 单张
	public static final int DOUBLE = 2; // 对子
	public static final int THREE = 3; // 三张
	// 这里开始是炸弹 大吃小
	public static final int BOM_FIVE_TEN_K = 5; // 510k炸弹
	public static final int BOM_FOUR = 6; // 炸弹4张
	public static final int BOM_COLOR_FIVE_TEN_K = 7; // 510k同花炸弹
	public static final int BOM_BIG = 8; // 炸弹 5张及以上
	public static final int BOM_KING = 9; // 四大天王炸弹
	public static final int BOM_EIGHT = 10; // 至 尊：八张相同点数的牌
	public static final int HAND_CARD = 27; // sh

	public static final int QJQF_RULE_ZHA = 1; // 总炸
	public static final int QJQF_TRUSTEE = 3;// 托管

	// 协议
	public static final int RESPONSE_QJQF_GAME_START = 1007;//// 1007
															//// 开始(gameStart)
	public static final int RESPONSE_QJQF_REFRESH_PLAYER_CARDS = 1008;// 刷新玩家的牌
	public static final int RESPONSE_QJQF_RECONNECT_DATA = 1009; // 断线重连
	public static final int RESPONSE_QJQF_OUT_CARD = 1010;// 发送玩家出牌
	public static final int RESPONSE_QJQF_GAME_END = 1011;
	public static final int RESPONSE_QJQF_BIG_BOOM = 1012; // 总炸
	// 两副牌
	public static final int CARD_DATA_SR_TWO[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
			0x0B, 0x0C, 0x0D, // 方块
								// A
								// -
								// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
																							// -
																							// K
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
																							// A
																							// -
																							// K
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
																							// A
																							// -
																							// K
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
																							// -
																							// K
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
																							// -
																							// K
			0x4E, 0x4E, 0x4F, 0x4F };
}
