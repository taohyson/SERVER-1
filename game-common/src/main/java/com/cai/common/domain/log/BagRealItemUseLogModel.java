package com.cai.common.domain.log;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 * @author zhanglong date: 2018年4月19日 下午2:21:04
 */
@Document(collection = "bag_real_item_use_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_nickname", def = "{'nickname': 1}", background = true),
		@CompoundIndex(name = "index_state", def = "{'state': 1}", background = true) })
public class BagRealItemUseLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String _id;
	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date create_time;
	/**
	 * 玩家Id
	 */
	@Indexed
	private long accountId;
	/**
	 * 玩家昵称
	 */
	@Indexed
	private String nickname;
	/**
	 * 玩家名字
	 */
	private String authName;
	/**
	 * 玩家身份证号
	 */
	private String identityCode;
	/**
	 * 玩家电话
	 */
	private long phone;
	/**
	 * 玩家邮箱
	 */
	private String email;
	/**
	 * 玩家地址
	 */
	private String address;
	/**
	 * 玩家邮编
	 */
	private int postCode;
	/**
	 * 物品Id
	 */
	private int itemId;
	/**
	 * 物品名称
	 */
	private String itemName;
	/**
	 * 物品数量
	 */
	private int itemNum;
	/**
	 * 发放状态(1-未发放 2-已发放)
	 */
	private int state;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 操作时间
	 */
	private Date operateDate;

	/**
	 * 物品规格
	 */
	private String itemSize;
	
	/**
	 * 发货状态(0-未发货 1-已发货)
	 */
	private int deliverState;
	
	/**
	 * 发货时间
	 */
	private Date deliverDate;
	
	/**
	 * 物流单号
	 */
	private String logisticsOrderId;
	
	/**
	 * 物流渠道
	 */
	private String logisticsChannel;

	
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

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getIdentityCode() {
		return identityCode;
	}

	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public String getItemSize() {
		return itemSize;
	}

	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	public int getDeliverState() {
		return deliverState;
	}

	public void setDeliverState(int deliverState) {
		this.deliverState = deliverState;
	}
	
	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	public String getLogisticsOrderId() {
		return logisticsOrderId;
	}

	public void setLogisticsOrderId(String logisticsOrderId) {
		this.logisticsOrderId = logisticsOrderId;
	}

	public String getLogisticsChannel() {
		return logisticsChannel;
	}

	public void setLogisticsChannel(String logisticsChannel) {
		this.logisticsChannel = logisticsChannel;
	}
	
}
