package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invite_money")
//邀请新用户真实操作红包
public class InviteMoneyModel implements Serializable{
	/**
	 * 玩家帐号ID
	 */
	@Indexed
	private long account_id;
	
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	@Indexed
	private long target_account_id;
	//操作类型 0进账获得红包，1出账提取红包
	private int opt_type;
	//返利金额，分为单位
	private int receive;
	//活动id
	private int active_id;
	
	private int receive_type;//获得红包类型，0推荐别人，1别人推荐自己,2提现
	
	
	
	
	public int getReceive_type() {
		return receive_type;
	}
	public void setReceive_type(int receive_type) {
		this.receive_type = receive_type;
	}
	public int getOpt_type() {
		return opt_type;
	}
	public void setOpt_type(int opt_type) {
		this.opt_type = opt_type;
	}
	public int getActive_id() {
		return active_id;
	}
	public void setActive_id(int active_id) {
		this.active_id = active_id;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public long getTarget_account_id() {
		return target_account_id;
	}
	public void setTarget_account_id(long target_account_id) {
		this.target_account_id = target_account_id;
	}
	public int getReceive() {
		return receive;
	}
	public void setReceive(int receive) {
		this.receive = receive;
	}
	public InviteMoneyModel(long account_id, long target_account_id, int opt_type, int receive, int active_id, int receive_type) {
		super();
		this.account_id = account_id;
		this.target_account_id = target_account_id;
		this.opt_type = opt_type;
		this.receive = receive;
		this.active_id = active_id;
		this.receive_type = receive_type;
		this.create_time = new Date();
	}
	
	
}
