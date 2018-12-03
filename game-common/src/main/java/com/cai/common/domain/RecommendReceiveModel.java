package com.cai.common.domain;

import java.util.Date;

/**
 * 账号
 * 
 * @author tang
 *
 */
public class RecommendReceiveModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 账号id
	 */
	private long account_id;
	
	private Date createTime;
	
	private Date lastTime;
	
	private int receive;//当前时间段累计返利
	
	private int level;//当前等级
	
	private transient boolean isNewAddValue;
	
	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public int getReceive() {
		return receive;
	}

	public void setReceive(int receive) {
		this.receive = receive;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public boolean isNewAddValue() {
		return isNewAddValue;
	}

	public void setNewAddValue(boolean isNewAddValue) {
		this.isNewAddValue = isNewAddValue;
	}

	public void resetModel(){
		this.receive = 0;
		this.lastTime = new Date();
		setNeedDB(true);
	}
	
}
