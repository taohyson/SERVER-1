package com.cai.common.util;

/**
 * 
 * @author wu_hc
 */
public interface Lifecycle {

	/**
	 * 启动
	 */
	void start() throws Exception;

	/**
	 * 停止
	 */
	void stop() throws Exception;

	/**
	 * 
	 * @return
	 */
	default boolean isRunning() {
		return true;
	};
}
