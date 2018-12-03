package com.cai.common.thread;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockedThreadChecker {

	private static final Logger logger = LoggerFactory.getLogger(BlockedThreadChecker.class);

	private static final Object O = new Object();
	private final Map<MessageThread, Object> threads = new WeakHashMap<>();
	private final Timer timer; // Need to use our own timer - can't use event
								// loop for this

	BlockedThreadChecker(long interval, long limitExceptionTime, long warnExceptionTime) {
		timer = new Timer("message-blocked-thread-checker", true);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				synchronized (BlockedThreadChecker.this) {
					for (MessageThread thread : threads.keySet()) {
						long execStart = thread.startTime();
						long dur = thread.executeTime();
						if (execStart != 0 && dur > limitExceptionTime) {
							final String message = "Thread " + thread + " has been blocked for " + (dur / 1000)
									+ "s, time limit is " + (limitExceptionTime / 1000) + "s, queue size is " 
									+ thread.getQueueSize() + ", thread size is " + threads.size() + " !!!";
							if (dur <= warnExceptionTime) {
								logger.warn(message);
							} else {
								RuntimeException stackTrace = new RuntimeException("Thread blocked !!");
								stackTrace.setStackTrace(thread.getStackTrace());
								logger.error(message, stackTrace);
							}
						}
					}
				}
			}
		}, interval, interval);
	}

	public synchronized void registerThread(MessageThread thread) {
		threads.put(thread, O);
	}

	public void close() {
		timer.cancel();
	}

}
