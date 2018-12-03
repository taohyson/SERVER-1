/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.dictionary;

/**
 * @author wu_hc date: 2017年12月22日 上午11:37:48 <br/>
 */
public interface DictType {
	// SYS_PARAM = 1; //系统参数
	// SYS_NOTICE = 2; //系统公告
	// GAME_DESC = 3; //玩法说明
	// SHOP = 4; //商城
	// MAIN_UI_NOTICE = 5; //主界面公告
	// LOGIN_NOTICE = 6; //登录公告
	// MONEY_SHOP = 7; //金币商城
	// ACTIVITY = 8; //活动
	// CONTINUE_LOGIN = 9; //连续登录
	// GOODS = 10; //道具
	// IP_LIST = 11; //ip
	// APPITEM = 12;//游戏下载列表
	// SERVER_LOGIC = 13; //服务器列表
	// GAME_RECOMMEND = 14; //推荐位
	// SERVER_BALANCE = 15; //指定子游戏运行逻辑服
	// SYS_GAME_TYPE = 16;//通知加载游戏类型对应收费索引 游戏类型 描述
	// GAME_GROUP_RULE = 17;
	// RED_PACKAGE_RULE = 18;//红包活动规则
	// TURNTABLE_RULE = 19; // 转盘活动规则
	// SYS_PARAM_SERVER = 20; //服务端系统参数
	// CUSTOMER_SER_NOTICE = 21;//客服界面公告
	// PACKAGE_ITEM = 22; // 背包物品
	// MATCH_GROUND = 23; //比赛场
	// SERVER_GATE = 24; //
	// MATCH_BROAD = 25;//比赛场公告
	// TURNTABLE = 26; // 转盘
	// INVITE_REDPACKEY = 27;//邀请新用户送红包活动
	// COIN_CONFIG = 28;//金币场配置

	// 专属豆活动
	int CLUB_EXCLUSIVE_ACTIVITY = 1;

	// 加载比赛场公告
	int MATCH_BROAD_LOAD = 28;
	// 加载比赛场
	int MATCH_DICT_LOAD = 30;

	// 转盘活动
	int TURNTABLE_DICT_LOAD = 31;

	// 邀请新用户送红包活动
	int INVITE_ACTIVITY = 32;

	// 加载金币场
	int COIN_LOAD = 33;

	int RECOMMEND_ACCOUNT_LIMIT = 34;

	// 实物兑换
	int ITEM_EXCHANGE = 35;

	// 福卡兑换
	int WELFARE_EXCHANGE = 36;

	// 卡密库
	int CARD_SECRET = 37;

	// 红包池清理字典
	int REDPACKET_POOL = 38;

	// 渠道参数
	int CHANNEL_DICT = 39;

	// 任务
	int ACTIVITY_MISSION = 40;

	// 推送管理
	int PUSH_MANAGER_DICT = 41;

	// 游戏跑马灯
	int GAME_NOTICE_DICT = 42;

	// 大厅指引图
	int HALL_GUIDE_DICT = 43;

	// 积分商品
	int BONUS_POINTS_GOODS_DICT = 44;

	// 子游戏印章、背景、标题资源
	int GAME_RESOURCE_DICT = 45;

	// 刺激玩法
	int EXCITE_DICT = 46;

	// 牌型
	int CARD_CATEGORY = 47;

	// 福卡商城分类
	int WELFARE_GOODS_TYPE = 48;

	// 邀请好友活动
	int INVITE_FRIENDS_ACTIVITY = 49;

	// 大厅主界面背景资源
	int HALL_MAIN_VIEW_BACK_DICT = 50;

	// 第三方CP app
	int SDK_APP_DICT = 51;

	// 第三方CP app商城
	int SDK_SHOP = 52;

	int CORNUCOPIA = 53;
	
	//钻石商城
	int SDK_DIAMOND_SHOP = 54;

}
