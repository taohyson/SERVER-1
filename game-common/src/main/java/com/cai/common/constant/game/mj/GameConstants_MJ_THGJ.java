package com.cai.common.constant.game.mj;

import com.cai.common.constant.GameConstants;

/**
 * 泰和滚精
 * 
 *
 * @author WalkerGeek date: 2018年8月24日 上午10:19:34 <br/>
 */
public class GameConstants_MJ_THGJ extends GameConstants {
	// 单选
	public static final int GAME_RULE_MJ_FEN_DING133 = 1; // 133
	public static final int GAME_RULE_MJ_FEN_DING200 = 2; // 200
	public static final int GAME_RULE_MJ_FEN_DING300 = 3; // 300
	public static final int GAME_RULE_MJ_BU_FEN_DING = 4; // 不封顶
	public static final int GAME_RULE_MJ_GUNJING = 5; // 滚精
	public static final int GAME_RULE_MJ_CHAOZHUANG = 6; // 抄庄
	public static final int GAME_RULE_MJ_BU_CHAOZHUANG = 7; // 不抄庄
	public static final int GAME_RULE_MJ_YOU_GANG_JING = 8; // 有杠精
	public static final int GAME_RULE_MJ_WU_GANG_JING = 9; // 无杠精
	public static final int GAME_RULE_MJ_BU_KE_CHI_PENG = 10; // 不可吃碰
	public static final int GAME_RULE_MJ_NOT_JING_CHI_PENG = 12; //可不带精吃不能碰
	public static final int GAME_RULE_MJ_ZHENG1_FU2= 13; // 一正精或两个副精
	public static final int GAME_RULE_MJ_YI_GE_JING = 11; // 一个精
	public static final int GAME_RULE_MJ_BU_CHENG_PIAO_BEI = 14; // +5不乘飘分倍数
	public static final int GAME_RULE_MJ_CHENG_PIAO_BEI = 15; // +5乘飘分倍数 
	
	

	public static final int HUSCORE = 0; // 胡分
	public static final int GANGSCORE = 1; // 杠分
	public static final int SHANGJING = 2; // 上精
	public static final int HUITOU = 3; // 回头
	public static final int XIAJING = 4; // 下精
	public static final int XIAZOUYOU = 5; // 下左右
	public static final int CHANGGE = 6; // 唱歌
	public static final int MAILEI = 7; // 埋雷
	public static final int FADIAN = 8; // 发电
	public static final int SHAIYUELIANG = 9; // 晒月亮

	public static final int ZHAOJINGZI = 10; // 照镜子
	public static final int CHAOZHUANG = 11; // 抄庄
	public static final int PALOU = 12; // 爬楼
	public static final int PIAOJING = 13; // 飘精
	public static final int FAFENG = 14; // 罚分

	// 霸王精玩法类型
	public static final int BA_WANG_JING_TYPE_JIA10 = 1; // 霸王精加10类型
	public static final int BA_WANG_JING_TYPE_FANGBEI = 2; // 霸王精翻倍类型

	// 复选
	public static final int BEGIN_FOUR = 82; // 剩余82张牌时候游戏正式开始
	public static final int BEGIN_THREE = 82 + 13; // 3人场 剩余82+13张牌时候游戏正式开始
	public static final int BEGIN_TWO = 82 + 26; // 2人场 剩余82+26张牌时候游戏正式开始
	public static final int END = 34; // 剩余34张牌时结束
	public static final int DE_GUO_EXTRA_SCORE = 5; // 德国牌型额外加分
	public static final int CHAO_ZHUANG_SCORE = 2; // 抄庄分

	public static final int JING = 0x100; // 上精牌
	public static final int NORMAL = 0x000; // 正常牌

	// 协议
	public static final int RESPONSE_GAME_END = 15; // 结算
	public static final int RESPONSE_ACTION_ANIMATION = 1014; // 动画显示
	public static final int RESPONSE_ACTION_TIP = 1015; // 提示信息
	public static final int RESPONSE_JING_DATA = 1016; // 每个玩家的精牌消息
	public static final int RESPONSE_TIME  = 1017; // 托管时间
	public static final int RESPONSE_LEFT_TIME = 1018; //剩余托管时间

	public static final int CHR_ZI_MO = 0x0001; // 自摸
	public static final int CHR_JIE_PAO = 0x0002; // 接炮
	public static final int CHR_TIAN_HU = 0x0004; // 天胡
	public static final int CHR_DI_HU = 0x0008; // 地胡
	public static final int CHR_FANG_PAO = 0x0010; // 放炮
	public static final int CHR_QIANG_GANG_HU = 0x0020; // 抢杠胡
	public static final int CHR_PENG_HU = 0x0040; // 大七对 也就是碰胡
	public static final int CHR_GANG_SHANG_HUA = 0x0080; // 杠上开花
	public static final int CHR_XIAO_QI_DUI = 0x0200; // 七小对
	public static final int CHR_SHI_SAN_LAN = 0x0400; // 十三烂
	public static final int CHR_QI_XING_SHI_SAN_LAN = 0x0800; // 七星十三烂
	public static final int CHR_DE_GUO = 0x1000; // 德国
	public static final int CHR_JING_DIAO = 0x2000; // 精吊
	public static final int CHR_PING_HU = 0x4000; // 平胡
	public static final int CHR_BA_HU = 0x8000; // 霸胡

	public static final int HU_CARD_TYPE_ZI_MO = 1; // 自摸
	public static final int HU_CARD_TYPE_JIE_PAO = 2; // 接炮
	public static final int HU_CARD_TYPE_QIANG_GANG = 3; // 抢杠
	public static final int HU_CARD_TYPE_GANG_KAI = 4; // 杠开
	public static final int HU_CARD_TYPE_GANG_PAO = 5; // 杠上炮

	public static final int FAN_GANG_KAI = 2; // 杠开
	public static final int FAN_ZI_MO = 2; // 自摸
	public static final int FAN_DIAN_PAO = 2; // 点炮
	public static final int FAN_QIANG_GANG = 2; // 抢杠
	public static final int FAN_DE_GUO = 2; // 德国
	public static final int FAN_JING_DIAO = 2; // 精钓
	public static final int FAN_TIAN_HU = 20; // 天胡地胡8翻
	public static final int FAN_DA_QI_DUI = 4; // 大七对
	public static final int FAN_XIAO_QI_DUI = 2; // 小七对
	public static final int FAN_SHI_SAN_LAN = 2; // 十三烂
	public static final int FAN_QI_XING_SHI_SAN_LAN = 4; // 七星十三烂
	public static final int FAN_PING_HU = 1; // 平胡
	public static final int FAN_BASE = 4; // 基础倍数
	public static final int FAN_BA_HU = 2; // 霸胡

	public static final int ACTION_SHANG_XIA_FANG = 1; // 上下翻
	public static final int ACTION_ZHAO_JING_ZI = 2; // 照镜子
	public static final int ACTION_MAI_DI_LEI = 3; // 埋地雷
	public static final int ACTION_TONG_YI_SHOU_GE = 4; // 同一首歌
	public static final int ACTION_SHAI_YUE_LIANG = 5; // 晒月亮
	public static final int ACTION_FA_DIAN = 6; // 发电
	public static final int ACTION_SHANG_JING = 7; // 上精
	public static final int ACTION_XIA_JING = 8; // 下精
	public static final int ACTION_ZUO_JING = 9; // 左精
	public static final int ACTION_YOU_JING = 11; // 右精
	public static final int ACTION_ZZ_JING = 10; // 左左精
	public static final int ACTION_YY_JING = 12; // 右右精
	public static final int ACTION_FAN_JING = 13; // 翻精动画
	public static final int ACTION_TING_PAI = 14; // 停牌
	public static final int ACTION_HUI_TOU_XIAO = 15;// 回头笑

	public static final int GS_MJ_SUI_JING = GAME_STATUS_PLAY + 18; // 游戏状态-->随精
	public static final int GS_MJ_FA_DIAN = GAME_STATUS_PLAY + 19; // 游戏状态-->发电
	public static final int GS_MJ_TING_PAI = GAME_STATUS_PLAY + 20; // 游戏状态-->停牌

	public static final int EFFECT_ACTION_XUAN_JING = 1000; // 选精操作

	public static final int DISPLAYER_TYPE_SUI = 200; // 随精状态
	// 默认麻将 基本牌都有
	public static final int DEFAULT[] = new int[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, // 万子
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
