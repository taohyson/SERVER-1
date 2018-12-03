/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.transport;

/**
 * 网络访问频率控制
 * 
 * @author wu_hc
 */
public final class SocketAccessHzUtil {
	/**
	 * 检测频率(毫秒)
	 */
	private int checkInterval = 5 * 1000;

	/**
	 * 请求频率(每SESSION_HZ_MS秒最高链接次数)
	 */
	private int checkHz = 300;

	/**
	 * 
	 */
	private long lastHzFlushTime;

	/**
	 * 访问记数器
	 */
	private int accessCounter = 0;

	/**
	 * 检测请求频率
	 * 
	 * @return
	 */
	public boolean checkIsNormalHz(long accessTime) {
		if (accessTime - lastHzFlushTime > checkInterval) {
			lastHzFlushTime = accessTime;
			accessCounter = 1;
		} else {
			accessCounter++;
		}
		if (accessCounter > checkHz) {
			return false;
		}
		return true;
	}

	/**
	 * @return the accessCounter
	 */
	public int getAccessCounter() {
		return accessCounter;
	}

	public int getCheckInterval() {
		return checkInterval;
	}

	public void setCheckInterval(int checkInterval) {
		this.checkInterval = checkInterval;
	}

	public int getCheckHz() {
		return checkHz;
	}

	public void setCheckHz(int checkHz) {
		this.checkHz = checkHz;
	}

}
