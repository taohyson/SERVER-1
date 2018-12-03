package com.cai.common.constant.game.mj;


import com.cai.common.constant.GameConstants;

public class GameConstants_LUHE extends GameConstants {

	public static final int GAME_RULE_PLAYER_4 = 1; // 四人场
	public static final int GAME_RULE_PLAYER_3 = 2; // 三人场
	public static final int GAME_RULE_PLAYER_2 = 3; // 二人场
	public static final int GAME_RULE_PENG_CHI = 4; // 可碰可吃
	public static final int GAME_RULE_NON_PENG_CHI = 5; // 可碰不可吃
	public static final int GAME_RULE_MA_2 = 6; // 2马
	public static final int GAME_RULE_MA_4 = 7; // 4马
	public static final int GAME_RULE_MA_6 = 8; // 6马
	public static final int GAME_RULE_MA_8 = 9; // 8马
	public static final int GAME_RULE_MA_FEN_5 = 10; // 马分-5
	public static final int GAME_RULE_MA_FEN_10 = 11; // 马分-10
	public static final int GAME_RULE_MA_FEN_20 = 12; // 马分-20
	public static final int GAME_RULE_DUO_PAO = 13; // 一炮多响
	public static final int GAME_RULE_OLNY_ZI_MO = 14; // 只自摸
	public static final int GAME_RULE_PAO_HU_JIANG_MA = 15; // 炮胡奖马
	public static final int GAME_RULE_ER_BEI_JIE_PAO = 16; //二倍玩法
	public static final int GAME_RULE_ER_BEI_QI_ZI_MO = 17; //二倍起  仅自摸

	public static final int HU_CARD_TYPE_ZI_MO = 0x00000001; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 0x00000002; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 0x00000004; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI_HUA = 0x00000008; // 杠开
	
	public static final int SHI_SAN_YAO_NUMBER  = 13;
	
	
	public enum LuHeHuTypeEnum {
		 JI_HU (1,1,"鸡胡"),
		 HUN_YI_SE (2,2,"混一色"),
		 DUI_DUI_HU (3,3,"对对胡"),
		 QIXIAODUI (4,4,"七小对"),
		 HUN_SE_DUI_DUI_HU (5,5,"混色对对胡"),
		 HUN_SE_QI_XIAO_DUI (6,6,"混色七小对"),
		 QING_YI_SE (7,7,"清一色"),
		 HAO_HUA_QIXIAODUI_MENQING (8,8,"豪华七小对 门清"),
		 YAO_JIU (9,9,"幺九"),
		 QING_YI_SE_DUI_DUI_HU (10,9,"清一色对对胡"),
		 QING_YI_SE_QI_XIAO_DUI (11,10,"清一色七小对"), 
		 HUN_SE_YAO_JIU (12,11,"混色幺九"),
		 HAO_HUA_QING_YI_SE_QI_XIAO_DUI (13,12,"豪华清一色七小对"),
		 SHI_BA_LUO_HAN (14,13,"十八罗汉"),
		 CHUN_YAO_JIU (15,13,"纯幺九"),
		 YI_SE_ZI (16,13,"一色字"),
		 KUANG_KUANG_HU (17,13,"款款胡"),
		 SHUANG_HAO_HUA_QIXIAODUI_MENQING (18,13,"双豪华七小对 门清"),
		 SHI_SAN_YAO (19,13,"十三幺"),
		 YAO_JIU_QIXIAODUI (20,13,"幺九七小对")
		
		;
		private int huType;   // 类型数字
		private int multiple; // 倍数
		private String huDesc; // 胡牌描述
		
		
		/**
		 * @param huType
		 * @param multiple
		 * @param huDesc
		 */
		private LuHeHuTypeEnum(int huType, int multiple, String huDesc) {
			this.huType = huType;
			this.multiple = multiple;
			this.huDesc = huDesc;
		}
		/**
		 * @return the huType
		 */
		public int getHuType() {
			return huType;
		}
		/**
		 * @param huType the huType to set
		 */
		public void setHuType(int huType) {
			this.huType = huType;
		}
		/**
		 * @return the multiple
		 */
		public int getMultiple() {
			return multiple;
		}
		/**
		 * @param multiple the multiple to set
		 */
		public void setMultiple(int multiple) {
			this.multiple = multiple;
		}
		/**
		 * @return the huDesc
		 */
		public String getHuDesc() {
			return huDesc;
		}
		/**
		 * @param huDesc the huDesc to set
		 */
		public void setHuDesc(String huDesc) {
			this.huDesc = huDesc;
		}
		
	
		
	}
	
	

	public static final int CHR_GNAG_KAI = 0x00008000; // 杠开

	// 花牌
	public static final int CARD_DATA_HUA[] = new int[] { 0x38, // 春
			0x39, // 夏
			0x41, // 秋
			0x42, // 冬
			0x43, // 梅
			0x44, // 兰
			0x45, // 竹
			0x46, // 菊
	};

	// 全部的麻将数据
	public static final int CARD_DATA_MAX[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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

			0x39, // 夏
			0x41, // 秋
			0x42, // 冬
			0x43, // 梅
			0x44, // 兰
			0x45, // 竹
			0x46, // 菊
	};
}
