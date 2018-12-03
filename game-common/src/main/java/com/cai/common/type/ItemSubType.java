package com.cai.common.type;

/**
 * 
 * 物品子类型
 * 
 * @author zhanglong date: 2018年4月13日 下午12:16:14
 */
public interface ItemSubType {
	/**
	 * 兑换券
	 */
	int EXCHANGE_TICKET = 1;

	/**
	 * 线上参赛券
	 */
	int ONLINE_MATCH_CARD = 2;

	/**
	 * 线下参赛券
	 */
	int OFFLINE_MATCH_CARD = 3;

	/**
	 * 红包
	 */
	int RED_PACKET = 4;

	/**
	 * 京东卡
	 */
	int JINGDONG_CARD = 5;

	/**
	 * 话费卡
	 */
	int PHONE_CARD = 6;

	/**
	 * 实物
	 */
	int REAL_ITEM = 7;
	
	/**
	 * 活动红包(活动用,不放入背包)
	 */
	int ACTIVITY_RED_PACKET = 8;
	
	
	/**
	 * 闲逸豆(不放入背包)
	 */
	int XIANYI_DOU = 9;
	
	
	/**
	 * 金币(不放入背包)
	 */
	int COIN = 10;
	
	/**
	 * 福卡(不放入背包)
	 */
	int WELFARE = 11;
	
	/**
	 * 爱奇艺会员卡
	 */
	int AIQIYI_VIP_CARD = 12;
}
