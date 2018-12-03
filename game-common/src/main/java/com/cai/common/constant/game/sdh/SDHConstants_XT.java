package com.cai.common.constant.game.sdh;

/**
 * 三打哈参数定义
 * 
 * @author hexinqi
 *
 */
public class SDHConstants_XT {

	public static final int GAME_RULE_SDH_JINGDIAN = 1; // 经典玩法
	public static final int GAME_RULE_SDH_XIAOGUANG_25 = 2; // 25分小光
	public static final int GAME_RULE_SDH_XIAOGUANG_30 = 3; // 30分小光
	public static final int GAME_RULE_SDH_SHUANGJINDANCHU = 4; // 双进单出
	public static final int GAME_RULE_SDH_BAOFULIUSHOU = 5; // 报副留守
	public static final int GAME_RULE_SDH_MAX_DI = 6; // 60分起叫
	public static final int GAME_RULE_SDH_YI_DANG_REN_SHU = 7; // 一档认输扣6分
	public static final int GAME_RULE_SDH_NEVER_TURN_BACK = 8; // 60分不回头
	public static final int GAME_RULE_SDH_BU_DA_WU_ZHU = 9; // 不打无主

	// 数值掩码
	public static final int LOGIC_MASK_COLOR = 0xF0; // 花色掩码
	public static final int LOGIC_MASK_VALUE = 0x0F; // 数值掩码

	public static final int SDH_GAME_PLAYER = 4; // 玩家数量
	public static final int SDH_PACK_COUNT = 2; // 两副牌
	public static final int SDH_COLOR_COUNT = 4; // 一副牌四个花色
	public static final int SDH_ONE_COLOR_COUNT = 13; // 一副牌一个花色13张牌
	public static final int SDH_CELL_PACK_REMOVE6 = 54 - 4 * 3; // 去掉6
	public static final int SDH_DIPAI_COUNT = 8; // 底牌数量
	public static final int SDH_CARD_COUNT_REMOVE6 = (SDH_PACK_COUNT * SDH_CELL_PACK_REMOVE6 - SDH_DIPAI_COUNT) / SDH_GAME_PLAYER; // 去掉6的玩法
	public static final int SDH_SCORE_CARD_COUNT = 24; // 分牌数量(5、10、K) 3 * 4 * 2
	public static final int SDH_MAX_COUNT_REMOVE6 = SDH_CARD_COUNT_REMOVE6 + SDH_DIPAI_COUNT; // 最大手牌数量
	public static final int SDH_COLOR_MAIN = 4; // 主花色
	public static final int SDH_COLOR_NT = 0x40; // 大小王
	public static final int SDH_COLOR_HEI_TAO = 0x30;// 黑桃
	public static final int SDH_COLOR_HONG_TAO = 0x20;// 红桃
	public static final int SDH_COLOR_MEI_HUA = 0x10;// 梅花
	public static final int SDH_COLOR_FANG_KUAI = 0x00;// 方块
	public static final int SDH_NOT_DI_PAI = 0x000; // 不是底牌
	public static final int SDH_IS_DI_PAI = 0x100; // 是底牌

	// 最大连牌 (13 - 2(3、4没有) - 2(2、7常主)) * 2(两副牌) = 18
	public static final int SDH_MAX_TRACKOR = 18;
	public static final int SDH_COLOR_RIGHT = 40; // 花色权位
	public static final int SDH_MAX_FEN = 80; // 最大叫分

	public static final int SDH_CT_ERROR = 0; // 错误类型
	public static final int SDH_CT_SINGLE = 1; // 单牌类型
	public static final int SDH_CT_SAME_2 = 2; // 对牌类型
	public static final int SDH_CT_SAME_3 = 3; // 三牌类型
	public static final int SDH_CT_SAME_4 = 4; // 四牌类型
	public static final int SDH_CT_TRACKOR_2 = 5; // 拖拉机型
	public static final int SDH_CT_TRACKOR_3 = 6; // 拖拉机型
	public static final int SDH_CT_TRACKOR_4 = 7; // 拖拉机型
	public static final int SDH_CT_THROW_CARD = 8; // 甩牌类型

	public static final int CARD_DATA_SDH_REMOVE6[] = new int[] { 
			0x01, 0x02, 0x05, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x15, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x25, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x35, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x41, 0x42, 
			0x01, 0x02, 0x05, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, // 方块
			0x11, 0x12, 0x15, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, // 梅花
			0x21, 0x22, 0x25, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, // 红桃
			0x31, 0x32, 0x35, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, // 黑桃
			0x41, 0x42, };

	// 参数
	public static final int GAME_STATUS_JIAOZHUANG = 101; // 叫庄状态
	public static final int GAME_STATUS_DINGZHU = 102; // 定主状态
	public static final int GAME_STATUS_MAICARD = 103; // 埋牌状态
	public static final int GAME_STATUS_OUTCARD = 104; // 出牌状态

	public static final int SDH_ERROR_NUMBER = -1;
	public static final int SDH_INVALID_NUMBER = 0;
	public static final int SDH_PLAYER_READY = 1;
	public static final int SDH_BANKER_DATA = 100;
	public static final int SDH_MIN_DIFEN = 5; // 最低底分
	public static final int SDH_QING_GUANG = 0; // 清光
	public static final int SDH_XIAO_GUANG = 40; // 小光
	public static final int SDH_DA_GUANG = 70; // 大光
	public static final int SDH_OPERATOR_TIME = 15; // 操作时间
	public static final int SDH_ALL_PLAYER_GIVE_UP = 16; // 操作时间

	// 效果
	public static final int Player_Status_OUT_CARDS = 1002; // 出牌等待/出牌子协议
	public static final int Player_Status_MAI_CARD = 1003; // 埋牌等待/埋牌子协议
	public static final int Player_Status_CALL_MAIN = 1004; // 定主等待/定主子协议
	public static final int Player_Status_GAME_END = 1005; // 游戏结束
	public static final int Player_Status_BANKER_SELECT = 1006; // 庄家选择
	public static final int Player_Status_CALL_BANKER = 1007; // 叫庄等待
	public static final int Player_Status_GIVE_UP = 1008; // 放弃
	public static final int Player_Status_LOOK_DIPAI = 1009; // 看底牌
	public static final int Player_Status_LOOK_SCORE = 1010; // 看得分
	public static final int Player_Status_RELOOK = 1011; // 回看
	public static final int Player_Status_CLEAR_CARDS = 1012; // 清桌
	public static final int Game_CALL_BANKER_WAIT_TIME_OUT = 10001; // 叫庄等待延迟
	public static final int ROOM_RATE = 1013; // 几档几倍
	public static final int RESPONSE_CALL_BANKER = 1014; // 叫分下发
	public static final int RESPONSE_RECONNECT_DATA = 1015; // 重连
	public static final int RESPONSE_CALL_MAIN_COLOR = 1016; // 叫主
	public static final int RESPONSE_REFRESH_PLAYER_SCORE = 1017; // 叫主
	public static final int RESPONSE_BAO_FU = 1018; // 报副
	public static final int RESPONSE_GUARD = 1019; // 留守

}
