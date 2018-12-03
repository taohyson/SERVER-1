package com.cai.common.thread;

public class HandleMessageExecutorPool extends AbstractMessageExecutorPool{
	
	public HandleMessageExecutorPool(String name){
		int executorNum = Runtime.getRuntime().availableProcessors();
		initExecutorPool(name, executorNum);
	}
	
	public HandleMessageExecutorPool(String name,int executorNum){
		initExecutorPool(name, executorNum);
	}
	
	private void initExecutorPool(String name,int executorNum){
		for(int index=1;index<=executorNum;index++){
			addThreadPoolExecutor(name,index);
		}
	}

	public IMessageExcutor pushTask(Runnable task) {
		return execute(task);
	}

}
