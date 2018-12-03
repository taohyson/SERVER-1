package com.cai.common.rmi;

import com.cai.common.domain.ProxyStatusModel;

public interface IProxyRMIServer extends IRMIServer {

	public String sayHello();

	public Long getCurDate();

	/**
	 * 状态
	 * 
	 * @return
	 */
	public ProxyStatusModel getProxyStatus();

	/**
	 * 测试是否通
	 * 
	 * @return
	 */
	public boolean test();

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
