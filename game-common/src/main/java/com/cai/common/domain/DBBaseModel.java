package com.cai.common.domain;

import java.io.Serializable;

public class DBBaseModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 是否需要更新数据库
	 */
	private boolean isNeedDB = false;

	public boolean isNeedDB() {
		return isNeedDB;
	}

	public void setNeedDB(boolean isNeedDB) {
		this.isNeedDB = isNeedDB;
	}
	
	

}
