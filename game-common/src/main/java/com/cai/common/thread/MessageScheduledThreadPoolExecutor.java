package com.cai.common.thread;

import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cai.common.base.BaseTask;

public class MessageScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {

	private static Logger LOGGER = LoggerFactory.getLogger(MessageScheduledThreadPoolExecutor.class);
	
	public MessageScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory) {
		super(corePoolSize, threadFactory);
	}

	@Override
	protected void beforeExecute(Thread t, Runnable r) {
		BaseTask task = transferToBaseTask(r);
		if(task != null){
			MessageThread mThread = transferToMessageThread(t);
			if(mThread != null){
				mThread.executeStart();
				mThread.setQueueSize(getQueueSize());
				task.setMessageThread(mThread);
			}
		}
	}

	@Override
	protected <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> task) {
		MessageScheduleFuture<V> messageFuture = new MessageScheduleFuture<>(runnable, task);
		return messageFuture;
	}

	@Override
	protected void afterExecute(Runnable r, Throwable t) {
		BaseTask task = transferToBaseTask(r);
		if(task != null){
			if(task.getException() != null){
				LOGGER.error("Thread execute error !!", task.getException());
			}
			
			MessageThread mThread = task.getMessageThread();
			task.setMessageThread(null);
			if(mThread == null){
				return;
			}
			
			mThread.executeEnd();
		}
	}
	
	@SuppressWarnings("rawtypes")
	private BaseTask transferToBaseTask(Runnable r){
		BaseTask task = null;
		if(r instanceof MessageScheduleFuture){
			MessageScheduleFuture messageFuture = (MessageScheduleFuture) r;
			Runnable runTask = messageFuture.getTask();
			if(runTask != null && runTask instanceof BaseTask){
				task = (BaseTask) runTask;
			}
		}
		return task;
	}
	
	private MessageThread transferToMessageThread(Thread thread){
		MessageThread mThread = null;
		if(thread instanceof MessageThread){
			mThread = (MessageThread) thread;
		}
		return mThread;
	}
	
	private int getQueueSize() {
		int size = 0;
		if(getQueue() != null){
			size = getQueue().size();
		}
		return size;
	}

}
