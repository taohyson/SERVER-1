package com.cai.common.constant.game.czbg;

/**
 * 郴州八怪常量定义
 * 
 * @author hexinqi
 *
 */
public class CZBGConstants {

	public static final int CZBG_RULE_PLAYER_2 = 2; // 2人
	public static final int CZBG_RULE_PLAYER_3 = 3; // 3
	public static final int CZBG_RULE_PLAYER_4 = 4; // 4
	public static final int CZBG_RULE_PLAYER_5 = 5; // 5
	public static final int CZBG_RULE_PLAYER_6 = 6; // 6
	public static final int CZBG_RULE_BANKER_WITH_RATE = 7; // 有倍抢庄
	public static final int CZBG_RULE_BANKER_WITH_TRUN = 8; // 轮流当庄
	public static final int CZBG_RULE_BANKER_WITH_FIXED = 9; // 固定庄
	public static final int CZBG_RULE_WITH_OUT_BANKER = 10; // 无庄通比
	public static final int CZBG_RULE_TRANSFORM_WITH_KING = 11; // 王当癞子
	public static final int CZBG_RULE_WITH_OUT_TRANSFORM = 12; // 无癞子
	public static final int CZBG_RULE_BASE_SCORE_1 = 13; // 1底分
	public static final int CZBG_RULE_BASE_SCORE_2 = 14; // 2底分
	public static final int CZBG_RULE_BASE_SCORE_3 = 15; // 3底分
	public static final int CZBG_RULE_BASE_SCORE_4 = 16; // 4底分
	public static final int CZBG_RULE_XIAN_NIU_HOU_GUAI = 17; // 先牛后怪
	public static final int CZBG_RULE_BA_GUAI = 18; // 八怪玩法
	public static final int CZBG_RULE_SAME_TYPE_COMP_COLOR = 19; // 同牌型比花色
	public static final int CZBG_RULE_SAME_TYPE_BANKER_WIN = 20; // 同牌型庄家赢
	public static final int CZBG_RULE_SAME_TYPE_DRAW = 21; // 同牌型平局

	public static final int OX_CARD_COUNT = 5; // 斗牛时候的手牌数
	public static final int MAX_CARD_COUNT = 8; // 最大手牌数
	public static final int COLOR_COUNT = 15; // 一门花色的卡牌数

	public static final int GS_CZBG_FREE = 0; // 空闲状态
	public static final int GS_CZBG_GAME_PLAY = 100;// 游戏状态
	public static final int GS_CZBG_CALL_BANKER = 101; // 叫庄状态
	public static final int GS_CZBG_OPEN_CARD = 102; // 摊牌状态
	public static final int GS_CZBG_GAME_END = 103; // 游戏结束
	public static final int GS_CZBG_OPEN_CARD_GUAI = 104; // 八怪开牌状态
	public static final int GS_CZBG_GAME_END_GUAI = 105; // 八怪游戏结束
	public static final int GS_CZBG_GAME_XIA_ZHU = 106; // 下注
	public static final int GS_CZBG_WAIT = 200; // 等待状态

	public static final int CZBG_ERROR = 0; // 错误
	public static final int CZBG_WIN = 1; // 赢
	public static final int CZBG_SAME = 0; // 相同
	public static final int CZBG_LOSE = -1; // 输

	// 八怪卡牌类型
	public static final int CZBG_CARD_TYPE_ERROR = -1; // 错误牌型
	public static final int CZBG_CARD_TYPE_SINGLE = 1; // 单牌
	public static final int CZBG_CARD_TYPE_DOUBLE = 2; // 对子
	public static final int CZBG_CARD_TYPE_ORDER = 3; // 顺子
	public static final int CZBG_CARD_TYPE_THREE = 4; // 三条
	public static final int CZBG_CARD_TYPE_SAME_COLOR_ORDER = 5; // 同花顺
	// 报道
	public static final int CZBG_CARD_TYPE_THREE_ORDER = 6; // 全顺
	public static final int CZBG_CARD_TYPE_BOOM = 7; // 四条
	public static final int CZBG_CARD_TYPE_FOUR_DOUBLE = 8; // 四对
	public static final int CZBG_CARD_TYPE_EIGHT = 9; // 八怪

	// 分数
	public static final int CZBG_CARD_SCORE_THREE = 4; // 三条的分数
	public static final int CZBG_CARD_SCORE_FLUSH = 5; // 同花顺的分数
	public static final int CZBG_CARD_BAO_DAO = 1; // 报道每一道多赢的分数

	// 协议
	public static final int RESPONSE_CZBG_GAME_START = 1001; // 斗牛开始
	public static final int RESPONSE_CZBG_OPEN_CARD = 1002; // 斗牛开牌
	public static final int RESPONSE_CZBG_OX_RESULT = 1003; // 斗牛结果
	public static final int RESPONSE_CZBG_GAME_START_GUAI = 1004; // 八怪开始
	public static final int RESPONSE_CZBG_OPEN_CARD_GUAI = 1005; // 八怪开牌
	public static final int RESPONSE_CZBG_RESULT_GUAI = 1006; // 结算
	public static final int RESPONSE_RECONNECT_DATA = 1007; // 重连
	public static final int RESPONSE_CZBG_GAME_START_AFTER_OX = 1008; // 斗牛后八怪发牌
	public static final int RESPONSE_CZBG_PROMPT = 1009; // 斗牛后八怪发牌
	public static final int RESPONSE_CZBG_CALL_BANKER = 1010; // 叫庄
	public static final int RESPONSE_CZBG_ADD_JETTON = 1011; // 下注
	public static final int RESPONSE_CZBG_ADD_JETTON_PLAY = 1012; // 各个玩家的下注信息
	public static final int RESPONSE_CZBG_CALL_BANKER_PLAY = 1013; // 各个玩家的叫庄
	public static final int RESPONSE_CZBG_BAO_DAO = 1014; // 玩家报道

	// 一副牌
	public static final int CARD_DATA_WITH_KING[] = new int[] {
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x4E, 0x4F };
	// 一副牌 没有大小王
	public static final int CARD_DATA_WITH_OUT_KING[] = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
	};

}
