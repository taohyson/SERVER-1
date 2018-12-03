/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.util.Date;

/**
 * 
 * 系统邮件Model
 * @author WalkerGeek 
 */
public class SysEmailModel extends DBBaseModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;      // 系统邮件主键ID
	
	private int type;           //1时效性邮件 ，2长期邮件
	
	private int app;            //指定应用0全部，1大厅安卓，2大厅ios
	
	private String receiver_id; // 接受者ID 逗号分隔 1 全部玩家 2发送时间所以有在线玩家 3指定玩家
	
	private long sender_id;	 //发送人Id
	
	private int send_type; //发送类型，1立即发送，2定时发送
	
	private Date send_time;   //发送时间
	
	private Date expire_time; //过期时间
	
	private String title;	 //标题
		
	private String content;	 //内容
	
	private int extra_type;    //邮件特殊状态  1:附件未领取 ：2 已领取
	
	private String extra_data;  //附件[{"itemId":10001,count:1}]
	
	private int send_state;//发送状态，0未发送，1已经发送
	
	private String operator;//操作者
	
	private int state;//邮件状态
	
	private Date operate_time;//操作时间
	
	private int isOpen;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the app
	 */
	public int getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	public void setApp(int app) {
		this.app = app;
	}

	/**
	 * @return the receiver_id
	 */
	public String getReceiver_id() {
		return receiver_id;
	}

	/**
	 * @param receiver_id the receiver_id to set
	 */
	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}

	/**
	 * @return the sender_id
	 */
	public long getSender_id() {
		return sender_id;
	}

	/**
	 * @param sender_id the sender_id to set
	 */
	public void setSender_id(long sender_id) {
		this.sender_id = sender_id;
	}

	/**
	 * @return the send_type
	 */
	public int getSend_type() {
		return send_type;
	}

	/**
	 * @param send_type the send_type to set
	 */
	public void setSend_type(int send_type) {
		this.send_type = send_type;
	}

	/**
	 * @return the send_time
	 */
	public Date getSend_time() {
		return send_time;
	}

	/**
	 * @param send_time the send_time to set
	 */
	public void setSend_time(Date send_time) {
		this.send_time = send_time;
	}

	/**
	 * @return the expire_time
	 */
	public Date getExpire_time() {
		return expire_time;
	}

	/**
	 * @param expire_time the expire_time to set
	 */
	public void setExpire_time(Date expire_time) {
		this.expire_time = expire_time;
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
	 * @return the extra_type
	 */
	public int getExtra_type() {
		return extra_type;
	}

	/**
	 * @param extra_type the extra_type to set
	 */
	public void setExtra_type(int extra_type) {
		this.extra_type = extra_type;
	}

	/**
	 * @return the extra_data
	 */
	public String getExtra_data() {
		return extra_data;
	}

	/**
	 * @param extra_data the extra_data to set
	 */
	public void setExtra_data(String extra_data) {
		this.extra_data = extra_data;
	}

	/**
	 * @return the send_state
	 */
	public int getSend_state() {
		return send_state;
	}

	/**
	 * @param send_state the send_state to set
	 */
	public void setSend_state(int send_state) {
		this.send_state = send_state;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the operate_time
	 */
	public Date getOperate_time() {
		return operate_time;
	}

	/**
	 * @param operate_time the operate_time to set
	 */
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
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
