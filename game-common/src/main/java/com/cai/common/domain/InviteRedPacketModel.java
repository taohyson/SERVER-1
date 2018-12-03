package com.cai.common.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invite_red_packet")
//邀请新用户送红包
public class InviteRedPacketModel {
	private String _id;
	/**
	 * 玩家帐号ID
	 */
	@Indexed
	private Long account_id;
	
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	@Indexed
	private long target_account_id;
	//邀请返利状态 0,未返利，1已经返利,2已经超出最大返利人数，不再获得返利
	private int state ;
	//返利金额，分为单位
	private int receive;
	//活动id
	private int active_id;
	
	private String icon;//头像
	
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getActive_id() {
		return active_id;
	}
	public void setActive_id(int active_id) {
		this.active_id = active_id;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getReceive() {
		return receive;
	}
	public void setReceive(int receive) {
		this.receive = receive;
	}
	public InviteRedPacketModel(){
		
	}
	public InviteRedPacketModel(long account_id, long target_account_id, int state, int receive, int active_id,String icon) {
		super();
		this.account_id = account_id;
		this.target_account_id = target_account_id;
		this.state = state;
		this.receive = receive;
		this.active_id = active_id;
		this.icon = icon;
		this.create_time = new Date();
	}

	
}
