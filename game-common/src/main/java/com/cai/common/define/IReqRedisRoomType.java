/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.define;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年1月11日 下午2:43:56 <br/>
 */
public interface IReqRedisRoomType {

	/**
	 * 
	 */
	int ALL = 0;

	/**
	 * 俱乐部id
	 */
	int CLUB_ID = 1;

	/**
	 * 房间id
	 */
	int ROOM_ID = 2;

	/**
	 * 逻辑服id
	 */
	int LOGIC_SERVER_INDEX = 3;

	/**
	 * 游戏大id
	 */
	int GAME_ID = 4;

	/**
	 * 游戏小id
	 */
	int GAME_TYPE_INDEX = 5;

	/**
	 * 创建者
	 */
	int CREATE_ACCOUNT_ID = 6;

	/**
	 * 俱乐部某个玩法/包间id
	 */
	int CLUB_RULE_ID = 7;

	/**
	 * 金币场
	 */
	int MONEY_ROOM = 8;

	/**
	 * 参与者
	 */
	int PARTAKE_ACCOUNT_ID = 9;
}
