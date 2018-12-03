/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.rmi;

/**
 * 
 *
 * @author wu_hc date: 2018年5月17日 上午11:13:25 <br/>
 */
public interface IRMIServer {

	/**
	 * 
	 * @param cmd
	 *            协议id
	 * @param message
	 *            消息体
	 * @return
	 */
	<T, R> R rmiInvoke(final int cmd, T message);
}
