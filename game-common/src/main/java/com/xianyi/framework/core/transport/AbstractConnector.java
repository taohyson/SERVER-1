/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.define.EServerStatus;
import com.xianyi.framework.core.concurrent.IEventListener;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.session.S2SSession;

/**
 *
 * @author wu_hc
 */
public abstract class AbstractConnector implements Connector {
	/**
	 * 日志
	 */
	protected final Logger log = LoggerFactory.getLogger(getClass());

	/**
	 * 
	 */
	protected final UnresolvedAddress address;

	/**
	 * 
	 */
	protected IOEventListener<S2SSession> listener;

	/**
	 * 
	 */
	protected IEventListener connectedCallback;

	/**
	 * 
	 */
	protected EServerStatus status = EServerStatus.NONE;

	/**
	 * 是否需要重连
	 */
	protected volatile boolean reConnect = true;

	/**
	 * 连接描述
	 */
	private String description;

	protected AbstractConnector(final UnresolvedAddress address) {
		this.address = address;
	}

	@Override
	public String getConnectKey() {
		return this.address.toString();
	}

	/**
	 * @return the listener
	 */
	public IOEventListener<S2SSession> getListener() {
		return listener;
	}

	/**
	 * @param listener
	 *            the listener to set
	 */
	public void setListener(IOEventListener<S2SSession> listener) {
		this.listener = listener;
	}

	/**
	 * @return the reConnect
	 */
	public boolean isReConnect() {
		return reConnect;
	}

	/**
	 * @param reConnect
	 *            the reConnect to set
	 */
	public void setReConnect(boolean reConnect) {
		this.reConnect = reConnect;
	}

	/**
	 * @return the status
	 */
	public EServerStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(EServerStatus status) {
		this.status = status;
	}

	@Override
	public boolean reConnect() {
		if (!reConnect)
			return false;
		return connect();
	}

	@Override
	public void setConnectedCallback(IEventListener callback) {
		this.connectedCallback = callback;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String description() {
		return getDescription();
	}

}
