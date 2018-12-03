package com.cai.common.core;

public class ResultCode {
	
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	
	private int status;
	private int code;
	private Object obj;
	private boolean isUpdate;
	private boolean isInterrupt;
	private boolean isLoad;
	
	public ResultCode(int status){
		this.status = status;
	}
	
	public ResultCode(int status,int code){
		this.status = status;
		this.code = code;
	}
	
	public ResultCode(int status,Object obj){
		this.status = status;
		this.obj = obj;
	}
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public boolean isUpdate() {
		return isUpdate;
	}
	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	public boolean isInterrupt() {
		return isInterrupt;
	}
	public void setInterrupt(boolean isInterrupt) {
		this.isInterrupt = isInterrupt;
	}
	public boolean isLoad() {
		return isLoad;
	}
	public void setLoad(boolean isLoad) {
		this.isLoad = isLoad;
	}

	public boolean isSuc(){
		if(status == SUCCESS){
			return true;
		}
		return false;
	}
}
