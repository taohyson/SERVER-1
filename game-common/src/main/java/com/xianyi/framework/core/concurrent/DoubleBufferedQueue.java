package com.xianyi.framework.core.concurrent;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 双缓冲队列
 *
 * @author wu_hc date: 2018年8月9日 下午2:55:30 <br/>
 */
public final class DoubleBufferedQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(DoubleBufferedQueue.class);
	/**
	 * The queued items
	 */
	private final Object[] itemsA;
	private final Object[] itemsB;

	private final ReentrantLock readLock = new ReentrantLock(), writeLock = new ReentrantLock();
	private Condition notFull;
	private Condition awake;

	private Object[] writeArray, readArray;
	private volatile int writeCount, readCount;
	private int writeArrayTP, readArrayHP;

	public DoubleBufferedQueue(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Queue initial capacity can't less than 0!");
		}

		itemsA = new Object[capacity];
		itemsB = new Object[capacity];

		notFull = writeLock.newCondition();
		awake = writeLock.newCondition();

		readArray = itemsA;
		writeArray = itemsB;
	}

	private void insert(E e) {
		writeArray[writeArrayTP] = e;
		++writeArrayTP;
		++writeCount;
	}

	private Object extract() {
		Object e = readArray[readArrayHP];
		readArray[readArrayHP] = null;
		++readArrayHP;
		--readCount;
		return e;
	}

	/**
	 * switch condition:
	 * read queue is empty && write queue is not empty
	 * <p>
	 * Notice:This function can only be invoked after readLock is
	 * grabbed,or may cause dead lock
	 *
	 * @param timeout
	 * @param isInfinite: whether need to wait forever until some other
	 *                    thread awake it
	 * @return
	 * @throws InterruptedException
	 */
	private long queueSwitch(long timeout, boolean isInfinite) throws InterruptedException {
		writeLock.lock();
		try {
			if (writeCount <= 0) {
				logger.debug("Write Count:" + writeCount + ", Write Queue is empty, do not switch!");
				try {
					logger.debug("Queue is empty, need wait....");
					if (isInfinite && timeout <= 0) {
						awake.await();
						return -1;
					} else {
						return awake.awaitNanos(timeout);
					}
				} catch (InterruptedException ie) {
					awake.signal();
					throw ie;
				}
			} else {
				Object[] tmpArray = readArray;
				readArray = writeArray;
				writeArray = tmpArray;

				readCount = writeCount;
				readArrayHP = 0;

				writeCount = 0;
				writeArrayTP = 0;

				notFull.signal();
				logger.debug("Queue switch successfully!");
				return -1;
			}
		} finally {
			writeLock.unlock();
		}
	}

	@Override
	public void put(E e) throws InterruptedException {

	}

	public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
		if (e == null) {
			throw new NullPointerException();
		}

		long nanoTime = unit.toNanos(timeout);
		writeLock.lockInterruptibly();
		try {
			for (; ; ) {
				if (writeCount < writeArray.length) {
					insert(e);
					if (writeCount == 1) {
						awake.signal();
					}
					return true;
				}

				//Time out
				if (nanoTime <= 0) {
					logger.debug("offer wait time out!");
					return false;
				}
				//keep waiting
				try {
					logger.debug("Queue is full, need wait....");
					nanoTime = notFull.awaitNanos(nanoTime);
				} catch (InterruptedException ie) {
					notFull.signal();
					throw ie;
				}
			}
		} finally {
			writeLock.unlock();
		}
	}

	@Override
	public E take() throws InterruptedException {
		return null;
	}

	public E poll(long timeout, TimeUnit unit) throws InterruptedException {
		long nanoTime = unit.toNanos(timeout);
		readLock.lockInterruptibly();

		try {
			for (; ; ) {
				if (readCount > 0) {
					return (E) extract();
				}

				if (nanoTime <= 0) {
					logger.debug("poll time out!");
					return null;
				}
				nanoTime = queueSwitch(nanoTime, false);
			}
		} finally {
			readLock.unlock();
		}
	}

	@Override
	public int remainingCapacity() {
		return 0;
	}

	@Override
	public int drainTo(Collection<? super E> c) {
		return 0;
	}

	@Override
	public int drainTo(Collection<? super E> c, int maxElements) {
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean offer(E e) {
		return false;
	}

	@Override
	public E poll() {
		return null;
	}

	@Override
	public E peek() {
		return null;
	}
}
