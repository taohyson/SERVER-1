package com.cai.common.constant;

public class HPGameConstans {

	public static final int MAX_WEAVE = 4; // 最大组合
	public static final int MAX_INDEX = 22; // 最大索引
	public static final int MAX_COUNT = 42;// 最大数目
	public static final int MAX_REPERTORY = 110; // 最大库存

	//////////////////////////////////////////////////////////////////////////
	// 逻辑掩码

	public static final int LOGIC_MASK_COLOR = 0xF0; // 花色掩码
	public static final int LOGIC_MASK_VALUE = 0x0F;// 数值掩码

	//////////////////////////////////////////////////////////////////////////
	// 动作定义

	//////////////////////////////////// babala////////////////////////////
	// 动作标志
	public static final int WIK_NULL = 0x00; // 没有类型
	public static final int WIK_DUI = 0x01;// 对牌类型
	public static final int WIK_SAN_ZHAO = 0x02;// 三招一类型
	public static final int WIK_SI_ZHAO = 0x04; // 四招一类型
	public static final int WIK_TONG_GIVE_UP = 0x08; // 第一轮的情况下，点击弃按钮向服务器发送的操作码

	public static final int WIK_SI_TONG = 0x10;// 四统类型
	public static final int WIK_WU_TONG = 0x20; // 五统类型
	public static final int WIK_QI_TA = 0x40;// 三个连一起的类型
	public static final int WIK_CHI_HU = 0x80;// 胡牌类型

	//////////////////////////////////////////////////////////////////////////

	// 动作标志
	public static final int WIK_LEFT = 0x21;// 左吃类型
	public static final int WIK_CENTER = 0x22; // 中吃类型
	public static final int WIK_RIGHT = 0x24; // 右吃类型
	public static final int WIK_PENG = 0x28; // 碰牌类型
	public static final int WIK_FILL = 0x23;// 补牌类型
	public static final int WIK_GANG = 0x34; // 杠牌类型
	// public static final int WIK_CHI_HU 0x40 //吃胡类型
	//////////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////////
	// 胡牌定义

	// 小胡牌型
	public static final int CHK_NULL = 0x00000;// 非胡类型
	public static final int CHK_PING_HU = 0x00001; // 平胡类型

	// 半大胡
	public static final int CHK_QUAN_QIU_REN = 0x00010; // 全求人胡牌，
	public static final int CHK_MEN_QIAN_QING = 0x00020;// 门前清
	public static final int CHK_JUE_ZHANG = 0x00040;// 绝张

	// 不需将的胡牌类型
	public static final int CHK_PENG_PENG = 0x01000;// 碰碰胡牌
	public static final int CHK_QING_YI_SE = 0x02000;// 清色类型，包括了万一色，条一色，筒一色，
	public static final int CHK_FENG_YI_SE = 0x04000; // 风一色，乱将
	public static final int CHK_JIANG_JIANG = 0x08000;// 将将胡牌，即将一色
	public static final int CHK_QI_DUI = 0x00100;// 七对
	public static final int CHK_HAO_HUA_QI_DUI = 0x00200;// 豪华七对

	// 需将的胡牌类型
	public static final int CHK_QIANG_GANG = 0x10000; // 抢杠
	public static final int CHK_HAI_DI = 0x20000;// 海底捞月
	public static final int CHK_GANG_SHANG_KAI_HUA = 0x40000;// 杠上开花

	// 乱将权位
	public static final int CHR_QING_YI_SE = 0x0100;// 清色权位，包括了万一色，条一色，筒一色，将一色
	public static final int CHR_QUAN_QIU_REN = 0x0200;// 全求权位
	public static final int CHR_MEN_QIAN_QIN = 0x0400;// 门前清权位
	public static final int CHR_JUE_ZHANG = 0x0800;// 绝张权位

	public static final int CHR_QIANG_GANG = 0x1000;// 抢杆权位
	public static final int CHR_HAI_DI = 0x2000; // 海底权位
	public static final int CHR_GANG_SHANG_KAI_HUA = 0x4000;// 杠上开花权位

	public static final int HUA_PAI_CARD_DATA[] = new int[] {

			0x01, 0x01, 0x01, 0x11, 0x11, // 一
			0x02, 0x02, 0x02, 0x02, 0x02, // 二
			0x03, 0x03, 0x03, 0x13, 0x13, // 三
			0x04, 0x04, 0x04, 0x04, 0x04, // 四
			0x05, 0x05, 0x05, 0x15, 0x15, // 五
			0x06, 0x06, 0x06, 0x06, 0x06, // 六
			0x07, 0x07, 0x07, 0x17, 0x17, // 七
			0x08, 0x08, 0x08, 0x08, 0x08, // 八
			0x09, 0x09, 0x09, 0x19, 0x19, // 九
			0x0A, 0x0A, 0x0A, 0x0A, 0x0A, // 十

			0x21, 0x21, 0x21, 0x21, 0x21, // 孔
			0x22, 0x22, 0x22, 0x22, 0x22, // 己

			0x23, 0x23, 0x23, 0x23, 0x23, // 上
			0x24, 0x24, 0x24, 0x24, 0x24, // 大
			0x25, 0x25, 0x25, 0x25, 0x25, // 人

			0x26, 0x26, 0x26, 0x26, 0x26, // 土
			0x27, 0x27, 0x27, 0x27, 0x27, // 化
			0x28, 0x28, 0x28, 0x28, 0x28, // 千

			0x29, 0x29, 0x29, 0x29, 0x29, // 可
			0x2A, 0x2A, 0x2A, 0x2A, 0x2A, // 知
			0x2B, 0x2B, 0x2B, 0x2B, 0x2B, // 礼

			0x2C, 0x2C, 0x2C, 0x2C, 0x2C, // 子
	};

}
