package com.cai.common.constant.game;

import com.cai.common.constant.GameConstants;

public class GameConstants_SXJY extends GameConstants {

	public static final int GAME_RULE_SHANXI_QYS_YTL_JF = 1; // 清一色、一条龙，加翻
	public static final int GAME_RULE_SHANXI_FH = 2; // 风胡玩法
	public static final int GAME_RULE_SHANXI_GBTKBNG = 3; // 改变听口不能杠
	public static final int GAME_RULE_PLAYER_NUM_4 = 4; // 4人玩法

	public static final int GANG_TYPE_AN_FENG_GANG = 5; // 暗风杠
	public static final int GANG_TYPE_MING_FENG_GANG = 6; // 明风杠

	public static final int GAME_RULE_SHANXI_QYS_YTL_QXD_FH_JF = 7; // 清一色、一条龙、七小对、风胡+10
	public static final int GAME_RULE_SHANXI_QYSYTL_QYSQXD_HHQXD = 8; // 清一色一条龙、清一色七小对、豪华七小对+20
	public static final int GAME_RULE_SHANXI_DIAN_GANG_BAO_GANG = 9; // 点杠包杠
	public static final int GAME_RULE_SHANXI_NENG_HU_BI_HU = 10; // 能胡必胡
	public static final int GAME_RULE_SHANXI_LAO_PAI = 11; // 老牌规则

	public static final int CHR_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int CHR_TYPE_DIAN_PAO = 0x00000002; // 点炮胡
	public static final int CHR_TYPE_QIANG_GANG = 0x00000004; // 抢杠胡
	public static final int CHR_TYPE_FENG_HU = 0x00000008; // 风胡

	public static final int CHR_QI_XIAO_DUI = 0x00000010; // 七小对
	public static final int CHR_SHI_SAN_YAO = 0x00000020; // 十三幺
	public static final int CHR_YI_TIAO_LONG = 0x00000040;// 一条龙
	public static final int CHR_QING_YI_SE = 0x00000080; // 清一色

	public static final int CHR_QYS_YTL = 0x00000100; // 清一色一条龙
	public static final int CHR_QYS_QXD = 0x00000200; // 清一色七小对
	public static final int CHR_HHQXD = 0x00000400;// 豪华七小对

	public static final int CHR_HUNAN_FENG_YI_SE = 0x00008000; // 风一色

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸的牌
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 点炮胡的牌
	public static final int HU_CARD_TYPE_QIANG_GANG_HU = 3; // 抢杠胡的牌

	public static final int CARD_ESPECIAL_TYPE_HIDE = 5300;// 报听后打出那张牌 需要扑倒
															// 不让别人看见

	public static final int CARD_ESPECIAL_TYPE_GANG_NAN_FENG = 5400;// 如果选择风杠的话
																	// 杠风的牌 那张南风

	public static final int DONG_FENG_CARD = 0x31;// 如果选择风杠的话 杠风的牌 那张东风
	public static final int BEI_FENG_CARD = 0x34;// 北风

	public static final int WIK_FENG_GANG = 0x400;// 特殊杠牌的操作 风杠

	public static final int WIK_HIDE_ACTION = 0x400000; // 能胡必胡时候添加的一个隐藏动作

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
