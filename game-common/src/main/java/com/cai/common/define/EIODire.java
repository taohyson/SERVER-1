/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * IO流向
 *
 * @author wu_hc date: 2017年7月13日 上午11:52:50 <br/>
 */
public enum EIODire {
	NONE("--"), In("流入"), Out("流出");

	private final String description;

	EIODire(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
