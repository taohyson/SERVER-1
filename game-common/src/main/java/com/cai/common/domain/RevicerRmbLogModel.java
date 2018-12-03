/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 提现明显
 *
 */
@Document(collection = "revicer_rmb_log")
public class RevicerRmbLogModel implements Serializable {

	
	private String _id;
	
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	
	/**
	 * 代理id
	 */
	@Indexed(name = "index_account_id")
	private long account_id;
	
	
	private String nickname;
	
	/**
	 * 当前提现金额
	 */
	private double money;

	/**
	 * 剩余可以提现
	 */
	private double rmb;


	/**
	 * 已经提现RMB
	 */
	private double receive_rmb;
	
	
	/**
	 * 历史总收益
	 */
	private double history_rmb;
	
	/**
	 */
	private String remark;


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public Date getCreate_time() {
		return create_time;
	}


	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}


	public long getAccount_id() {
		return account_id;
	}


	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public double getRmb() {
		return rmb;
	}


	public void setRmb(double rmb) {
		this.rmb = rmb;
	}


	public double getReceive_rmb() {
		return receive_rmb;
	}


	public void setReceive_rmb(double receive_rmb) {
		this.receive_rmb = receive_rmb;
	}


	public double getHistory_rmb() {
		return history_rmb;
	}


	public void setHistory_rmb(double history_rmb) {
		this.history_rmb = history_rmb;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	


}
