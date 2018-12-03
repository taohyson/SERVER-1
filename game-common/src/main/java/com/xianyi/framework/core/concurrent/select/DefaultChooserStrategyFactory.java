package com.xianyi.framework.core.concurrent.select;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import com.xianyi.framework.core.concurrent.WorkerLoop;
import com.xianyi.framework.core.concurrent.WorkerLoopGroup.SelectStrategy;

/**
 * 
 * 选择/负载策略
 *
 * @author wu_hc date: 2017年7月2日 下午11:44:15 <br/>
 */
public final class DefaultChooserStrategyFactory implements ChooserStrategyFactory {

	/**
	 * 单例
	 */
	private final static DefaultChooserStrategyFactory INSTANCE = new DefaultChooserStrategyFactory();

	private DefaultChooserStrategyFactory() {
	}

	public static DefaultChooserStrategyFactory getInstance() {
		return INSTANCE;
	}

	@Override
	public EventLoopChooser newChooser(WorkerLoop[] executors) {
		return newChooser(executors, SelectStrategy.ROUND);
	}

	@Override
	public EventLoopChooser newChooser(WorkerLoop[] executors, SelectStrategy strategy) {
		if (SelectStrategy.ROUND == strategy) {
			if (isPowerOfTwo(executors.length)) {
				return new PowerOfTowEventLoopChooser(executors);
			} else {
				return new GenericEventLoopChooser(executors);
			}
		} else if (SelectStrategy.BALANCE == strategy) {
			return new BalanceEventLoopChooser(executors);
		} else {
			return new RandomEventLoopChooser(executors);
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
	private static final class PowerOfTowEventLoopChooser implements EventLoopChooser {
		private final AtomicInteger idx = new AtomicInteger();
		private final WorkerLoop[] executors;

		PowerOfTowEventLoopChooser(WorkerLoop[] executors) {
			this.executors = executors;
		}

		@Override
		public WorkerLoop next() {
			return executors[idx.getAndIncrement() & executors.length - 1];
		}
	}

	/**
	 * 
	 * 顺序
	 *
	 */
	private static final class GenericEventLoopChooser implements EventLoopChooser {
		private final AtomicInteger idx = new AtomicInteger();
		private final WorkerLoop[] executors;

		GenericEventLoopChooser(WorkerLoop[] executors) {
			this.executors = executors;
		}

		@Override
		public WorkerLoop next() {
			return executors[Math.abs(idx.getAndIncrement() % executors.length)];
		}
	}

	/**
	 * 按注册数
	 */
	private static final class BalanceEventLoopChooser implements EventLoopChooser {
		private final WorkerLoop[] executors;

		BalanceEventLoopChooser(WorkerLoop[] executors) {
			this.executors = executors;
		}

		@Override
		public WorkerLoop next() {
			WorkerLoop excutor = null;
			for (final WorkerLoop e : executors) {
				if (null == excutor || e.getRegisterCount() < excutor.getRegisterCount())
					excutor = e;
			}
			return excutor;
		}

	}

	/**
	 * 随机
	 */
	private static final class RandomEventLoopChooser implements EventLoopChooser {
		private final WorkerLoop[] executors;

		RandomEventLoopChooser(WorkerLoop[] executors) {
			this.executors = executors;
		}

		@Override
		public WorkerLoop next() {
			return executors[ThreadLocalRandom.current().nextInt(executors.length)];
		}
	}
}
