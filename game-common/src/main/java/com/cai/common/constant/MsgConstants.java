package com.cai.common.constant;

public class MsgConstants {

	public static final int RESPONSE_REFRESH_DELAY_TIME = 999; // 同步定时器时间
																// 占用(所有游戏通用)
	// 1=创建房间请求(game_type_index,game_rule_index,game_round)
	// 2=加入房间(room_id,room_pw)
	// 6=小局数详细数据(brand_id)
	// 10 = 玩家准备
	// 101 = 玩家出牌(operate_card),
	// 102 = 玩家操作,吃碰杠等。(operate_card,operate_code)

	public static final int REQUST_PLAYER_READY = 10;

	public static final int REQUST_PLAYER_RELEASE_ROOM = 11; // 解散房间

	public static final int REQUST_PLAYER_BE_IN_ROOM = 12; // 进入房间

	public static final int REQUST_PLAYER_OUT_CARD = 101; // 101 =
															// 玩家出牌(operate_card),

	public static final int REQUST_PLAYER_OPERATE = 102; // 102 =
															// 玩家操作,吃碰杠等。(operate_card,operate_code)
	public static final int REQUES_OPERATE_HANDLER_OPERATE = 103;

	public static final int REQUEST_SWITCH_TO_MAIN_SCREEN = 104; // 切换到主界面
	public static final int REQUEST_SWITCH_TO_GAME_SCREEN = 105; // 切换到游戏界面

	public static final int REQUST_CALL_BANKER = 110; // 用户叫庄
	public static final int REQUST_ADD_SCORE = 111; // 用户下注
	public static final int REQUST_OPEN_CARD = 112; // 用户摊牌
	public static final int REQUST_OPERATE_BUTTON = 113; // 操作按钮
	public static final int REQUST_PLAYER_OUT_CARD_MUL = 114;// 出多张牌 （>=0)
	public static final int REQUES_OX_GAME_START = 115; // 牛游戏开始
	public static final int REQUES_ASK_PLAYER = 116; // 询问玩家
	public static final int REQUES_CPDZ_YANG_PAI = 117; // 长牌仰操作
	public static final int REQUES_UPDATA_ONLINE = 118; // 是否离线
	public static final int REQUST_AUDIO_CHAT = 13; // 13 = 聊天
	public static final int REQUST_EMJOY_CHAT = 14; // 14 = 表情

	public static final int REQUST_PAO_QIANG = 15; // 15 = 跑呛

	public static final int REQUST_LOCATION = 16; // 16 = 定位

	public static final int REQUST_OPEN_LESS = 17; // 17 = 允许少人模式

	public static final int REQUST_PROXY_RELEASE_ROOM = 18; // 代理解散房间

	public static final int REQUST_IS_TRUSTEE = 20; // 是否托管

	public static final int REQUST_GOODS = 21; // 道具

	public static final int REQUST_REFRESH_PLAYERS = 22; // 道具

	public static final int REQUST_NAO_ZHUANG = 23; // 闹庄
	public static final int REQUST_BIAO_YAN = 24; // 表演分
	public static final int REQUEST_ROOM_CHAT = 25; //

	public static final int REQUST_LOCATION_NEW = 26; // 26 = 新定位
	public static final int REQUEST_SWITCH_CARDS = 27; // 四川麻将-换三张

	public static final int REQUEST_PAO_QIANG_BIAOYAN = 28; // 邓州十九张，一次新处理抵、前漂、后漂

	// 四川麻将
	public static final int REQUEST_SC_MJ_LIU_SHUI = 1001; // 请求流水

	public static final int REQUST_CALL_QIANG_ZHUANG = 1001; // 叫地主抢地主
	public static final int REQUST_DDZ_OUT_CARD_MUL = 1002; // 叫地主出牌
	public static final int REQUST_DDZ_ADD_TIMES = 1003; // 叫地主加倍

	//////////////////////////////////////////////// 炸金花
	public static final int REQUST_OPREATE = 1004;// 操作
	public static final int REQUST_DBN_OPERATE = 1005;// 斗板牛
	public static final int REQUST_FKN_OPERATE = 1006;// 疯狂牛

	// 十三张
	public static final int REQUST_SSZ_JETTON = 1008;// 下注操作
	public static final int REQUST_SSZ_CALLBANKER = 1009;// 叫庄操作
	public static final int REQUST_SSZ_OPENCARD = 1010;// 开牌操作

	// 三打哈
	public static final int REQUST_SDH_OPERATE = 1007; // 叫庄
	public static final int REQUST_SDH_OUT_CARD_MUL = 1011; // 出牌/埋牌

	// 文字聊天
	public static final int REQUST_MESSAGE_CHAT = 1012;
	public static final int REQUST_SG_OPERATE_JD = 1013;// 三公

	// 干瞪眼
	public static final int REQUST_GDY_OUT_CARD_LAIZI = 1014;

	// 九点半
	public static final int REQUST_JDB_OPERATE = 1015;
	// 闲逸咔陇
	public static final int REQUST_XYKL_OPERATE = 1016;
	public static final int REQUST_DBD_CALL_BANKER = 1017;// 斗板凳

	// 窟窿带神下拔
	public static final int REQUEST_XIA_BA = 1018;
	// 扳砣子/推饼
	public static final int REQUST_BTZ_TRUSTEE = 1019;// 托管
	// 斗板凳
	public static final int REQUST_DBD_OUT_CARD_LAIZI = 1020;
	// 郴州五小牛
	public static final int REQUST_CZWXOX_OPERATE = 1021;
	// 快乐牛牛
	public static final int REQUST_KLOX_OPERATE = 1022;
	public static final int REQUST_OPREATE_DEH = 1023;// 丁二红操作
	public static final int REQUST_OPEN_CARD_DEH = 1024;// 丁二红开牌
	// 岳阳斗牛
	public static final int REQUST_YYOX_OPERATE = 1025;

	public static final int REQUST_OPEN_LESS_EXTENDS = 1026; // 26 = 允许少人模式扩展接口
	public static final int REQUST_DMZ_OPERATE = 1027;
	// 郴州八怪
	public static final int REQUST_CZBG_OPEN_CARD = 1028;

	// 牛牛八人玩法
	public static final int REQUST_EIGHTOX_OPERATE = 1029;
	// 江西牛牛玩法
	public static final int REQUST_KLOXJX_OPERATE = 1030;
	// 卡五星
	public static final int REQUET_LIANG_ZHANG = 1031;
	// 红二十
	public static final int REQUST_OPERATE_CARD = 1032;
	// A包子
	public static final int REQUST_OUT_CARD_ABZ = 1033;
	public static final int REQUST_CALL_BANKER_ABZ = 1034;
	public static final int REQUST_CHANGE_ABZ = 1035;
	// 十点半
	public static final int REQUST_SDB_OPERATE = 1036;
	// 益阳无花牛
	public static final int REQUST_YI_YANG_OX_OPERATE = 1037;
	// 广丰510K
	public static final int REQUST_GF_WSK_OPERATE = 1038;
	// 怀化牛牛
	public static final int REQUST_HUAIHUAOX_OPERATE = 1039;
	// 信丰挂挡
	public static final int REQUST_SJ_SFGD_OPERATE = 1040;

	// 切入后台
	public static final int REQUST_ENTER_BACK = 1042;

	// 卡五星出子
	public static final int REQUST_CHU_ZI = 1043;

	// 拼十玩法
	public static final int REQUST_PSHOX_OPERATE = 1044;
	// 疯狂拼十玩法
	public static final int REQUST_FKPSH_OPERATE = 1045;
	// 咸宁打拱
	public static final int REQUST_XNDG_OPERATE = 1046;
	public static final int REQUST_PDK_QIE_PAI = 1047;
	public static final int REQUEST_SCORE_RECORD = 1048; // 请求查看战绩
	// 益阳巴十组队：找朋友
	public static final int REQUST_SDH_YYBS_ORGANIZETEAM = 1049;
	// 通城打滚
	public static final int REQUST_TCDG_OPERATE = 1050;

	// 快乐斗地主
	public static final int REQUST_PIAO_FEN = 1051;

	// 信丰挂挡
	public static final int REQUST_SJ_LLDQ_OPERATE = 1052;

	// 博胡
	public static final int REQUST_XPBH_OPERATE = 1053;
	// 跑得快
	public static final int REQUST_PDK_OPERATE = 1054;
	// 万载倒段
	public static final int REQUST_WZDD_OPERATE = 1055;

	// 六盘水分摞
	public static final int REQUST_FEN_LUO_LPS = 1056;
	// 六盘水换三张
	public static final int REQUST_SWAP_CARD_LPS = 1057;
	// 潜江千分
	public static final int REQUST_QJQF = 1058;
	// 河南武陟
	public static final int REQUEST_HNWZ_DISPLAY_WIN_CARDS = 1059; // 显示所有玩家的胡牌情况
	// 六盘水让牌
	public static final int REQUEST_RANG_PAI = 1060; // 显示所有玩家的胡牌情况
	// 浦城炸弹
	public static final int REQUST_PC_WSK_OPERATE = 1061;
	// 溆浦240
	public static final int REQUST_XPSJ_OPERATE = 1062;
	// 松溪同花
	public static final int REQUST_SXTH_OPERATE = 1063;
	// 大冶510K
	public static final int REQUST_HSDY_OPERATE = 1064;

	public static final int REQUST_CALL_BAKER_LPS = 1065; // 叫地主抢地主
	public static final int REQUST_DDZ_ADD_TIMES_LPS = 1066; // 加倍
	// 玉山打炸
	public static final int REQUST_YSDZ_OPERATE = 1067;

	public static final int REQUST_YJMJ_LANG_QI = 1068; // 荥经麻将廊起

	// 承包
	public static final int REQUST_CHENG_BAO_HTS = 1069; // 承包
	// 南平跑得快
	public static final int REQUST_NPPDK_OPERATE = 1070;
	// 卡五星扣牌检测出牌
	public static final int REQUST_KWX_KOU_CHECK = 1071;

	public static final int REQUST_DDZLF_OPERATE = 1072; // 临汾斗地主
	public static final int REQUST_YZBP_OPERATE = 1073; // 永州包牌
	public static final int REQUST_LI_PAI_HTS = 1074; // 理牌请求
	public static final int REQUST_PXGT_OPERATE = 1075; // 理牌请求
	// 贵州板子炮
	public static final int REQUST_GZH_BZP_OPERATE = 1076;
	public static final int REQUST_GDY_OPERATE = 1077; // 干瞪眼
	// 南昌四团
	public static final int REQUST_NCST_OPERATE = 1078;

	public static final int REQUST_NCMJ_SUIJING = 1079; // 南昌麻将随精
	public static final int REQUST_NCMJ_FADIAN = 1080; // 南昌麻将发电
	public static final int REQUST_NCMJ_TINGPAI = 1081; // 南昌麻将停牌
	public static final int REQUST_YXZD_OPERATE = 1082; // 永兴炸弹
	public static final int REQUST_TXW_OPERATE = 1083; // 提小五
	//
	public static final int REQUST_XTXZ_OPERATE = 1084;
	public static final int REQUST_NCEQW_OPERATE = 1085;
	public static final int REQUST_DCTS_OPERATE = 1086; // 都昌讨赏

	public static final int REQUST_YJQF_OPERATE = 1087;// 沅江千分切牌

	// 南昌过炸
	public static final int REQUST_NCGZ_OPERATE = 1088;// 请求
	// 娄底三打哈
	public static final int REQUST_LDSDH_OPERATE = 1089;// 请求

	public static final int REQUST_HRDZ_OPERATE = 1090;// 华容打炸弹
	public static final int REQUST_XPBF_OPERATE = 1091;// 溆浦包分
	public static final int REQUST_HCNG_OPERATE = 1092;// 河池牛鬼
	public static final int REQUST_YGGP_OPERATE = 1093;// 余干关牌
	public static final int REQUST_YGWSK_OPERATE = 1094;// 余干五十K
	public static final int REQUST_FCGZ_OPERATE = 1095;// 丰过过炸
	public static final int REQUST_JZPDK_OPERATE = 1096;// 荆州跑得快
	public static final int REQUST_FCSJ_OPERATE = 1097;// 丰城双剑
	public static final int REQUST_THGZ_OPERATE = 1098;// 泰和过炸
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public static final int RESPONSE_ENTER_ROOM = 10;

	public static final int RESPONSE_REFRESH_PLAYERS = 11;
	public static final int RESPONSE_REFRESH_PLAYER_CARDS = 12;// 刷新玩家的牌

	public static final int RESPONSE_SHOW_HAND_CARD = 14; // 14显示出牌

	public static final int RESPONSE_GAME_END = 15;

	public static final int RESPONSE_RECONNECT_DATA = 16;

	public static final int RESPONSE_REFRESH_DISCARD = 17;

	public static final int RESPONSE_OPERATE_XIAO_HU = 19;

	public static final int RESPONSE_FORCE_EXIT = 20;// 20系统级别的,收到这个消息,玩家强制退出客户端
	public static final int RESPONSE_PLAYER_READY = 21;// 玩家准备
	public static final int RESPONSE_PLAYER_RELEASE = 22;// 解散
	public static final int RESPONSE_AUDIO_CHAT = 23;// 聊天
	public static final int RESPONSE_EMJOY_CHAT = 24;
	public static final int RESPONSE_ADD_DISCARD = 25;// 添加牌到牌堆
	public static final int RESPONSE_EFFECT_ACTION = 26;// 26显示效果(effects_index,effect_time,effect_target)
	public static final int RESPONSE_PLAYER_ACTION = 27;// 通知玩家弹出操作
	public static final int RESPONSE_SHOW_CARD = 28;// 显示在玩家前面的牌,小胡牌,摸杠牌
	public static final int RESPONSE_PLAYER_STATUS = 29;// 基础状态
	public static final int RESPONSE_GAME_ROOM_RECORD_LIST = 30;// 大局记录列表
	public static final int RESPONSE_GAME_ROUND_RECORD_LIST = 31;// 小局记局表表
	public static final int RESPONSE_GAME_ROUND_RECORD = 32;// 小局记局(单个)
	public static final int RESPONSE_GAME_ESPECIAL_TXT = 33;// 刷新特别显示字符
	public static final int RESPONSE_GAME_PLAYER_SCORE = 34;// 牌局中分数结算
	public static final int RESPONSE_REMOVE_DISCARD = 35;// 删除出牌

	public static final int RESPONSE_REFRESH_PLAYER_DATA = 36;// 刷新玩家数据
	public static final int RESPONSE_PAO_QIANG_ACTION = 37;// 跑呛

	public static final int RESPONSE_REFRESH_ROOM_STATUS = 38;// 更新房间状态
	public static final int RESPONSE_NAO_ACTION = 39;// 闹庄状态

	public static final int RESPONSE_LOCATION = 40;// 定位
	public static final int RESPONSE_IS_TRUSTEE = 41;// 托管
	public static final int RESPONSE_IS_XIANGGONG = 42;// 是否是相公

	public static final int RESPONSE_DISPLAY_BIRD_CARDS = 44; // 显示鸟牌

	public static final int RESPONSE_PLAYER_ACTION_DING_SHEN = 1043;// 通知玩家弹出定神操作

	public static final int RESPONSE_CAN_WIN_BUT_WITHOUT_ENOUGH_SCORE = 1044; // 鄂州晃晃，牌能胡但是没达到起胡分
	public static final int RESPONSE_SWITCH_AUTO_WIN_CARD = 1045; // 鄂州晃晃，控制‘自动胡牌’按钮的显示
	public static final int RESPONSE_CHU_ZI = 1046; // 孝感麻将-出子
	public static final int RESPONSE_SHOW_HU_CARD = 1047; // 幺筒断勾卡显示点炮牌

	// public static final int RESPONSE_EFFECT_ACTION_CENTER = 45;//
	// 26显示效果(effects_index,effect_time,effect_target,operate_card)--带中心牌

	public static final int RESPONSE_GOODS = 43;// 道具返回

	public static final int RESPONSE_REFRESH_PLAYER_WEAVE_CARDS = 44;// 刷新玩家的在组合牌

	public static final int RESPONSE_BIAO_YAN_ACTION = 45;// 表演

	public static final int RESPONSE_PAO = 46;

	public static final int RESPONSE_MY_ROOMS = 50;// 我的房间
	public static final int RESPONSE_CREATE_MY_ROOM = 51;// 创建我的房间（RoomInfo）
	public static final int RESPONSE_CREATE_RROXY_ROOM_SUCCESS = 52;// 创建成功
	public static final int RESPONSE_UPDATE_MY_ROOM = 53;// 更新我的房间
	public static final int RESPONSE_SELECT_HHTYPE = 54; // 选择攸县红黑胡类型
	public static final int RESPONSE_UPDATE_HU_XI = 80; // 胡息
	public static final int RESPONSE_DOU_LIU_ZI = 81; // 逗溜子
	public static final int RESPONSE_MID_SCORE = 82; // 刷新游戏中的分数
	public static final int RESPONSE_ASK_PLAYER = 83; // 询问玩家
	public static final int RESPONSE_ROOM_CHAT = 84; // 聊天
	public static final int RESPONSE_EFFECT_ACTION_RECORD = 85; // 回放玩家操作记录
	public static final int RESPONSE_UPDATE_USER_DATA_RECORD = 86; // 刷新用户数据记录
	public static final int RESPONSE_ZHE_ZHE_HU_COUNT = 87; // 啫嗜胡数量
	public static final int RESPONSE_FAN_JIANG = 88; // 翻将
	public static final int RESPONSE_RECORD_INFO_OX = 89; // 记录消息
	public static final int RESPONSE_DING_SHEN = 1085; // 定神牌
	public static final int RESPONSE_DING_SHEN_YOU_SHENG = 1086; // 是否有神

	public static final int RESPONSE_REFRESH_PLAYERS_LOCATION = 90;// 刷新定位

	public static final int RESPONSE_APPLY_PLAYER_INFO = 100; // 刷新申请玩家信息

	public static final int RESPONSE_OTHER_CARD = 1084; // 商丘亮牌数据和花牌数据

	public static final int RESPONSE_OUT_CARD = 201;// 发送玩家出牌 201
													// =玩家出牌(CMD_OutCard:
													// operate_player,operate_card)
	public static final int RESPONSE_SEND_CARD = 204;// 204 =
														// 发牌（CMD_SendCard:operate_player,operate_card,operate_code）
	public static final int RESPONSE_GAME_START = 200;//// 200 开始(gameStart)
	public static final int RESPONSE_OPERATE_RESULT = 203;//// 203 =
															//// 操作结果(CMD_OperateResult:operate_player,provide_player,operate_code,operate_card)
	public static final int RESPONSE_OPERATE_NOTIFY = 202;////
	public static final int RESPONSE_CHI_HU_RESULT = 205;// 25 =
															// 发牌（CMD_SendCard:operate_player,operate_card,operate_code）
	public static final int RESPONSE_CHI_HU_CARDS = 206;// 显示吃胡牌
	public static final int RESPONSE_OPEN_CARD = 207;// 用户开牌
	public static final int RESPONSE_CALL_BANKER = 208; // 用户叫庄
	public static final int RESPONSE_ADD_JETTON = 209; // 用户下注
	public static final int RESPONSE_SELECT_BANKER = 210; // 选择庄家
	public static final int RESPONSE_OPEN_ALL_CARD = 211; // 全开
	public static final int RESPONSE_YAO_CARD = 212; // 要牌
	public static final int RESPONSE_TOU_XIANG_OPERATE = 213;// 是否投降
	public static final int RESPONSE_WAIT_RESPONSE = 214; // 等待用户
	public static final int RESPONSE_CANNOT_OUT_CARD = 215; // 不能出的牌
	public static final int RESPONSE_ROOM_OWNER_START = 216; // 游戏 是否开始
	public static final int RESPONSE_MUST_OUT_CARD = 217; // 必须出牌
	public static final int RESPONSE_UPDATE_DISCARD = 218; // 刷新弃牌
	public static final int RESPONSE_UPDATE_PICKUP_CARD = 219; // 刷新检牌
	public static final int RESPONSE_CANNOT_OUT_PICKUP_CARD = 210;// 不能出检的牌
	public static final int RESPONSE_RECORD_INFO_OX_C = 220; // 客户端请回顾信息
	public static final int RESPONSE_DI_FEN_BEI_SHU = 221; // 底分倍数
	public static final int RESPONSE_GSYS_TIMER = 222;// 定时器
	public static final int RESPONSE_SET_BANKER = 223;// 设置庄家
	public static final int RESPONSE_RECONNECT_NEW_WAY = 224; // 小结算断线时 显示整个桌面
	public static final int RESPONSE_SHAKE_TOU_ZI = 225; // 摇骰子
	public static final int RESPONSE_SET_QI_PLAYER = 226;// 设置起用户

	// 斗地主
	public static final int RESPONSE_DDZ_GAME_START = 1001;//// 1001
															//// 开始(gameStart)
	public static final int RESPONSE_DDZ_REFRESH_PLAYER_CARDS = 1002;// 刷新玩家的牌
	public static final int RESPONSE_DDZ_CALL_BANKER = 1003; // 叫地主
	public static final int RESPONSE_DDZ_RECONNECT_DATA = 1004; // 断线重连
	public static final int RESPONSE_DDZ_OUT_CARD = 1005;// 发送玩家出牌 201
	public static final int RESPONSE_DDZ_GAME_END = 1006;
	public static final int RESPONSE_DDZ_CALL_BANKER_RESULT = 1007; // 叫地主结果
	public static final int RESPONSE_DDZ_ADD_TIMES = 1008; // 叫地主加倍
	public static final int RESPONSE_DDZ_ADD_TIMES_RESULE = 1009; // 叫地主加倍结果
	public static final int RESPONSE_DDZ_RE_DISPATH = 1010;// 重新发牌
	public static final int RESPONSE_DDZ_EFFECT = 1011;// 效果
	public static final int RESPONSE_DDZ_EFFECT_PIAO = 1012;// 飘分
	public static final int RESPONSE_DDZ_MING_PAI = 1013;// 明牌
	public static final int RESPONSE_DDZ_FEN_LUO = 1014;// 分摞发牌
	public static final int RESPONSE_DDZ_FEN_LUO_RESULE = 1015;// 分摞发牌结果
	public static final int RESPONSE_DDZ_SWAP = 1016;// 换三张
	public static final int RESPONSE_DDZ_SWAP_RESULT = 1017;// 换三张结果
	public static final int RESPONSE_DDZ_SEND_LAST_CARD = 1018;// 发底牌
	public static final int RESPONSE_DDZ_SEND_LAI_ZI = 1019;// 发送癞子
	public static final int RESPONSE_DDZ_SEND_RECORD_CARD = 1020;// 记牌器
	public static final int RESPONSE_DDZ_RANG_PAI = 1021;// 让牌
	public static final int RESPONSE_DDZ_RANG_PAI_RESULT = 1022;// 让牌结果
	public static final int RESPONSE_DDZ_SEND_CRAD = 1023;// 发牌

	// 跑得快
	public static final int RESPONSE_PDK_GAME_START = 1007;//// 1007
															//// 开始(gameStart)
	public static final int RESPONSE_PDK_REFRESH_PLAYER_CARDS = 1008;// 刷新玩家的牌
	public static final int RESPONSE_PDK_RECONNECT_DATA = 1009; // 断线重连
	public static final int RESPONSE_PDK_OUT_CARD = 1010;// 发送玩家出牌 201
	public static final int RESPONSE_PDK_GAME_END = 1011;
	public static final int RESPONSE_PDK_QIE_START = 1012;
	public static final int RESPONSE_PDK_QIE_RESULT = 1013;
	public static final int RESPONSE_PDK_QIE_RESPONSE = 1014;
	public static final int RESPONSE_PDK_PIAO_SCORE_BEGIN = 1015;
	public static final int RESPONSE_PDK_PIAO_SCORE_RESPONSE = 1016;
	public static final int RESPONSE_PDK_OPEN_LESS = 1017;
	public static final int RESPONSE_PDK_SEND_BOOM = 1018;// 发送炸弹信息
	public static final int RESPONSE_PDK_QIANG_GUAN_BEGIN = 1018;// 抢关
	public static final int RESPONSE_PDK_QIANG_GUAN_RESPONSE = 1019;// 抢关
	public static final int RESPONSE_PDK_MING_PAI_BEGIN = 1020;// 明牌开始
	public static final int RESPONSE_PDK_MING_PAI_OPREATE = 1021;// 明牌操作
	public static final int RESPONSE_PDK_ZHAN_JI_RESPONSE = 1022;// 战绩
	public static final int RESPONSE_PDK_EFFECT_TYPE = 1023;// 飞金币
	// 炸金花
	public static final int RESPONSE_ZJH_GAME_START = 1001;//// 1001
															//// 开始(gameStart)
	public static final int RESPONSE_ZJH_LOOK_CARD_RESULT = 1002;// 看牌结果
	public static final int RESPONSE_ZJH_JETTON_RESULT = 1003;// 下注结果
	public static final int RESPONSE_ZJH_GIVE_UP_RESULT = 1004;// 放弃结果
	public static final int RESPONSE_ZJH_COMPARE_CARD_RESULT = 1005;// 比牌结果
	public static final int RESPONSE_ZJH_GAME_END = 1006;// 游戏结束
	public static final int RESPONSE_ZJH_RECONNECT_DATA = 1007; // 断线重连
	public static final int RESPONSE_ZJH_LIANG_PAI_RESULT = 1008;// 亮牌
	public static final int RESPONSE_ZJH_REFRESH_OPREATE = 1009;// 刷新用户操作
	public static final int RESPONSE_ZJH_JETTON_ROUND_REFRESH = 1010;// 下注轮数刷新
	public static final int RESPONSE_ZJH_COMPARE_CARD_USER = 1011;// 可比牌玩家
	public static final int RESPONSE_ZJH_SEND_CARD = 1012;//// 1012 发牌
	public static final int RESPONSE_ZJH_GENDAODI_RESULT = 1013;// 下注结果
	public static final int RESPONSE_ZJH_PIN_BEGIN = 1014;// 拼分开始
	public static final int RESPONSE_ZJH_PIN_RESPONSE = 1015;// 拼分返回
	public static final int RESPONSE_ZJH_PIN_RESULT = 1016;// 拼分结果
	public static final int RESPONSE_ZJH_USER_STATUS = 1017;// 玩家状态
	// 斗板牛
	public static final int RESPONSE_DBN_GAME_START = 2001; // 开始
	public static final int RESPONSE_DBN_QIE_CARD = 2002; // 切牌
	public static final int RESPONSE_DBN_ADD_JETTON = 2003; // 下注
	public static final int RESPONSE_DBN_OPEN_CARD = 2004; // 开牌
	public static final int RESPONSE_DBN_LIANG_CARD = 2005; // 亮牌
	public static final int RESPONSE_DBN_UPDATA_BUTTON = 2006; // 更新按钮信息
	public static final int RESPONSE_DBN_UPDATA_BANKER = 2007; // 更新庄家信息
	public static final int RESPONSE_DBN_SEND_CARD = 2008; // 发牌
	public static final int RESPONSE_DBN_GAME_END = 2009; // 游戏结束
	public static final int RESPONSE_DBN_RECONNECT_DATA = 2010; // 断线重连
	public static final int RESPONSE_DBN_ANIMATION = 2011; // 动画

	// 疯狂牛牛
	public static final int RESPONSE_FKN_GAME_START = 1001; // 开始
	public static final int RESPONSE_FKN_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_FKN_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_FKN_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_FKN_JETTON = 1005; // 下注
	public static final int RESPONSE_FKN_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_FKN_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_FKN_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_FKN_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_FKN_RECONNECT_DATA = 1010; // 断线重连
	// 郴州五小牛
	public static final int RESPONSE_CSWOXOX_GAME_START = 1001; // 开始
	public static final int RESPONSE_CSWOXOX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_CSWOXOX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_CSWOXOX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_CSWOXOX_JETTON = 1005; // 下注
	public static final int RESPONSE_CSWOXOX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_CSWOXOX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_CSWOXOX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_CSWOXOX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_CSWOXOX_RECONNECT_DATA = 1010; // 断线重连
	// 牛牛8人玩法
	public static final int RESPONSE_EIGHTOX_GAME_START = 1001; // 开始
	public static final int RESPONSE_EIGHTOX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_EIGHTOX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_EIGHTOX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_EIGHTOX_JETTON = 1005; // 下注
	public static final int RESPONSE_EIGHTOX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_EIGHTOX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_EIGHTOX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_EIGHTOX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_EIGHTOX_RECONNECT_DATA = 1010; // 断线重连

	// 拼十8人玩法
	public static final int RESPONSE_PSHOX_GAME_START = 1001; // 开始
	public static final int RESPONSE_PSHOX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_PSHOX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_PSHOX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_PSHOX_JETTON = 1005; // 下注
	public static final int RESPONSE_PSHOX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_PSHOX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_PSHOX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_PSHOX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_PSHOX_RECONNECT_DATA = 1010; // 断线重连
	// 疯狂拼十
	public static final int RESPONSE_FKPSH_GAME_START = 1001; // 开始
	public static final int RESPONSE_FKPSH_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_FKPSH_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_FKPSH_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_FKPSH_JETTON = 1005; // 下注
	public static final int RESPONSE_FKPSH_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_FKPSH_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_FKPSH_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_FKPSH_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_FKPSH_RECONNECT_DATA = 1010; // 断线重连
	// 益阳无花牛
	public static final int RESPONSE_YI_YANG_OX_GAME_START = 1001; // 开始
	public static final int RESPONSE_YI_YANG_OX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_YI_YANG_OX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_YI_YANG_OX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_YI_YANG_OX_JETTON = 1005; // 下注
	public static final int RESPONSE_YI_YANG_OX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_YI_YANG_OX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_YI_YANG_OX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_YI_YANG_OX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_YI_YANG_OX_RECONNECT_DATA = 1010; // 断线重连

	// 快乐牛牛
	public static final int RESPONSE_KLOX_GAME_START = 1001; // 开始
	public static final int RESPONSE_KLOX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_KLOX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_KLOX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_KLOX_JETTON = 1005; // 下注
	public static final int RESPONSE_KLOX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_KLOX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_KLOX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_KLOX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_KLOX_RECONNECT_DATA = 1010; // 断线重连
	public static final int RESPONSE_KLOX_SEND_GP = 1011; // 发牌公牌

	// 江西快乐牛牛
	public static final int RESPONSE_KLOX_JX_GAME_START = 1001; // 开始
	public static final int RESPONSE_KLOX_JX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_KLOX_JX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_KLOX_JX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_KLOX_JX_JETTON = 1005; // 下注
	public static final int RESPONSE_KLOX_JX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_KLOX_JX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_KLOX_JX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_KLOX_JX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_KLOX_JX_RECONNECT_DATA = 1010; // 断线重连
	public static final int RESPONSE_KLOX_JX_SEND_GP = 1011; // 发牌公牌
	public static final int RESPONSE_KLOX_JX_BUY_JETTON = 1012; // 买码数据

	// 岳阳牛牛
	public static final int RESPONSE_YYOX_GAME_START = 1001; // 开始
	public static final int RESPONSE_YYOX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_YYOX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_YYOX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_YYOX_JETTON = 1005; // 下注
	public static final int RESPONSE_YYOX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_YYOX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_YYOX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_YYOX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_YYOX_RECONNECT_DATA = 1010; // 断线重连

	// 怀化牛牛
	public static final int RESPONSE_HUAIHUAOX_GAME_START = 1001; // 开始
	public static final int RESPONSE_HUAIHUAOX_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_HUAIHUAOX_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_HUAIHUAOX_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_HUAIHUAOX_JETTON = 1005; // 下注
	public static final int RESPONSE_HUAIHUAOX_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_HUAIHUAOX_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_HUAIHUAOX_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_HUAIHUAOX_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_HUAIHUAOX_RECONNECT_DATA = 1010; // 断线重连

	// 十点半玩法
	public static final int RESPONSE_SDB_GAME_START = 1001; // 开始
	public static final int RESPONSE_SDB_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_SDB_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_SDB_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_SDB_JETTON = 1005; // 下注
	public static final int RESPONSE_SDB_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_SDB_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_SDB_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_SDB_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_SDB_RECONNECT_DATA = 1010; // 断线重连
	public static final int RESPONSE_SDB_BANKER_SCORE = 1011; // 庄家的携带分数
	public static final int RESPONSE_SDB_CARD_OPR = 1012; // 要牌和停牌操作
	public static final int RESPONSE_SDB_RECONNECT_WAIT = 1013; // 等待状态重连数据
	public static final int RESPOSNE_SDB_SHAI_ZI_RESULT = 1014; // 色子 数据
	// 十三张
	public static final int RESPONSE_SSZ_GAME_START = 1001; // 开始
	public static final int RESPONSE_SSZ_JETTON_START = 1002; // 开始下注
	public static final int RESPONSE_SSZ_SEND_CARD = 1003; // 发牌
	public static final int RESPONSE_SSZ_OPEN_CARD = 1004; // 开牌
	public static final int RESPONSE_SSZ_GAME_END = 1005; // 游戏结束
	public static final int RESPONSE_SSZ_RECONNECT_DATA = 1006; // 断线重连
	public static final int RESPONSE_SSZ_JETTON_RESULT = 1007; // 下注响应
	public static final int RESPONSE_SSZ_CALLBANKER_RESULT = 1008; // 叫庄响应
	public static final int RESPONSE_SSZ_CALL_BANKER = 1009; // 叫庄
	public static final int RESPONSE_SSZ_REFRESH_COLOCK = 1010;// 时钟显示
	// 三打哈
	public static final int RESPONSE_SDH_REFRESH_PLAYER_CARDS = 1001;// 刷新玩家的牌
	public static final int RESPONSE_SDH_REFRESH_PLAYER_SCORE = 1002;// 刷新玩家的分数
	public static final int RESPONSE_SDH_OUT_CARD_PLAYER = 1003;// 出牌玩家
	public static final int RESPONSE_SDH_OUT_CARD_TYPE = 1004;// 出牌类型
	public static final int RESPONSE_SDH_DISPATCH_PLAYER_CARDS = 1020;// 发牌协议
	public static final int RESPONSE_SDH_CALL_MAIN_PLAYER_CARDS = 1021; // 可叫主信息

	// 溆浦老牌
	public static final int RESPONSE_XU_LP_JPQ = 1001; // 记牌器

	// 镇江麻将聊天消息
	public static final int RESPONSE_ZZMJ_MESSAGE = 1001;

	// 三公
	public static final int RESPONSE_SG_GAME_START = 1001; // 开始
	public static final int RESPONSE_SG_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_SG_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_SG_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_SG_JETTON = 1005; // 下注
	public static final int RESPONSE_SG_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_SG_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_SG_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_SG_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_SG_RECONNECT_DATA = 1010; // 断线重连

	// 打码子
	public static final int RESPONSE_DMZ_GAME_START = 1001;//// 1001
															//// 开始(gameStart)
	public static final int RESPONSE_DMZ_REFRESH_PLAYER_CARDS = 1002;// 刷新玩家的牌
	public static final int RESPONSE_DMZ_RECONNECT_DATA = 1003; // 断线重连
	public static final int RESPONSE_DMZ_OUT_CARD = 1004;// 发送玩家出牌 201
	public static final int RESPONSE_DMZ_GAME_END = 1005;
	public static final int RESPONSE_DMZ_USER_GET_SCORE = 1006;// 刷新用户抓分
	public static final int RESPONSE_DMZ_PAI_SCORE = 1007;// 刷新剩余牌分
	public static final int RESPONSE_DMZ_MINGPAI_ANSER = 1008;// 明牌回复
	public static final int RESPONSE_DMZ_MINGPAI_RESULT = 1009;// 明牌结果
	public static final int RESPONSE_DMZ_MUSIC_RESULT = 1010;// 语音回复
	public static final int RESPONSE_DMZ_ANIMATION_SEAT = 1011;// 确定首出动画
	public static final int RESPONSE_DMZ_TOUXIANG_ANSER = 1012;// 投降回复
	public static final int RESPONSE_DMZ_TOUXIANG_RESULT = 1013;// 投降结果
	// 干瞪眼
	public static final int RESPONSE_GDEYE_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_GDEYE_REFRESH_PLAYER_CARDS = 1002;// 刷新玩家的牌
	public static final int RESPONSE_GDEYE_RECONNECT_DATA = 1003; // 断线重连
	public static final int RESPONSE_GDEYE_OUT_CARD = 1004;// 发送玩家出牌 1004
	public static final int RESPONSE_GDEYE_GAME_END = 1005;
	public static final int RESPONSE_GDEYE_SEND_CARD = 1006;// 发牌
	public static final int RESPONSE_GDEYE_QIE_PAI_BEGIN = 1007;// 切牌开始
	public static final int RESPONSE_GDEYE_QIE_PAI_RESULT = 1008;// 切牌结果
	public static final int RESPONSE_GDEYE_CALL_BANKER_RESPONSE = 1009;// 叫庄回复
	public static final int RESPONSE_GDEYE_CALL_BANKER_RESULT = 1010;// 叫庄结果

	// 九点半
	public static final int RESPONSE_JDB_GAME_START = 1001; // 开始
	public static final int RESPONSE_JDB_SEND_CARD = 1002; // 发牌
	public static final int RESPONSE_JDB_ROBOT_BANKER = 1003; // 抢庄
	public static final int RESPONSE_JDB_ROBOT_BANKER_RESULT = 1004; // 庄家信息
	public static final int RESPONSE_JDB_JETTON = 1005; // 下注
	public static final int RESPONSE_JDB_OPEN_CARD = 1006; // 开牌
	public static final int RESPONSE_JDB_LIANG_PAI = 1007; // 亮牌
	public static final int RESPONSE_JDB_UPDATE_BTN = 1008; // 更新按钮
	public static final int RESPONSE_JDB_GAME_END = 1009; // 游戏结束
	public static final int RESPONSE_JDB_RECONNECT_DATA = 1010; // 断线重连
	public static final int RESPONSE_JDB_APPLY_LIST = 1011; // 申请坐下列表
	public static final int RESPONSE_JDB_ROOM_PLAY_INFO = 1012; // 房间用户信息
	public static final int RESPONSE_JDB_APPLY_BU_SCORE_LIST = 1013; // 补分
	public static final int RESPONSE_JDB_QIE_CARD = 1014; // 切牌
	public static final int RESPONSE_JDB_POPUP_MESSAGE = 1015; // 弹窗
	public static final int RESPONSE_JDB_ROOM_MANAGER = 1016; // 管理员
	public static final int RESPONSE_JDB_RECORD_INFO = 1017; // 战绩
	public static final int RESPONSE_JDB_PAUSE_GAME = 1018; // 游戏暂停
	public static final int RESPONSE_JDB_RETRUN_DATA = 1019; // 返回数据
	public static final int RESPONSE_JDB_USER_NUMBER_LIST = 1020; // 获取游戏列表

	// 闲逸咔陇
	public static final int RESPONSE_XYKL_GAME_START = 1001;//// 1007
															//// 开始(gameStart)
	public static final int RESPONSE_XYKL_REFRESH_PLAYER_CARDS = 1002;// 刷新玩家的牌
	public static final int RESPONSE_XYKL_RECONNECT_DATA = 1003; // 断线重连
	public static final int RESPONSE_XYKL_SEND_CARD = 1004;// 发牌
	public static final int RESPONSE_XYKL_GAME_END = 1005;
	public static final int RESPONSE_XYKL_JETTON = 1006;// 下注
	public static final int RESPONSE_XYKL_CALLBANKER = 1007;// 叫庄
	public static final int RESPONSE_XYKL_OPENCARD = 1008;// 开牌
	public static final int RESPONSE_XYKL_JETTON_AREA = 1009;// 下注范围
	public static final int RESPONSE_XYKL_CHOU_PAI = 1010;// 搓牌
	public static final int RESPONSE_XYKL_ENTER_ROOM = 1011;// 坐下确认
	// 斗板凳
	public static final int RESPONSE_DBD_GAME_START = 1001;//// 1007
															//// 开始(gameStart)
	public static final int RESPONSE_DBD_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_DBD_OUT_CARD = 1003;// 发送玩家出牌 201
	public static final int RESPONSE_DBD_GAME_END = 1004;
	public static final int RESPONSE_DBD_CALL_BANKER = 1005;// 庄家叫庄
	public static final int RESPONSE_DBD_RE_DISPATH = 1006;// 重新发牌

	// 丁二红
	public static final int RESPONSE_DEH_GAME_START = 1001; // 开始
	public static final int RESPONSE_DEH_BOBO_RESULT = 1002; // 簸簸响应
	public static final int RESPONSE_DEH_SEND_CARD = 1003; // 发牌
	public static final int RESPONSE_DEH_GAME_END = 1004; // 游戏结束
	public static final int RESPONSE_DEH_RECONNECT_DATA = 1005; // 断线重连
	public static final int RESPONSE_DEH_JETTON_RESULT = 1006; // 下注响应
	public static final int RESPONSE_DEH_REFRESH_OPREATE = 1007;// 刷新用户操作
	public static final int RESPONSE_DEH_OPREATE_RESULT = 1008; // 操作响应
	public static final int RESPONSE_DEH_REFRESH_PLAYER_STATUS = 1009; // 玩家状态
	public static final int RESPONSE_DEH_REFRESH_GAME_STATUS = 1010; // 游戏状态
	public static final int RESPONSE_DEH_SPECIAL_REMIN = 1011;// 特殊牌型提示
	public static final int RESPONSE_DEH_ZI_CHAN_SCORE = 1012;// 刷新资产分数
	public static final int RESPONSE_DEH_REFRESH_TABLE = 1013;// 桌面信息
	public static final int RESPONSE_DEH_CHEPAI_BEGIN = 1014;// 扯牌开始
	public static final int RESPONSE_DEH_CHEPAI_END = 1015;// 扯牌结束
	public static final int RESPONSE_DEH_BANKER = 1016;// 确定庄家
	public static final int RESPONSE_DEH_OPEN_CARD_RESULT = 1017;// 玩家开牌
	public static final int RESPONSE_DEH_REFRESH_COLOCK = 1018;// 时钟显示

	// 益阳歪胡子
	public static final int RESPONSE_WHZYIYANG_SHEN_CARD = 1001; // 确认神牌
	public static final int RESPONSE_WHZYIYANG_SHEN_YAO = 1002; // 发送神腰

	// 四川麻将
	public static final int RESPONSE_SC_DING_QUE = 1001; // 定缺
	public static final int RESPONSE_SC_SWITCH_CARD = 1002; // 换三张
	public static final int RESPONSE_SC_FINISHED_SWITCH_CARD = 1003; // 完成换三张
	public static final int RESPONSE_SC_SHOW_SCORE_DETAIL = 1004; // 显示流水
	public static final int RESPONSE_SC_OPERATE_RT_SCORE = 1005; // 实时刷新分数
	public static final int RESPONSE_SC_OPERATE_RT_HU_CARDS = 1006; // 实时刷新胡的牌
	public static final int RESPONSE_SC_OVER_TIME_COUNTER = 1007; // 读秒
	public static final int RESPONSE_SC_BAO_TING = 1008; // 报听

	// A包子
	public static final int RESPONSE_ABZ_GAME_START = 1001; // 游戏开始
	public static final int RESPONSE_ABZ_CALL_BANKER = 1002; // 叫庄
	public static final int RESPONSE_ABZ_CHANGE_CARD = 1003; // 换牌
	public static final int RESPONSE_ABZ_OUT_CARD = 1004; // 出牌
	public static final int RESPONSE_ABZ_GAME_END = 1005; // 游戏结束
	public static final int RESPONSE_ABZ_RECONNECT = 1006; // 断线重连
	public static final int RESPONSE_ABZ_ZHANJI = 1007; // 战绩
	public static final int RESPONSE_ABZ_REFRESH = 1008; // 刷新手牌

	// 红二十
	public static final int RESPONSE_HES_BU_CARD = 7001;
	public static final int RESPONSE_HES_GAME_END = 7002;

	// 广丰510K
	public static final int RESPONSE_WSK_GF_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_WSK_GF_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_GF_OUT_CARD = 1003;// 发送玩家出牌 201
	public static final int RESPONSE_WSK_GF_GAME_END = 1004;
	public static final int RESPONSE_WSK_GF_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_GF_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_WSK_GF_LIANG_PAI_RESULT = 1008;// 亮牌回复
	public static final int RESPONSE_WSK_GF_TOUXIANG_ANSER = 1009;// 投降回复
	public static final int RESPONSE_WSK_GF_TOUXIANG_RESULT = 1010;// 投降结果
	public static final int RESPONSE_WSK_GF_CALL_BANKER_RESULT = 1011;// 叫庄结果
	public static final int RESPONSE_WSK_GF_TOUXIANG_BEGIN = 1012;// 投降开始
	public static final int RESPONSE_WSK_GF_REFRESH_CARD = 1013;// 刷新手牌
	public static final int RESPONSE_WSK_GF_REFRESH_DUIYOU_CARD = 1014;// 刷新队友手牌

	// 浦城炸弹
	public static final int RESPONSE_WSK_PC_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_WSK_PC_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_PC_OUT_CARD = 1003;// 发送玩家出牌 201
	public static final int RESPONSE_WSK_PC_GAME_END = 1004;
	public static final int RESPONSE_WSK_PC_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_PC_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_WSK_PC_LIANG_PAI_RESULT = 1007;// 亮牌回复
	public static final int RESPONSE_WSK_PC_CALL_BANKER_RESULT = 1008;// 叫庄结果
	public static final int RESPONSE_WSK_PC_REFRESH_CARD = 1009;// 刷新手牌
	public static final int RESPONSE_WSK_PC_REFRESH_DUIYOU_CARD = 1010;// 刷新队友手牌

	// 信丰挂挡
	public static final int RESPONSE_XFGD_GAME_START = 1001;//// 1001////
															//// 开始(gameStart)
	public static final int RESPONSE_XFGD_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_XFGD_OUT_CARD = 1003;// 发送玩家出牌 201
	public static final int RESPONSE_XFGD_GAME_END = 1004;
	public static final int RESPONSE_XFGD_SEND_CARD = 1005;//// 发牌
	public static final int RESPONSE_XFGD_CALL_BANKER = 1006;//// 叫挡
	public static final int RESPONSE_XFGD_TOU_XIANG = 1007;// 投降
	public static final int RESPONSE_XFGD_JIAO_ZHU_BEGIN = 1008;// 叫主开始
	public static final int RESPONSE_XFGD_DI_PAI_CARD = 1009;// 底牌数据
	public static final int RESPONSE_XFGD_LI_SHI_CARD = 1010;// 底牌数据
	public static final int RESPONSE_XFGD_MAI_DI_BEGIN = 1011;// 埋牌开始
	public static final int RESPONSE_XFGD_REFRESH_CARD = 1012;// 刷新手牌
	public static final int RESPONSE_XFGD_REFRESH_SCORE = 1013;// 分数
	public static final int RESPONSE_XFGD_TOU_XIANG_BEGIN = 1014;// 投降
	public static final int RESPONSE_XFGD_ZHU_CARD = 1015;// 主牌消息
	public static final int RESPONSE_XFGD_TOU_XIANG_ANIMAL = 1016;// 投降动画
	public static final int RESPONSE_XFGD_ZHU_TYPE = 1017;// 主牌类型
	public static final int RESPONSE_XFGD_QIE_PAI = 1018;// 切牌
	// 通用消息，小结算的时候，断线重连
	public static final int RESPONSE_RECONNECT_WHEN_GAME_FINISH = 1101; // 游戏小结算的时候，断线重连

	// 吉县斗地主
	public static final int RESPONSE_JXDDZ_GAME_START = 1001;//// 开始(gameStart)
	public static final int RESPONSE_JXDDZ_CALLBANKER_START = 1002;//// 叫庄开始
	public static final int RESPONSE_JJDDZ_CALLBANKER_RESULT = 1003;//// 叫庄结果
	public static final int RESPONSE_JJDDZ_ADD_BEGIN = 1004;//// 加倍开始
	public static final int RESPONSE_JJDDZ_ADD_RESULT = 1005;//// 加倍结果
	public static final int RESPONSE_JJDDZ_OUT_CARD = 1006;//// 出牌
	public static final int RESPONSE_JJDDZ_RECONNECT = 1007;//// 断线重连
	public static final int RESPONSE_JJDDZ_GAME_END = 1008;//// 游戏结束

	// 咸宁打拱
	public static final int RESPONSE_WSK_XNDG_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_WSK_XNDG_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_XNDG_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_WSK_XNDG_GAME_END = 1004;
	public static final int RESPONSE_WSK_XNDG_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_XNDG_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_WSK_XNDG_LIANG_PAI_RESULT = 1008;// 亮牌回复
	public static final int RESPONSE_WSK_XNDG_CALL_BANKER_RESULT = 1009;// 叫庄结果
	public static final int RESPONSE_WSK_XNDG_REFRESH_CARD = 1010;// 刷新手牌
	public static final int RESPONSE_WSK_XNDG_REFRESH_MING_PAI = 1011;// 明鸡

	public static final int RESPONSE_WSK_GAME_START = 1001;//// 开始(gameStart)
	public static final int RESPONSE_WSK_ANIMATION_SEAT = 1002;//// 叫庄开始
	public static final int RESPONSE_WSK_CALL_BANKER_RESULT = 1003;//// 叫庄结果
	public static final int RESPONSE_WSK_USER_GET_SCORE = 1004;//// 玩家得分
	public static final int RESPONSE_WSK_OUT_CARD = 1005;// 出牌

	// 通城打滚
	public static final int RESPONSE_WSK_TCDG_GAME_START = 1001;// 开始(gameStart)
	public static final int RESPONSE_WSK_TCDG_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_TCDG_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_WSK_TCDG_GAME_END = 1004;
	public static final int RESPONSE_WSK_TCDG_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_TCDG_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_WSK_TCDG_LIANG_PAI_RESULT = 1008;// 亮牌回复
	public static final int RESPONSE_WSK_TCDG_CALL_BANKER_RESULT = 1009;// 叫庄结果
	public static final int RESPONSE_WSK_TCDG_REFRESH_CARD = 1010;// 刷新手牌
	public static final int RESPONSE_WSK_TCDG_REFRESH_MING_PAI = 1011;// 明鸡
	public static final int RESPONSE_WSK_TCDG_PIAO = 1012;// 飘分

	// 贵州板子炮
	public static final int RESPONSE_BZP_GZH_GAME_START = 1001;// 开始(gameStart)
	public static final int RESPONSE_BZP_GZH_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_BZP_GZH_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_BZP_GZH_GAME_END = 1004; // 游戏结束
	public static final int RESPONSE_BZP_GZH_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_BZP_GZH_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_BZP_GZH_LIANG_PAI_RESULT = 1008;// 亮牌回复
	public static final int RESPONSE_BZP_GZH_CALL_BANKER_RESULT = 1009;// 叫庄结果
	public static final int RESPONSE_BZP_GZH_REFRESH_CARD = 1010;// 刷新手牌
	public static final int RESPONSE_BZP_GZH_REFRESH_MING_PAI = 1011;// 明鸡
	public static final int RESPONSE_BZP_GZH_PIAO = 1012;// 飘分
	public static final int RESPONSE_BZP_GZH_BANKER_BUTTON = 1013;// 操作按钮
	// 郴州字牌，请求战绩的相应数据
	public static final int RESPONSE_SCORE_RECORD = 1001;

	// 打筒子
	public static final int RESPONSE_DTZ_GAME_START = 1001; ////
	public static final int RESPONSE_DTZ_REFRESH_PLAYER_CARDS = 1002;// 刷新玩家的牌
	public static final int RESPONSE_DTZ_RECONNECT_DATA = 1003; // 断线重连
	public static final int RESPONSE_DTZ_OUT_CARD = 1004;// 发送玩家出牌 201
	public static final int RESPONSE_DTZ_GAME_END = 1005;
	public static final int RESPONSE_DTZ_REFRESH_USER_GET_SCORE = 1006;
	public static final int RESPONSE_DTZ_REFRESH_CURR_ROUND_SCORE = 1007;
	public static final int RESPONSE_DTZ_SHOW_AUTO_OUT_CARD_TIME = 1008;

	// 吕梁打七
	public static final int RESPONSE_LLDQ_GAME_START = 1001;//// 1001////
															//// 开始(gameStart)
	public static final int RESPONSE_LLDQ_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_LLDQ_OUT_CARD = 1003;// 发送玩家出牌 201
	public static final int RESPONSE_LLDQ_GAME_END = 1004;
	public static final int RESPONSE_LLDQ_SEND_CARD = 1005;//// 发牌
	public static final int RESPONSE_LLDQCALL_BANKER = 1006;//// 叫主
	public static final int RESPONSE_LLDQ_TOU_XIANG = 1007;// 投降
	public static final int RESPONSE_LLDQ_MAIDI_BEIGN = 1008;// 埋底开始
	public static final int RESPONSE_LLDQ_MAIDI_OPREATE = 1009;// 埋底操作
	public static final int RESPONSE_LLDQ_SCORE = 1010;// 分数显示
	public static final int RESPONSE_LLDQ_ZHU_COUNT = 1011;// 牌型数量
	public static final int RESPONSE_LLDQ_SEND_CARD_END = 1012;// 发牌结束
	public static final int RESPONSE_LLDQ_DI_PAI_DATA = 1013;// 底牌数据
	public static final int RESPONSE_LLDQ_EFFECT_TYPE = 1014;// 动画特效
	public static final int RESPONSE_LLDQ_ZHU_CARD_DATA = 1015;// 主牌数据
	public static final int RESPONSE_LLDQ_REFRES_CARD_DATA = 1016;// 刷新手牌
	public static final int RESPONSE_LLDQ_SOUND_TYPE = 1017;// 音效

	// 万载倒段
	public static final int RESPONSE_WZDD_GAME_START = 1001;//// 1001////
															//// 开始(gameStart)
	public static final int RESPONSE_WZDD_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WZDD_OUT_CARD = 1003;// 发送玩家出牌 201
	public static final int RESPONSE_WZDD_GAME_END = 1004;
	public static final int RESPONSE_WZDD_SEND_CARD = 1005;//// 发牌
	public static final int RESPONSE_WZDD_CALL_BANKER = 1006;//// 叫庄
	public static final int RESPONSE_WZDD_JIAO_ZHU_BEGIN = 1007;// 叫主开始
	public static final int RESPONSE_WZDD_DI_PAI_CARD = 1008;// 底牌数据
	public static final int RESPONSE_WZDD_LI_SHI_CARD = 1009;// 底牌数据
	public static final int RESPONSE_WZDD_MAI_DI_BEGIN = 1010;// 埋牌开始
	public static final int RESPONSE_WZDD_REFRESH_CARD = 1011;// 刷新手牌
	public static final int RESPONSE_WZDD_REFRESH_SCORE = 1012;// 分数
	public static final int RESPONSE_WZDD_ZHU_CARD = 1013;// 主牌消息
	public static final int RESPONSE_WZDD_ZHU_TYPE = 1014;// 主牌类型
	public static final int RESPONSE_WZDD_EFFECT_TYPE = 1015;// 动画特效

	// 河南武陟麻将
	public static final int RESPONSE_HNWZ_REFRESH_PLAYER_CARDS = 1101; // 亮四打一时，刷新手牌

	public static final int RESPONSE_HNWZ_DISPLAY_WIN_CARDS = 1102; // 显示所有玩家的胡牌情况

	// 松溪麻将
	public static final int RESPONSE_SX_MAI_MA_CARDS = 1501; // 松溪麻将买马数据

	// 松溪同花
	public static final int RESPONSE_WSK_SXTH_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_WSK_SXTH_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_SXTH_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_WSK_SXTH_GAME_END = 1004;
	public static final int RESPONSE_WSK_SXTH_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_SXTH_TOUXIANG_RESULT = 1006;// 投降结果
	public static final int RESPONSE_WSK_SXTH_TOUXIANG_BEGIN = 1007;// 投降开始
	public static final int RESPONSE_WSK_SXTH_EFFECT = 1008;// 特效
	public static final int RESPONSE_WSK_SXTH_TOUXIANG_ASK = 1009;// 投降询问
	public static final int RESPONSE_WSK_SXTH_REFRESH_CARD = 1010;// 刷新手牌
	public static final int RESPONSE_WSK_SXTH_CHAGNE_SEAT = 1011;// 转换位置
	// 大冶510K
	public static final int RESPONSE_WSK_HSDY_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_WSK_HSDY_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_HSDY_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_WSK_HSDY_GAME_END = 1004;
	public static final int RESPONSE_WSK_HSDY_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_HSDY_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_WSK_HSDY_LIANG_PAI_RESULT = 1008;// 亮牌回复
	public static final int RESPONSE_WSK_HSDY_CALL_BANKER_RESULT = 1009;// 叫庄结果
	public static final int RESPONSE_WSK_HSDY_REFRESH_CARD = 1010;// 刷新手牌
	public static final int RESPONSE_WSK_HSDY_REFRESH_MING_PAI = 1011;// 明鸡
	public static final int RESPONSE_WSK_HSDY_RECORD_OUT_CARD = 1012;// 记牌器
	// 玉山打炸
	public static final int RESPONSE_WSK_YSDZ_GAME_START = 1001;//// 1001
																//// 开始(gameStart)
	public static final int RESPONSE_WSK_YSDZ_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_YSDZ_GAME_END = 1003;
	public static final int RESPONSE_WSK_YSDZ_USER_GET_SCORE = 1004;// 刷新用户抓分
	public static final int RESPONSE_WSK_YSDZ_EFFECT = 1005;// 特效
	public static final int RESPONSE_WSK_YSDZ_OUT_CARD = 1006;// 发送玩家出牌

	// 黑桃3
	public static final int RESPONSE_WSK_HTS_GAME_START = 1001;// 1001
	public static final int RESPONSE_WSK_HTS_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_HTS_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_WSK_HTS_GAME_END = 1004;// 游戏结束
	public static final int RESPONSE_WSK_HTS_CHENG_BAO = 1005;// 发送承包
	public static final int RESPONSE_WSK_HTS_CB_RESULT = 1006;// 承包结果
	public static final int RESPONSE_WSK_HTS_EFFECT = 1007;// 特效
	public static final int RESPONSE_WSK_HTS_GET_SCORE = 1008;// 发送玩家捡分
	public static final int RESPONSE_WSK_HTS_SEND_BANKER = 1009;// 发送庄家
	public static final int RESPONSE_WSK_HTS_REFRESH_CARD = 1010;// 刷新手牌

	// 湘潭消造
	public static final int RESPONSE_WSK_XTXZ_GAME_START = 1001;// 开始(gameStart)
	public static final int RESPONSE_WSK_XTXZ_RECONNECT_DATA = 1002; // 断线重连
	public static final int RESPONSE_WSK_XTXZ_OUT_CARD = 1003;// 发送玩家出牌
	public static final int RESPONSE_WSK_XTXZ_GAME_END = 1004;
	public static final int RESPONSE_WSK_XTXZ_USER_GET_SCORE = 1005;// 刷新用户抓分
	public static final int RESPONSE_WSK_XTXZ_PAI_SCORE = 1006;// 刷新剩余牌分
	public static final int RESPONSE_WSK_XTXZ_LIANG_PAI_RESULT = 1008;// 亮牌回复
	public static final int RESPONSE_WSK_XTXZ_CALL_BANKER_RESULT = 1009;// 叫庄结果
	public static final int RESPONSE_WSK_XTXZ_REFRESH_CARD = 1010;// 刷新手牌
	public static final int RESPONSE_WSK_XTXZ_REFRESH_MING_PAI = 1011;// 明鸡
	public static final int RESPONSE_WSK_XTXZ_BIAO_TAI = 1012;// 表态
	
	// 丰城麻将
	public static final int RESPONSE_REFRESH_TAN_CARD = 1101; // 刷新摊牌
}
