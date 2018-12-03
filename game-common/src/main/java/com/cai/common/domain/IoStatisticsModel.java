package com.cai.common.domain;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 流量统计
 * @author run
 *
 */
public final class IoStatisticsModel
{
	
	private final AtomicLong inMessages = new AtomicLong();

	private final AtomicLong outMessages = new AtomicLong();
	
	private final AtomicLong inBytes = new AtomicLong();
	
	private final AtomicLong outBytes = new AtomicLong();
	
	
	private String title;
	
	
	public IoStatisticsModel(String title){
		this.title = title;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public AtomicLong getInMessages() {
		return inMessages;
	}


	public AtomicLong getOutMessages() {
		return outMessages;
	}


	public AtomicLong getInBytes() {
		return inBytes;
	}


	public AtomicLong getOutBytes() {
		return outBytes;
	}

	

}
