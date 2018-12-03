/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;

/**
 * 
 *
 * @author WalkerGeek 
 * date: 2017年10月30日 上午10:06:01 <br/>
 */
public class SysPalyerEmailModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int emailId;
	
	private int isOpen;
	
	private int isReceive;

	/**
	 * @return the emailId
	 */
	public int getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the isOpen
	 */
	public int getIsOpen() {
		return isOpen;
	}

	/**
	 * @param isOpen the isOpen to set
	 */
	public void setIsOpen(int isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * @return the isReceive
	 */
	public int getIsReceive() {
		return isReceive;
	}

	/**
	 * @param isReceive the isReceive to set
	 */
	public void setIsReceive(int isReceive) {
		this.isReceive = isReceive;
	}
	
	
	
}
