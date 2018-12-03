package com.cai.common.constant.game;

public class Constants_ChenZhou {
    public static final int GAME_PLAYER_OF_4 = 4; // 四人玩
    public static final int GAME_PLAYER_OF_3 = 3; // 三人玩

    public static final int GAME_RULE_PLAYER_3 = 1; // 三人玩法
    public static final int GAME_RULE_PLAYER_4 = 2; // 四人玩法
    public static final int GAME_RULE_3_HU_XI_MEI_TUN = 3; // 3息1囤
    public static final int GAME_RULE_1_HU_XI_MEI_TUN = 4; // 1息1囤
    public static final int GAME_RULE_QIANG_ZHI_HU = 5; // 强制胡牌
    public static final int GAME_RULE_HONG_HEI_DIAN = 6; // 红黑点
    public static final int GAME_RULE_MAO_HU = 7; // 毛胡
    public static final int GAME_RULE_ZI_MO_DOUBLE = 8; // 自摸翻倍
    public static final int GAME_RULE_SHE_PAO = 9; // 射跑
    public static final int GAME_RULE_PIAO_FEN = 10; // 飘分
    
    public static final int CHR_ZI_MO = 0x0001; // 自摸
    public static final int CHR_CHI_HU = 0x0002; // 胡
    public static final int CHR_JEI_PAO_HU = 0x0004; // 接炮
    public static final int CHR_PHZ_FANG_PAO = 0x0008; // 放炮
    public static final int CHR_TIAN_HU = 0x0010; // 天胡
    public static final int CHR_ALL_HEI = 0x0020; // 全黑
    public static final int CHR_ONE_HONG = 0x0040; // 一点红
    public static final int CHR_TEN_HONG_PAI = 0x0080; // 全红
    public static final int CHR_SPECAIL_TIAN_HU = 0x0100; // 特殊天胡
    public static final int CHR_MAO_HU = 0x0200; // 毛胡
    
    public static final int BASIC_HU_XI_9 = 9; // 9胡起胡
    public static final int BASIC_HU_XI_3 = 3; // 3胡起胡
    
    public static final int CARD_DATA_PHZ[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, // 小一到十
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, // 大壹到拾
    };
}
