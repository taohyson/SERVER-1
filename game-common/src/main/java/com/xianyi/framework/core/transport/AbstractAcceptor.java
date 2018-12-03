/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport;

import java.util.List;

import com.cai.common.define.EIODire;
import com.cai.common.util.RuntimeOpt;
import com.google.common.collect.Lists;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.statistics.SocketIOUtil;

/**
 * 
 *
 * @author wu_hc <br>
 *         date: 2017年7月13日 上午11:17:40
 */
public abstract class AbstractAcceptor<T extends Session> implements Acceptor, IOEventListener<T> {

	protected final int inetPort;
	protected final String inetHost;
	protected int workCount = RuntimeOpt.availableProcessors() << 1;

	/**
	 * 
	 */
	protected final SocketIOUtil socketIo = new SocketIOUtil(EIODire.NONE);

	/**
	 * 网络事件事件监听者
	 */
	protected final List<IOEventListener<T>> ioEventListeners = Lists.newArrayList();

	/**
	 * 
	 * @param port
	 */
	public AbstractAcceptor(final int inetPort, final String inetHost) {
		this.inetPort = inetPort;
		this.inetHost = inetHost;
	}

	@Override
	public int boundPort() {
		return this.inetPort;
	}

	/**
	 * @return the inetHost
	 */
	public String getInetHost() {
		return inetHost;
	}

	@Override
	public void start() throws Exception {
		start(true);
	}

	/**
	 * worker线程数量
	 * 
	 * @return
	 */
	protected int workerCount() {
		return workCount;
	}

	public void setWorkCount(int workCount) {
		this.workCount = workCount;
	}

	public List<IOEventListener<T>> listener() {
		return ioEventListeners;
	}

	@Override
	public SocketIOUtil socketIO() {
		return this.socketIo;
	}
}
