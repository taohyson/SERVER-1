package com.cai.common.constant.game.mj;



public class Constants_MJ_ZHANG_PU{

	public static final int GAME_RULE_ZHANG_PU_33_ZHI = 1; // 漳浦33制
	public static final int GAME_RULE_FO_TAN_88_ZHI = 2; // 佛坛88制
	public static final int GAME_RULE_YING_HU = 3; // 硬胡
	public static final int GAME_RULE_TAN_PAI = 4; // 探牌
	public static final int GAME_RULE_ZHANG_TAI_ZHI = 5; // 涨台制
	public static final int GAME_RULE_SAUN_TAI_ZHI = 6; // 算台制
	public static final int GAME_RULE_10_ZHANG_5 = 7; // 10涨5
	public static final int GAME_RULE_20_ZHANG_10 = 8; // 20涨10
	public static final int GAME_RULE_30_ZHANG_20 = 9; // 30涨20
	public static final int GAME_RULE_50_ZHANG_20 = 10; // 50涨20
	public static final int GAME_RULE_100_ZHANG_50 = 11; // 100涨50
	public static final int GAME_RULE_5_SUAN_1 = 12; // 5-1
	public static final int GAME_RULE_10_SUAN_2 = 13; // 10-2
	public static final int GAME_RULE_20_SUAN_4 = 14; // 20-4
	public static final int GAME_RULE_50_SUAN_10 = 15; // 50-10
	public static final int GAME_RULE_100_SUAN_20 = 16; // 100-20
	public static final int GAME_RULE_ZHUA_HUA = 17; // 抓花
	public static final int GAME_RULE_CHA_HUA = 18; // 插花
	public static final int GAME_RULE_EXIST_ZHUA_HUA = 19; // 存在抓花
	public static final int GAME_RULE_EXIST_CHA_HUA = 20; // 存在插花
	
	public static final int ACTION_OUT_FLOWER_CARD = 0x10002; // 出花牌的动画值


	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_QIANG_GANG = 2; // 抢杠胡
	public static final int HU_CARD_TYPE_DIAN_PAO = 3; // 点炮胡
	public static final int HU_CARD_TYPE_BU_HUA = 4; // 补花
	
	
	public static final int MAX_HAND_CARD_COUNT = 17; // 最大手牌
	public static final int MAX_WEAVE = 5; // 最大组合 = 17
	
	public static final int CHR_ZI_MO = 				0x00000001; // 自摸
	public static final int CHR_DIAN_PAO_HU = 			0x00000002; // 点炮胡
	public static final int CHR_QIANG_GANG = 			0x00000004; // 抢杠胡
	public static final int CHR_BU_HU_ZI_MO = 			0x00000008; // 补花自摸
	public static final int CHR_FANG_PAO = 				0x00000010; // 放炮
	public static final int CHR_BEI_QIANG_GANG = 		0x00000020; // 被抢杠
	public static final int CHR_TIAN_HU = 				0x00000040; // 天胡
	public static final int CHR_MEN_QIAN_QING = 		0x00000080; // 门前清
	public static final int CHR_WU_HUA_WU_ZI = 			0x00000100; // 无花无字
	public static final int CHR_HUN_YI_SE = 			0x00000200; // 混一色
	public static final int CHR_HAI_DI_LAO_YUE = 		0x00000400; // 海底捞月
	public static final int CHR_QUAN_QIU_REN = 			0x00000800; // 全求人
	public static final int CHR_HUA_YI_SE = 			0x00001000; // 花一色
	public static final int CHR_XIAO_SAN_YUAN = 		0x00002000; // 小三元
	public static final int CHR_BAI_LIU = 				0x00004000; // 百六
	public static final int CHR_AN_BAI_LIU = 			0x00008000; // 暗百六
	public static final int CHR_DA_SAN_YUAN = 			0x00010000; // 大三元
	public static final int CHR_QING_YI_SE = 			0x00020000; // 清一色
	public static final int CHR_XIAO_SI_XI = 			0x00040000; // 小四喜
	public static final int CHR_DA_SI_XI = 				0x00080000; // 大四喜
	public static final int CHR_BA_HUA_HU = 			0x00100000; // 八花胡
	public static final int CHR_TIAN_TING = 			0x00200000; // 天听
	public static final int CHR_PING_HU = 				0x00400000; // 平胡
	public static final int CHR_THREE_AN_KE = 			0x00800000; // 三暗刻
	public static final int CHR_FOUR_AN_KE = 			0x01000000; // 四暗刻
	public static final int CHR_FIVE_AN_KE = 			0x02000000; // 五暗刻
	public static final int CHR_DUI_DUI_PENG = 			0x04000000; // 对对碰
	
	public enum CRHTYPE{
		CHR_ZI_MO(0x00000001, "自摸"),
		;
		private int chr;
		private String des;
		
		private  CRHTYPE(int chr, String des){
			this.chr = chr;
			this.des = des;
		}
		
		public static String getDes(int chr){
			for (CRHTYPE ct : values()) {
				if(ct.chr == chr)
					return " " + ct.des;
			}
			return " ";
		}
	}
	
	public static void main(String[] args) {
		String des = CRHTYPE.getDes(CRHTYPE.CHR_ZI_MO.chr);
		System.out.println(des);
	}
	
	// 全部的麻将数据
	public static final int CARD_DATA_MAX[] = new int[] { 
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