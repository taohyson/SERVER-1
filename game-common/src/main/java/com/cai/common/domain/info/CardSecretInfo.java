package com.cai.common.domain.info;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author zhanglong date: 2018年4月18日 下午6:30:30
 */
public class CardSecretInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private int id;
	/**
	 * 卡密类型(5京东卡6话费卡)
	 */
	private int card_type;
	/**
	 * 卡密金额
	 */
	private int card_money;
	/**
	 * 卡密号
	 */
	private String card_secret;
	/**
	 * 使用状态(1未使用2已使用)
	 */
	private int state;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 操作时间
	 */
	private Date operate_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCard_type() {
		return card_type;
	}

	public void setCard_type(int card_type) {
		this.card_type = card_type;
	}

	public int getCard_money() {
		return card_money;
	}

	public void setCard_money(int card_money) {
		this.card_money = card_money;
	}

	public String getCard_secret() {
		return card_secret;
	}

	public void setCard_secret(String card_secret) {
		this.card_secret = card_secret;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperate_time() {
		return operate_time;
	}

	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}
}
