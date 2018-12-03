/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;

/**
 * 
 *
 * date: 2017年10月10日 下午8:10:29 <br/>
 */
public class RmiDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String desc;
	
	private int value;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
