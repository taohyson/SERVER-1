package com.cai.common.domain.zhuzhou;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

import com.cai.common.domain.DBBaseModel;

/**
 * 
 * 
 * 株洲协会推广返利model
 * 
 * @author tang date: 2018年9月21日 下午2:26:59 <br/>
 */
public class AccountPromoterReceiveModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private long account_id;
	private long remain_money;// 剩余返利金额
	private long history_money;// 历史总返利金额
	private long draw_money;// 已经提现的金额
	private Date create_time;
	private transient ReentrantLock redisLock;
	private transient boolean isNewAddValue;

	public boolean isNewAddValue() {
		return isNewAddValue;
	}

	public void setNewAddValue(boolean isNewAddValue) {
		this.isNewAddValue = isNewAddValue;
	}

	public AccountPromoterReceiveModel() {
	}

	public AccountPromoterReceiveModel(long account_id) {
		super();
		this.account_id = account_id;
	}

	public ReentrantLock getRedisLock() {
		if (redisLock == null) {
			redisLock = new ReentrantLock();
		}
		return redisLock;
	}

	public void setRedisLock(ReentrantLock redisLock) {
		this.redisLock = redisLock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getRemain_money() {
		return remain_money;
	}

	public void setRemain_money(long remain_money) {
		this.remain_money = remain_money;
	}

	public long getHistory_money() {
		return history_money;
	}

	public void setHistory_money(long history_money) {
		this.history_money = history_money;
	}

	public long getDraw_money() {
		return draw_money;
	}

	public void setDraw_money(long draw_money) {
		this.draw_money = draw_money;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

}
