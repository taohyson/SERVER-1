/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain.log;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

/**
 * MONGO DB 基类
 *
 * @author wu_hc date: 2018年4月24日 下午2:56:38 <br/>
 */
public abstract class BaseLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 是否需要更新数据库
	 */
	@Transient
	private boolean isNeedDB = false;

	public boolean isNeedDB() {
		return isNeedDB;
	}

	public void setNeedDB(boolean isNeedDB) {
		this.isNeedDB = isNeedDB;
	}
}
