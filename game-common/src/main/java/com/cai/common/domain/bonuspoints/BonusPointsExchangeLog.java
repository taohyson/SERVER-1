package com.cai.common.domain.bonuspoints;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 积分兑换订单表
 *
 * @author tang date: 2018年7月2日 下午4:35:33 <br/>
 */
@Document(collection = "bonus_points_exchange_log")
@CompoundIndexes({ @CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"),
		@CompoundIndex(name = "index_create_time", def = "{'create_time': 1}") })
public class BonusPointsExchangeLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	private long accountId;
	private String orderId;
	private int orderState;// 订单状态 0未发货，1发货
	private long score;// 消耗的积分
	private long remainScore;// 剩余积分
	private int goodsId;// 商品id
	private String goodsName;// 商品名称
	private int count;// 兑换数量
	private String goodsFormat;// 商品规格
	private Date create_time;// 兑换时间
	private Date deliver_time;// 发货时间
	private String operator;// 操作者
	private String deliverName;// 收货人
	private String mobile;
	private String deliverAddress;// 收货地址
	private String logisticsChannel;// 物流渠道
	private String logisticsOrderId;// 物流订单id
	private int goodsType;
	@Transient
	private BonusPointsGoods goods;

	public int getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(int goodsType) {
		this.goodsType = goodsType;
	}

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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getOrderState() {
		return orderState;
	}

	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

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

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsFormat() {
		return goodsFormat;
	}

	public void setGoodsFormat(String goodsFormat) {
		this.goodsFormat = goodsFormat;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getDeliver_time() {
		return deliver_time;
	}

	public void setDeliver_time(Date deliver_time) {
		this.deliver_time = deliver_time;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getDeliverName() {
		return deliverName;
	}

	public void setDeliverName(String deliverName) {
		this.deliverName = deliverName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDeliverAddress() {
		return deliverAddress;
	}

	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}

	public String getLogisticsChannel() {
		return logisticsChannel;
	}

	public void setLogisticsChannel(String logisticsChannel) {
		this.logisticsChannel = logisticsChannel;
	}

	public String getLogisticsOrderId() {
		return logisticsOrderId;
	}

	public void setLogisticsOrderId(String logisticsOrderId) {
		this.logisticsOrderId = logisticsOrderId;
	}

	public BonusPointsGoods getGoods() {
		return goods;
	}

	public void setGoods(BonusPointsGoods goods) {
		this.goods = goods;
	}

}
