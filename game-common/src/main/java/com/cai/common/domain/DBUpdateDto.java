package com.cai.common.domain;

import com.cai.common.define.DbOpType;
import com.cai.common.define.DbStoreType;

/**
 * 数据库更新
 * @author run
 *
 */
public class DBUpdateDto {

	private DbStoreType dbStoreType;
	
	private DbOpType dbOpType;
	
	private String sqlStr;
	
	private Object object;
	
	private String logMsg;
	
	public DBUpdateDto(DbStoreType dbStoreType,DbOpType dbOpType,String sqlStr,Object object){
		this.dbStoreType = dbStoreType;
		this.dbOpType = dbOpType;
		this.sqlStr = sqlStr;
		this.object = object;
	}
	
	public DBUpdateDto(DbStoreType dbStoreType,DbOpType dbOpType,String sqlStr,Object object,String logMsg){
		this.dbStoreType = dbStoreType;
		this.dbOpType = dbOpType;
		this.sqlStr = sqlStr;
		this.object = object;
		this.setLogMsg(logMsg);
	}


	public DbStoreType getDbStoreType() {
		return dbStoreType;
	}

	public void setDbStoreType(DbStoreType dbStoreType) {
		this.dbStoreType = dbStoreType;
	}

	public DbOpType getDbOpType() {
		return dbOpType;
	}

	public void setDbOpType(DbOpType dbOpType) {
		this.dbOpType = dbOpType;
	}

	public String getSqlStr() {
		return sqlStr;
	}

	public void setSqlStr(String sqlStr) {
		this.sqlStr = sqlStr;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getLogMsg() {
		return logMsg;
	}

	public void setLogMsg(String logMsg) {
		this.logMsg = logMsg;
	}
	
	
	
	
	
}
