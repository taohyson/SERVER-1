package com.cai.common.constant.game;

public class Constants_HuangShi {
    public static final int GAME_RULE_DI_FEN_1 = 1; // 底分1分
    public static final int GAME_RULE_DI_FEN_2 = 2; // 底分2分
    public static final int GAME_RULE_DI_FEN_5 = 3; // 底分0.5分
    
    public static final int GAME_RULE_HONG_ZHONG_FA_CAI_GANG = 4; // 红中发财杠
    public static final int GAME_RULE_HONG_ZHONG_LAI_ZI_GANG = 5; // 红中癞子杠
    
    public static final int GAME_RULE_QI_HU_XUAN_ZE_1 = 6; // 起胡分 8/10/16/20
    public static final int GAME_RULE_QI_HU_XUAN_ZE_2 = 7; // 起胡分 16/20/30/32/35
    
    public static final int CHR_ZI_MO =                 0x0001; // 自摸（手提）
    public static final int CHR_JIE_PAO =               0x0002; // 接炮
    public static final int CHR_FANG_PAO =              0x0004; // 放炮
    public static final int CHR_YING_HU =               0x0008; // 硬胡
    public static final int CHR_RUAN_HU =               0x0010; // 软胡
    public static final int CHR_QING_YI_SE =            0x0020; // 清一色
    public static final int CHR_PENG_PENG_HU =          0x0040; // 碰碰胡
    public static final int CHR_QI_DUI =                0x0080; // 七对
    public static final int CHR_JIANG_YI_SE =           0x0100; // 将一色
    public static final int CHR_DA_DAO =                0x0200; // 大刀（未开口的小胡自摸）
    public static final int CHR_XIAO_DAO =              0x0400; // 小刀（开了口的小胡自摸）
    public static final int CHR_QUAN_QIU_REN =          0x0800; // 全求人
    
    public static final int HU_CARD_TYPE_ZI_MO =        1; // 自摸
    public static final int HU_CARD_TYPE_JIE_PAO =      2; // 接炮
    
    public static final int HONG_ZHONG_INDEX =          31; // 红中索引
    public static final int HONG_ZHONG_CARD =           0x35; //  红中牌值
    public static final int FA_CAI_INDEX =              32; // 发财索引
    public static final int FA_CAI_CARD =               0x36; // 发财牌值
    public static final int BAI_BAN_INDEX =              33; // 白板索引
    public static final int BAI_BAN_CARD =               0x37; // 白板牌值
    
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
