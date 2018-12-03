/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport.netty.session;

import com.xianyi.framework.core.transport.Session;

import io.netty.channel.Channel;

/**
 * 服务器与服务器之间的连接
 * 
 * @author wu_hc
 */
public final class S2SSession extends AbstractNettySession implements Session {

	/**
	 * @param channel
	 */
	public S2SSession(Channel channel) {
		super(channel);
	}

	@Override
	protected int timeOut() {
		return DEAULT_TIME_OUT;
	}

}
