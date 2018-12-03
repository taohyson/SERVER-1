package com.cai.common.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface IMessageExcutor {
	
	public Future<?> scheduleAtFixedMinute(Runnable task,long initMinDelay, long minPeriod);
	
	public Future<?> scheduleAtFixedSecond(Runnable task,long initSecDelay, long secPeriod);
	
	public void pushTask(Runnable task);
	
	public void shutdown();
	
	public String getThreadName();
	
	public void executeTask(Runnable task);
	
	public <T> Future<T> submit(Callable<T> callTask);
	
	public Future<?> scheduleSecond(Runnable task,long initSecond);
	
	public Future<?> scheduleMSecond(Runnable task,long initMilliSecond);
	
	public int getQueueSize();

}
