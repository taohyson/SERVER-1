package com.cai.common.constant.game;

public class Constants_EZ {
    public static final int GAME_RULE_DI_FEN = 1; // 底分
    public static final int GAME_RULE_FENG_DING = 2; // 封顶
    public static final int GAME_RULE_QI_HU_FEN = 3; // 起胡分
    
    public static final int GAME_RULE_QI_DUI = 4; // 可胡七对
    public static final int GAME_RULE_PENG_PENG_HU = 5; // 可胡碰碰胡
    public static final int GAME_RULE_QING_YI_SE = 6; // 可胡清一色
    public static final int GAME_RULE_JIANG_YI_SE = 7; // 可胡将一色
    
    public static final int GAME_RULE_KAO_ZHANG_KOU_FEN = 8; // 杠后打靠张包赔
    
    public static final int GAME_RULE_PLAYER_FOUR = 9; // 四人场
    public static final int GAME_RULE_PLAYER_THREE = 10; // 三人场
    public static final int GAME_RULE_PLAYER_TWO = 11; // 二人场
    
    public static final int CHR_ZI_MO =                 0x0001; // 自摸
    public static final int CHR_JIE_PAO =               0x0002; // 接炮
    public static final int CHR_FANG_PAO =              0x0004; // 放炮
    public static final int CHR_YING_HU =               0x0008; // 硬胡
    public static final int CHR_RUAN_HU =               0x0010; // 软胡
    public static final int CHR_PENG_PENG_HU =          0x0020; // 碰碰胡 
    public static final int CHR_QI_DUI =                0x0040; // 七对
    public static final int CHR_HAO_HUA_QI_DUI =        0x0080; // 豪华七对
    
    public static final int CHR_SHH_QI_DUI =            0x0100; // 双豪华七对
    public static final int CHR_MEN_QIAN_QING =         0x0200; // 门前清
    public static final int CHR_QING_YI_SE =            0x0400; // 清一色
    public static final int CHR_JIANG_YI_SE =           0x0800; // 将一色
    public static final int CHR_SAN_HAO_HUA_QI_DUI =    0x1000; // 三豪华七对
    
    public static final int HU_CARD_TYPE_ZI_MO =        1; // 自摸
    public static final int HU_CARD_TYPE_JIE_PAO =      2; // 接炮
    
    public static final int HZ_INDEX =          31; // 红中索引
    public static final int HZ_CARD =           0x35; //  红中牌值
    
    public static final int CARD_DATA[] = new int[] { 
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

            0x35, 0x35, 0x35, 0x35, // 红中
            0x36, 0x36, 0x36, 0x36, // 绿发
            0x37, 0x37, 0x37, 0x37, // 白板
    };
}
