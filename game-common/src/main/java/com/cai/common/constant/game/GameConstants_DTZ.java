package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_DTZ extends GameConstants {

	public static final int GMAE_RULE_PLAYER_2 = 1; // 2人
	public static final int GMAE_RULE_PLAYER_3 = 2; // 3人
	public static final int GAME_RULE_CARD_NUM_3 = 3; // 3副牌
	public static final int GAME_RULE_REWARD_NON = 4; // 无奖励
	public static final int GAME_RULE_REWARD_100 = 5;
	public static final int GAME_RULE_REWARD_200 = 6;
	public static final int GAME_RULE_REWARD_300 = 7;
	public static final int GAME_RULE_REWARD_500 = 8;
	public static final int GAME_RULE_HAVE_CARD_THAN_OUT = 9; // 有牌必出
	public static final int GAME_RULE_TRUSTEE = 10; // 托管
	public static final int GAME_RULE_SHOW_LEFT_CARD = 11; // 显示剩余牌
	public static final int GAME_RULE_CAN_DAI_CARD = 12; // 可带牌
	public static final int GAME_RULE_FEN_600 = 13; // 600分
	public static final int GAME_RULE_FEN_1000 = 14; // 1000分
	public static final int GAME_RULE_RODAM = 15; // 随机出头

	public static final int MAX_INDEX = 16;
	public static final int MAX_INDEX_COLOR = 54;
	public static final int EFFECT_ACTION_TYPE_MONEY = 0x1000;

	public static final int CT_ERROR = -1; // 错误类型
	public static final int CT_PASS = 0; // 过
	public static final int CT_SINGLE = 1; // 单张
	public static final int CT_DOUBLE = 2; // 对子
	public static final int CT_THREE = 3; // 三张
	public static final int CT_THREE_TAKE_ONE = 4; // 三带一
	public static final int CT_THREE_TAKE_TWO = 5; // 三带二
	public static final int CT_DOUBLE_LINE = 6; // 对子顺子
	public static final int CT_PLANE = 7; // 飞机带翅膀
	public static final int CT_PLANE_LOST = 8; // 飞机缺翅膀
	public static final int CT_BOMB_CARD_4 = 9; // 4炸弹
	public static final int CT_BOMB_CARD_5 = 10; // 5炸弹
	public static final int CT_BOMB_CARD_6 = 11; // 6炸弹
	public static final int CT_BOMB_CARD_7 = 12; // 7炸弹
	public static final int CT_BOMB_CARD_8 = 13; // 8炸弹
	public static final int CT_BOMB_CARD_TONG = 14; // 筒子炸
	public static final int CT_BOMB_CARD_DI = 15; // 地炸

	public static final int DISPLAY_TIME_AUTO_OUT = 120; // 自动出牌
	public static final int DISPLAY_TIME_15 = 15; // 15秒延迟

	public static final int CARD_DATA_THREE[] = new int[] { 0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
			0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
			0x01, 0x02, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃A
			0x31, 0x32, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃A
	};
}
