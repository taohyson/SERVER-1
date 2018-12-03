package com.cai.common.domain.info;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author zhanglong date: 2018年4月23日 上午10:42:17
 */
public class PlayerUseRedpacketInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 玩家Id
	 */
	private long accountId;
	/**
	 * 上次使用红包时间
	 */
	private Date lastUseTime;
	/**
	 * 今日使用次数
	 */
	private int useCount;
	/**
	 * 总使用次数
	 */
	private int totalCount;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Date getLastUseTime() {
		return lastUseTime;
	}

	public void setLastUseTime(Date lastUseTime) {
		this.lastUseTime = lastUseTime;
	}

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

}
