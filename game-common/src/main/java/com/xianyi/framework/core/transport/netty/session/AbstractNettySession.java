/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.netty.session;

import com.xianyi.framework.core.transport.AbstractSession;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

/**
 * 
 *
 * @author wu_hc date: 2017年7月24日 下午11:13:01 <br/>
 */
public abstract class AbstractNettySession extends AbstractSession {

	/**
	 * @param channel
	 */
	public AbstractNettySession(Channel channel) {
		this.channel = channel;
	}

	/**
	 * 
	 */
	protected final Channel channel;

	/**
	 * 发送数据[c:request,s:response]
	 * 
	 * @param message
	 */
	@Override
	public final void send(final Object message) {
		if (isActive()) {
			channel.writeAndFlush(message).addListener(new ChannelFutureListener() {
				public void operationComplete(ChannelFuture future) throws Exception {
					if (!future.isSuccess()) {
						sessionException(SessionException.SEND_ERR);
						// log.warn("session send message fail,message:{}",
						// message);
					}
				}
			});
		} else {
			sessionException(SessionException.CHANNEL_NIL);
		}
	}

	@Override
	public boolean isActive() {
		return (null != channel && channel.isActive());
	}

	public Channel getChannel() {
		return channel;
	}

	public Channel channel() {
		return getChannel();
	}

	@Override
	public void shutdownGracefully() {
		if (isActive()) {
			channel.close();
		}
	}

}
