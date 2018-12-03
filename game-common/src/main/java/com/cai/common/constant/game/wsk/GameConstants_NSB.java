package com.cai.common.constant.game.wsk;

import com.cai.common.constant.GameConstants;

public class GameConstants_NSB extends GameConstants {

	public static final int GAME_RULE_DAN_JU = 1; // 单局
	public static final int GAME_RULE_QIAN_FEN_JU = 2;// 千分局
	public static final int GAME_RULE_DAN_JU_1 = 3; // 单局1
	public static final int GAME_RULE_DAN_JU_2 = 4; // 单局2
	public static final int GAME_RULE_DAN_JU_4 = 5; // 单局4
	public static final int GAME_RULE_QIAN_FEN_JU_300 = 6;// 千分局
	public static final int GAME_RULE_QIAN_FEN_JU_500 = 7;// 千分局
	public static final int GAME_RULE_QIAN_FEN_JU_1000 = 8;// 千分局
	public static final int GAME_RULE_SAN_DAI_DUI = 9; // 三带一对
	public static final int GAME_RULE_FEI_JI_DAI_DUI = 10; // 飞机带对

	public static final int CT_ERROR = -1; // 错误类型
	public static final int CT_PASS = 0; // 过
	public static final int CT_SINGLE = 1; // 单牌类型
	public static final int CT_DOUBLE = 2; // 对子类型
	public static final int CT_THREE_NON = 3; // 3张类型,不带翅膀
	public static final int CT_THREE = 4; // 3张类型，带翅膀
	public static final int CT_FOUR = 5; // 4张类型
	public static final int CT_SINGLE_LINK = 6; // 单连类型
	public static final int CT_DOUBLE_LINK = 7; // 对连类型
	public static final int CT_THREE_LINK_NON = 8; // 三连类型,不带翅膀
	public static final int CT_THREE_LINK = 9; // 三连类型,带翅膀
	public static final int WSK_CT_KING_THREE = 10; // 3王类型
	public static final int CT_SHUN_ZI_DC = 11; // 杂花顺子
	public static final int CT_510K_DC = 12; // 杂510K
	public static final int CT_510K_SC = 13; // 纯510K
	public static final int CT_BOMB_4 = 14; // 4炸类型
	public static final int CT_BOMB_5 = 15; // 5炸类型
	public static final int CT_BOMB_6 = 16; // 6炸类型
	public static final int CT_BOMB_7 = 17; // 7炸类型
	public static final int CT_BOMB_8 = 18; // 8炸类型
	public static final int CT_SHUN_ZI_SC = 19; // 同花顺子
	public static final int CT_KING_FOUR = 20; // 4王炸弹

	public static final int WSK_MAX_COUNT = 28; // 手牌数量
}
