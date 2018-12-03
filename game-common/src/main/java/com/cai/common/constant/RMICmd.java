/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant;

/**
 * 
 *
 * @author wu_hc date: 2017年10月17日 下午3:53:32 <br/>
 */
public interface RMICmd {

	int HELLO = 0;

	// 删除房间
	int DEL_ROOM = 1;

	int CLUB_LIST = 2;

	int CLUB_SET = 3;

	int ITEM = 4;

	int CLUB_TO＿GROUP = 5;

	int GROUP_TO_CLUB = 6;

	// int GROUP_TICK_OUT = 6;//微信踢人同步到俱乐部
	//
	// int CLUB_TICK_OUT = 7;//俱乐部踢人同步到微信

	// 手机绑定手机相关
	int ACCOUNT_PHONE = 8;

	// 手机验证码
	int PHONE_IDENTIFY_CODE = 9;

	// 切换微新
	int PHONE_SWITCH_WX = 10;

	// 发邮件
	int EMAIL = 11;
	int CERTIFICATION = 12;
	int PHONE_INFO = 13;

	int DICT_RELOAD = 14;// 加载字典

	int ACCOUNT_UNION_SWITCH = 15;// 用户unionId交换

	// 俱乐部专属豆
	int CLUB_EXCLUSIVE_COST = 16;

	// 查看俱乐部包间缓存数据
	int CLUB_RULE_CACHE_TABLE = 17;

	// 俱乐部专属豆返歀
	int CLUB_EXCLUSIVE_REPAY = 18;

	int CLUB_EXCLUSIVE_GOLD_INFO = 19;

	// 批量操作
	int CLUB_EXCLUSIVE_GOLD_SSHE_BATCH = 20;

	// 单次操作
	int CLUB_EXCLUSIVE_GOLD_SSHE = 21;

	int REPORT_PUSH_ID = 22;// 上报推送的唯一标识

	int UPDATE_MODEL = 23;// 更新数据model

	// 俱乐部专属豆有更新
	int CLUB_EXCLUSIVE_ACTIVITY_UPDATE = 24;

	// 俱乐部创始人房卡更新
	int ACCOUNT_WEALTH_UPDATE = 25;

	int ACCOUNT_WEALTH_INFO = 26;

	// 修改俱乐部id
	int UPDATE_CLUB_ID = 27;
	// 比赛玩家数据
	int MATCH_PLAYER_INFO = 28;
	// 用户收益一次提现操作
	int UPDATE_ACCOUNT_INCOME = 29;

	// 获取房间信息
	int REDIS_ROOM_INFO = 30;

	// 查询玩家是否在俱乐部
	int CLUB_AND_ACCOUNT = 31;
	// 生成俱乐部活动快照，活动结束了才可以生成
	int CLUB_ACTIVITY_SNAPSHOT_BUILD = 32;
	// 获取用户参数model
	int ACCOUNT_PARAM_HANDLER = 33;
	// 邀请红包处理
	int INVITE_REDPACKET_HANDLER = 34;
	// 俱乐部专属豆转
	int CLUB_EXCLUSIVE_TRANSFER = 35;
	// 添加玩家玩过的游戏列表
	int ACCOUNT_PLAY_GAME_LIST = 36;
	// 管理系统生成验证码
	int CUSTOMER_PRODUCT_CODE = 37;
	// 充值推广员返利相关操作
	int RECHARGE_RECEIVE = 38;

	// 单纯给后台红
	int CLUB_SSHE_MINI_LIST = 39;

	// 俱乐部公告
	int CLUB_BULLET = 40;

	// 手机绑定微信公众号
	int BIND_WX_OFFICAL = 41;

	// 获取绑定微信公众号信息
	int GET_WX_OFFICAL_MODEL = 42;

	// 生成使用红包订单号
	int GEN_USE_RED_PACKET_ORDER_ID = 43;

	// 俱乐部请求通知房间数据
	int CLUB_REQ_LOGIC_SYNC_ROOM = 44;

	// 账号是否绑定手机号码
	int IS_ACCOUNT_PHONE_BIND = 45;
	// 红包池处理
	int REDPACKET_POOL = 46;
	// 充值任务
	int RECHARGE_TASK = 47;

	// 删除俱乐部包间/用于中途下架玩法;
	int CLUB_DELETE_RULE = 48;
	// 删除redis房间
	int DEL_REDIS_ROOM = 49;
	// 推广员降级操作
	int DOWN_PROMOTER_LEVEL = 50;
	// 触发游戏跑马灯
	int SEND_GAME_NOTICE = 51;
	/** 查询俱乐部疲劳值信息 */
	int CLUB_TIRE_INFO_QUERY = 52;
	/** 俱乐部玩家数据(仅供俱乐部数据统计时使用) */
	int CLUB_LOG_PLAYER_INFO = 53;
	/** 指定的玩家中有多少加入了亲友圈 */
	int ACCOUNT_HAS_CLUB = 54;

	int ROOM_INFO_UPDATE = 55;

	/** 亲友圈自建赛创建房间 */
	int CLUB_MATCH_CREATE_ROOM = 56;

	/**
	 * 亲友圈自建赛黑名单/白名单
	 */
	int CLUB_MATCH_BLACKLIST = 57;
	/** 积分操作 */
	int BONUS_POINTS = 58;
	/** 发送短信rmi */
	int SEND_MSG = 59;
	// 获取所有的下级id
	int GET_ALL_SUB = 60;
	// 获取代理消耗统计(公众号使用)
	int WEIXIN_PROXY_CONSUME = 61;

	// 后台设置俱乐部转让
	int CLUB_TRANSFER = 62;
	// 单个比赛玩家数据
	int MATCH_PLAYER_INFO_ID = 63;

	// 玩家在客户端上传二维码
	int CLIENT_UPLOAD_ERWEIMA = 64;

	// 查询玩家在客户端上传二维码
	int FIND_PLAYER_CLIENT_UPLOAD_ERWEIMA = 65;

	// 后台通知重新加载玩家二维码
	int BACKGROUND_RELOAD_PLAYER_ERWEIMA = 66;

	// 玩家荣誉
	int ACCOUNT_HONOR = 67;

	/** 亲友圈区域保护游戏权限 */
	int CLUB_AREA_PROTECT = 68;

	// 加载钻石数量
	int SDK_LOAD_DIAMOND = 79;

	// 验证SDK Token是否有效
	int SDK_LOGIN_VERIFY = 80;

	// SDK钻石兑换，扣除钻石
	int SDK_DIAMOND_EXCHANGE = 81;

	int NEW_DICT_RELOAD = 82;// 通用加载字典
	int OPERATE_PROMOTER = 83;// 株洲麻将协会推荐人修改删除添加操作

	/** 俱乐部玩家数据 */
	int CLUB_PLAYER_INFO = 84;

	/** 更新玩家参与比赛时间 */
	int UPDATE_PLAYER_ATTEND_MATCH_TIME = 85;

	/** 生成使用话费卡订单号 */
	int GEN_USE_PHONE_CARD_ORDER_ID = 86;

	/** 使用话费卡回调 */
	int PHONE_CARD_USE_CALL_BACK = 87;

	/** 易接SDK接入 */
	int EJ_RMI_HANDLER = 88;

	/** 获取下线代理与代理身份 */
	int GET_SUB_PROXY = 89;
}
