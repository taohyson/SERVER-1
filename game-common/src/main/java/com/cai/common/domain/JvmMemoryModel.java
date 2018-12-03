package com.cai.common.domain;

import java.io.Serializable;

/**
 * jvm内存使用情况
 * 
 * @author run
 *
 */
public class JvmMemoryModel implements Serializable {
	private long max;
	private long total;
	private long free;
	private long use;

	public JvmMemoryModel(){
		Runtime run = Runtime.getRuntime();
		max = run.maxMemory();
		total = run.totalMemory();
		free = run.freeMemory();
		use = total-free;
	}
	
	public String info(){
		StringBuilder buf = new StringBuilder();
		buf.append("最大内存:"+max/(1024L*1024)+"M")
		.append(",已分配内存:"+total/(1024L*1024)+"M")
		.append("使用:"+use/(1024L*1024)+"M");
		return buf.toString();
	}

	public long getMax() {
		return max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getFree() {
		return free;
	}

	public void setFree(long free) {
		this.free = free;
	}

	public long getUse() {
		return use;
	}

	public void setUse(long use) {
		this.use = use;
	}
	
	

}
