package com.cai.common.constant.game.mj;


public class Constants_MJ_JXTDH {
    //模式
	public static final int GAME_RULE_BU_DAI_FENG = 1; // 不带风
	public static final int GAME_RULE_BU_DAI_WAN = 2; // 不带万
	public static final int GAME_RULE_DAI_FENG_DAI_WAN = 3; // 带风带万
	public static final int GAME_RULE_BU_DAI_TONG_TIAO = 4; // 不带条筒
	//可选
	public static final int GAME_RULE_GEN_ZHUANG = 5;// 跟庄
	public static final int GAME_RULE_KE_CHI_PAI = 6;// 可吃牌
	public static final int GAME_RULE_KE_PAO_HU = 7; // 可炮胡
	public static final int GAME_RULE_MAI_MA = 8; // 买马
	public static final int GAME_RULE_GUI_PAI = 9; // 鬼牌
	public static final int GAME_RULE_GANG_BAO_QUAN_BAO = 10; // 杠爆(明杠)全包
	public static final int GAME_RULE_KE_QIANG_GANG_HU = 11; // 可抢杠胡
	public static final int GAME_RULE_GANG_GANG_QUAN_BAO = 12; // 抢杠全包
	//买马
	public static final int GAME_RULE_FANG_WEI_MA = 13; // 方位马
	public static final int GAME_RULE_DING_ZHUANG_MA = 14; // 定庄马
	public static final int GAME_RULE_MAI_MA_2 = 15; // 买2马
	public static final int GAME_RULE_MAI_MA_4 = 16; // 买4马
	public static final int GAME_RULE_MAI_MA_6 = 17; // 买6马
	public static final int GAME_RULE_MAI_MA_8 = 18; // 买8马
	public static final int GAME_RULE_YI_MA_QUAN_ZHONG = 19; // 一马全中
	public static final int GAME_RULE_MA_SCORE_1 = 20; // 马1分
	public static final int GAME_RULE_MA_SCORE_2 = 21; // 马2分
	public static final int GAME_RULE_MA_GENG_DI_SCORE = 22; // 马跟胡牌分
	//鬼牌
	public static final int GAME_RULE_HONG_ZHONG_MAGIC = 23; // 红中鬼
	public static final int GAME_RULE_BAI_BAN_MAGIC = 24; // 白板鬼
	public static final int GAME_RULE_ZHONG_FA_MAGIC = 25; // 中发鬼
	public static final int GAME_RULE_HUA_MAGIC = 26; // 花鬼
	public static final int GAME_RULE_FAN_MAGIC = 27; // 翻鬼
	public static final int GAME_RULE_FAN_DOUBLE_MAGIC = 28; // 翻双鬼
	public static final int GAME_RULE_HONG_ZHONG_4 = 29; // 4红中
	public static final int GAME_RULE_HONG_ZHONG_8 = 30; // 8红中
	public static final int GAME_RULE_BAI_BAN_4 = 31; // 4白板
	public static final int GAME_RULE_BAI_BAN_8 = 32; // 8白板
	public static final int GAME_RULE_HUA_4 = 33; // 4花鬼
	public static final int GAME_RULE_HUA_8 = 34; // 8花鬼
	//可胡牌型
	public static final int GAME_RULE_QI_DUI = 35; // 七对
	public static final int GAME_RULE_SHI_SAN_YAO = 36; // 十三幺
	public static final int GAME_RULE_SHI_SAN_LAN = 37; // 十三烂
	public static final int GAME_RULE_SI_GUI_HU = 38; // 四鬼胡
	//加倍
	public static final int GAME_RULE_PENG_PENG_HU_2 = 39; // 碰碰胡加倍
	public static final int GAME_RULE_HAI_DI_HU_2 = 40; // 海底胡加倍
	public static final int GAME_RULE_QING_YI_SE_2 = 41; // 清一色加倍
	public static final int GAME_RULE_QING_YI_SE_4 = 42; // 清一色四倍
	public static final int GAME_RULE_QI_DUI_2 = 43; // 七对加倍
	public static final int GAME_RULE_SHI_SAN_LAN_2 = 44; // 十三烂加倍
	public static final int GAME_RULE_SHI_SAN_YAO_2 = 45; // 十三幺加倍
	public static final int GAME_RULE_WU_GUI_2 = 46; // 无鬼加倍
	public static final int GAME_RULE_SI_GUI_HU_2 = 47; // 四鬼加倍
	//特殊
	public static final int GAME_RULE_JIE_JIE_GAO = 48; // 节节高
	public static final int GAME_RULE_MA_GEN_GANG = 49; // 马跟杠
	public static final int GAME_RULE_SI_GUI_QUAN_MA = 50; // 四鬼全马
	
    
    public static final int HU_CARD_TYPE_ZI_MO = 8; // 自摸
    public static final int HU_CARD_TYPE_DIAN_PAO = 9; // 点炮胡
    public static final int HU_CARD_TYPE_QIANG_GANG_HU = 10; // 抢杠胡
    public static final int HU_CARD_TYPE_GANG_SHANG_HUA = 11; // 杠爆（杠上花）
    public static final int HU_CARD_TYPE_HAI_DI = 12; // 海底胡加倍
    
    public static final int CHR_ZI_MO 				= 0x00000001; // 自摸
    public static final int CHR_DIAN_PAO 			= 0x00000002; // 点炮
    public static final int CHR_QIANG_GANG 			= 0x00000004; // 抢杠
    public static final int CHR_HAI_DI_HU_2			= 0x00000008; // 海底胡加倍
    public static final int CHR_GANG_BAO 			= 0x00000010; // 杠爆（杠上花）
    public static final int CHR_HUA_DAN_DIAO 		= 0x00000020; // 花单钓
    public static final int CHR_WU_GUI_2 			= 0x00000040; // 无鬼加倍
    public static final int CHR_QING_YI_SE_2 		= 0x00000080; // 清一色加倍
    public static final int CHR_QING_YI_SE_4 		= 0x00000100; // 清一色四倍
    
    public static final int CHR_SI_GUI_HU 			= 0x00000200; // 四鬼胡
    public static final int CHR_SI_GUI_HU_2 		= 0x00000400; // 四鬼加倍
    public static final int CHR_PENG_PENG_HU 		= 0x00000800; // 碰碰胡（不加倍）
    public static final int CHR_PENG_PENG_HU_2		= 0x00001000; // 碰碰胡加倍
    public static final int CHR_QI_DUI 				= 0x00002000; // 七对（不加倍）
    public static final int CHR_QI_DUI_2 			= 0x00004000; // 七对加倍
    public static final int CHR_SHI_SAN_LAN 		= 0x00008000; // 十三烂（不加倍）
    public static final int CHR_SHI_SAN_LAN_2 		= 0x00010000; // 十三烂加倍
    public static final int CHR_SHI_SAN_YAO 		= 0x00020000; // 十三幺（不加倍）
    public static final int CHR_SHI_SAN_YAO_2		= 0x00040000; // 十三幺加倍
    public static final int CHR_BEI_QIANG_GANG		= 0x00080000; // 被抢杠
    public static final int CHR_FANG_PAO 			= 0x00100000; // 放炮
    public static final int CHR_JI_PING_HU 			= 0x00200000; // 鸡平胡
    
 	public static final int CARD_DATA_WAN[] = new int[] { 
 		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
		0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
 	};	
 	public static final int CARD_DATA_TIAO[] = new int[] { 
 		0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
		0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
		0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
		0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, // 索子
 	};	
 	public static final int CARD_DATA_TONG[] = new int[] { 
 		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
		0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, // 同子
 	};	
 	public static final int CARD_DATA_ZI[] = new int[] { 
 		0x31, 0x31, 0x31, 0x31, // 东风
		0x32, 0x32, 0x32, 0x32, // 南风
		0x33, 0x33, 0x33, 0x33, // 西风
		0x34, 0x34, 0x34, 0x34, // 北风
 	};	
 	public static final int CARD_DATA_ZHONG[] = new int[] { 
 		0x35, 0x35, 0x35, 0x35, // 红中
 	};	
 	public static final int CARD_DATA_FA[] = new int[] { 
 		0x36, 0x36, 0x36, 0x36, // 绿发
 	};	
 	public static final int CARD_DATA_BAI[] = new int[] { 
 		0x37, 0x37, 0x37, 0x37, // 白板
 	};	
 	public static final int CARD_DATA_HUA_4[] = new int[] { 
 		0x38, // 春
		0x39, // 夏
		0x41, // 秋
		0x42, // 冬
 	};	
 	public static final int CARD_DATA_HUA_8[] = new int[] { 
		0x43, // 梅
		0x44, // 兰
		0x45, // 竹
		0x46, // 菊
 	};	
    
}
