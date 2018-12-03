package com.cai.common.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public abstract class AbstractMessageExecutorPool implements IMessageExecutorPool {
	
	protected Map<String, IMessageExcutor> threadMap = new HashMap<String, IMessageExcutor>();
	protected List<IMessageExcutor> threadList = new ArrayList<IMessageExcutor>();
	private Map<String, Future<?>> futureMap = new HashMap<>();
	
	public IMessageExcutor addThreadPoolExecutor(String name,int index){
		IMessageExcutor executor = new MessageExcutor(name,index);
		threadMap.put(executor.getThreadName(), executor);
		threadList.add(executor);
		
		return executor;
	}
	
	@Override
	public int getIndex(){
		int executorIndex = 0;
		int minQueueNum = Integer.MAX_VALUE;
		int queueNum = 0;
		IMessageExcutor executor = null;
		for(int index = 0;index < threadList.size();index++){
			executor = threadList.get(index);
			queueNum = executor.getQueueSize();
			if(queueNum < minQueueNum){
				minQueueNum = queueNum;
				executorIndex = index;
			}
		}
		return executorIndex;
	}
	
	public int getExecutorPoolSize() {
		return threadList.size();
	}

	public void shutdown() {
		if(threadList.isEmpty()){
			return;
		}
		for(IMessageExcutor ex : threadList){
			ex.shutdown();
		}
	}

	public IMessageExcutor getExecutorByName(String threadName) {
		IMessageExcutor executor = threadMap.get(threadName);
		return executor;
	}
	
	/** 根据指定的索引获取对应的执行器 */
	public IMessageExcutor getExecutorByIndex(int index){
		int size = getExecutorPoolSize();
		if(index >= size){
			index = 0;
		}
		IMessageExcutor executor = threadList.get(index);
		return executor;
	}
	
	/** 根据指定的值获取对应的索引值   获取对应的执行器 */
	public IMessageExcutor getExecutor(long index){
		int size = getExecutorPoolSize();
		if(index < 0){
			index = -index;
		}
		int eIndex = (int) (index % size);
		IMessageExcutor executor = threadList.get(eIndex);
		return executor;
	}
	
	public IMessageExcutor execute(Runnable task){
		IMessageExcutor executor = getExecutorByIndex(getIndex());
		executor.executeTask(task);
		return executor;
	}
	
	public IMessageExcutor execute(long index,Runnable task){
		IMessageExcutor executor = getExecutor(index);
		executor.executeTask(task);
		return executor;
	}
	
	@Override
	public <T> Future<T> submit(Callable<T> callTask) {
		IMessageExcutor executor = getExecutorByIndex(getIndex());
		Future<T> result = executor.submit(callTask);
		return result;
	}

	@Override
	public Future<?> scheduleAtFixedMinute(Runnable task, long initMinDelay,
			long minPeriod) {
		IMessageExcutor executor = getExecutorByIndex(getIndex());
		return executor.scheduleAtFixedMinute(task, initMinDelay, minPeriod);
	}
	
	@Override
	public Future<?> scheduleAtFixedMinute(long index,Runnable task, long initMinDelay,
			long minPeriod) {
		IMessageExcutor executor = getExecutor(index);
		return executor.scheduleAtFixedMinute(task, initMinDelay, minPeriod);
	}

	@Override
	public Future<?> scheduleAtFixedSecond(Runnable task, long initSecDelay, long SecPeriod) {
		IMessageExcutor executor = getExecutorByIndex(getIndex());
		return executor.scheduleAtFixedSecond(task, initSecDelay, SecPeriod);
	}
	
	@Override
	public Future<?> scheduleAtFixedSecond(long index,Runnable task, long initSecDelay, long SecPeriod) {
		IMessageExcutor executor = getExecutor(index);
		return executor.scheduleAtFixedSecond(task, initSecDelay, SecPeriod);
	}
	
	@Override
	public Future<?> schedule(Runnable task,long initMilliSecond){
		IMessageExcutor executor = getExecutorByIndex(getIndex());
		return executor.scheduleMSecond(task, initMilliSecond);
	}
	
	@Override
	public Future<?> scheduleSecond(long index,Runnable task,long initSecond) {
		IMessageExcutor executor = getExecutor(index);
		Future<?> future = executor.scheduleSecond(task, initSecond);
		return future;
	}
	
	@Override
	public Future<?> scheduleMSecond(long index,Runnable task,long initMilliSecond) {
		IMessageExcutor executor = getExecutor(index);
		Future<?> future = executor.scheduleMSecond(task, initMilliSecond);
		return future;
	}
	
	@Override
	public void cancelFuture(String name){
		Future<?> future = futureMap.get(name);
		if(future != null){
			future.cancel(true);
		}
 	}
	
}
