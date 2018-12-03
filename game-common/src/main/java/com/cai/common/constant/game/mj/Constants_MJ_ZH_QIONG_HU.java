package com.cai.common.constant.game.mj;


public class Constants_MJ_ZH_QIONG_HU {

	public static final int GAME_RULE_PIAO_HU = 1; // 飘胡
	public static final int GAME_RULE_XJMTF = 2; // 小鸡满天飞
	public static final int GAME_RULE_DPSJF = 3; // 点炮三家付
	public static final int GAME_RULE_ZFBKP = 4; // 中发白可碰
	public static final int GAME_RULE_JIA_HU = 5; // 夹胡
	public static final int GAME_RULE_GSKHJF = 6; // 杠上开花加番
	public static final int GAME_RULE_QGHJF = 7; // 抢杠胡加番
	public static final int GAME_RULE_SCORE_20 = 8; // 20分
	public static final int GAME_RULE_SCORE_40 = 9; // 40分
	public static final int GAME_RULE_SCORE_80 = 10; // 80分
	public static final int GAME_RULE_SCORE_160 = 11; // 160分
	public static final int GAME_RULE_SCORE_320 = 12; //320分
	public static final int GAME_RULE_NO_SEAL_TOP = 13; // 无封顶
	public static final int GAME_RULE_NOW_OUT_BAO = 14; // 立即打宝
	public static final int GAME_RULE_AFTER_OUT_BAO = 15; // 过圈打宝
	
	

	public static final int HU_CARD_TYPE_ZI_MO 	= 1; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	public static final int HU_CARD_TYPE_GKSH = 4; // 杠上开花
	public static final int HU_CARD_TYPE_BAO_TING = 6; // 报听出牌
	public static final int HU_CARD_TYPE_GKSH_BT = 7; // 报听后的杠上摸牌
	
	
	public static final int WIK_GANG_BAO_TING = 0x10001; // 杠牌后的报听不用出牌
	
	
	public static final int CHR_ZI_MO 							= 0x00000001; // 自摸
	public static final int CHR_BEI_QIANG_GANG 					= 0x00000002; // 被抢杠
	public static final int CHR_DIAN_PAO_HU 					= 0x00000004; // 点炮胡
	public static final int CHR_FANG_PAO 						= 0x00000008; // 放炮
	public static final int CHR_QIANG_GANG_HU					= 0x00000010; // 抢杠胡
	public static final int CHR_GANG_SHANG_KAI_HUA 				= 0x00000020; // 杠上开花
	public static final int CHR_JIA_HU 							= 0x00000040; // 夹胡
	public static final int CHR_MO_BAO							= 0x00000080; // 摸宝
	public static final int CHR_CHONG_BAO 						= 0x00000100; // 冲宝
	public static final int CHR_PIAO_HU							= 0x00000200; // 飘胡
	public static final int CHR_PING_HU							= 0x00000400; // 平胡
	
	public static final int ACTION_MEI_HU_DAO 					= 0x00001000; // 没胡到
	public static final int ACTION_DA_BAO 						= 0x00002000; // 打宝（第一个报听）
	public static final int ACTION_KAN_BAO 						= 0x00004000; // 看宝（第2个及后面报听的）
	public static final int ACTION_HUAN_BAO 					= 0x00008000; // 换宝
	
	public static final int CHR_QING_YI_SE 						= 0x00010000; // 清一色
	public static final int CHR_QI_XIAO_DUI 					= 0x00020000; // 七小对
	public static final int CHR_QYS_QI_XIAO_DUI 				= 0x00040000; // 清一色七小对
	
}
