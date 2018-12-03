package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 红包活动
 * 
 *
 * @author tang 
 * date: 2017年9月7日 上午10:38:14 <br/>
 */

@Document(collection="red_package_model")
public class RedPackageModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	@Indexed
	private Long account_id;
	private Integer active_id;//活动id
	private Integer active_type;//活动类型
	private String active_name;//活动名称
	private String nick_name;//昵称
	private Integer money;    //红包金额
	private Integer room_id;//领取奖励的房间号
	
	
	
	
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
	public Integer getActive_id() {
		return active_id;
	}
	public void setActive_id(Integer active_id) {
		this.active_id = active_id;
	}
	public Integer getActive_type() {
		return active_type;
	}
	public void setActive_type(Integer active_type) {
		this.active_type = active_type;
	}
	public String getActive_name() {
		return active_name;
	}
	public void setActive_name(String active_name) {
		this.active_name = active_name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}
	
}
