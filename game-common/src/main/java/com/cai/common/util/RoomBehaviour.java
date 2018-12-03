/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Map;

import com.cai.common.domain.Player;
import com.cai.common.domain.Room;

import protobuf.clazz.Protocol.Response;
import protobuf.clazz.Protocol.RoomResponse;

/**
 * 
 * @author wu_hc date: 2017年9月12日 下午3:19:58 <br/>
 */
public interface RoomBehaviour {

	/**
	 * 房间
	 * 
	 * @return
	 */
	Room getRoom();

	/**
	 * 进入房间
	 * 
	 * @param player
	 */
	void enter(final Player player);

	/**
	 * 退出房间
	 * 
	 * @param accountId
	 */
	void exit(final long accountId);

	/**
	 * 获得玩家
	 * 
	 * @param accountId
	 * @return
	 */
	Player getPlayer(long accountId);

	/**
	 * 玩家是否在这个房间
	 * 
	 * @param accountId
	 * @return
	 */
	boolean isExist(long accountId);

	/**
	 * 清理工作
	 */
	void clear();

	/**
	 * 获取房间内的所有玩家
	 * 
	 * @return
	 */
	Map<Long, Player> allPlayers();

	/**
	 * 房间的玩家数量
	 * 
	 * @return
	 */
	int playerCount();

	/**
	 * 
	 * @param roomResponse
	 */
	void sendAll(RoomResponse.Builder roomResponse);

	/**
	 * 
	 * @param player
	 * @param roomResponse
	 */
	void send(Player player, RoomResponse.Builder roomResponse);

	/**
	 * 
	 * @param player
	 * @param response
	 */
	void send(Player player, final Response response);
}
