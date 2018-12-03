/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "redpacket_pool_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}"),
		})
public class RedpacketPoolLogModel implements Serializable {

	private static final long serialVersionUID = -1196191607351928564L;

	private Date create_time;
	/**
	 * 帐号ID
	 */
	private long account_id;

	/**
	 * 参考ERedpacketPoolType 
	 */
	private int log_type;

	private int money;//操作金额
	
	private int remain;//余额
	
	private String msg;//操作行为
	
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

	public int getLog_type() {
		return log_type;
	}

	public void setLog_type(int log_type) {
		this.log_type = log_type;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
