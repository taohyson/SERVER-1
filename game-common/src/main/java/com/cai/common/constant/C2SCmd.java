/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant;

/**
 * 客户端在服务端通信的协议号 <br>
 *
 * @author wu_hc date: 2017年7月24日 下午5:27:50 <br/>
 */
public interface C2SCmd {

	int TEST_TEST = -2;

	int FAST_JOIN_ROOM = -1;

	int HEAR = 1;

	// 登录(loginRequest)
	int LOING = 2;

	// 注册
	int REGISTER = 3;

	// 逻辑到转发的总请求(response)
	int PROXY = 4;

	// 房间请求(roomRequest)
	int ROOM = 5;

	// 逻辑服房间请求
	int LOGIC_ROOM = 6;

	// 我的压力测试(myTestRequest)
	int MY_TEST = 7;

	// 其它系统功能(otherSystemRequest)
	int OTHER_SYS = 8;

	// 商城(storeRequest)
	int STORE = 9;

	// 房卡相关(goldCardRequest)
	int GOLD_CARD = 10;

	// 金币场(MoneyGameRequest)
	int MONEY_GAME = 11;

	// 精彩活动(ActivityRequest)
	int ACTIVITY = 12;

	// 子游戏更新请求 ( SubAppUpdateRequest )
	int SUBAPP_UPDATE = 13;

	// 排行榜(RankRequest)
	int RANK = 14;

	// 签名设置(SignatureRequest)
	int SIGNATURE = 15;

	// 查看其他玩家信息
	int PLAYER_VIEW = 16;

	// 通用属性值请求(AccountPropertyRequest)
	int PROPERTY = 17;

	// 服务器用
	int S2S = 18;

	// 俱乐部
	int CLUB = 19;

	// 客户端与服务器通信，拆包
	int C2S = 20;
	///////////////////////////////////////////////////////

	// 拓展协议：>>>>>>>>> ↓↓↓↓↓ 需要在 C2SPBRegister 注册映射关系 ↓↓↓↓↓↓ <<<<<<<<<<<

	// 子游戏
	int APPITEM = 21;

	// 请求房间信息
	int ROOM_INFO = 22;

	// 读取玩法配置（根据appId）
	int GAME_RULE = 23;
	// 读取玩法配置（根据gameId）
	int GAME_RULE_BY_GAME_ID = 24;

	// 活动------红包雨
	int ACTIVITY_RED_PACK = 25;
	// 活动------转盘
	int ACTIVITY_TURNTABLE = 26;

	int GAME_RULE_APP_LIST = 27;

	// 请求服务器时间
	int SERVER_TIME = 28;

	// 背包
	int ITEM = 29;

	// 邮件
	int EMAIL = 30;

	// 查看红点

	int RED_HEART = 31;

	// 比赛场
	int MATCH = 32;

	/**
	 * 请求当前自增长app列表版本号
	 */
	int APP_AUTO_INCR_VERSION = 33;
	/**
	 * oss上传图片获取临时认证
	 */
	int OSS_STS_AUTH = 34;

	int SECNE_REQ = 35;

	/**
	 * 获取代理开房数量
	 */
	int PROXY_ROOM_COUNT_REQ = 36;

	// 新战绩
	int NEW_GAME_RECORDS = 37;

	// 俱乐部简单数据
	int CLUB_MINI_INFO = 38;

	// 手机登陆
	int PHONE_LOGIN_REQ = 39;

	// 手机绑定
	int PHONE_BIND = 40;

	// 手机解绑
	int PHONE_UN_BIND = 41;

	// 获取手机验证码
	int PHONE_IDENTIFY_CODE = 42;

	// 请求帐号的绑定情况
	int PHONE_BIND_STATUS = 43;

	// 战绩分布日期
	int RECORD_DISTRIBUTION = 44;

	// 切换微信
	int PHONE_SWITCH_WX = 45;

	// 实名认证
	int CERTIFICATION = 46;

	// 俱乐部专属豆
	int CLUB_EXCLUSIVE_GOLD_INFO = 47;

	// 推送上报
	int PUSH_REPROT = 48;

	// 战绩点赞
	int CLUB_RECORD_UPVOTE = 49;

	// 客户端登陆完成
	int CLIENT_LOGIN_FINISH = 50;

	// 请求俱乐部设置信息
	int CLUB_SETTINGS_INFO = 51;

	// 非法信息举报
	int ILLEGAL_REPORT = 52;

	// 创建俱乐部活动
	int CLUB_CREATE_ACTIVITY = 53;

	// 取消俱乐部活动
	int CLUB_DEL_ACTIVITY = 54;

	// 俱乐部信息[二级，活动详情]
	int CLUB_ACTIVITY_INFO = 55;

	// 俱乐部活动排名
	int CLUB_ACTIVITY_RANK_SNAPSHOT = 56;

	// 俱乐部列表信息[一级，只有名称，id，时间]
	int CLUB_ACTIVITY_MINI_INFO = 57;

	// 转盘抽奖
	int TURNTABLE = 58;
	// 邀请红包活动
	int INVITE_REDPACKET_ACTIVITY = 59;

	// 有活动？？
	int CLUB_HAS_ACTIVITY = 60;
	// 客户端城市上报
	int CITY_REPORT = 61;

	// 俱乐部转让
	int CLUB_ASSIGNMENT = 62;

	// 俱乐部成员头像信息
	int CLUB_MEMBER_AVATAR = 63;

	// appitem 头像，下载地址
	int APPITEM_MINI = 64;

	/** 闲逸豆兑换金币比例 */
	int XIAN_YI_DOU_EXCHANGE_COIN_RATE = 65;

	/** 闲逸豆兑换金币 */
	int XIAN_YI_DOU_EXCHANGE_COIN = 66;

	// 语音状态
	int VOICE_STATUS = 67;

	/** 获取语音聊天 */
	int GET_VOICE_CHAT = 68;

	/** 获取大厅指引 */
	int GET_HALL_GUIDE = 69;

	/** 获取游戏印章、背景、标题资源 */
	int GET_APP_RESOURCE = 70;

	/** 玩家在客户端上传二维码 */
	int CLIENT_PLAYER_UPLOAD_ERWEIMA_REQUEST = 71;

	/** 获取大厅主界面背景资源 */
	int GET_HALL_MAIN_VIEW_BACK = 72;

	// 加载大厅SDK 第三方 APP
	int LOAD_SDK_APP_LIST = 73;

	// 加载SDK APP推荐位
	int LOAD_SDK_APP_RECOMMEND = 74;

	// 易接登录
	int E_J_SDK_LOGIN = 75;

	// 补充注册信息
	int SUPPLEMENT_USER_INFO = 76;

	// 易接平台转码登录
	int E_J_CACHE_LOGIN = 77;

	/** 玩家开关状态请求*/
	int PLAYER_SWITCH_STATUS_REQ = 78;

	/** 玩家开关状态设置*/
	int PLAYER_SWITCH_SET = 79;

	// ------------ 俱乐部预留
	// 俱乐部每日消耗
	int CLUB_DAILY_COST = 500;

	// 俱乐部申请加入信息
	int CLUB_APPLY_JOIN_MSG = 501;

	// 俱乐部邀请进入桌子
	int CLUB_INVITE_JOIN_TABLE = 502;

	// 拒绝被邀请
	int CLUB_INGORE_INVITE = 503;

	// 创建公告
	int CLUB_SET_BULLETIN = 504;

	// 俱乐部活动消息
	int CLUB_BULLETIN_INFO = 505;

	// 玩家所属俱乐部界面标记
	int CLUB_SCENE_TAG = 506;

	// 包间在线人数
	int CLUB_RULE_OL_MEMBERS = 507;

	/** 修改俱乐部玩家记录 */
	int MODIFY_CLUB_MEMBER_RECORD = 508;

	/** 俱乐部玩家记录请求 */
	int CLUB_MEMBER_RECORD_LIST_REQUEST = 509;

	/** 俱乐部修改疲劳值消息请求 */
	int CLUB_MODIFY_TIRE_MSG_REQUEST = 510;

	/** 俱乐部申请退出信息 */
	int CLUB_APPLY_QUIT_MSG_REQUEST = 511;

	/** 俱乐部申请退出拒绝 */
	int CLUB_QUIT_APPLY_REJECT = 512;

	/** 亲友圈桌子设置密码 */
	int CLUB_TABLE_SET_PASSPORT = 513;

	/** 亲友圈禁止同桌 */
	int CLUB_BAN_PLAYER_SET = 514;

	/** 玩家禁止同桌的玩家列表 */
	int CLUB_BAN_PLAYER_LIST_REQ = 515;

	/** 获取俱乐部聊天唯一Id */
	int CLUB_CHAT_GET_UNIQUE_ID_REQ = 516;

	/** 设置俱乐部玩家限制局数 */
	int CLUB_SET_PLAYER_ROUND_LIMIT = 517;

	/** 俱乐部玩家限制局数数据请求 */
	int CLUB_PLAYER_LIMIT_ROUND_REQ = 518;

	/** 俱乐部玩家剩余限制局数请求 */
	int CLUB_PLAYER_LEFT_ROUND_REQ = 519;

	/** 请求俱乐部后台开关状态 */
	int CLUB_BAN_SWITCH_REQ = 520;

	/** 创建or删除亲友圈比赛 */
	int CLUB_CREATE_OR_DEL_MATCH = 521;
	/** 参加or退出亲友圈比赛 */
	int CLUB_MATCH_ENROLL_OR_EXIT = 522;
	/** 请求亲友圈比赛列表 */
	int CLUB_MATCH_DATA_REQ = 523;
	/** 管理员设置比赛参赛人员 */
	int CLUB_MATCH_MANAGER_SET_ATTEND = 524;
	/** 管理员设置比赛参赛人员数据请求 */
	int CLUB_MATCH_SET_ATTEND_LIST_REQ = 525;
	/** 亲友圈自建赛牌桌信息请求 */
	int CLUB_MATCH_TABLE_INFO_REQ = 526;

	/** 清除俱乐部玩家限制局数设置 */
	int CLUB_CLEAR_PLAYER_ROUND_LIMIT = 527;

	/** 亲友圈处于开赛通知阶段的比赛请求 */
	int CLUB_MATCH_WILL_START_REQ = 528;
	/** 亲友圈自建赛排行数据请求 */
	int CLUB_MATCH_RANK_REQ = 529;
	/** 亲友圈自建赛比赛记录请求 */
	int CLUB_MATCH_RECORD_REQ = 530;

	/** 亲友圈包间记录请求 */
	int CLUB_RULE_RECORD_REQ = 531;

	/** 亲友圈桌子房间内解散请求 */
	int CLUB_TABLE_DISBAND_IN_ROOM_REQ = 532;

	/** 玩家进入亲友圈自建赛房间请求 */
	int PLAYER_ENTER_CLUB_MATCH_ROOM_REQ = 533;
	/** 同步亲友圈黑名单 */
	int CLUB_DEFRIEND_SYNC_REQ = 534;

	/** 亲友圈添加合伙人 */
	int CLUB_ADD_PARTNER_REQ = 535;
	/** 亲友圈同意合伙人邀请 */
	int CLUB_AGREE_ADD_PARTNER = 536;
	/** 亲友圈解除合伙人关系 */
	int CLUB_DEL_PARTNER_REQ = 537;
	/** 亲友圈同意解除合伙人关系 */
	int CLUB_AGREE_DEL_PARTNER = 538;
	/** 亲友圈添加合伙人子成员 */
	int CLUB_ADD_PARTNER_CHILD_REQ = 539;
	/** 亲友圈移除合伙人子成员 */
	int CLUB_REMOVE_PARTNER_CHILD_REQ = 540;
	/** 亲友圈合伙人邀请成员加入 */
	int CLUB_PARTNER_INVITE_JOIN_CLUB_REQ = 541;
	/** 接受亲友圈合伙人的加入邀请 */
	int AGREE_CLUB_PARTNER_INVITE_JOIN = 542;

	/** 自建赛关闭报名入口 */
	int CLUB_MATCH_BAN_ENROLL_REQ = 543;
	/** 自建赛管理员取消玩家报名 */
	int CLUB_MATCH_MANAGER_CANCEL_ENROLL_REQ = 544;
	/** 自建赛立即开赛 */
	int CLUB_MATCH_START_IMMEDIATE_REQ = 545;
	/** 亲友圈牌桌牌局id请求 */
	int CLUB_TABLE_BRAND_ID_REQ = 546;
	/** 亲友圈所有包间数据请求 */
	int CLUB_RULE_TABLE_DATA_REQ = 547;

	/** 自建赛桌子信息请求 */
	int CLUB_MATCH_TABLES_INFO_REQ = 548;
	/** 自建赛管理员解散桌子 */
	int CLUB_MATCH_DISBAND_TABLE_REQ = 549;

	/** 玩家亲友圈福卡请求 */
	int CLUB_MEMBER_WELFARE_REQ = 550;
	/** 亲友圈福卡领取请求 */
	int CLUB_WELFARE_GET_REQ = 551;
	/** 亲友圈福卡抽奖记录请求 */
	int CLUB_WELFARE_LOTTERY_MSG_REQ = 552;
	/** 玩家亲友圈福卡变动记录请求 */
	int CLUB_MEMBER_WELFARE_CHANGE_MSG_REQ = 553;
	/** 亲友圈修改玩家福卡请求 */
	int CLUB_MODIFY_MEMBER_WELFARE_REQ = 554;
	/** 亲友圈福卡抽奖请求 */
	int CLUB_WELFARE_LOTTERY_REQ = 555;

	/** 亲友圈区域保护游戏权限申请 */
	int CLUB_AREA_PROTECT_PERMISSION_APPLY_REQ = 556;

	/** 亲友圈玩家信息请求 */
	int CLUB_MEMBER_INFO_REQ = 557;
	/** 亲友圈创建人是否是代理 */
	int CLUB_OWNER_IS_AGENT_REQ = 558;


	// 通用协议 1000 - 2000
	int GAME_SETTLEMENT = 1000; // 游戏结算消息

	// 金币场 2000 - 3000
	int COIN_GAME_TYPE_LIST = 2000; // 金币游戏类型列表
	int COIN_GAME_LIST = 2001; // 金币游戏列表
	int COIN_GAME_DETAIL = 2002; // 金币游戏详情列表
	int COIN_GAME_MATCH = 2003; // 金币游戏请求匹配
	int COIN_RELIEF_REWARD = 2004; // 金币场救济金奖励
	int COIN_RELIEF_RECEIVE = 2005; // 金币场救济金领取
	int COIN_GAME_MATCH_SUC = 2006; // 金币场匹配成功,等待开始
	int COIN_GAME_OVER = 2007; // 金币场游戏结束
	int COIN_GAME_ENTER = 2008; // 进入金币场房间
	int COIN_GAME_EXIT = 2009; // 离开金币场房间
	int COIN_GAME_FAIL = 2010; // 金币场房间游戏结束
	int COIN_GAME_CONNECT = 2011; // 金币场房间重连
	int COIN_CONFIG_REFRESH = 2012; // 金币场匹配刷新
	int COIN_ONE_GAME_DETAIL = 2013; // 金币游戏详情
	int COIN_GAME_DESC = 2014; // 金币游戏详情
	int COIN_MSG_STAT = 2015; // 金币场基础信息统计
	int COIN_PAY_MSG_STAT = 2016; // 金币场充值信息统计
	int COIN_GAME_RULE = 2017; // 金币场游戏规则
	int COIN_CORNUCOPIA_RANK = 2018; // 金币场聚宝盆排行榜
	int COIN_CORNUCOPIA_CFG = 2019; // 聚宝盆奖池分配配置
	int COIN_CORNUCOPIA_REMAINDER = 2020; // 聚宝盆奖池
	int COIN_GAME_MINI_CFG = 2021; // MINI
	int COIN_GAME_BOX_CFG = 2022; // 金币场宝箱配置
	int COIN_GAME_OPEN_BOX = 2023; // 开宝箱
	int COIN_BOX_ACCOUNT_INFO = 2024; // 宝箱个人信息

	/******** 涉及到和游戏基础服交互 **********/
	// 活动 3001-3999
	int LOAD_FOUNDATION_ACTIVITY = 3001; // 拉取活动
	int TAKE_FOUNDATION_MISSION_REWARD = 3002; // 领取活动奖励
	int ACTIVITY_RECORD = 3003;// 拉取活动领取记录
	int ACTIVITY_REWARD_DETAIL = 3004;// 拉取活动奖品详情
	int REDPACKET_POOL_ACTIVITY = 3005;// 查看红包池详情，提取红包池金额
	int REDPACKET_POOL_EXCHANGE = 3006;// 查看红包商品，红包兑换闲逸豆
	int ACTIVITY_MANUAL_START = 3020; // 任务手动开启
	int TAKE_MISSION_GROUP_REWARD = 3007; // 领取任务组奖励

	int LOAD_NEW_USER_ACTIVITY = 3008;// 拉取新手豪礼活动
	int TAKE_NEW_USER_REWARD = 3009;// 领取新手豪礼活动奖励

	int LOAD_INVITE_FRIENDS_ACTIVITY = 3010;// 拉取邀请好友活动
	int TAKE_INVITE_FRIENDS_REWARD = 3011;// 领取邀请好友奖励
	int QUOTA_OF_PERSION = 3012;// 活动邀请好友人数限制是否已满
	int MY_HONOR_RECORD = 3013;// 个人荣誉记录
	int MY_HONOR_ID_RECORD = 3014;// 个人某个荣誉记录
	int TAKE_LIVENESS_REWARD = 3015; // 领取活跃度奖励

}
