/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.constant;

/**
 * 服务器交互协议号
 *
 * @author wu_hc date: 2017年7月24日 下午4:55:32 <br/>
 */
public interface S2SCmd {

	int TEST_CMD = -1;

	// 服务器登陆请求
	int S2S_LOGIN_REQ = 1;

	// 服务器登陆回复
	int S2S_LOGIN_RSP = 2;

	// 服务器间发起Ping
	int PING = 3;

	// 服务器间回复Pong
	int PONG = 4;

	// 俱乐部
	int CLUB_REQ = 5;

	// 俱乐部牌桌记录
	int CLUB_GAME_RECORD_REQ = 6;

	// 俱乐部返回
	int CLUB_REP = 7;

	// 直接发送到客户端
	int SEND_TO_CLIENT_RSP = 8;

	int CREATE_CLUB_ROOM_RSP = 9;

	int CREATE_ENTER_ROOM_RSP = 10;

	// 背包
	int ITEM = 11;

	// 邮件发送
	int EMAILSEND = 14;

	// 玩家状态
	int PLAYER_STATUS = 15;

	// 红点
	int RED_HEART = 16;

	// 比赛场服务器之间用
	int MATCH_SERVER = 17;

	// 数据批量发给客户端 每个人都不同数据包
	int SEND_TO_CLIENT_BATCH = 18;

	// 协议批量发送给客户端 同一个数据包
	int SEND_TO_CLENT_BATCH_SAME_PKG = 19;

	// 转发客户端请求道俱乐部服
	int C_2_CLUB = 20;

	int L_2_CLUB_ROOM_STATUS = 21;

	int C_2_LOGIC_ROOM_STATUS = 22;

	// 代理开放
	int PROXY_ROOM_STATUS = 23;

	// 逻辑服服通知X服扣豆成功,刷新豆豆
	int WEALTH_UPDATE = 24;

	// 俱乐部围观需求
	int CLUB_ROOM_OBSERVER = 25;

	// 代理房间数据变更
	int PROXY_ROOM_CHANGE = 26;

	// 通过网关服把协议转到玩家的代理服
	int S_G_S = 27;

	int MATCH_BROAD_LOAD = 28;// 加载比赛场公告

	// 俱乐部专属豆，更新 logic<->club
	int CLUB_EXCLUSIVE_UPDATE = 29;

	int MATCH_DICT_LOAD = 30;// 加载比赛场

	// 点赞
	int CLUB_RECORD_UPVOTE = 31;

	// 通过网关服把协议转到比赛服
	int S_2_M = 32;

	// 俱乐部解散，告诉比赛服发邮件
	int CLUB_DISBAND_TO_MACTH_SERVER = 33;

	// 转盘抽奖
	int TURNTABLE = 34;

	// 俱乐部活动结束，委托给代理服生成活动快照
	int CLUB_ACTIVITY_SNAPSHOT_BUILD = 35;

	// 每日分享
	int EVERYDAY_SHARE = 36;

	// 比赛次数
	int GAME_OVER = 37;

	// 俱乐部活动对应的排行
	int CLUB_ACTIVITY_RANK_RSP = 38;

	// 线程信息
	int THREAD_POOL_INFO = 39;

	// 财富更新
	int ACCOUNT_WEALTH_UPATE = 40;

	// 解散房间@see PlayerServiceImpl#delRoomId(int)
	int RM_ROOM_CACHE = 41;

	// 刷新俱乐部成员信息
	int CLUB_SYNC_MEMBER_INFO = 42;

	// 背包增加道具，往比赛服中传
	int ADD_ITEM_TO_MATCH = 43;

	/**
	 * 俱乐部玩家记录数据
	 */
	int CLUB_MEMBER_RECORD_INFO = 44;

	/**
	 * 亲友圈自建赛开赛失败发邮件
	 */
	int CLUB_MATCH_START_FAIL_TO_MATCH_SERVER = 45;

	/**
	 * 俱乐部包间记录数据
	 */
	int CLUB_RULE_RECORD_INFO = 46;

	/**
	 * 牌局结束通知
	 */
	int ROOM_GAME_OVER_NOTIFY = 47;

	/**
	 * 亲友圈合伙人邀请成员加入邮件
	 */
	int CLUB_PARTNER_INVITE_JOIN_MAIL_TO_MATCH = 48;

	/**
	 * 亲友圈福卡抽奖奖励发放
	 */
	int CLUB_WELFARE_LOTTERY_REWARD_TO_MATCH = 49;

	/**
	 * 加载配置通知
	 */
	int LOAD_ALL_CONFIG = 50;

	/**** 以下为游戏基础服协议 ****/
	// 加载所有活动
	int FOUNDATION_ACTIVITY_LOADING = 100;

	// 更新活动任务
	int FOUNDATION_ACTIVITYMISSION_UPDATE = 101;
	// 新活动机制交互
	int ACTIVITY_GLOBAL_OPERATE = 102;
	// 活动任务更新通知
	int ACTIVITY_NOTIFY = 103;

	// 转发客户端请求到基础服
	int C_2_FOUNDATION = 104;

	// 发送消息给所有在线玩家
	int SEND_TO_ALL_CLIENT = 105;

	// 俱乐部请求通知房间数据
	int CLUB_REQ_LOGIC_SYNC_ROOM = 106;

	// 比赛场推送
	int MATCH_PUSH_TO_FOUNDATION = 107;

	//金币场奖励金币
	int COIN_EXCITE_MONEY_UPDATE = 108;

	//金币回收
	int COIN__RECYCLE_UPDATE = 109;

	/**
	 * 客户端更新包奖励
	 */
	int CLIENT_UPDATE_PACKAGE_REWARD = 110;

	//金币回收
	int COIN_BOX_REWARD_SCORE = 111;

	// 金币场 2000 - 3000

}
