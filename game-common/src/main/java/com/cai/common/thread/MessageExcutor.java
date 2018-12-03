package com.cai.common.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MessageExcutor implements IMessageExcutor {

	private ScheduledThreadPoolExecutor executor;
	private String threadName;
	
	public MessageExcutor(String name){
		NameThreadFactory factory = new NameThreadFactory(name);
		initExcutor(factory);
	}
	
	public MessageExcutor(String name,int index){
		NameThreadFactory factory = new NameThreadFactory(name,index);
		initExcutor(factory);
	}
	
	private void initExcutor(NameThreadFactory factory){
		this.threadName = factory.getName();
		this.executor = new MessageScheduledThreadPoolExecutor(1, factory);
	}
	
	public void pushTask(Runnable task) {
		
	}

	public void shutdown() {
		if(executor != null && !executor.isShutdown()){
			executor.shutdownNow();
		}
	}

	public String getThreadName() {
		return threadName;
	}

	public void executeTask(Runnable task) {
		executor.execute(task);
	}

	@Override
	public <T> Future<T> submit(Callable<T> callTask) {
		Future<T> result = executor.submit(callTask);
		return result;
	}

	@Override
	public Future<?> scheduleAtFixedMinute(Runnable task, long initMinDelay,
			long minPeriod) {
		Future<?> future = executor.scheduleAtFixedRate(task, initMinDelay, minPeriod, TimeUnit.MINUTES);
		return future;
	}

	@Override
	public Future<?> scheduleAtFixedSecond(Runnable task, long initSecDelay, long secPeriod) {
		Future<?> future = executor.scheduleAtFixedRate(task, initSecDelay, secPeriod, TimeUnit.SECONDS);
		return future;
	}

	@Override
	public Future<?> scheduleSecond(Runnable task, long initSecond) {
		Future<?> future = executor.schedule(task, initSecond, TimeUnit.SECONDS);
		return future;
	}
	
	@Override
	public Future<?> scheduleMSecond(Runnable task,long initMilliSecond) {
		Future<?> future = executor.schedule(task, initMilliSecond, TimeUnit.MILLISECONDS);
		return future;
	}

	@Override
	public int getQueueSize() {
		int size = 0;
		BlockingQueue<Runnable> taskQueue = executor.getQueue();
		if(taskQueue != null){
			size = taskQueue.size();
		}
		return size;
	}

}
