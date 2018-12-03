package com.cai.common.constant.game;

public class Constants_CouYiSe {
    public static final int GAME_RULE_DI_FEN = 1; // 底分

    public static final int GAME_RULE_8_DIAN = 2; // 8点
    public static final int GAME_RULE_16_DIAN = 3; // 16点
    public static final int GAME_RULE_32_DIAN = 4; // 32点
    
    public static final int GAME_RULE_FENG_DING = 5; // 封顶分
    
    public static final int GAME_RULE_QI_HU_FEN = 6; // 起胡分
    
    public static final int CHR_ZI_MO =             0x0000001; // 自摸
    public static final int CHR_JIE_PAO =           0x0000002; // 接炮
    public static final int CHR_FANG_PAO =          0x0000004; // 放炮
    public static final int CHR_YING_HU =           0x0000008; // 硬胡
    
    public static final int CHR_RUAN_HU =           0x0000010; // 软胡
    public static final int CHR_HAI_DI_LAO =        0x0000020; // 海底捞
    public static final int CHR_GANG_KAI =          0x0000040; // 杠开
    public static final int CHR_QUAN_QIU_REN =      0x0000080; // 全求人
    
    public static final int CHR_COU_YI_SE =         0x0000100; // 凑一色
    public static final int CHR_FENG_YI_SE =        0x0000200; // 风一色
    public static final int CHR_QING_YI_SE =        0x0000400; // 清一色
    public static final int CHR_JIANG_YI_SE =       0x0000800; // 将一色
    
    public static final int CHR_HUN_PENG =          0x0001000; // 混碰
    public static final int CHR_HUN_QI =            0x0002000; // 混七
    public static final int CHR_COU_PENG =          0x0004000; // 凑碰
    public static final int CHR_COU_QI =            0x0008000; // 凑七
    
    public static final int CHR_QING_PENG =         0x0010000; // 清碰
    public static final int CHR_QING_QI =           0x0020000; // 清七
    public static final int CHR_JIANG_PENG =        0x0040000; // 将碰
    
    public static final int CHR_MEN_QIAN_QING =     0x0080000; // 门前清
    
    public static final int HZ_INDEX = 31; // 红中索引
    public static final int HZ_CARD = 0x35; // 红中牌值
    
    public static final int HU_CARD_TYPE_ZI_MO =        1; // 自摸
    public static final int HU_CARD_TYPE_JIE_PAO =      2; // 接炮
    public static final int HU_CARD_TYPE_GANG_KAI = 3; // 杠开

    public static final int CARD_DATA[] = new int[] { 
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万
            0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 条
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 条
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 条
            0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 条
            0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 筒
            0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 筒
            0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 筒
            0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 筒

            0x31, 0x31, 0x31, 0x31, // 东
            0x32, 0x32, 0x32, 0x32, // 南
            0x33, 0x33, 0x33, 0x33, // 西
            0x34, 0x34, 0x34, 0x34, // 北
            0x35, 0x35, 0x35, 0x35, // 中
            0x36, 0x36, 0x36, 0x36, // 发
            0x37, 0x37, 0x37, 0x37, // 白
    };
}
