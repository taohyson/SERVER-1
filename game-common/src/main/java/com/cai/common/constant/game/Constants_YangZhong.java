package com.cai.common.constant.game;

public class Constants_YangZhong {
    public static final int GAME_RULE_PLAYER_THREE = 1; // 三人场
    public static final int GAME_RULE_PLAYER_FOUR = 2; // 四人场

    public static final int GAME_RULE_HUN_WU_QING_SHI = 3; // 混五清十
    public static final int GAME_RULE_HUN_SHI_QING_ER_SHI = 4; // 混十清二十

    public static final int GAME_RULE_YI_MO_ER_CHONG = 5; // 一摸二冲
    public static final int GAME_RULE_YING_ER_HUA = 6; // 硬二花
    public static final int GAME_RULE_YING_SAN_HUA = 7; // 硬三花
    public static final int GAME_RULE_YING_WU_HUA = 8; // 硬五花
    
    public static final int CHR_ZI_MO = 0x00000001; // 自摸
    public static final int CHR_JIE_PAO = 0x00000002; // 接炮
    public static final int CHR_FANG_PAO = 0x00000004; // 放炮
    public static final int CHR_PI_HU = 0x00000008; // 屁和
    public static final int CHR_DUI_DUI_HU = 0x00000020; // 对对和
    public static final int CHR_HUN_YI_SE = 0x00000040; // 混一色
    public static final int CHR_QING_YI_SE = 0x00000080; // 清一色
    public static final int CHR_HUN_DUI_DUI = 0x00000100; // 浑对对
    public static final int CHR_QING_DUI_DUI = 0x00000200; // 清对对
    public static final int CHR_DA_ZI = 0x00000400; // 大字
    public static final int CHR_HAI_DI = 0x00000800; // 海底(只能自摸)
    public static final int CHR_DA_DIAO = 0x00001000; // 大吊(单掉)
    public static final int CHR_GANG_KAI = 0x00002000; // 杠开
    public static final int CHR_QIANG_GANG = 0x00004000; // 抢杠

    public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
    public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
    public static final int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
    public static final int HU_CARD_TYPE_GANG_KAI = 4; // 杠开花
    public static final int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮
    
    public static final int max_hua_card = 8; //
    
    public static final int CARD_DATA_YANG_ZHONG[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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

            0x38, // 春
			0x39, // 夏
			0x41, // 秋
			0x42, // 冬
			0x43, // 梅
			0x44, // 兰
			0x45, // 竹
			0x46, // 菊
    };
}
