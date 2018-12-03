package com.xianyi.framework.core.concurrent.select;

import com.xianyi.framework.core.concurrent.WorkerLoop;
import com.xianyi.framework.core.concurrent.WorkerLoopGroup.SelectStrategy;

/**
 * 選擇策略
 * 
 * @author huancai.wu
 *
 */
public interface ChooserStrategyFactory {

	/**
	 * 
	 * @param executors
	 * @return
	 */
	EventLoopChooser newChooser(WorkerLoop[] executors);

	/**
	 * 
	 * @param executors
	 * @param strategy
	 * @return
	 */
	EventLoopChooser newChooser(WorkerLoop[] executors, SelectStrategy strategy);

	/**
	 * 
	 * 选择策略器
	 *
	 */
	interface EventLoopChooser {

		WorkerLoop next();
	}
}
