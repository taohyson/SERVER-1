/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.event;

import com.xianyi.framework.core.transport.Session;

/**
 * 
 *
 * @author wu_hc date: 2017年7月18日 下午12:21:46 <br/>
 */

public interface IOEvent<T extends Session> {

	/**
	 * IO事件
	 * 
	 * @return
	 */
	Event event();

	/**
	 * 
	 * @return
	 */
	T session();

	/**
	 * 
	 * @return
	 */
	Object attachment();

	public enum Event {
		READ, REGISTERED, UNREGISTERED, EXCEPTION, INACTIVE;
	}
}