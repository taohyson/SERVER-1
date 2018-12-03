package com.cai.common.constant.game.mj;

import com.cai.common.constant.GameConstants;

public class UniversalConstants extends GameConstants {
	// 通用的胡的那张牌的类型。基本所有的都只有这几种，如果不够，往后面追加。
	public static final int U_HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int U_HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	public static final int U_HU_CARD_TYPE_GANG_SHANG_HUA = 3; // 杠上花
	public static final int U_HU_CARD_TYPE_QIANG_GANG_HU = 4; // 抢杠胡
	public static final int U_HU_CARD_TYPE_GANG_SHANG_PAO = 5; // 杠上炮

	// 通用的建房面板规则，值能一直往上加。也可以每个子游戏都从新开始计数。
	public static final int U_GAME_RULE_PLAYER_FOUR = 1; // 四人
	public static final int U_GAME_RULE_PLAYER_THREE = 2; // 三人
	public static final int U_GAME_RULE_SEVEN_MAGIC = 3; // 七王
	public static final int U_GAME_RULE_FOUR_MAGIC = 4; // 四王
	public static final int U_GAME_RULE_ONE_BIRD = 5; // 抓1鸟
	public static final int U_GAME_RULE_TWO_BIRD = 6; // 抓2鸟
	public static final int U_GAME_RULE_THREE_BIRD = 7; // 抓3鸟
	public static final int U_GAME_RULE_REPLACABLE_MAGIC = 8; // 代王硬
	public static final int U_GAME_RULE_PLAYER_TWO = 9; // 二人
	public static final int U_GAME_RULE_ZHUANG_JIA_LIANG_FEN = 10; // 庄家加2分
	public static final int U_GAME_RULE_AN_GANG_KE_JIAN = 11; // 暗杠可见
	public static final int U_GAME_RULE_SHU_YE = 12; // 数页
	public static final int U_GAME_RULE_ZHUANG_JIA_YI_FEN = 13; // 庄加1分
	public static final int U_GAME_RULE_LUN_ZHUANG = 14; // 荒庄轮庄
	public static final int U_GAME_RULE_MUST_MEN_QING = 15; // 必门清

	// 长整型的CHR值，能支持到64个牌型，争取用现有的。或者对不同的游戏，尽量用同一个16进制值但是不同的名字。也可以每个子游戏都从新开始计数。
	public static final long U_CHR_ZI_MO = 0x00000001; // 自摸
	public static final long U_CHR_JIE_PAO = 0x00000002; // 接炮
	public static final long U_CHR_FANG_PAO = 0x00000004; // 放炮
	public static final long U_CHR_GANG_SHANG_HUA = 0x00000008; // 杠上花
	public static final long U_CHR_QIANG_GANG_HU = 0x00000010; // 抢杠胡
	public static final long U_CHR_GANG_SHANG_PAO = 0x00000020; // 杠上炮

	//
	public static final long U_CHR_PING_HU = 0x00000040; // 平胡
	public static final long U_CHR_QING_YI_SE = 0x00000080; // 清一色
	public static final long U_CHR_YING_ZHUANG = 0x00000100; // 硬庄
	public static final long U_CHR_SAN_WANG = 0x00000200; // 三王
	public static final long U_CHR_XIAO_QI_DUI = 0x00000400; // 小七对
	public static final long U_CHR_SI_WANG = 0x00000800; // 四王
	public static final long U_CHR_LIU_WANG = 0x00001000; // 六王
	public static final long U_CHR_QI_WANG = 0x00002000; // 七王

	// 吉县1928夹
	public static final long U_CHR_JX_SAN_YUAN = 0x00000040; // 三元
	public static final long U_CHR_JX_MEN_QING = 0x00000080; // 门清
	public static final long U_CHR_JX_YI_ZHANG_YING = 0x00000100; // 一张赢
	public static final long U_CHR_JX_QI_DUI = 0x00000200; // 七对
	public static final long U_CHR_JX_LUAN_YI_SE = 0x00000400; // 乱一色
	public static final long U_CHR_JX_QING_YI_SE = 0x00000800; // 清一色
	public static final long U_CHR_JX_LUAN_FANG = 0x00001000; // 乱方
	public static final long U_CHR_JX_ZI_YI_SE = 0x00002000; // 字一色
	public static final long U_CHR_JX_DA_DU_ZI = 0x00004000; // 大肚子
	public static final long U_CHR_JX_ZHONG_FA_BAI = 0x00008000; // 中发白
	public static final long U_CHR_JX_DI_HU = 0x00010000; // 天胡
	public static final long U_CHR_JX_TIAN_HU = 0x00020000; // 地胡

	// 临汾硬三组
	public static final long U_CHR_LF_GU_JIANG = 0x00000040; // 孤将
	public static final long U_CHR_LF_YI_ZHANG_YING = 0x00000080; // 一张赢
	public static final long U_CHR_LF_QUE_MEN = 0x00000100; // 缺门
	public static final long U_CHR_LF_SAN_YUAN = 0x00000200; // 三元
	public static final long U_CHR_LF_SAN_FENG = 0x00000400; // 三风
	public static final long U_CHR_LF_MEN_QING = 0x00000800; // 门清
	public static final long U_CHR_LF_QING_YI_SE = 0x00001000; // 清一色
	public static final long U_CHR_LF_YI_TIAO_LONG = 0x00002000; // 一条龙
	public static final long U_CHR_LF_QI_XIAO_DUI = 0x00004000; // 七小对
	public static final long U_CHR_LF_HAO_HUA_QXD = 0x00008000; // 豪华七小对
	public static final long U_CHR_LF_SHUANG_HAO_HUA_QXD = 0x00010000; // 双豪华七小对
	public static final long U_CHR_LF_ZI_YI_SE = 0x00020000; // 字一色
	public static final long U_CHR_LF_QING_LONG = 0x00040000; // 清龙
	public static final long U_CHR_LF_QING_QI_DUI = 0x00080000; // 清七对
	public static final long U_CHR_LF_QING_HH_QI_DUI = 0x00100000; // 清豪华七对
	public static final long U_CHR_LF_SHU_YE = 0x00200000; // 数页
}
