package com.cai.common.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "add_gold_check_log")
// 后台审核历史记录
public class AddGoldCheckLog {
	
	private String _id;
	@Indexed
	private String orderID;			//订单流水号
	@Indexed
	private Long accountId;			//玩家账号ID
	private String nickname;		//微信昵称
	private String remark;			//备注
	private Integer cardNum;		//购买的房卡数
	private Integer sendNum;		//购买赠送的房卡数
	private Integer rmb;			//花费的rmb
	@Indexed
	private Date create_time;		//审核时间
	private String ossID;			//后台审核管理员ID
	private String ossName;			//后台审核管理员名字
	private int state;				//审核是否通过(1通过0未通过)
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getOssID() {
		return ossID;
	}
	public void setOssID(String ossID) {
		this.ossID = ossID;
	}
	public String getOssName() {
		return ossName;
	}
	public void setOssName(String ossName) {
		this.ossName = ossName;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Integer getCardNum() {
		return cardNum;
	}
	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}
	public Integer getSendNum() {
		return sendNum;
	}
	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}
	public Integer getRmb() {
		return rmb;
	}
	public void setRmb(Integer rmb) {
		this.rmb = rmb;
	}
	
}
