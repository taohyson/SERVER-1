/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.util.Date;

/**
 * 
 * 玩家邮件Model
 * @author WalkerGeek 
 */
public class PlayerEmailModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int mailID;      // 邮件主键ID
	
	private long receiverID; // 接受者ID
	
	private long senderID;	 //发送人Id  
	
	private Date sendTime;   //发送时间
	
	private Date expireTime; //过期时间
	
	private String title;	 //标题
		
	private String content;	 //内容
	
	private int extraType;    //邮件特殊状态  1:附件未领取 ：2 已领取 3没有附件 4删除
	
	private String extraData;  //附件
	
	private int isOpen;    //阅读状态 true 已查看
	

	/**
	 * @return the mailID
	 */
	public int getMailID() {
		return mailID;
	}

	/**
	 * @param mailID the mailID to set
	 */
	public void setMailID(int mailID) {
		this.mailID = mailID;
	}
	

	/**
	 * @return the receiverID
	 */
	public long getReceiverID() {
		return receiverID;
	}

	/**
	 * @param receiverID the receiverID to set
	 */
	public void setReceiverID(long receiverID) {
		this.receiverID = receiverID;
	}

	/**
	 * @return the senderID
	 */
	public long getSenderID() {
		return senderID;
	}

	/**
	 * @param senderID the senderID to set
	 */
	public void setSenderID(long senderID) {
		this.senderID = senderID;
	}

	/**
	 * @return the sendTime
	 */
	public Date getSendTime() {
		return sendTime;
	}

	/**
	 * @param sendTime the sendTime to set
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * @return the expireTime
	 */
	public Date getExpireTime() {
		return expireTime;
	}

	/**
	 * @param expireTime the expireTime to set
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	

	/**
	 * @return the extraData
	 */
	public String getExtraData() {
		return extraData;
	}

	/**
	 * @param extraData the extraData to set
	 */
	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	/**
	 * @return the extraType
	 */
	public int getExtraType() {
		return extraType;
	}

	/**
	 * @param extraType the extraType to set
	 */
	public void setExtraType(int extraType) {
		this.extraType = extraType;
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

	
	
	
}
