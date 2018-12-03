package com.cai.common.constant.game.dzd;

/**
 * 打炸弹常量定义
 * 
 * @author hexinqi
 *
 */
public class DZDConstants {
	
	public static final int DZD_RULE_SHOW_CARD_COUNT = 1; // 显示牌数
	public static final int DZD_RULE_NOT_SHOW_CARD_COUNT = 2; // 不显示牌数
	public static final int DZD_RULE_ALL_CLOSE = 3; // 全关
	public static final int DZD_RULE_CAN_REMOVE_BOOM = 4; // 炸弹可拆

	public static final int SORT_CARD = -5; // 排序
	public static final int LOGIC_CARD = -4; // 理牌请求
	public static final int ERROR = -1; // 错误类型
	public static final int PASS = 0; // 过
	public static final int SINGLE = 1; // 单张
	public static final int DOUBLE = 2; // 对子
	public static final int THREE = 3; // 三张
	// 这里开始是炸弹 大吃小
	public static final int BOM_FOUR = 4; // 炸弹4张
	public static final int BOM_FIVE = 5; // 炸弹5张
	public static final int BOM_SIX = 6; // 炸弹6张
	public static final int BOM_SEVEN = 7; // 炸弹7张
	public static final int BOM_EIGHT = 8; // 炸弹8张
	public static final int HAND_CARD = 26; // 手牌数
	public static final int ONE_COLOR_CARD_COUNT = 13; // 一个花色中的卡牌数量
	public static final int WIN_SCORE = 1; // 获胜得分

	// 协议
	public static final int RESPONSE_DZD_GAME_START = 1007; // 开始(gameStart)
	public static final int RESPONSE_DZD_REFRESH_PLAYER_CARDS = 1008; // 刷新玩家的牌
	public static final int RESPONSE_DZD_RECONNECT_DATA = 1009; // 断线重连
	public static final int RESPONSE_DZD_OUT_CARD = 1010; // 发送玩家出牌
	public static final int RESPONSE_DZD_GAME_END = 1011; // 游戏结束
	public static final int REQUEST_DZD_SHOW_SCORE = 1012; // 看分请求
	public static final int REQUEST_DZD_LOGIC_CARD = 1013; // 理牌请求

	// 两副牌 去掉大小王
	public static final int CARD_DATA_SR_TWO[] = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
	};
	
	public static final int CARD_SCORE[] = new int[] {
			0x05, 0x0A, 0x0D, // 方块
			0x15, 0x1A, 0x1D, // 梅花
			0x25, 0x2A, 0x2D, // 红桃
			0x35, 0x3A, 0x3D, // 黑桃
			0x05, 0x0A, 0x0D, // 方块
			0x15, 0x1A, 0x1D, // 梅花
			0x25, 0x2A, 0x2D, // 红桃
			0x35, 0x3A, 0x3D, // 黑桃
	};
}
