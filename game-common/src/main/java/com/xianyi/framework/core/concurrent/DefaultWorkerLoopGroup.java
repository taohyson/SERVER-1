/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.xianyi.framework.core.concurrent;

import com.xianyi.framework.core.concurrent.select.ChooserStrategyFactory;
import com.xianyi.framework.core.concurrent.select.DefaultChooserStrategyFactory;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年7月日 下午11:43:31 <br/>
 */
public class DefaultWorkerLoopGroup implements WorkerLoopGroup {

	/**
	 * 工作组
	 */
	private final WorkerLoop[] executors;

	/**
	 * 分配策略
	 */
	private final SelectStrategy strategy;

	/**
	 * 选择器
	 */
	private final ChooserStrategyFactory.EventLoopChooser chooser;

	/**
	 * 
	 */
	private final int workerSize;

	/**
	 * 
	 * @param prefix
	 * @return
	 */
	public static DefaultWorkerLoopGroup newGroup(String prefix) {
		return new DefaultWorkerLoopGroup(prefix, Runtime.getRuntime().availableProcessors(), SelectStrategy.ROUND);
	}

	/**
	 * 
	 * @param prefix
	 * @param workerCount
	 * @return
	 */
	public static DefaultWorkerLoopGroup newGroup(String prefix, int workerCount) {
		return new DefaultWorkerLoopGroup(prefix, workerCount, SelectStrategy.ROUND);
	}

	/**
	 * 
	 * @param prefix
	 * @param workerCount
	 * @param strategy
	 * @return
	 */
	public static DefaultWorkerLoopGroup newGroup(String prefix, int workerCount, SelectStrategy strategy) {
		return new DefaultWorkerLoopGroup(prefix, workerCount, strategy);
	}

	/**
	 * 
	 * @param prefix
	 * @param workerCount
	 * @param strategy
	 */
	private DefaultWorkerLoopGroup(String prefix, int workerCount, SelectStrategy strategy) {
		if (workerCount <= 0) {
			throw new IllegalArgumentException("create event loop group,size must more than zero!");
		}

		executors = new WorkerLoop[workerCount];
		for (int i = 0; i < workerCount; i++) {
			executors[i] = new DefaultWorkerLoop(prefix, i + 1);
		}
		this.workerSize = workerCount;
		this.strategy = strategy;
		chooser = DefaultChooserStrategyFactory.getInstance().newChooser(executors, strategy);
	}

	@Override
	public WorkerLoop next() {
		return chooser.next();
	}

	/**
	 * 
	 * @param hash
	 * @return
	 */
	@Override
	public WorkerLoop next(int hash) {
		return executors[Math.abs(hash % executors.length)];
	}
	
	/**
	 * 
	 * @param hash
	 * @return
	 */
	public WorkerLoop next(long hash) {
		return executors[(int) Math.abs(hash % executors.length)];
	}

	@Override
	public SelectStrategy getStrategy() {
		return this.strategy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < executors.length; i++) {
			sb.append("event-" + i).append(" register:").append(executors[i].getRegisterCount()).append("\t");
		}
		return sb.toString();
	}

	@Override
	public long getTaskCount() {
		long count = 0;
		for (WorkerLoop executor : executors) {
			count += executor.getTaskCount();
		}
		return count;
	}

	@Override
	public long getCompletedTaskCount() {
		long count = 0;
		for (WorkerLoop executor : executors) {
			count += executor.getCompletedTaskCount();
		}
		return count;
	}

	@Override
	public int workerSize() {
		return this.workerSize;
	}

}
