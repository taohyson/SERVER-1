/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.domain.GamePlayerGroup;
import com.cai.common.domain.Player;
import com.cai.common.domain.Room;
import com.google.common.collect.Maps;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import protobuf.clazz.Protocol;
import protobuf.clazz.Protocol.Request;
import protobuf.clazz.Protocol.Response;
import protobuf.clazz.Protocol.RoomResponse;
import protobuf.clazz.Protocol.Response.ResponseType;

/**
 * 房间内的玩家管理
 *
 * @author wu_hc date: 2017年9月12日 下午12:30:45 <br/>
 */
public abstract class AbstractRoomBehaviour implements RoomBehaviour {

	/**
	 * 日志
	 */
	private static Logger logger = LoggerFactory.getLogger(GamePlayerGroup.class);

	/**
	 * 参战者
	 */
	private final Map<Long, Player> players = Maps.newConcurrentMap();

	/**
	 * 所在房间
	 */
	private final Room room;

	/**
	 * @param room
	 */
	public AbstractRoomBehaviour(Room room) {
		this.room = room;
	}

	/**
	 * @return the room
	 */
	@Override
	public Room getRoom() {
		return room;
	}

	/**
	 * 进入
	 * 
	 * @param player
	 */
	@Override
	public void enter(final Player player) {
		if (null == player) {
			logger.error("什么鬼,传进来的player对象为空!!!!");
			return;
		}

		Player oldCache = players.put(player.getAccount_id(), player);
		if (null != oldCache) {
			logger.warn("玩家[{}]重复进入房间!", oldCache.getAccount_id());
		}
	}

	/**
	 * 离开
	 * 
	 * @param accountId
	 */
	@Override
	public void exit(final long accountId) {
		players.remove(accountId);
	}

	/**
	 * 
	 * @param accountId
	 * @return
	 */
	@Override
	public Player getPlayer(final long accountId) {
		return players.get(accountId);
	}

	@Override
	public boolean isExist(long accountId) {

		return players.containsKey(accountId);
	}

	@Override
	public Map<Long, Player> allPlayers() {
		return Collections.unmodifiableMap(players);
	}

	@Override
	public int playerCount() {
		return players.size();
	}

	@Override
	public void clear() {
		players.clear();
	}

	@Override
	public void sendAll(RoomResponse.Builder roomResponse) {
		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.ROOM);
		responseBuilder.setExtension(Protocol.roomResponse, roomResponse.build());

		players.forEach((k, player) -> {
			this.send(player, responseBuilder.build());
		});
	}

	/**
	 * 
	 * @param player
	 * @param roomResponse
	 */
	@Override
	public void send(Player player, RoomResponse.Builder roomResponse) {
		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.ROOM);
		responseBuilder.setExtension(Protocol.roomResponse, roomResponse.build());
		this.send(player, responseBuilder.build());
	}

	/**
	 * 
	 * @param player
	 * @param response
	 */
	@Override
	public void send(Player player, final Response response) {

		if (player.getRoom_id() != room.getRoom_id()) {
			logger.error("玩家:[{}]房间id不合理!p_roomid:{},roomid:{}", player, player.getRoom_id(), room.getRoom_id());
			return;
		}

		if (!player.getChannel().isActive()) {
			logger.info("玩家:[{}]持有的代理服连接已经失效,proxyIndex:{},channel:{}", player, player.getProxy_index(), player.getChannel());
			return;
		}

		Request.Builder requestBuilder = Request.newBuilder();
		requestBuilder.setRequestType(Request.RequestType.PROXY);
		requestBuilder.setProxId(player.getProxy_index());
		requestBuilder.setProxSeesionId(player.getProxy_session_id());
		requestBuilder.setExtension(Protocol.response, response);

		player.getChannel().writeAndFlush(requestBuilder.build()).addListener(new ChannelFutureListener() {
			public void operationComplete(ChannelFuture future) throws Exception {
				if (!future.isSuccess()) {
					logger.error("房间发送消息给指定玩家消息失败,{}，rspType:{},roomid:{}", player, response.getResponseType(), room.getRoom_id());
				}
			}
		});
	}
}
