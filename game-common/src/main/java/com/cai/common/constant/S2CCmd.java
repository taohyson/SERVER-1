/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant;

/**
 *
 *
 * @author wu_hc date: 2017年7月24日 下午5:27:50 <br/>
 */
public interface S2CCmd {

	int TEST_TEST = -2;
	int FAST_JOIN_ROOM = -1;
	int HEAR = 1; // 心跳
	int LOING = 2; // 登录(loginRequest)
	int REGISTER = 3; // 注册()
	int ROOM = 4; // 房间总返回(roomResponse)
	int MSG = 5; // 提示(MsgAllResponse)
	int PROPERTY = 6; // 通用属性值(accountPropertyListResponse)
	int GAME_NOTICE = 7; // 游戏公告(gameNoticeAllResponse)
	int MY_TEST = 8; // 我的压力测试(myTestResponse)
	int OTHER_SYS = 9; // 其它系统(otherSystemResponse)
	int Store = 10; // 商城(storeAllResponse)
	int GOLD_CARD = 11; // 房卡相关
	int MONEY_GAME = 12; // 金币场(MoneyGameResponse)
	int ACTIVITY = 13; // 精彩活动(ActivityResponse)
	int PROXY_ROOM = 14; // 代理开房间(proxyRoomAllResponse)
	int SUBAPP_UPDATE = 15; // 子游戏请求更新差异包返回 ( SubAppUpdateResponse )
	int SUBAPP_ITEM_UPDATE = 16; // 子游戏更新 （ UpdateSubAppItemResponse ）
	int RANK = 17; // 排行榜返回
	int PLAYER_VIEW = 18; // 查看玩家镜像
	int SY_PROPERTY = 19; // 系统参数信息返回(syPropertyResponse)
	int S2S = 20; // 服务器用
	int S2C = 21; // 客户端与服务器通信，拆包
	int CLUB = 22; // 俱乐部

	///////////////////////////////////////////////////////

	// 子游戏
	int APPITEM = 23;

	// 房间信息
	int ROOM_INFO = 24;

	// 子游戏有更新，需要同步给客户端
	int APPITEM_UPDATE = 25;

	// 消息确认
	int MESSAGE_RECEIVE = 26;

	// 获取游戏数据
	int GAME_RULE = 27;

	// 获取游戏数据
	int GAME_RULE_BY_GAME_ID = 28;

	// 获取红包雨排行榜数据
	int ACTIVITY_RED_PACK_RANK = 29;

	// 获取红包雨获得
	int ACTIVITY_RED_PACK_GET = 30;

	// 获取红包雨领取记录
	int ACTIVITY_RED_PACK_RECEIVE = 31;

	// 获取红包雨规则
	int ACTIVITY_RED_PACK_RULE = 32;

	// 获取分享链接
	int ACTIVITY_RED_PACK_SHARE = 33;

	// 发送红包雨
	int RESPONSE_SEND_RED_PACK = 34;

	// 获取代理的appId
	int PROXY_ROOM_APP_LIST = 35;

	// 请求服务器时间返回
	int SERVER_TIME = 36;

	// 背包
	int ITEM = 37;

	// 邮件推送
	int SEND_EMAIL = 38;
	// 邮件列表回调
	int EMAILTABLERESP = 39;

	// 邮件领取回调
	int EMAILRECEIVERESP = 40;

	// 查看红点
	int RED_HEART = 41;

	// 比赛场
	int MATCH = 42;
	//
	int APP_AUTO_INCR_VERSION = 43;
	/**
	 * oss上传图片获取临时认证
	 */
	int OSS_STS_AUTH = 44;

	// 俱乐部玩法对应的桌子信息
	int CLUB_RULE_TABLES = 45;

	int CLUB_TABLE_UPDATE = 46;

	// 俱乐部规则下的在桌人数
	int CLUB_RULE_TABLE_ON_SIT = 47;

	// 俱乐部事件
	int CLUB_EVENT_MSG_RSP = 48;

	// 俱乐部事件推送
	int CLUB_EVENT_MSG_NOTIFY = 49;

	// 规则修改
	int CLUB_RULE_UPDATE = 50;

	// 俱乐部红点
	int CLUB_RED_HEART = 51;

	// 请求推送
	int CLUB_APPLY_NOTIFY = 52;

	// 加入结果反馈
	int CLUB_JOIN_RESULT = 53;

	// 俱乐部聊天
	int CLUB_CHAT_NOTIFY = 54;

	// 在线成员
	int CLUB_ONLINE_MEMBER = 55;

	// 成员备注
	int CLUB_MEMBER_REMARK = 56;

	// 俱乐部公告推送
	int CLUB_NOTICE_NOTIFY = 57;

	// 俱乐部聊天记录
	int CLUB_CHAT_HISTORY = 58;

	// 俱乐部结算快照
	int CLUB_GAME_OVER_SNAPSHOT = 59;

	// 大赢家，轮数记录
	int CLUB_HONOUR_RECORD = 60;

	// 获取代理开房数量
	int PROXY_ROOM_COUNT = 61;

	// 同步微信群数据到俱乐部中
	int GROUP_TO_CLUB = 62;

	// 我的微信群列表
	int GROUP_REQ_LIST = 63;

	// 微信群成员列表
	int GROUP_MEMBER_LIST = 64;

	// 同步俱乐部数据到微信群中
	int CLUB_TO_GROUP = 65;

	// 新战绩
	int NEW_GAME_RECORDS = 66;

	// 俱乐部简单数据
	int CLUB_MINI_INFO = 67;

	// 玩法重置
	int GAME_RULE_RESET = 68;
	// 绑定微信群
	int BIND_GROUP = 69;
	// 解绑微信群
	int UNBIND_GROUP = 70;

	// 俱乐部绑定的微信群
	int CLUB_GROUP = 71;

	int PHONE_BIND_INFO = 72;

	// 战绩分布日期
	int RECORD_DISTRIBUTION = 73;

	// 俱乐部添加微信成员
	int GROUP_MEMBER_JOIN_CLUB = 74;

	// 手机绑定
	int PHONE_BIND = 75;

	// 手机解绑
	int PHONE_UN_BIND = 76;

	// 认证信息
	int CERTIFICATION_INFO = 77;

	// 切换微信
	int PHONE_SWITCH_WX = 78;

	// 比赛公告
	int NOTICE = 79;

	int CLUB_TODAY_RECORD = 80;

	// 俱乐部包间/玩法备注
	int CLUB_RULE_REMARK = 81;

	// 俱乐部专属豆
	int CLUB_EXCLUSIVE_GOLD_INFO = 82;

	// 俱乐部专属豆有更新
	int CLUB_EXCLUSIVE_ACTIVITY_UPDATE = 83;

	// 俱乐部拉黑
	int CLUB_DEFRIEND = 84;

	// 俱乐部管理员闲逸豆变化
	int CLUB_OWENER_GOLD_UPDATE = 85;

	// 只推给操作者
	int CLUB_MEMBER_JOIN = 86;

	// 点赞
	int CLUB_RECORD_UPVOTE = 87;

	// 身份切换推送
	int CLUB_IDENTITY_UPDATE = 88;

	// 俱乐部成员列表
	int CLUB_MEMBER_LIST = 89;

	// 桌子开始游戏
	int CLUB_GAME_START_NOTIFY = 90;

	// 俱乐部设置返回
	int CLUB_SETTINGS = 91;

	// 创建俱乐部活动
	int CLUB_CREATE_ACTIVITY = 92;

	// 俱乐部列表信息[一级，只有名称，id，时间]
	int CLUB_ACTIVITY_MINI_INFO = 93;

	// 俱乐部信息[二级，活动详情]
	int CLUB_ACTIVITY_INFO = 94;

	// 俱乐部活动排名
	int CLUB_ACTIVITY_RANK = 95;

	// 转盘抽奖
	int TURNTABLE = 96;

	// 俱乐部事件
	int CLUB_ACTIVITY_EVENT = 97;

	int MY_INVITE_REDPACKET = 98; // 我的红包

	int RANK_DATA = 99; // 排行榜数据

	int INVITE_RECORD = 100; // 邀请记录

	int INVITE_ACTIVITY = 101; // 红包活动，包括奖品展示、规则说明

	// 有活动？？
	int CLUB_HAS_ACTIVITY = 102;

	// 公共码
	int COMMON_CODE = 103;

	// 空桌子
	int CLUB_EMPTY_TABLE = 104;

	// 俱乐部成员头像信息
	int CLUB_MEMBER_AVATAR = 105;

	int APP_ITEM_MINI = 106;

	/** 闲逸豆兑换金币比例 */
	int XIAN_YI_DOU_EXCHANGE_COIN_RATE = 107;

	/** 闲逸豆兑换金币 */
	int XIAN_YI_DOU_EXCHANGE_COIN = 108;

	/** 金币场充值(充值直接兑换金币)结果返回 */
	int RECHARGE_FOR_COIN = 109;

	/** 实物兑换结果返回 */
	int ITEM_EXCHANGE_RESP = 110;

	/** 福卡兑换结果返回 */
	int WELFARE_EXCHANGE_RESP = 111;

	/** 实物使用结果返回 */
	int REAL_ITEM_USE_RESULT = 112;

	/** 邮件删除结果返回 */
	int DEL_EMAIL_LIST_RESP = 113;

	/** 语音聊天返回 */
	int VOICE_CHAT_RSP = 114;

	/** 大厅指引返回 */
	int HALL_GUIDE_RSP = 115;
	/** 获取游戏印章、背景、标题资源 */
	int GET_APP_RESOURCE = 116;
	/** 玩家上传二维码结果返回 */
	int CLIENT_PLAYER_UPLOAD_ERWEIMA_RESPONSE = 117;
	/** 玩家是否能上传及上传的身份 */
	int UPLOAD_ROLE_AND_TYPE_RESPONSE = 118;
	/** 指定玩家二维码图片返回 */
	int PLAYER_ERWEIMA_RESPONSE = 119;
	/** 大厅主界面背景资源返回 */
	int HALL_MAIN_VIEW_BACKRSP = 120;

	// 加载大厅SDK 第三方 APP 返回
	int LOAD_SDK_APP_RESPONSE = 121;

	/** 钻石更新 */
	int DIAMOND_UPDATE = 122;

	/** 加载大厅SDK 第三方 APP推荐位 */
	int LOAD_SDK_APP_RECOMMEND_RESPONSE = 123;

	/** 玩家开关状态返回*/
	int PLAYER_SWITCH_STATUS_RSP = 124;

	// ------------ 俱乐部预留
	// 俱乐部每日消耗
	int CLUB_DAILY_COST = 500;

	// 俱乐部申请加入信息
	int CLUB_APPLY_JOIN_MSG = 501;

	// 俱乐部邀请进入桌子
	int CLUB_INVITE_JOIN_TABLE = 502;

	int CLUB_BULLETIN_INFO = 503;

	int CLUB_BULLETIN_EVENT = 504;

	// 包间在线人数
	int CLUB_RULE_OL_MEMBERS = 505;

	/** 修改俱乐部玩家记录返回 */
	int MODIFY_CLUB_MEMBER_RECORD_RSP = 506;

	/** 俱乐部玩家记录返回 */
	int CLUB_MEMBER_RECORD_LIST_RSP = 507;

	/** 俱乐部修改疲劳值消息返回 */
	int CLUB_MODIFY_TIRE_MSG = 508;

	/** 俱乐部申请退出信息 */
	int CLUB_APPLY_QUIT_MSG_RSP = 509;

	/** 俱乐部申请退出拒绝 */
	int CLUB_QUIT_APPLY_REJECT_RSP = 510;

	/** 亲友圈桌子需要输入密码 */
	int CLUB_TABLE_NEED_PASSPORT_RSP = 511;

	/** 亲友圈禁止同桌玩家列表返回 */
	int CLUB_BAN_PLAYER_LIST_RSP = 512;

	/** 俱乐部聊天唯一Id返回 */
	int CLUB_CHAT_UNIQUE_ID_RSP = 513;

	/** 俱乐部设置桌子密码返回 */
	int CLUB_SET_TABLE_PASSPORT_RSP = 514;

	/** 俱乐部玩家疲劳值批量修改 */
	int CLUB_MEMBER_RECORD_BATCH_MODIFY_RSP = 515;

	/** 俱乐部玩家限制局数数据返回 */
	int CLUB_PLAYER_LIMIT_ROUND_RSP = 516;

	/** 俱乐部玩家剩余限制局数返回 */
	int CLUB_PLAYER_LEFT_LIMIT_ROUND_RSP = 517;

	/** 俱乐部后台开关状态返回 */
	int CLUB_BAN_SWITCH_RSP = 518;

	/** 亲友圈比赛列表数据返回 */
	int CLUB_MATCH_DATA_RSP = 519;

	/** 亲友圈自建赛事件 */
	int CLUB_MATCH_EVENT = 520;

	/** 创建or删除亲友圈自建赛结果返回 */
	int CLUB_CREATE_OR_DEL_MATCH_RESULT_RSP = 521;
	/** 参加or退出亲友圈比赛结果返回 */
	int CLUB_MATCH_ENROLL_OR_EXIT_RESULT_RSP = 522;
	/** 管理员设置比赛参赛人员列表 */
	int CLUB_SET_ATTEND_MEM_LIST_RSP = 523;
	/** 管理员设置比赛参赛人员结果返回 */
	int CLUB_SET_ATTEND_MEM_RESULT_RSP = 524;
	/** 亲友圈自建赛牌桌数据返回 */
	int CLUB_MATCH_TABLE_INFO_RSP = 525;
	/** 亲友圈将开赛自建赛列表返回 */
	int CLUB_MATCH_WILL_START_RSP = 526;
	/** 亲友圈自建赛排行数据返回 */
	int CLUB_MATCH_RANK_DATA_RSP = 527;
	/** 亲友圈自建赛记录数据返回 */
	int CLUB_MATCH_RECORD_DATA_RSP = 528;
	/** 亲友圈自建赛结束通知 */
	int CLUB_MATCH_GAME_END_NOTIFY = 529;

	/** 亲友圈包间记录返回 */
	int CLUB_RULE_RECORD_RSP = 530;

	/** 玩家正在进行中的亲友圈自建赛 */
	int PLAYER_ONGOING_CLUB_MATCH = 531;

	/** 亲友圈桌子房间内解散请求 */
	int CLUB_TABLE_DISBAND_IN_ROOM_RSP = 532;
	/** 玩家进入亲友圈自建赛房间返回 */
	int PLAYER_ENTER_CLUB_MATCH_ROOM_RSP = 533;

	/** 身份切换推送(批量) */
	int CLUB_IDENTITY_UPDATE_BATCH = 534;

	/** 亲友圈合伙人邀请 */
	int CLUB_INVITE_PARTNER = 535;
	/** 接受亲友圈合伙人邀请 */
	int CLUB_PARTNER_ACCEPT_INVITE = 536;
	/** 亲友圈合伙人解除 */
	int CLUB_PARTNER_DEL = 537;
	/** 接受亲友圈合伙人解除 */
	int CLUB_PARTNER_ACCEPT_DEL = 538;
	/** 亲友圈设置合伙人子成员返回 */
	int CLUB_ADD_PARTNER_CHILD_RSP = 539;
	/** 亲友圈移除合伙人子成员返回 */
	int CLUB_REMOVE_PARTNER_CHILD_RSP = 540;
	/** 亲友圈合伙人邀请玩家加入 */
	int CLUB_PARTNER_INVITE_JOIN = 541;
	/** 接受亲友圈合伙人的加入邀请 */
	int AGREE_CLUB_PARTNER_INVITE_JOIN_RSP = 542;

	/** 自建赛关闭报名入口 */
	int CLUB_MATCH_BAN_ENROLL_RSP = 543;
	/** 自建赛管理员取消玩家报名 */
	int CLUB_MATCH_CANCEL_ENROLL = 544;
	/** 自建赛管理员取消玩家报名结果返回 */
	int CLUB_MATCH_CANCEL_ENROLL_RESULT_RSP = 545;
	/** 亲友圈牌桌牌局id返回 */
	int CLUB_TABLE_BRAND_ID_RSP = 546;
	/** 亲友圈所有包间数据返回 */
	int CLUB_RULE_TABLE_DATA_RSP = 547;

	/** 自建赛桌子信息返回 */
	int CLUB_MATCH_TABLES_INFO_RSP = 548;
	/** 自建赛管理员解散桌子返回 */
	int CLUB_MATCH_DISBAND_TABLE_RSP = 549;
	/** 亲友圈事件 */
	int CLUB_EVENT_RSP = 550;

	/** 亲友圈福卡数据返回 */
	int CLUB_WELFARE_INFO_RSP = 551;
	/** 亲友圈福卡领取返回 */
	int CLUB_WELFARE_GET_RSP = 552;
	/** 亲友圈修改玩家福卡返回 */
	int CLUB_MODIFY_MEMBER_WELFARE_RSP = 553;
	/** 亲友圈福卡抽奖返回 */
	int CLUB_WELFARE_LOTTERY_RSP = 554;
	/** 亲友圈福卡抽奖记录返回 */
	int CLUB_WELFARE_LOTTERY_MSG_RSP = 555;
	/** 亲友圈福卡抽奖通知 */
	int CLUB_WELFARE_LOTTERY_NOTIFY = 556;
	/** 玩家亲友圈福卡变动记录返回 */
	int CLUB_MEMBER_WELFARE_CHANGE_MSG_RSP = 557;

	/** 亲友圈区域保护游戏权限返回 */
	int CLUB_AREA_PROTECT_RET_RSP = 558;

	/** 亲友圈玩家信息返回 */
	int CLUB_MEMBER_INFO_RSP = 559;
	/** 亲友圈创建人是否是代理返回 */
	int CLUB_OWNER_IS_AGENT_RSP = 560;
	/** 亲友圈添加成员通知 */
	int CLUB_ADD_MEMBER_NOTIFY = 561;

	/** 亲友圈合伙人邀请成员加入结果返回 */
	int CLUB_PARTNER_INVITE_JOIN_RSP = 562;

	// 活动 1001-1999
	int LOAD_FOUNDATION_ACTIVITY = 1001; // 拉取活动
	int TAKE_FOUNDATION_MISSION_REWARD = 1002; // 领取活动奖励
	int MISSION_FINISH_NOTIFY = 1003; // 活动完成通知，由服务端主动通知
	int ACTIVITY_RECORD = 1004;// 拉取活动领取记录
	int ACTIVITY_REWARD_DETAIL = 1005;// 拉取活动奖品详情
	int REDPACKET_POOL_ACTIVITY = 1006;// 查看红包池详情，提取红包池金额
	int REDPACKET_POOL_EXCHANGE = 1007;// 查看红包商品，红包兑换闲逸豆
	int MANUAL_START_ACTIVITY = 1020;// 手动开启活动
	int TAKE_MISSION_GROUP_REWARD = 1008; // 领取任务组奖励

	int LOAD_NEW_USER_ACTIVITY = 1009;// 新手豪礼活动返回
	int TAKE_NEW_USER_ACITIVITY_REWARD = 1010; // 新手豪礼活动领取结果返回

	int LOAD_INVITE_FRIENDS_ACTIVITY = 1011;// 新手豪礼活动返回
	int TAKE_INVITE_FRIENDS_REWARD = 1012; // 新手豪礼活动领取结果返回
	int INVITE_FRIENDS_NOTIFY = 1013; // 新手豪礼活动进度通知
	int QUOTA_OF_PERSION = 1014; // 活动邀请好友人数限制是否已满
	int MY_HONOR_RECORD = 1015; // 个人荣誉记录
	int MY_HONOR_ID_RECORD = 1016; // 个人某个荣誉记录
	int TAKE_LIVENESS_REWARD = 1017;// 领取活跃度奖励返回
	int NOTIFY_LIVENESS_STATE = 1018;// 推送活跃度跟宝箱状态
	// 金币场 2000 - 3000
	int COIN_CORNUCOPIA_RANK = 2018;
	int COIN_CORNUCOPIA_CFG = 2019; // 聚宝盆奖池分配配置
	int COIN_CORNUCOPIA_REMAINDER = 2020; // 聚宝盆奖池
	int COIN_GAME_MINI_CFG = 2021; // MINI
	int COIN_GAME_BOX_CFG = 2022; // 金币场宝箱配置
	int COIN_GAME_OPEN_BOX = 2023; // 开宝箱
	int COIN_BOX_ACCOUNT_INFO = 2024; // 宝箱个人信息
}
