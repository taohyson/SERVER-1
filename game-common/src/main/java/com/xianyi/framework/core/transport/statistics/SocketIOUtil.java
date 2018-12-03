/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.statistics;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.cai.common.define.EIODire;
import com.cai.common.util.NamedThreadFactory;
import com.cai.common.util.Pair;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * 流量统计
 *
 * @author wu_hc date: <br>
 *         2017年7月13日 上午11:50:10 <br/>
 */
public final class SocketIOUtil {

	/**
	 * 统计线程，共享
	 */
	private static final Executor e = Executors.newSingleThreadExecutor(new NamedThreadFactory("socket-io-thread"));

	/**
	 * 流向描述
	 */
	private EIODire dire;

	/**
	 * 进[协议号(数量，流量)]
	 */
	private final Map<Integer, Pair<Long, Long>> in = Maps.newHashMap();

	/**
	 * 出[协议号(数量，流量)]
	 */
	private final Map<Integer, Pair<Long, Long>> out = Maps.newHashMap();

	public SocketIOUtil(EIODire dire) {
		this.dire = dire;
	}

	/**
	 * @return the dire
	 */
	public EIODire getDire() {
		return dire;
	}

	/**
	 * @param dire
	 *            the dire to set
	 */
	public void setDire(EIODire dire) {
		this.dire = dire;
	}

	/**
	 * 
	 * @param code
	 * @param msgsize
	 */
	public void in(int code, long msgsize) {
		e.execute(new IOTask(EIODire.In, this, code, msgsize));
	}

	/**
	 * 
	 * @param code
	 * @param msgsize
	 */
	public void out(int code, long msgsize) {
		e.execute(new IOTask(EIODire.Out, this, code, msgsize));
	}

	/**
	 * 
	 * @param code
	 * @param msgsize
	 */
	final void inStatistics(int code, long msgsize) {
		Pair<Long, Long> pair = in.get(code);
		if (null == pair) {
			pair = Pair.of(1L, msgsize);
			in.put(code, pair);
		} else {
			pair.setFirst(pair.getFirst() + 1L);
			pair.setSecond(pair.getSecond() + msgsize);
		}
	}

	/**
	 * 
	 * @param code
	 * @param msgsize
	 */
	final void outStatistics(int code, long msgsize) {
		Pair<Long, Long> pair = out.get(code);
		if (null == pair) {
			pair = Pair.of(1L, msgsize);
			out.put(code, pair);
		} else {
			pair.setFirst(pair.getFirst() + 1L);
			pair.setSecond(pair.getSecond() + msgsize);
		}
	}

	/**
	 * 
	 * @return
	 */
	public Pair<Long, Long> getInStatistics() {
		return getStatistics(in);
	}

	/**
	 * 
	 * @return
	 */
	public Pair<Long, Long> getOutStatistics() {
		return getStatistics(out);
	}

	/**
	 * 
	 * @param map
	 * @return
	 */
	private static Pair<Long, Long> getStatistics(Map<Integer, Pair<Long, Long>> map) {
		List<Pair<Long, Long>> list = Lists.newArrayList();
		synchronized (map) {
			list.addAll(map.values());
		}
		long count = 0;
		long msgSize = 0L;

		if (!list.isEmpty()) {
			for (final Pair<Long, Long> pair : list) {
				count += pair.getFirst();
				msgSize += pair.getSecond();
			}
		}
		return Pair.of(count, msgSize);
	}
}
