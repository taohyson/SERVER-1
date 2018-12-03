/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.util.DefaultAttributeMap;

/**
 * 会话/tcp 连接抽象
 * 
 * @author wu_hc
 */
public abstract class AbstractSession extends DefaultAttributeMap implements Session {

	/**
	 * 日志
	 */
	protected Logger log = LoggerFactory.getLogger(getClass());

	/**
	 * 默认超时时间
	 */
	protected static final int DEAULT_TIME_OUT = 6 * 1000;

	/**
	 * 
	 */
	protected final SocketAccessHzUtil hzUtil = new SocketAccessHzUtil();

	/**
	 * 
	 */
	private final Lock mainLock = new ReentrantLock();

	/**
	 * 上一次通信时间，包括PING
	 */
	private volatile long lastAccessTime;

	/**
	 * 创建时间
	 */
	private long createTime;

	/**
	 * 会话ID
	 */
	private long sessionId;

	/**
	 * 客户端IP
	 */
	private String clientIP;

	public AbstractSession() {
		lastAccessTime = System.currentTimeMillis();
		createTime = lastAccessTime;
	}

	public long getLastAccessTime() {
		return lastAccessTime;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	/**
	 * 使用{@link AbstractSession#access}
	 * 
	 * @param lastAccessTime
	 */
	@Deprecated
	public void setLastAccessTime(long lastAccessTime) {
		access();
	}

	public final boolean access() {
		this.lastAccessTime = System.currentTimeMillis();
		if (!hzUtil.checkIsNormalHz(lastAccessTime)) {
			sessionException(SessionException.FREQUENT);
			return false;
		}
		return true;
	}

	public boolean isTimeOut() {
		return (System.currentTimeMillis() - lastAccessTime) > timeOut();
	}

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	/**
	 * 获取超时时间
	 * 
	 * @return
	 */
	protected int timeOut() {
		return DEAULT_TIME_OUT;
	}

	/**
	 * @return the mainLock
	 */
	public Lock getMainLock() {
		return mainLock;
	}

	/**
	 * 
	 * @return
	 */
	public SocketAccessHzUtil getHzUtil() {
		return hzUtil;
	}

	/**
	 * 
	 */
	protected void sessionException(SessionException exception) {
	}

}
