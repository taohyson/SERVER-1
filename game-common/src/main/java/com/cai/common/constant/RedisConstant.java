package com.cai.common.constant;

public class RedisConstant {

	/**
	 * 玩家账号
	 */
	// public static final String ACCOUNT_NAME = "ACCOUNT_NAME_";

	/**
	 * 房间号
	 */
	public static final String ROOM = "ROOM";

	/**
	 * 账号
	 */
	@Deprecated
	public static final String ACCOUNT = "ACCOUNT";

	/**
	 * redis的账号数据
	 */
	public static final String ACCOUNT_REDIS = "ACCOUNT_REDIS";

	/**
	 * 所有字典hset
	 */
	public static final String DICT = "DICT";
	/**
	 * 字典-系统参数(二级)
	 */
	public static final String DICT_SYSPARAM = "DICT_SYSPARAM";
	/**
	 * 字典-系统公告(二级)
	 */
	public static final String DICT_SYSNOTICE = "DICT_SYSNOTICE";
	/**
	 * 字典-玩法说明(二级)
	 */
	public static final String DICT_GAMEDESC = "DICT_GAMEDESC";
	/**
	 * 字典-商城商品(二级)
	 */
	public static final String DICT_STORE = "DICT_STORE_GOOD";

	/**
	 * 字典-app商城商品(二级)
	 */
	public static final String DICT_STORE_APP = "DICT_STORE_GOOD_APP";

	/**
	 * 字典-金币商城商品(二级)
	 */
	public static final String DICT_STORE_MONEY = "DICT_STORE_GOOD_MONEY";

	/**
	 * 字典-道具商品(二级)
	 */
	public static final String DICT_GOODS = "DICT_GOODS";

	/**
	 * 字典-道具商品(二级--唯一性)
	 */
	public static final String DICT_GOODS_UNION = "DICT_GOODS_UNION";

	/**
	 * 字典-IP(二级)
	 */
	public static final String DICT_IP = "DICT_IP";

	/**
	 * 字典-主界面公告(二级)
	 */
	public static final String DICT_MAIN_UI_NOTICE = "DICT_MAIN_UI_NOTICE";
	/**
	 * 字典-登录公告
	 */
	public static final String DICT_LOGIN_NOTICE = "DICT_LOGIN_NOTICE";

	/**
	 * 字典-活动(二级)
	 */
	public static final String DICT_ACTIVITY = "DICT_ACTIVITY";

	public static final String DICT_ACTIVITY_NEW = "DICT_ACTIVITY_NEW";

	public static final String DICT_ACTIVITY_MISSION = "DICT_ACTIVITY_MISSION";
	
	public static final String DICT_ACTIVITY_MISSION_GROUP = "DICT_ACTIVITY_MISSION_GROUP";
	
	public static final String DICT_INVITE_FRIENDS_ACTIVITY = "DICT_INVITE_FRIENDS_ACTIVITY";

	/**
	 * 大厅指引(二级)
	 */
	public static final String DICT_HALL_GUIDE = "DICT_HALL_GUIDE";

	/**
	 * 字典-连续登录配置
	 */
	public static final String DICT_CONTINUE_LOGIN = "DICT_CONTINUE_LOGIN";

	/**
	 * 
	 */
	public static final String GROUP_ROOM = "GROUP_ROOM";
	/**
	 * 字典-app版本管理缓存
	 */
	public static final String APPITEMKEY = "APPITEM";
	/**
	 * 字典-app版本管理缓存
	 */
	public static final String APPITEMMAP = "APPITEM_MAP";

	/**
	 * 逻辑服务器
	 */
	public static final String DIR_SERVER_LOGIC = "DIR_SERVER_LOGIC";

	/**
	 * 代理服务器
	 */
	public static final String DIR_SERVER_PROXY = "DIR_SERVER_PROXY";

	/**
	 * 网关服务器
	 */
	public static final String DIR_SERVER_GATE = "DIR_SERVER_GATE";

	/**
	 * 比赛服务器
	 */
	public static final String DIR_SERVER_MATCH = "DIR_SERVER_MATCH";

	/**
	 * 金币场服务器
	 */
	public static final String DIR_SERVER_COIN = "DIR_SERVER_COIN";

	/**
	 * 游戏基础服务器
	 */
	public static final String DIR__SERVER_FOUNDATION = "DIR_SERVER_FOUNDATION";

	/**
	 * 推荐位
	 */
	public static final String DIR_GAME_RECOMMEND = "DIR_GAME_RECOMMEND";

	/**
	 * 游戏类型对应收费索引 游戏类型 描述
	 */
	public static final String DIR_SYS_GAME_TYPE = "DIR_SYS_GAME_TYPE";

	/**
	 * 玩法规则配置
	 */
	public static final String DIR_GAME_GROUP_RULE = "DIR_GAME_GROUP_RULE";
	/**
	 * 红包活动规则
	 */
	public static final String DIR_RED_PACKAGE_RULE = "DIR_RED_PACKAGE_RULE";

	/**
	 * 字典-系统参数(二级)
	 */
	public static final String DICT_SYSPARAM_SERVER = "DICT_SYSPARAM_SERVER";
	/**
	 * 字典-客服界面公告(二级)
	 */
	public static final String DICT_CUSTOMER_SER_NOTICE = "DICT_CUSTOMER_SER_NOTICE";

	public static final String DIR_TURUNTABLE_GOODS_POOL = "DIR_TURUNTABLE_GOODS_POOL";

	/**
	 * 字典-背包物品
	 */
	public static final String DICT_PACKAGE_ITEM = "DICT_PACKAGE_ITEM";
	/**
	 * 比赛场字典
	 */
	public static final String DICT_MATCH = "DICT_MATCH";
	/**
	 * 比赛联赛字典
	 */
	public static final String DICT_MATCH_UNION = "DICT_MATCH_UNION";
	public static final String DICT_MATCH_UNION_SIDE = "DICT_MATCH_UNION_SIDE";
	public static final String DICT_MATCH_LEVEL = "DICT_MATCH_LEVEL";
	public static final String DICT_MATCH_CMD = "DICT_MATCH_CMD";
	public static final String DICT_MATCH_TOP_STATUS = "DICT_MATCH_TOP_STATUS";
	public static final String DICT_MATCH_TOP_HONOR = "DICT_MATCH_TOP_HONOR";
	public static final String DICT_MATCH_SYSTEM_CONFIG = "DICT_MATCH_SYSTEM_CONFIG";
	/**
	 * 玩家比赛数据
	 */
	public static final String MATCH_ROOM_ACCOUNT = "DICT_MATCH_ACCOUNT";

	/**
	 * 转盘抽奖活动
	 */
	public static final String DICT_TURUNTABLE_AWARD_POOL = "DICT_TURUNTABLE_AWARD_POOL";

	/**
	 * 比赛场数据
	 */
	// public static final String MATCH_INFO = "MATCH_INFO";
	// public static final String MATCH_INFO_LIST = "MATCH_INFO_LIST";
	/**
	 * 金币场数据
	 */
	public static final String COIN_PLAYER_INFO = "COIN_PLAYER_INFO";
	public static final String COIN_PLAYER_MATCH_INFO = "COIN_PLAYER_MATCH_INFO";

	/**
	 * 
	 */
	public static final String APPITEM_TMP_VERSION = "DICT:APPITEM_TMP_VERSION";

	/**
	 * 字典-比赛场公告(二级)
	 */
	public static final String DICT_MATCH_BROAD = "DICT_MATCH_BROAD";

	/**
	 * 玩家房间数据
	 */
	public static final String ROOM_INFO = "ROOM_INFO";
	/**
	 * 玩家邀请得红包活动
	 */
	public static final String DICT_INVITE_RED_PACKET = "DICT_INVITE_RED_PACKET";

	/** 金币场游戏类型 */
	public static final String DICT_COIN_GAME_TYPE = "DICT_COIN_GAME_TYPE";
	/** 金币场子游戏类型 */
	public static final String DICT_COIN_GAMES = "DICT_COIN_GAMES";
	/** 金币场游戏详情 */
	public static final String DICT_COIN_GAME_DETAILS = "DICT_COIN_GAME_DETAILS";
	/** 金币场游戏救济 */
	public static final String DICT_COIN_RELIEF = "DICT_COIN_RELIEF";

	/** 商城实物兑换 */
	public static final String ITEM_EXCHANGE = "ITEM_EXCHANGE";

	/** 商城福卡兑换 */
	public static final String WELFARE_EXCHANGE = "WELFARE_EXCHANGE";

	/** 福卡兑换商城分类 */
	public static final String WELFARE_GOODS_TYPE = "WELFARE_GOODS_TYPE";

	/** 卡密 */
	public static final String CARD_SECRET = "CARD_SECRET";

	/** 渠道数据 */
	public static final String CHANNEL_DICT = "CHANNEL_DICT";

	/** 清空红包池字典 */
	public static final String REDPACKET_POOL_CLEAR = "REDPACKET_POOL_CLEAR";

	/** 推送字典 */
	public static final String PUSH_MANAGER_DICT = "PUSH_MANAGER_DICT";

	/** 跑马灯字典 */
	public static final String GAME_NOTICE_DICT = "GAME_NOTICE_DICT";

	/** 子游戏印章、背景、标题资源 */
	public static final String DICT_GAME_RESOURCE = "DICT_GAME_RESOURCE";


	/**刺激场，特殊奖励*/
	public static final String DICT_COIN_EXCITE = "DICT_COIN_EXCITE";

	/**牌型*/
	public static final String DICT_CARD_CATEGORY = "DICT_CARD_CATEGORY";
	
	/** 大厅主界面背景资源 */
	public static final String DICT_HALL_MAIN_VIEW_BACK = "DICT_HALL_MAIN_VIEW_BACK";
	
	/** 大厅主界面背景资源城市对应关系 */
	public static final String DICT_HALL_MAIN_VIEW_BACK_CITY = "DICT_HALL_MAIN_VIEW_BACK_CITY";
	
	/** SDK APP */
	public static final String DICT_SDK_APP = "DICT_SDK_APP";
	
	/** SDK APP SHOP */
	public static final String DICT_SDK_APP_SHOP = "DICT_SDK_APP_SHOP";
	
	public static final String DICT_SDK_APP_REGION = "DICT_SDK_APP_REGION";
	
	/** SDK DIAMOND SHOP */
	public static final String DICT_SDK_DIAMOND_SHOP = "DICT_SDK_DIAMOND_SHOP";

	/** 金币场-聚宝盆 */
	public static final String DICT_CORNUCOPIA = "DICT_CORNUCOPIA";

}
