package com.cai.common.thread;

public class MessageThread extends Thread{
	
	private long execStart;
	private int queueSize;
	
	public MessageThread() { }

    public MessageThread(Runnable target) {
        super(target);
    }

    public MessageThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MessageThread(String name) {
        super(name);
    }

    public MessageThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MessageThread(Runnable target, String name) {
        super(target, name);
    }

    public MessageThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MessageThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }
    
    public final void executeStart() {
        execStart = System.currentTimeMillis();
    }

    public final void executeEnd() {
    	execStart = 0;
    }
    
    public long executeTime(){
    	long time = System.currentTimeMillis() - startTime();
    	return time;
    }
    
    public long startTime() {
        return execStart;
    }

	public int getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}

}
