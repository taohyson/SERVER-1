/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import protobuf.clazz.Protocol;
import protobuf.clazz.Protocol.Request;
import protobuf.clazz.Protocol.Response;
import protobuf.clazz.Protocol.Response.ResponseType;
import protobuf.clazz.Protocol.RoomResponse;

/**
 * 
 * 观察者列表
 * 
 * @author wu_hc date: 2017年7月24日 上午11:51:58 <br/>
 */
public final class GameObserverGroup {

	/**
	 * 日志
	 */
	private static Logger logger = LoggerFactory.getLogger(GameObserverGroup.class);

	/**
	 * 观战者
	 */
	private final Map<Long, Player> observer = Maps.newConcurrentMap();

	/**
	 * 所在房间
	 */
	private final Room room;

	/**
	 * 
	 * @param room
	 */
	public GameObserverGroup(final Room room) {
		this.room = room;
	}

	/**
	 * 
	 * @param player
	 */
	public void enter(final Player player) {
		if (null == player)
			return;
		Player oldCache = observer.put(player.getAccount_id(), player);
		if (null != oldCache) {
			logger.warn("玩家[{}]重复进入房间观战!", oldCache.getAccount_id());
		}
	}

	/**
	 * 参战，离开
	 * 
	 * @param accountId
	 */
	public void exit(final long accountId) {

		Player player = observer.remove(accountId);
		if (null != player) {
			// 通知代理服玩家已经退出观战
			// player.setRoom_id(0);
			// player.set_seat_index(GameConstants.INVALID_SEAT);
		}
	}

	/**
	 * 清空围观者
	 */
	public void clear() {
		observer.clear();
	}

	/**
	 * 坐下，请求参战
	 * 
	 * @param player
	 */
	public boolean sit(final long accountId) {
		Player player = observer.remove(accountId);
		return null != player;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * 
	 * @param accountId
	 * @return
	 */
	public Player getPlayer(final long accountId) {
		return observer.get(accountId);
	}

	/**
	 * 
	 * @param accountId
	 * @return
	 */
	public boolean exist(final long accountId) {
		return null != getPlayer(accountId);
	}

	/**
	 * 观战者
	 * 
	 * @return
	 */
	public Map<Long, Player> observerMap() {
		return Collections.unmodifiableMap(observer);
	}

	/**
	 * 观战者
	 * 
	 * @return
	 */
	public Collection<Player> observerCollection() {
		return Collections.unmodifiableCollection(observer.values());
	}

	public int count() {
		return this.observer.size();
	}

	/**
	 * 
	 * @param roomResponse
	 */
	public void sendAll(RoomResponse.Builder roomResponse) {
		if (observer.size() <= 0) {
			return;
		}
		roomResponse.setRoomId(room.getRoom_id());
		roomResponse.setAppId(room.getGame_id());
		Response.Builder responseBuilder = Response.newBuilder();
		responseBuilder.setResponseType(ResponseType.ROOM);
		responseBuilder.setExtension(Protocol.roomResponse, roomResponse.build());

		for (final Player player : observer.values()) {
			this.send(player, responseBuilder.build());
		}
	}

	/**
	 * 
	 * @param roomResponse
	 */
	public void sendAll(Response roomResponse) {
		if (observer.size() <= 0) {
			return;
		}
		for (final Player player : observer.values()) {
			this.send(player, roomResponse);
		}
	}

	/**
	 * 
	 * @param player
	 * @param roomResponse
	 */
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
	public void send(Player player, final Response response) {
		if (!exist(player.getAccount_id())) {
			return;
		}

		if (player.getRoom_id() != room.getRoom_id()) {
			exit(player.getAccount_id()); // 该玩家可以移出了
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
					logger.error("发送给指定玩家消息失败" + response.getResponseType());
				}
			}
		});
	}
}
