/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.concurrent.disruptor;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.util.NamedThreadFactory;
import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

/**
 * 最好调用execute来执行，有备用线程池
 *
 * @author wu_hc date: 2017年10月24日 上午10:11:58 <br/>
 */
public final class TaskDispatcher implements Dispatcher<Runnable>, Executor {

	/**
	 * 日志
	 */
	private static final Logger logger = LoggerFactory.getLogger(TaskDispatcher.class);

	private static final EventFactory<MessageEvent<Runnable>> eventFactory = new EventFactory<MessageEvent<Runnable>>() {

		@Override
		public MessageEvent<Runnable> newInstance() {
			return new MessageEvent<>();
		}
	};

	private final Disruptor<MessageEvent<Runnable>> disruptor;
	private final Executor reserveExecutor;

	public static TaskDispatcher newDispatcher(int numWorkers, String threadFactoryName, int numReserveWorkers) {
		return new TaskDispatcher(numWorkers, threadFactoryName, BUFFER_SIZE, numReserveWorkers);
	}

	public static TaskDispatcher newDispatcher(int numWorkers, String threadFactoryName, int bufSize, int numReserveWorkers) {
		return new TaskDispatcher(numWorkers, threadFactoryName, bufSize, numReserveWorkers);
	}

	public TaskDispatcher(int numWorkers) {
		this(numWorkers, "task.dispatcher", BUFFER_SIZE, 0);
	}

	@SuppressWarnings("unchecked")
	public TaskDispatcher(int numWorkers, String threadFactoryName, int bufSize, int numReserveWorkers) {

		if (numReserveWorkers > 0) {
			String name = "reserve.processor";

			reserveExecutor = new ThreadPoolExecutor(numReserveWorkers, numReserveWorkers, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(),
					new NamedThreadFactory(name));
		} else {
			reserveExecutor = null;
		}

		ThreadFactory threadFactory = new NamedThreadFactory(threadFactoryName);
		Disruptor<MessageEvent<Runnable>> dr = new Disruptor<>(eventFactory, bufSize, threadFactory, ProducerType.MULTI, new BlockingWaitStrategy());
		// dr.setDefaultExceptionHandler(new LoggingExceptionHandler());
		numWorkers = Math.min(Math.abs(numWorkers), MAX_NUM_WORKERS);
		if (numWorkers == 1) {
			dr.handleEventsWith(new TaskHandler());
		} else {
			TaskHandler[] handlers = new TaskHandler[numWorkers];
			for (int i = 0; i < numWorkers; i++) {
				handlers[i] = new TaskHandler();
			}
			dr.handleEventsWithWorkerPool(handlers);
		}

		dr.start();
		disruptor = dr;
	}

	@Override
	public boolean dispatch(Runnable message) {
		RingBuffer<MessageEvent<Runnable>> ringBuffer = disruptor.getRingBuffer();
		try {
			long sequence = ringBuffer.tryNext();
			try {
				MessageEvent<Runnable> event = ringBuffer.get(sequence);
				event.setMessage(message);
			} finally {
				ringBuffer.publish(sequence);
			}
			return true;
		} catch (Exception e) {
			logger.error("dispatcher[{}] error:", Thread.currentThread().getName(), e);
			return false;
		}
	}

	@Override
	public void execute(Runnable message) {
		if (!dispatch(message)) {
			// 备选线程池
			if (reserveExecutor != null) {
				reserveExecutor.execute(message);
			} else {
				throw new RejectedExecutionException("ring buffer is full");
			}
		}
	}

	@Override
	public void shutdown() {
		disruptor.shutdown();
	}
}
