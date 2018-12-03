package com.cai.common.constant.game.mj;

public class GameConstants_NingXiangWang {

	public static final int GAME_RULE_FENG_DING = 5; // 大胡封顶(默认三番)
	public static final int GAME_RULE_NOT_FENG_DING = 6; // 大胡不封顶
	public static final int GAME_RULE_ONLY_ZI_MO = 7; // 只能自摸
	public static final int GAME_RULE_PIAO_NIAO = 8; // 飘鸟
	public static final int GAME_RULE_KE_CHI = 9; // 可以吃牌

	public static final int GAME_RULE_ZHUA_NIAO_ZERO = 10; // 抓鸟0
	public static final int GAME_RULE_ZHUA_NIAO_ONE = 11; // 抓鸟1
	public static final int GAME_RULE_ZHUA_NIAO_TWO = 12; // 抓鸟2
	public static final int GAME_RULE_ZHUA_NIAO_FOUR = 13; // 抓鸟4
	public static final int GAME_RULE_ZHUA_NIAO_SIX = 14; // 抓鸟6

	public static final int CHR_ZI_MO = 0x00000001; // 自摸胡
	public static final int CHR_JIE_PAO = 0x00000002; // 接炮
	public static final int CHR_FANG_PAO = 0x00000004; // 放炮
	public static final int CHR_GANG_KAI = 0x00000008; // 杠上开花
	public static final int CHR_QIANG_GANG = 0x00000010; // 抢杠胡

	public static final int CHR_PING_HU = 0x00000020; // 平胡
	public static final int CHR_QING_YI_SE = 0x00000040; // 清一色
	public static final int CHR_PENG_PENG_HU = 0x00000080; // 碰碰胡
	public static final int CHR_JIANG_JIANG_HU = 0x00000100; // 将将胡
	public static final int CHR_QI_XIAO_DUI = 0x00000200; // 七小对

	public static final int CHR_WU_WANG = 0x00000400; // 无王
	public static final int CHR_LIU_WANG = 0x00000800; // 六王

	public static final int CHR_HAI_DI_LAO_YUE = 0x00001000; // 海底捞月
	public static final int CHR_HAI_DI_PAO = 0x00002000; // 海底炮

	public static final int CHR_GANG_SHANG_PAO = 0x00004000; // 杠上炮

	public static final int CHR_TIAN_HU = 0x00010000; // 天胡
	public static final int CHR_BAO_TING = 0x00080000; // 报听

	public static final int CHR_WU_WANG_WU_JIANG = 0x00400000; // 无王无将
	public static final int CHR_QUE_YI_SE = 0x00800000; // 缺一色
	public static final int CHR_YI_ZHI_HUA = 0x01000000; // 一枝花
	public static final int CHR_HEI_TIAN_HU = 0x02000000; // 黑天胡
	public static final int CHR_SI_WANG = 0x04000000; // 四王
	public static final int CHR_QI_SHOU_HU = 0x08000000; // 起手胡

	// 请求胡牌类型
	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸胡
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮胡
	public static final int HU_CARD_TYPE_GANG_KAI = 3; // 杠开
	public static final int HU_CARD_TYPE_QIANG_GANG = 4; // 抢杠
	public static final int HU_CARD_TYPE_GANG_SHANG_PAO = 5; // 杠上炮
	public static final int HU_CARD_TYPE_QI_SHOU_HU = 6; // 起手胡
	public static final int HU_CARD_TYPE_TIAN_HU = 7; // 天胡
	public static final int HU_CARD_TYPE_HAI_DI_LAO_HU = 8; // 海底捞胡
	public static final int HU_CARD_TYPE_HAI_DI_PAO_HU = 9; // 海底炮胡
	public static final int HU_CARD_TYPE_BAO_TING = 10; // 报听

	public static final int MAX_MAGIC_CARD = 2;
	public static final int CELL_SCORE = 1;

	public static final int WIK_BAO_TING = 0x10000; // 报听(操作)
	public static final int CARD_STATUS_BAO_TING = 2; // 报听(牌型状态)
	public static final int WIK_FENG_DONG = 0x20000; // 封东(操作)
	public static final int CARD_STATUS_FENG_DONG = 3; // 封东(牌型状态)
	public static final int CARD_STATUS_DA_LAI = 4; // 打癞锁牌(牌型状态)

	public static final int Show_Card_FengDong = 7;
	public static final int Show_Card_KaiGang = 8;
	public static final int Show_Card_HaiDi = 9;
	public static final int Show_Card_SelectMagicCard = 10;

	public static final int[] CARD_DATA = { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
	};
}
