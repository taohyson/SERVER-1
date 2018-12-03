/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import io.netty.channel.Channel;
import protobuf.clazz.Protocol.Request;

/**
 *
 * @author wu_hc
 */
public interface ProviderProcessor {

	/**
	 * 处理正常请求
	 */
	void handleRequest(Channel channel, Request request) throws Exception;

	/**
	 * 处理异常
	 */
	void handleException(Channel channel, Throwable cause);
}
