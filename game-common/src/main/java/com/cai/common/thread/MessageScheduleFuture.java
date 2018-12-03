package com.cai.common.thread;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MessageScheduleFuture<V> implements RunnableScheduledFuture<V> {
	
	private Runnable task;
	private RunnableScheduledFuture<V> scheduleFuture;
	
	public MessageScheduleFuture(Runnable task, RunnableScheduledFuture<V> scheduleFuture){
		this.task = task;
		this.scheduleFuture = scheduleFuture;
	}

	@Override
	public void run() {
		scheduleFuture.run();
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		return scheduleFuture.cancel(mayInterruptIfRunning);
	}

	@Override
	public boolean isCancelled() {
		return scheduleFuture.isCancelled();
	}

	@Override
	public boolean isDone() {
		return scheduleFuture.isDone();
	}

	@Override
	public V get() throws InterruptedException, ExecutionException {
		return scheduleFuture.get();
	}

	@Override
	public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		return scheduleFuture.get(timeout, unit);
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return scheduleFuture.getDelay(unit);
	}

	@Override
	public int compareTo(Delayed o) {
		return scheduleFuture.compareTo(o);
	}

	@Override
	public boolean isPeriodic() {
		return scheduleFuture.isPeriodic();
	}

	public Runnable getTask() {
		return task;
	}

}
