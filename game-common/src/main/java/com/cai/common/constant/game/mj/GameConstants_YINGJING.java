package com.cai.common.constant.game.mj;

import com.cai.common.constant.GameConstants;

/**
 * 荥经麻将常量
 * @author WalkerGeek 
 */
public class GameConstants_YINGJING extends GameConstants {

//	public static final int GAME_RULE_SI_REN = 1; // 四人麻将
//	public static final int GAME_RULE_SAN_REN = 2; // 三人麻将
	public static final int GAME_RULE_FENG_DING_3 = 1; // 3番
	public static final int GAME_RULE_FENG_DING_4 = 2; // 4番
	public static final int GAME_RULE_ZIMO_BU_JIA = 3; // 自摸不加
	public static final int GAME_RULE_ZIMO_JIA_DI=4; // 自摸加底
	public static final int GAME_RULE_ZIMO_JIA_FAN = 5; // 自摸加番
	
	
	public static final int MAX_COUNT = 11;  //最大手牌数量
	
	public static final int CHR_DUI_DUI_HU =        0x00000001; // 对对胡
    public static final int CHR_QING_YI_SE =        0x00000002; // 清一色
    public static final int CHR_QI_DUI =            0x00000004; // 暗5对
    public static final int CHR_JIANG_DUI =         0x00000010; // 将对
    public static final int CHR_TIAN_DIAN_DI = 		0x00000020; // 天点地
    public static final int CHR_LANG_QI =			0x00000030; // 廊起
    
    public static final int CHR_TIAN_HU =           0x00000200; // 天胡
    public static final int CHR_DI_HU =             0x00000400; // 地胡
    
    public static final int CHR_HAI_DI_PAO =        0x00002000; // 海底炮
    public static final int CHR_GANG_KAI =          0x00004000; // 杠开
    public static final int CHR_GANG_PAO =          0x00008000; // 杠炮
    
    public static final int CHR_QIANG_GANG =        0x00010000; // 抢杠
    public static final int CHR_FANG_PAO =          0x00020000; // 放炮
    public static final int CHR_JIE_PAO =           0x00040000; // 接炮
    public static final int CHR_ZI_MO =             0x00080000; // 自摸
    public static final int CHR_LONG_DUI = 			0x00200000; // 龙对
    public static final int CHR_DAI_YAO_JIU =       0x00800000; // 带幺九
    public static final int CHR_JI_HU = 			0x02000000; // 平胡
    public static final int CHR_HAI_DI_HUA = 		0x04000000; // 海底花
	
	public static final int WIK_AN_GANG = 0x1000; // 暗杠动画-下雨
    public static final int WIK_JIE_GANG = 0x2000; // 接杠动画-刮风
    public static final int WIK_ADD_GANG = 0x4000; // 回放杠动画-刮风
    
    public static final int WIK_LNAG_QI = 0x400; // 廊起1--需要出牌
    public static final int WIK_LNAG_QI2 = 0x800; // 廊起2-- 不需要出牌
    public static final int WIK_LNAG_QI_GUO = 10; // 廊起2过
     
    
    public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
    public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
    public static final int HU_CARD_TYPE_GANG_KAI = 3; // 杠开
    public static final int HU_CARD_TYPE_QIANG_GANG = 4; // 抢杠
    public static final int HU_CARD_TYPE_GANG_PAO = 5; // 杠炮
    public static final int HU_CARD_TYPE_DIAN_GANG_GANG_KAI = 6; // 点杠杠开
    
    public static final int SHOW_CARD_LANG_QI = 7; //显示廊起的牌

	// 全部的麻将数据
	public static final int CARD_DATA_MAX[] = new int[] { 
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
