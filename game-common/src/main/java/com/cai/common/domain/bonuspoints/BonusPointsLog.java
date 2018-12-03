package com.cai.common.domain.bonuspoints;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 积分流水
 *
 * @author tang date: 2018年7月2日 下午4:35:33 <br/>
 */
@Document(collection = "bonus_points_stream_log")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_create_time", def = "{'create_time': 1}") })
public class BonusPointsLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed
	private long accountId;
	private Date create_time;
	// private String orderId;
	private long score;// 增加的积分
	private long remainScore;// 剩余积分
	private int money;// 充值金额
	private String remark;
	private int operateType;// 操作类型，EBonusPointsType

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	// public String getOrderId() {
	// return orderId;
	// }
	//
	// public void setOrderId(String orderId) {
	// this.orderId = orderId;
	// }

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public long getRemainScore() {
		return remainScore;
	}

	public void setRemainScore(long remainScore) {
		this.remainScore = remainScore;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getOperateType() {
		return operateType;
	}

	public void setOperateType(int operateType) {
		this.operateType = operateType;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
