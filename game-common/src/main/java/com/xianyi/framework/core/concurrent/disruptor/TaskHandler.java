/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.concurrent.disruptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.LifecycleAware;
import com.lmax.disruptor.TimeoutHandler;
import com.lmax.disruptor.WorkHandler;

/**
 * 
 * woker
 *
 * @author wu_hc date: 2017年10月24日 上午10:17:37 <br/>
 */
public class TaskHandler implements EventHandler<MessageEvent<Runnable>>, WorkHandler<MessageEvent<Runnable>>, TimeoutHandler, LifecycleAware {

	private static final Logger logger = LoggerFactory.getLogger(TaskHandler.class);

	@Override
	public void onEvent(MessageEvent<Runnable> event, long sequence, boolean endOfBatch) throws Exception {
		event.getMessage().run();
	}

	@Override
	public void onEvent(MessageEvent<Runnable> event) throws Exception {
		event.getMessage().run();
	}

	@Override
	public void onTimeout(long sequence) throws Exception {
		if (logger.isWarnEnabled()) {
			logger.warn("Task timeout on: {}, sequence: {}.", Thread.currentThread().getName(), sequence);
		}
	}

	@Override
	public void onStart() {
		if (logger.isDebugEnabled()) {
			logger.debug("Task handler on start: {}.", Thread.currentThread().getName());
		}
	}

	@Override
	public void onShutdown() {
		if (logger.isDebugEnabled()) {
			logger.debug("Task handler on shutdown: {}.", Thread.currentThread().getName());
		}
	}
}
