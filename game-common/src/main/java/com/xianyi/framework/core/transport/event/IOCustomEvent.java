/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.event;

import com.xianyi.framework.core.transport.Session;

/**
 * 
 *
 * @author wu_hc date: 2017年7月18日 下午12:28:39 <br/>
 */
public final class IOCustomEvent<T extends Session> implements IOEvent<T> {

	private final Event event;
	private final T session;
	private final Object attachment;

	/**
	 * 
	 * @param event
	 * @param session
	 */
	public IOCustomEvent(Event event, T session) {
		this(event, session, null);
	}

	public IOCustomEvent(Event event, T session, Object attachment) {
		this.event = event;
		this.session = session;
		this.attachment = attachment;
	}

	@Override
	public Event event() {
		return event;
	}

	@Override
	public T session() {
		return this.session;
	}

	@Override
	public Object attachment() {
		return attachment;
	}

	@Override
	public String toString() {
		return "IOCustomEvent [event=" + event + ", session=" + session + ", attachment=" + attachment + "]";
	}

}