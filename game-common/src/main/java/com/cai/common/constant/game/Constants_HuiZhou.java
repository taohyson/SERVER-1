package com.cai.common.constant.game;

/**
 * 
 * 
 * 广东惠州庄
 * 
 * @author shiguoqiong date: 2018年3月20日 下午5:45:12 <br/>
 */
public interface Constants_HuiZhou {

	int GAME_RULE_KE_QIANG_GANG_HU = 1;// 可抢杠胡
	int GAME_RULE_QIANG_GANG_QUAN_BAO = 2;// 抢杠全包
	int GAME_RULE_GANG_BAO_QUAN_BAO = 3;// 杠爆全包
	int GAME_RULE_JI_HU_KE_HU = 4;// 鸡胡可胡
	int GAME_RULE_KE_JIE_PAO_HU = 5;// 可接炮胡
	int GAME_RULE_KE_HU_QI_DUI = 6;// 可胡7对
	int GAME_RULE_BAO_JIU_QUAN_BAO = 7;// 报九全包（12张落地）
	int GAME_RULE_HUA_PAI = 8;// 花牌
	int GAME_RULE_WU_HUA_JIA_BEI = 9;// (无花加倍)
	int GAME_RULE_MAI_MA = 10;// 买马
	int GAME_RULE_MA_GEN_DI_FEN = 11;// 马跟底分
	int GAME_RULE_MA_GEN_GANG = 12;// 马跟杠
	int GAME_RULE_ER_HUA = 13;// 2花
	int GAME_RULE_SI_HUA = 14;// 4花
	int GAME_RULE_LIU_HUA = 15;// 6花
	int GAME_RULE_BA_HUA = 16;// 8花
	int GAME_RULE_MAI_2_MA = 17;// 买2马
	int GAME_RULE_MAI_4_MA = 18;// 买4马
	int GAME_RULE_MAI_6_MA = 19;// 买6马

	int CHR_ZI_MO = 0x00000001; // 自摸
	int CHR_JIE_PAO = 0x00000002; // 接炮
	int CHR_FANG_PAO = 0x00000004; // 放炮
	int CHR_PI_HU = 0x00000008; // 屁和
	int CHR_DUI_DUI_HU = 0x00000020;//对对胡
	int CHR_HUN_YI_SE = 0x00000040; // 混一色
	int CHR_QING_YI_SE = 0x00000080; // 清一色
	int CHR_HUN_DUI_DUI = 0x00000100; // 浑对对
	int CHR_QING_DUI_DUI = 0x00000200; // 清对对
	int CHR_QUAN_FENG = 0x00000400; // 大字(全风牌，字一色全是风牌，全风)
	int CHR_QI_DUI = 0x00000800;// 七对
	int CHR_YAO_JIU = 0x00001000;// 幺九
	int CHR_QING_QI_DUI = 0x00002000;// 清七对
	int CHR_SHI_SAN_YAO = 0x00004000;// 十三幺
	int CHR_QUAN_YAO_JIU = 0x00008000;// 全幺九
	int CHR_HUA_DAN_DIAO = 0x00010000;// 花单吊
	int CHR_HUA_DIAO_HUA = 0x00020000;// 花吊花
//	int CHR_HAI_DI = 0x00040000; // 海底(只能自摸)
	int CHR_GANG_SHANG_KAI_HUA = 0x00040000; // 杠开花
	int CHR_QIANG_GANG = 0x00080000; // 抢杠
	int CHR_WU_GUI = 0x00100000; // 无鬼
	int CHR_DAN_DIAO = 0x00200000; //单吊
	int CHR_BEI_ZI_MO = 0x00400000; //被自摸
	int CHR_BEI_QIANG_GANG = 0x00800000; //被抢杠

	int CHUN_MAGIC_CARD = 0x38; // 春赖子
	int XIA_MAGIC_CARD = 0x39; // 夏赖子
	int QIU_MAGIC_CARD = 0x41; // 秋赖子
	int DONG_MAGIC_CARD = 0x42; // 冬赖子
	int MEI_MAGIC_CARD = 0x43; // 梅赖子
	int LAN_MAGIC_CARD = 0x44; // 兰赖子
	int ZHU_MAGIC_CARD = 0x45; // 竹赖子
	int JU_MAGIC_CARD = 0x46; // 菊赖子

	int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	int HU_CARD_TYPE_GANG_KAI = 4; // 杠开花
	int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮
	
	
	int MAX_MAGIC_CARD = 8;

	int CARD_DATA_HUI_ZHOU[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
			0x32, 0x32, 0x32, 0x32, // 南风
			0x33, 0x33, 0x33, 0x33, // 西风
			0x34, 0x34, 0x34, 0x34, // 北风
			0x35, 0x35, 0x35, 0x35, // 红中
			0x36, 0x36, 0x36, 0x36, // 绿发
			0x37, 0x37, 0x37, 0x37, // 白板

	};
}
