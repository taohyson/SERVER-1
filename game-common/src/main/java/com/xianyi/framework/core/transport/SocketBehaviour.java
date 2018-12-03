/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

/**
 * 提供行为
 * 
 * @author wu_hc
 */
public interface SocketBehaviour<T extends Session> {

	void read(T session, Object msg);

	void registered(T session);

	void unregistered(T session);

	void exceptionCaught(T session, Throwable cause);
}
