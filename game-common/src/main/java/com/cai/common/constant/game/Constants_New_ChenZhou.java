package com.cai.common.constant.game;

public class Constants_New_ChenZhou {
    public static final int GAME_PLAYER_OF_4 = 4; // 四人玩
    public static final int GAME_PLAYER_OF_3 = 3; // 三人玩
    public static final int GAME_PLAYER_OF_2 = 2; // 二人玩

    public static final int GAME_RULE_PLAYER_2 = 1; // 二人玩法
    public static final int GAME_RULE_PLAYER_3 = 2; // 三人玩法
    public static final int GAME_RULE_PLAYER_4 = 3; // 四人玩法

    public static final int GAME_RULE_3_HU_QI_HU = 4; // 3胡起胡
    public static final int GAME_RULE_6_HU_QI_HU = 5; // 6胡起胡
    public static final int GAME_RULE_9_HU_QI_HU = 6; // 9胡起胡
    
    public static final int GAME_RULE_3_HU_XI_MEI_TUN = 7; // 3息1囤
    public static final int GAME_RULE_1_HU_XI_MEI_TUN = 8; // 1息1囤
    
    public static final int GAME_RULE_YOU_HU_BI_HU = 9; // 有胡必胡
    public static final int GAME_RULE_FANG_PAO_BI_HU = 10; // 放炮必胡
    public static final int GAME_RULE_NO_YOU_HU_BI_HU = 11; // 无
    
    public static final int GAME_RULE_HONG_HEI_DIAN = 12; // 红黑点
    public static final int GAME_RULE_HONG_HEI_DIAN_2_FAN = 13; // 红黑点2番
    public static final int GAME_RULE_WU_HONG_HEI_DIAN = 14; // 无
    
    public static final int GAME_RULE_ZI_MO_DOUBLE = 15; // 自摸翻倍
    public static final int GAME_RULE_MAO_HU = 16; // 毛胡
    public static final int GAME_RULE_TIAN_DI_HU = 17; // 天地胡
    
    public static final int GAME_RULE_PIAO_123 = 18; // 飘123
    public static final int GAME_RULE_PIAO_235 = 19; // 飘235
    public static final int GAME_RULE_BU_PIAO = 20; // 不飘
    
    public static final int GAME_RULE_21_ZHANG = 21; // 21张
    public static final int GAME_RULE_15_ZHANG = 22; // 15张
    
    public static final int GAME_RULE_SUAN_FEN_1 = 23; // 1胡起1息1囤
    public static final int GAME_RULE_SUAN_FEN_2 = 24; // 起胡1囤额外1息1囤
    
    public static final int GAME_RULE_SPEED_FAST = 25; // 速度-快速
    public static final int GAME_RULE_SPEED_NORMAL = 26; // 速度-正常
    
    public static final int GAME_RULE_SHOU_DONG_DIAN_HU = 27; // 手动点胡 
    
    public static final int CHR_ZI_MO =            0x0001; // 自摸
    public static final int CHR_CHI_HU =           0x0002; // 胡
    public static final int CHR_JEI_PAO_HU =       0x0004; // 接炮
    public static final int CHR_PHZ_FANG_PAO =     0x0008; // 放炮
    public static final int CHR_TIAN_HU =          0x0010; // 天胡
    public static final int CHR_ALL_HEI =          0x0020; // 全黑
    public static final int CHR_ONE_HONG =         0x0040; // 一点红
    public static final int CHR_TEN_HONG_PAI =     0x0080; // 全红
    public static final int CHR_SPECAIL_TIAN_HU =  0x0100; // 特殊天胡
    public static final int CHR_MAO_HU =           0x0200; // 毛胡
    public static final int CHR_DI_HU =            0x0400; // 地胡
    
    public static final int BASIC_HU_XI_9 = 9; // 9胡起胡
    public static final int BASIC_HU_XI_6 = 6; // 6胡起胡
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
