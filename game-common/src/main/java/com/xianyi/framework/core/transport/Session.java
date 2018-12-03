/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import io.netty.util.AttributeMap;

/**
 *
 * @author wu_hc
 */
public interface Session extends AttributeMap {

	/**
	 * 发送数据[c:request,s:response]
	 * 
	 * @param message
	 */
	void send(final Object message);

	/**
	 * @return
	 */
	boolean isActive();

	/**
	 * 关闭连接
	 */
	void shutdownGracefully();

	public enum SessionException {
		FREQUENT, // 访问过于频繁
		SEND_ERR, // 发送失败
		CHANNEL_NIL,// channel无效，为空或连接状态不可用
		;
	}
}
