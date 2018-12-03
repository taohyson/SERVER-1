package com.cai.common.domain.zhuzhou;

import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 株洲协会推广
 * 
 *
 * @author tang date: 2018年9月21日 下午2:51:19 <br/>
 */
@Document(collection = "zzxh_recharge_receive_log")
public class RechargeRecordModel {

	private long accountId;
	private int payType;// 下单方式 1微信，2ios，3店铺充值,4店铺进货
	private long rechargeId;// 充值id
	private int rechargeMoney;// 充值金额
	private int receivePer;// 返利比
	private int receive;// 返利金额
	private Date create_time;// 充值时间
	private String orderId;// 订单号
	private int type;// 0收益，1提现
	private String desc;// 描述
	private String operateTime;// 操作时间'2018-10-01'
	@Transient
	private String nick;
	@Transient
	private String icon;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public long getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(long rechargeId) {
		this.rechargeId = rechargeId;
	}

	public int getRechargeMoney() {
		return rechargeMoney;
	}

	public void setRechargeMoney(int rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

	public int getReceivePer() {
		return receivePer;
	}

	public void setReceivePer(int receivePer) {
		this.receivePer = receivePer;
	}

	public int getReceive() {
		return receive;
	}

	public void setReceive(int receive) {
		this.receive = receive;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

}
