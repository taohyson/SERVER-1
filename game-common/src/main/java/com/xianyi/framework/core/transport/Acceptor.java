/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import com.xianyi.framework.core.transport.statistics.SocketIOUtil;

/**
 *
 * 网络接收器
 * 
 * @author wu_hc
 */
public interface Acceptor {

	/**
	 * 
	 * @return
	 */
	int boundPort();

	/**
	 * 停止
	 */
	void shutdownGracefully() throws InterruptedException;

	/**
	 * 
	 */
	void doInit();

	/**
	 * 启动
	 */
	void start() throws Exception;

	/**
	 * 
	 * @param sync
	 * @throws Exception
	 */
	void start(boolean sync) throws Exception;

	/**
	 * 
	 * @return
	 */
	SocketIOUtil socketIO();

}
