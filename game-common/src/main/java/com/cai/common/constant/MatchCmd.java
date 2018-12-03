package com.cai.common.constant;

public class MatchCmd {

	public static final int C2S_MATCH_CONFIG = 1; // 比赛配置
	public static final int C2S_MATCH_APPLY = 2; // 报名
	public static final int C2S_MATCH_CANCEL_APPLY = 3;//取消报名
	public static final int C2S_MATCH_LIST_BY_APP_ID = 4; // 获取某个游戏的比赛数据
	public static final int C2S_MATCH_ENTER_MATCH = 5; //请求进入比赛场
	public static final int C2S_MTACH_REGISTER = 6; // 客户端注册比赛数据更新
	public static final int C2S_MATCH_UNION_CONFIG = 7; // 联赛配置
	public static final int C2S_MATCH_LEAVE = 8; // 离开
	public static final int C2S_MATCH_OEVER_DATA = 9; //  比赛已经结束获取排名
	public static final int C2S_MATCH_AUTH = 10; //比赛认证
	public static final int C2S_MATCH_AUTH_UPDATE = 11; //比赛认证修改
	public static final int C2S_GET_MATCH_AUTH = 12; //获取认证数据
	public static final int C2S_MATCH_RESERVE_ENTER = 13; //预约
	public static final int C2S_MATCH_UNION_DETAIL_CONFIG = 14; // 联赛详细配置
	public static final int C2S_MATCH_DETAIL_CONFIG = 15; // 比赛详细配置
	public static final int C2S_MATCH_LOG = 16; // 比赛排行log
	
	public static final int MATCH_ID_INFO = 100; // 请求指定ID比赛数据
	public static final int MATCH_ID_INFOS = 101; // 请求列表比赛数据
	public static final int MATCH_RULE_INFOS = 102; // 请求比赛相关游戏规则
	public static final int MATCH_SCORE_INFOS = 103; // 请求比赛相关游戏分数规则
	public static final int MATCH_UNION_SIDE_INFOS = 104; // 请求比赛联赛边角列表信息
	public static final int MATCH_CANCEL_RESERVE = 105; // 取消预约
	public static final int MATCH_ID_CONFIG = 106; // 请求指定ID比赛配置数据
	public static final int MATCH_GMAE_RANK = 107; // 比赛内游戏排名
	
	public static final int MATCH_WINNER_START = 108; // 大赢家比赛开始
	public static final int MATCH_WINNER_LIST = 109; // 比赛大赢家列表
	public static final int MATCH_WINNER_OPERATION = 110; // 大赢家比赛管理(旁观等)
	public static final int MATCH_WINNER_ALLOCATION = 111; // 大赢家配桌
	public static final int MATCH_WINNER_REFRESH = 112; // 大赢家信息刷新
	public static final int MATCH_EXTRA_CONFIG = 113; // 额外比赛配置
	public static final int MATCH_EXTRA_LIST_CONFIG = 114; // 额外比赛数据
	public static final int MATCH_WINNER_TABLE_LIST = 115; // 大赢家桌子信息
	public static final int MATCH_WINNER_NO_READY_LIST = 116; // 大赢家没准备列表信息
	public static final int MATCH_WINNER_RANK_LIST = 117; // 大赢家晋级排行榜
	public static final int MATCH_REIVE = 118; // 比赛复活
	
	//竞技二打一相关 150 - 200
	public static final int MATCH_ATHLETICS_PLAYER_MSG = 150; //玩家基本信息
	public static final int MATCH_ATHLETICS_AUTH_MSG = 151; //玩家认证信息
	public static final int MATCH_ATHLETICS_SUBMIT_AUTH = 152; //提交认证信息
	public static final int MATCH_ATHLETICS_REWARD_MSG = 153; //领取信息
	public static final int MATCH_ATHLETICS_REWARD = 154; //奖金领取
	public static final int MATCH_ATHLETICS_RANK = 155; //排名信息
	public static final int MATCH_ATHLETICS_LEVEL_CONFIG = 156; //牌手等级配置信息
	
	//201 - 250 聊天 7.1
	public static final int MATCH_EXCHANGE = 201; //比赛兑换
	public static final int MATCH_CHAT_UNIQUE_ID = 220; //聊天唯一ID
	public static final int MATCH_CHAT_SEND = 221; //发送聊天内容
	public static final int MATCH_CHAT_VOICE = 222; //语音聊天内容
	public static final int MATCH_CHAT_ROOM = 223; //请求加入聊天房间
	public static final int MATCH_CHAT_RECORD = 224; //聊天记录
	public static final int MATCH_CHAT_REPORT = 225; //聊天举报
	
	//251 - 300 7.13
	public static final int MATCH_MY_RECORD = 251; //我的战绩
	public static final int MATCH_SCHEDULE = 252; //赛程
	public static final int MATCH_CHECK_MY_SCRETE = 253; //验证我的秘钥
	
	//300 - 350 冲榜赛 8.08
	public static final int MATCH_TOP_RANK = 300; //冲榜赛排行榜
	public static final int MATCH_TOP_REWARD = 301; //冲榜赛奖励榜
	public static final int MATCH_TOP_LIST = 302; //冲榜赛列表
	public static final int MATCH_TOP_RECORD = 303; //冲榜赛跑马灯战绩
	public static final int MATCH_TOP_RANK_CHANGE = 304; //冲榜赛排行改变记录
	public static final int MATCH_TOP_MY_REWARD = 305; //我的冲榜赛奖励
	public static final int MATCH_TOP_ROUND_RECORD = 306; //冲榜赛对局记录
	public static final int MATCH_TOP_NEXT_HONOR = 307; //冲榜赛下个荣誉
	public static final int MATCH_TOP_RESET = 308; //冲榜赛日榜清零
	
	//快速赛
	public static final int MATCH_QUICK_ROOM_INFO = 330; //快速赛配桌成功
	
	//400 - 500 比赛系统功能
	public static final int MATCH_IDENTITY_ENABLE = 400; //比赛场身份激活
	public static final int MATCH_IDENTITY_CONTENT = 401; //比赛场身份内容
	
	public static final int S2C_MATCH_CONFIG = 1;
	public static final int S2C_MATCH_APPLY_SUCCESS = 2;
	public static final int S2C_MATCH_CANCEL_APPLY_SUCCESS = 3;
	public static final int S2C_MATCH_LIST_BY_APP_ID = 4; // 获取某个游戏的比赛数据
	public static final int S2C_MATCH_LOGIN = 5; //玩家登录下发比赛数据
	public static final int S2C_MATCH_DATA_CHANGE = 6; // 更新玩家免费数据
	public static final int S2C_MATCH_START = 7;// 游戏开始了.等待分配房间
	public static final int S2C_MATCH_INFO = 8; // 比赛当前信息
	public static final int S2C_MATCH_FAIL = 9; // 比赛开局失败
	public static final int S2C_MATCH_OVER = 10; //比赛结束
	public static final int S2C_MATCH_ROUND = 11; // 小局结束
	public static final int S2C_MATCH_OUT = 12; // 你已经被淘汰
	public static final int S2C_MATCH_CHANGE = 13; // 更新比赛数据
	public static final int S2C_MATCH_ENTER = 14; // 进入房间返回
	public static final int S2C_MATCH_UNION_CONFIG = 15; // 联赛配置
	public static final int S2C_MATCH_BASE_START = 16; // 每大局开始
	public static final int S2C_MATCH_SCORE_CHANGE = 17; // 比赛进度变更 分数转换
	public static final int S2C_MATCH_RESET_CONNECT = 18; //比赛断线重连
	public static final int S2C_MATCH_ROUND_STATR = 19; //比赛每小局开始
	public static final int S2C_MATCH_LEAVE = 20; // 离开
	public static final int S2C_MATCH_UNREGISTER = 21; // 取消注册
	public static final int S2C_MATCH_CONFIG_RESET = 22; // 比赛配置后台重新加载了，需要清除缓存
	public static final int S2C_MATCH_OEVER_DATA = 23; // 比赛已经结束获取排名
	public static final int S2C_MATCH_AUTH = 24; //比赛认证
	public static final int S2C_MATCH_AUTH_UPDATE = 25; //比赛认证修改
	public static final int S2C_SEND_MATCH_AUTH = 26; //获取认证数据
	public static final int S2C_MATCH_RESERVE_ENTER = 28; //预约返回
	public static final int S2C_MATCH_UNION_DETAIL_CONFIG = 29; // 联赛详细配置
	public static final int S2C_MATCH_DETAIL_CONFIG = 30; // 比赛详细配置
	public static final int S2C_MATCH_ADDTION = 31; // 附加赛
	public static final int S2C_MATCH_LOG = 32; // 比赛冠军日志
}
