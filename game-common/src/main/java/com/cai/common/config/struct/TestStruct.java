/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config.struct;

import java.util.List;

import com.cai.common.config.EnumConfig;
import com.cai.common.config.IConfig;

/**
 *
 * @author wu_hc
 */
@IConfig(tag = EnumConfig.TEST)
public final class TestStruct implements Config {

	/**
	 * 
	 */
	private String a;

	private int b;

	private boolean c;

	private List<String> d;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}

	public List<String> getD() {
		return d;
	}

	public void setD(List<String> d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "TestStruct [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
