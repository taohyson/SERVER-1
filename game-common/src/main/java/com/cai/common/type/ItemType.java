package com.cai.common.type;

/**
 * 
 * 物品大类型
 * 
 * @author zhanglong date: 2018年4月13日 下午12:11:12
 */
public interface ItemType {
	/**
	 * 普通道具
	 */
	int NORMAL_PROP = 1;

	/**
	 * 参赛券
	 */
	int MATCH_CARD = 2;

	/**
	 * 红包
	 */
	int RED_PACKET = 3;

	/**
	 * 实物
	 */
	int REAL_ITEM = 4;
	
	/**
	 * 活动奖励(活动用,不放入背包)
	 */
	int ACTIVITY_REWARD = 5;
	
	/**
	 * 货币
	 */
	int CURRENCY = 6;
}
