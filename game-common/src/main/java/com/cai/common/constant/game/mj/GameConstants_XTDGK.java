package com.cai.common.constant.game.mj;

import com.cai.common.constant.GameConstants;

/**
 * 幺筒断勾卡麻将常量
 * @author WalkerGeek 
 */
public class GameConstants_XTDGK extends GameConstants {

	public static final int GAME_RULE_SI_REN = 1; // 四人麻将
	public static final int GAME_RULE_SAN_REN = 2; // 三人麻将
	public static final int GAME_RULE_FENG_DING_5 = 3; // 5番
	public static final int GAME_RULE_FENG_DING_6 = 4; // 6番
	public static final int GAME_RULE_HAIDILAO = 5; // 海底捞加番
	public static final int GAME_RULE_HAIDIPAO = 6; // 海底炮加番
	public static final int GAME_RULE_DAI_YAO_JIU = 7; // 带幺九4番
	public static final int GAME_RULE_JIANG_DUI = 8; // 将对5番
	public static final int GAME_RULE_YAO_TONG = 9;// 幺筒(听用)
	public static final int GAME_RULE_DI1 = 10;// 1分底
	public static final int GAME_RULE_DI2 = 11;// 2分底
	public static final int GAME_RULE_DI3 = 12;// 3分底
	public static final int GAME_RULE_DI4 = 13;// 4分底
	public static final int GAME_RULE_DI5 = 14;// 5分底
	public static final int GAME_RULE_DI10 = 15;// 10分底
	public static final int GAME_RULE_ZIMO_JIADI = 16;//自摸加底
	public static final int GAME_RULE_ZIMO_JIAFAN = 17;//自摸加底
	
	
	public static final int MAX_COUNT = 11;  //最大手牌数量
	
	public static final int YAO_TONG_CARD = 0x21; //幺筒值
	
	public static final int WIK_QING_HU = 0x100; //请胡
	
	
	
	public static final int CHR_DUI_DUI_HU =        0x00000001; // 对对胡
    public static final int CHR_QING_YI_SE =        0x00000002; // 清一色
    public static final int CHR_QI_DUI =            0x00000004; // 5对(请胡)
    public static final int CHR_QING_DUIDUI =       0x00000008; // 清对对
    public static final int CHR_JIANG_DUI =         0x00000010; // 将对
    public static final int CHR_YAO_JIU =           0x00000040; // 幺九
    public static final int CARD_TYPE_ZHUA_BAO_HU = 0x00000080;  // 抓抱胡
    
    public static final int CHR_TIAN_HU =           0x00000200; // 天胡
    public static final int CHR_DI_HU =             0x00000400; // 地胡
    public static final int CHR_BAO_HU =            0x00000800; //报胡(音效)
    
    public static final int CHR_HAI_DI_PAO =        0x00002000; // 海底炮
    public static final int CHR_GANG_KAI =          0x00004000; // 杠开
    public static final int CHR_GANG_PAO =          0x00008000; // 杠炮
    
    public static final int CHR_QIANG_GANG =        0x00010000; // 抢杠
    public static final int CHR_FANG_PAO =          0x00020000; // 放炮
    public static final int CHR_JIE_PAO =           0x00040000; // 接炮
    public static final int CHR_ZI_MO =             0x00080000; // 自摸
    public static final int CHR_QING_HU = 			0x00100000; // 请胡(音效)
    public static final int CHR_DUAN_YAO_JIU = 		0x00200000; // 断幺九
    public static final int CHR_JIA_QING_QING_DUI = 0x00400000; // 清请胡
    public static final int CHR_DAI_YAO_JIU =       0x00800000; // 带幺九
    public static final int CHR_QING_YAO_JIU =      0x01000000; // 清幺九
    public static final int CHR_JI_HU = 			0x02000000; // 鸡胡
    public static final int CHR_HAI_DI_HUA = 		0x04000000; // 海底花
    public static final int CARD_TYPE_ZHUA_QING_HU =0x08000000;  // 抓请胡
	
	
	 public static final int WIK_AN_GANG = 0x1000; // 暗杠动画-下雨
     public static final int WIK_JIE_GANG = 0x2000; // 接杠动画-刮风
     public static final int WIK_ADD_GANG = 0x4000; // 回放杠动画-刮风
     
     
     
     public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
     public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
     public static final int HU_CARD_TYPE_GANG_KAI = 3; // 杠开
     public static final int HU_CARD_TYPE_QIANG_GANG = 4; // 抢杠
     public static final int HU_CARD_TYPE_GANG_PAO = 5; // 杠炮
     public static final int HU_CARD_TYPE_DIAN_GANG_GANG_KAI = 6; // 点杠杠开

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
