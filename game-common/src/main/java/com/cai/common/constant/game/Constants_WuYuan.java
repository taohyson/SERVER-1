package com.cai.common.constant.game;

/**
 * 婺源麻将
 * @author admin
 *
 */
public interface Constants_WuYuan {

	int GAME_RULE_SI_REN = 1;// 4人
	int GAME_RULE_SAN_REN = 2;// 3人
	int GAME_RULE_ER_REN = 3;// 2人
	int GAME_RULE_BAO_PAI_LIU_JU = 4;// 翻到宝牌流局
	int GAME_RULE_MO_WAN_LIU_JU = 5;// 摸完所有牌流局

	int CHR_ZI_MO = 0x00000001; // 自摸
	int CHR_JIE_PAO = 0x00000002; // 接炮
	int CHR_FANG_PAO = 0x00000004; // 放炮
	int CHR_PI_HU = 0x00000008; // 屁和
	int CHR_JIU_YAO= 0x00000020;//九幺
	int CHR_SHI_YAN_LAN = 0x00000040; // 十三烂
	int CHR_PENG_PENG_HU = 0x00000080; // 碰碰胡
	int CHR_QI_DUI = 0x00000100; // 七对
	int CHR_QING_YI_SE = 0x00000200; // 清一色
	int CHR_QI_XING_JIU_YAO = 0x00000400; // 七星九幺
	int CHR_QI_XING_SHI_SAN_LAN = 0x00000800;// 七星十三烂
	int CHR_QING_YI_SE_PENG_PENG_HU = 0x00001000;// 清一色碰碰胡
	int CHR_QING_QI_SE_QI_DUI = 0x00002000;// 清一色七对
	int CHR_HAO_HUA_QI_XIAO_DUI = 0x00004000;// 豪华七小对
	int CHR_BAO_DIAO = 0x00008000;// 宝吊
	int CHR_WU_BAO = 0x00010000;// 无宝
	int CHR_FEI_BAO = 0x00020000;// 飞宝
	int CHR_GANG_SHANG_KAI_HUA = 0x00040000; // 杠开花
	int CHR_QIANG_GANG = 0x00080000; // 抢杠
	int CHR_SI_BAO = 0x00100000; // 四宝
	int CHR_TIAN_HU = 0x00200000; //天胡
	int CHR_DI_HU = 0x00400000; //地胡
//	int CHR_BEI_QIANG_GANG = 0x00800000; //被抢杠


	int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	int HU_CARD_TYPE_GANG_KAI = 4; // 杠开花
	int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮
	
}
