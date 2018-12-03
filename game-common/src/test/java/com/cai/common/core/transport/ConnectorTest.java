/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.core.transport;

import java.util.concurrent.CountDownLatch;

import com.xianyi.framework.core.transport.event.IOEvent;
import com.xianyi.framework.core.transport.event.IOEventListener;
import com.xianyi.framework.core.transport.netty.NettySocketConnector;
import com.xianyi.framework.core.transport.netty.session.S2SSession;

/**
 *
 * @author wu_hc
 */
public final class ConnectorTest implements IOEventListener<S2SSession> {

	private static CountDownLatch latch = new CountDownLatch(2);

	public static void main(String[] args) {
		ConnectorTest test = new ConnectorTest();
		NettySocketConnector connector = new NettySocketConnector("localhost", 30071);
		connector.setListener(test);
		connector.doInit();
		try {
			connector.connect();
			latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onEvent(IOEvent<S2SSession> ioEvent) {
		System.out.println(ioEvent);
	}

}
