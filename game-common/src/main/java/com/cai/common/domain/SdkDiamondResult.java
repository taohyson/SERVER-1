package com.cai.common.domain;

import java.io.Serializable;

public class SdkDiamondResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private boolean result=false;
	
	
	private int curdiamond;
	
	
	private String extentMsg;


	public int getCurdiamond() {
		return curdiamond;
	}


	public void setCurdiamond(int curdiamond) {
		this.curdiamond = curdiamond;
	}


	public boolean getResult() {
		return result;
	}


	public void setResult(boolean result) {
		this.result = result;
	}


	public String getExtentMsg() {
		return extentMsg;
	}


	public void setExtentMsg(String extentMsg) {
		this.extentMsg = extentMsg;
	}



}
