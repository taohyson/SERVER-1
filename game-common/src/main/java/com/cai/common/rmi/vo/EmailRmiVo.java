package com.cai.common.rmi.vo;

import java.io.Serializable;

import com.cai.common.define.EmailContentEnum;
import com.cai.common.domain.ItemDTO;

public class EmailRmiVo implements Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 1L;

	private long accountId;
	
	private EmailContentEnum emailEnum;
	
	private Object[] titleArgs = null;
	
	private Object[] contentArgs = null;
	
	private long receiveId;
	
	private ItemDTO item;
	
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public EmailContentEnum getEmailEnum() {
		return emailEnum;
	}

	public void setEmailEnum(EmailContentEnum emailEnum) {
		this.emailEnum = emailEnum;
	}

	public Object[] getTitleArgs() {
		return titleArgs;
	}

	public void setTitleArgs(Object[] titleArgs) {
		this.titleArgs = titleArgs;
	}

	public Object[] getContentArgs() {
		return contentArgs;
	}

	public void setContentArgs(Object[] contentArgs) {
		this.contentArgs = contentArgs;
	}

	public long getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(long receiveId) {
		this.receiveId = receiveId;
	}

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}

}
