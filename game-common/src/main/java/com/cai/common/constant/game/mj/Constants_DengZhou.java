package com.cai.common.constant.game.mj;

public interface Constants_DengZhou {
	int RULE_ZHUANG_JIA_KE_TUO = 1; // 庄家可坨
	int RULE_PIAN_JIA_KE_DI = 2; // 偏家可抵
	int RULE_ZI_MO_SUAN_QIAN_HOU_PIAO = 3; // 自摸算前后漂
	int RULE_DAI_QIAN_PIAO = 4; // 带前漂
	int RULE_DAI_HOU_PIAO = 5; // 带后漂
	
	int HU_ZI_MO = 1; // 自摸
	int HU_JIE_PAO = 2; // 接炮

	int CHR_ZI_MO = 0x00000001; // 自摸
	int CHR_JIE_PAO = 0x00000002; // 接炮
	int CHR_FANG_PAO = 0x00000004; // 放炮
	
	int WIK_HUI_LONG_GANG = 0x1000; // 回笼杠
	int WIK_DIAO_DUI = 0x2000; // 钓对
}
