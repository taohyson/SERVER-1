package com.cai.common.base;

import com.cai.common.thread.MessageThread;

public abstract class BaseTask implements Runnable {

	private Exception exception;
	private MessageThread messageThread;

	@Override
	public void run() {
		try {
			execute();
		} catch (Exception e) {
			e.printStackTrace();
			this.exception = e;
		}
	}

	public abstract void execute();

	public String getTaskName(){
		return this.getClass().getSimpleName();
	};

	public Exception getException() {
		return exception;
	}

	public MessageThread getMessageThread() {
		return messageThread;
	}

	public void setMessageThread(MessageThread messageThread) {
		this.messageThread = messageThread;
	}

}
