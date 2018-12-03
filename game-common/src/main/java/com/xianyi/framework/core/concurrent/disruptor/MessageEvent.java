/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.concurrent.disruptor;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年10月24日 上午10:13:22 <br/>
 */
public class MessageEvent<T> {

	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
}
