package com.cai.common.core.transport;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import com.xianyi.framework.core.concurrent.DefaultWorkerLoopGroup;
import com.xianyi.framework.core.concurrent.IEventListener;
import com.xianyi.framework.core.concurrent.WorkerLoop;
import com.xianyi.framework.core.concurrent.WorkerLoopGroup;
import com.xianyi.framework.core.concurrent.WorkerLoopGroup.SelectStrategy;

public final class EventLoopTest {

	public static void main(String[] args) {
		EventLoopTest test = new EventLoopTest();
		// test.testThreadPool();
		test.testEventLoop();

		for (int i = 1; i < 20; i++) {
			System.out.println("i ^ " + i + "=" + (1 << i));
		}
	}

	public void testThreadPool() {
		final ExecutorService servicce = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (;;) {
					// try {
					// TimeUnit.MILLISECONDS.sleep(100L);
					// } catch (InterruptedException e) {
					// e.printStackTrace();
					// }
					servicce.execute(new Runnable() {
						@Override
						public void run() {
							System.out.println(Thread.currentThread().getName());
						}
					});
				}
			}
		});
		thread.setName("report thread");
		thread.start();

	}

	public void testEventLoop() {

		final WorkerLoopGroup group = DefaultWorkerLoopGroup.newGroup("GAME-PLAYER-WORKER", 1 << 3,
				SelectStrategy.ROUND);

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (;;) {
					try {
						TimeUnit.MILLISECONDS.sleep(1L);
					} catch (Exception e) {
						e.printStackTrace();
					}
					WorkerLoop loop = group.next();
					if (ThreadLocalRandom.current().nextInt(3) > 1)
						loop.register(new IEventListener() {

							@Override
							public void onEvent(Object event) {
							}
						});

					loop.runInLoop(new Runnable() {

						@Override
						public void run() {
							// try {
							// TimeUnit.SECONDS.sleep(4);
							// } catch (InterruptedException e) {
							// e.printStackTrace();
							// }
							System.out.println(Thread.currentThread().getName() + "\tnor" + "\t" + group);
						}
					});

					// loop.runInPriLoop(new Runnable() {
					//
					// @Override
					// public void run() {
					// System.out.println(Thread.currentThread().getName() +
					// "\tpri" + "\t" + group);
					// }
					// });
				}
			}
		});
		thread.setName("report thread");
		thread.start();
	}
}
