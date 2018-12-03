package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="new_hall_recommend")
@CompoundIndexes({
	@CompoundIndex(name = "index_create_time", def = "{'create_time': -1}"),
    @CompoundIndex(name = "index_account_id", def = "{'account_id': 1}"),
    @CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"),
    @CompoundIndex(name = "index_target_id", def = "{'target_id': 1}")
})
public class NewHallRecommend implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	@Indexed
	private long account_id;
	@Indexed
	private String log_type;
	private String msg;
	private long v1;//返利金额
	private long v2;//每个值代表 0:直属代理,1直属推广员，2下级推广的直属代理，3下级推广的推广员，4推广员自己充值，5没有上级的代理自己充值,6提现
	private String account_ip;
	private long target_id;//发生行为的账号id
	private long recharge_money;//充值金额
	private long source_id;//来源id
	private int recommend_level;//充值玩家的推广员等级
	private int my_level;//我的等级
	private int receive_percent;//返利比
	private String orderSeq;//充值时的订单号，只有后台充值才有
	
	
	public String getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}

	public int getMy_level() {
		return my_level;
	}

	public void setMy_level(int my_level) {
		this.my_level = my_level;
	}

	public int getRecommend_level() {
		return recommend_level;
	}

	public void setRecommend_level(int recommend_level) {
		this.recommend_level = recommend_level;
	}

	public int getReceive_percent() {
		return receive_percent;
	}

	public void setReceive_percent(int receive_percent) {
		this.receive_percent = receive_percent;
	}

	public long getSource_id() {
		return source_id;
	}

	public void setSource_id(long source_id) {
		this.source_id = source_id;
	}

	public long getRecharge_money() {
		return recharge_money;
	}

	public void setRecharge_money(long recharge_money) {
		this.recharge_money = recharge_money;
	}

	public long getTarget_id() {
		return target_id;
	}

	public void setTarget_id(long target_id) {
		this.target_id = target_id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String get_id() {
		return _id;
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
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getV1() {
		return v1;
	}
	public void setV1(long v1) {
		this.v1 = v1;
	}
	public long getV2() {
		return v2;
	}
	public void setV2(long v2) {
		this.v2 = v2;
	}
	public String getAccount_ip() {
		return account_ip;
	}
	public void setAccount_ip(String account_ip) {
		this.account_ip = account_ip;
	}
}
