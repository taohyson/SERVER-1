/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.select;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import com.xianyi.framework.core.transport.Connector;
import com.xianyi.framework.core.transport.ConnectorGroup.SelectStrategy;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年11月4日 下午5:28:15 <br/>
 */
public final class DefaultConnectorStrategyFactory implements ConnectorStrategyFactory {

	/**
	 * 单例
	 */
	private final static DefaultConnectorStrategyFactory INSTANCE = new DefaultConnectorStrategyFactory();

	private DefaultConnectorStrategyFactory() {
	}

	public static DefaultConnectorStrategyFactory getInstance() {
		return INSTANCE;
	}

	@Override
	public ConnectorChooser newChooser(Connector[] connectors) {
		return newChooser(connectors, SelectStrategy.ROUND);
	}

	@Override
	public ConnectorChooser newChooser(Connector[] connectors, SelectStrategy strategy) {
		if (SelectStrategy.ROUND == strategy) {
			if (isPowerOfTwo(connectors.length)) {
				return new PowerOfTowEventLoopChooser(connectors);
			} else {
				return new GenericEventLoopChooser(connectors);
			}
		} else {
			return new RandomEventLoopChooser(connectors);
		}
	}

	private static boolean isPowerOfTwo(int val) {
		return (val & -val) == val;
	}

	/**
	 * 
	 * 二次方
	 *
	 */
	private static final class PowerOfTowEventLoopChooser implements ConnectorChooser {
		private final AtomicInteger idx = new AtomicInteger();
		private final Connector[] connectors;

		PowerOfTowEventLoopChooser(Connector[] connectors) {
			this.connectors = connectors;
		}

		@Override
		public Connector next() {
			return connectors[idx.getAndIncrement() & connectors.length - 1];
		}
	}

	/**
	 * 
	 * 顺序
	 *
	 */
	private static final class GenericEventLoopChooser implements ConnectorChooser {
		private final AtomicInteger idx = new AtomicInteger();
		private final Connector[] connectors;

		GenericEventLoopChooser(Connector[] connectors) {
			this.connectors = connectors;
		}

		@Override
		public Connector next() {
			return connectors[Math.abs(idx.getAndIncrement() % connectors.length)];
		}
	}

	/**
	 * 随机
	 */
	private static final class RandomEventLoopChooser implements ConnectorChooser {
		private final Connector[] connectors;

		RandomEventLoopChooser(Connector[] connectors) {
			this.connectors = connectors;
		}

		@Override
		public Connector next() {
			return connectors[ThreadLocalRandom.current().nextInt(connectors.length)];
		}
	}
}
