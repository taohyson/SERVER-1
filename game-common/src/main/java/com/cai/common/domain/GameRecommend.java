package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="game_recommend")
//@CompoundIndexes({
//	@CompoundIndex(name = "index_crate_time", def = "{'create_time': -1}"),
//    @CompoundIndex(name = "index_account", def = "{'account_id': 1}"),
//    @CompoundIndex(name = "index_log_type", def = "{'log_type': 1}")
//})
public class GameRecommend implements Serializable{
	
	private String _id;
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	@Indexed
	private Long account_id;
	private Integer center_id;
	private Integer proxy_id;
	private Integer logic_id;
	@Indexed
	private String log_type;
	private String msg;
	private Long v1;
	private Long v2;
	private String local_ip;
	private String account_ip;
	private Long target_id;
	private Long recharge_money;//充值金额
	
	
	public Long getRecharge_money() {
		return recharge_money;
	}

	public void setRecharge_money(Long recharge_money) {
		this.recharge_money = recharge_money;
	}

	
	public Long getTarget_id() {
		return target_id;
	}

	public void setTarget_id(Long target_id) {
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
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Integer getProxy_id() {
		return proxy_id;
	}
	public void setProxy_id(Integer proxy_id) {
		this.proxy_id = proxy_id;
	}
	
	public Integer getLogic_id() {
		return logic_id;
	}
	public void setLogic_id(Integer logic_id) {
		this.logic_id = logic_id;
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
	public Long getV1() {
		return v1;
	}
	public void setV1(Long v1) {
		this.v1 = v1;
	}
	public Long getV2() {
		return v2;
	}
	public void setV2(Long v2) {
		this.v2 = v2;
	}
	public String getLocal_ip() {
		return local_ip;
	}
	public void setLocal_ip(String local_ip) {
		this.local_ip = local_ip;
	}
	public String getAccount_ip() {
		return account_ip;
	}
	public void setAccount_ip(String account_ip) {
		this.account_ip = account_ip;
	}
	public Integer getCenter_id() {
		return center_id;
	}
	public void setCenter_id(Integer center_id) {
		this.center_id = center_id;
	}
	
	
	
	
	
	
	
	
}
