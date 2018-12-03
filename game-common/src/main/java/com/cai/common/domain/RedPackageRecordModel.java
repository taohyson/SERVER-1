package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 红包领取记录
 * 
 *
 * @author tang 
 * date: 2017年9月7日 上午10:38:14 <br/>
 */

@Document(collection="red_package_record_model")
public class RedPackageRecordModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private Date create_time;
	@Indexed
	private Long account_id;
	private Integer money;    //领取金额
	private String nickName;
	private Integer remainMoney;
	
	
	public Integer getRemainMoney() {
		return remainMoney;
	}
	public void setRemainMoney(Integer remainMoney) {
		this.remainMoney = remainMoney;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
}
