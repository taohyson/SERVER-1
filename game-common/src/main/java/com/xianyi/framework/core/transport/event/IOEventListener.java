/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.event;

import com.xianyi.framework.core.transport.Session;

/**
 * 
 *
 * @author wu_hc date: 2017年7月18日 下午2:15:24 <br/>
 */

public interface IOEventListener<T extends Session> {

	/**
	 * 事件元数据传递
	 * 
	 * @param ioEvent
	 */
	void onEvent(IOEvent<T> ioEvent);

	/**
	 * 拦截传递
	 * 
	 * @param ioEvent
	 */
	// void onIntercept(IOEvent ioEvent);
}
