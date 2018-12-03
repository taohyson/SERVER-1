package com.cai.common.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface IMessageExecutorPool {
	
	/**
	 * 获取线程池中  执行队列任务最小的任务的执行器
	 */
	public int getIndex();
	
	public IMessageExcutor pushTask(Runnable task);
	
	public IMessageExcutor execute(Runnable task);
	
	public IMessageExcutor execute(long index,Runnable task);
	
	public <T> Future<T> submit(Callable<T> callTask);
	
	public void shutdown();
	
	public IMessageExcutor getExecutorByName(String threadName);
	
	public IMessageExcutor getExecutor(long index);
	
	public int getExecutorPoolSize();
	
	public Future<?> scheduleAtFixedMinute(Runnable task,long initMinDelay, long minPeriod);
	
	public Future<?> scheduleAtFixedMinute(long index,Runnable task,long initMinDelay, long minPeriod);
	
	public Future<?> scheduleAtFixedSecond(Runnable task,long initSecDelay, long SecPeriod);
	
	public Future<?> scheduleAtFixedSecond(long index,Runnable task,long initSecDelay, long SecPeriod);
	
	public Future<?> schedule(Runnable task,long initMilliSecond);
	
	public Future<?> scheduleSecond(long index,Runnable task,long initSecond);
	
	public Future<?> scheduleMSecond(long index,Runnable task,long initMilliSecond);
	
	public void cancelFuture(String name);

}
