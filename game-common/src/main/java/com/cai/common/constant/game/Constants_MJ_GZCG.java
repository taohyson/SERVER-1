package com.cai.common.constant.game;

public class Constants_MJ_GZCG {
	// 单选
	public static final int GAME_RULE_DI_LEI = 1; // 上下翻埋地雷
	public static final int GAME_RULE_ZUOYOU_FAN = 2; // 上下左右翻精
	public static final int GAME_RULE_ZUOZUO_FAN = 3; // 上下左左右右翻精
	public static final int GAME_RULE_TONG_ZHUANG = 4; // 庄闲通庄
	public static final int GAME_RULE_FAN_BEI = 5; // 庄家翻倍
	public static final int GAME_RULE_PING_HU = 6; // 可平胡
	public static final int GAME_RULE_ZI_MO = 7; // 仅自摸
	public static final int GAME_RULE_BI_DIAO = 8; // 精必钓
	public static final int GAME_RULE_BASE_SCORE_ONE = 9; // 底分1
	public static final int GAME_RULE_BASE_SCORE_TWO = 10; // 底分2
	public static final int GAME_RULE_PLAYER_NUMBER_TWO = 12; // 2人场
	public static final int GAME_RULE_PLAYER_NUMBER_THREE = 13; // 3人场
	public static final int GAME_RULE_PLAYER_NUMBER_FOUR = 14; // 4人场
	public static final int GAME_RULE_JIN_SHANG_JING = 15; // 仅上精
	public static final int GAME_RULE_QUAN_BU_JING = 16; // 全部精
	public static final int GAME_RULE_KE_CHI = 17; //可吃
	public static final int GAME_RULE_BU_KE_CHI = 18; //不可吃
	public static final int GAME_RULE_BASE_SCORE_FOUR = 19;  //4分底
	
	
	// 复选
	public static final int GAME_RULE_REWARD = 11; // 出精奖励

	public static final int BEGIN_FOUR = 82; // 剩余82张牌时候游戏正式开始
	public static final int BEGIN_THREE = 82 + 13; // 3人场 剩余82+13张牌时候游戏正式开始
	public static final int BEGIN_TWO = 82 + 26; // 2人场 剩余82+26张牌时候游戏正式开始
	public static final int END = 34; // 剩余34张牌时结束
	public static final int DE_GUO_EXTRA_SCORE = 5; // 德国牌型额外加分
	public static final int CHAO_ZHUANG_SCORE = 2; // 抄庄分

	public static final int JING = 0x100; // 上精牌
	public static final int NORMAL = 0x000; // 正常牌

	// 协议
	public static final int RESPONSE_GZCG_FAN_JING = 1012; // 翻精
	public static final int RESPONSE_GZCG_GAME_END = 1013; // 结算

	public static final int CHR_ZI_MO = 0x0001; // 自摸
	public static final int CHR_JIE_PAO = 0x0002; // 接炮
	public static final int CHR_TIAN_HU = 0x0004; // 天胡
	public static final int CHR_DI_HU = 0x0008; // 地胡
	public static final int CHR_FANG_PAO = 0x0010; // 放炮
	public static final int CHR_QIANG_GANG_HU = 0x0020; // 抢杠胡
	public static final int CHR_PENG_HU = 0x0040; // 大七对 也就是碰胡
	public static final int CHR_GANG_SHANG_HUA = 0x0080; // 杠上开花
	public static final int CHR_MEN_QING = 0x0100; // 门清
	public static final int CHR_XIAO_QI_DUI = 0x0200; // 七小对
	public static final int CHR_SHI_SAN_LAN = 0x0400; // 十三烂
	public static final int CHR_QI_XING_SHI_SAN_LAN = 0x0800; // 七星十三烂
	public static final int CHR_DE_GUO = 0x1000; // 德国
	public static final int CHR_JING_DIAO = 0x2000; // 精钓
	public static final int CHR_PING_HU = 0x4000; // 平胡

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI = 4; // 杠开
	public static final int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮

	public static final int FAN_GANG_KAI = 2; // 杠开
	public static final int FAN_DE_GUO = 2; // 德国
	public static final int FAN_JING_DIAO = 2; // 精钓
	public static final int FAN_TIAN_HU = 8; // 天胡地胡8翻
	public static final int FAN_DA_QI_DUI = 4; // 大七对
	public static final int FAN_XIAO_QI_DUI = 2; // 小七对
	public static final int FAN_SHI_SAN_LAN = 2; // 十三烂
	public static final int FAN_QI_XING_SHI_SAN_LAN = 4; // 七星十三烂
	public static final int FAN_PING_HU = 1; // 平胡
	public static final int FAN_BASE = 4; // 基础倍数

	// 默认麻将 基本牌都有
	public static final int DEFAULT[] = new int[] { 
			0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
			0x32, 0x32, 0x32, 0x32, // 南风
			0x33, 0x33, 0x33, 0x33, // 西风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板
	};
}
