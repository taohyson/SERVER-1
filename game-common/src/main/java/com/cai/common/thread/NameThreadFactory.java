package com.cai.common.thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NameThreadFactory implements ThreadFactory{
	
	private static AtomicInteger INDEX = new AtomicInteger(0);
	//警告限制为2秒   
	private static BlockedThreadChecker checker = new BlockedThreadChecker(1000, 2000, 5000);
	
	private static Set<String> nameSet = new HashSet<>();
	
	private String threadName;
	
	public NameThreadFactory(String name){
		this.threadName = getTreadName(name, 0);
	}
	
	public NameThreadFactory(String name,int index){
		this.threadName = getTreadName(name, index);;
	}
	
	private String getTreadName(String name,int index){
		StringBuffer sb = new StringBuffer();
		if(nameSet.contains(name)){
			name = name + "-" + INDEX.incrementAndGet();
		}
		sb.append(name).append("-").append(index);
		return sb.toString();
	}

	public Thread newThread(Runnable run) {
		MessageThread thread = new MessageThread(run);
		thread.setName(threadName);
		checker.registerThread(thread);
		return thread;
	}
	
	public String getName(){
		return threadName;
	}

}
