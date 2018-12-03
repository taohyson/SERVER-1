package com.cai.common.domain;

import java.io.Serializable;

/**
 * redis 通知字典更新
 * @author run
 *
 */
public class RedisDictUpdateModel implements Serializable{

	/**
	 * 更新类型
	 */
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
