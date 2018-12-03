/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.xianyi.framework.core.transport.statistics;

import com.cai.common.define.EIODire;

/**
 * 
 *
 * @author wu_hc date: 2017年12月11日 下午12:14:27 <br/>
 */
public final class IOTask implements Runnable {

	private final EIODire dire;
	private final SocketIOUtil ioUitl;
	private final int code;
	private final long msgsize;

	public IOTask(EIODire dire, SocketIOUtil ioUitl, int code, long msgsize) {
		this.dire = dire;
		this.ioUitl = ioUitl;
		this.code = code;
		this.msgsize = msgsize;
	}

	public EIODire getDire() {
		return dire;
	}

	public SocketIOUtil getIoUitl() {
		return ioUitl;
	}

	@Override
	public void run() {
		if (EIODire.In == dire) {
			ioUitl.inStatistics(code, msgsize);
		} else {
			ioUitl.outStatistics(code, msgsize);
		}
	}
}
