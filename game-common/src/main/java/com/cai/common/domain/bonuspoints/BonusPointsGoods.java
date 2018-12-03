package com.cai.common.domain.bonuspoints;

import java.util.concurrent.locks.ReentrantLock;

import com.cai.common.domain.DBBaseModel;

/**
 * 积分商品
 * 
 * @author tang
 *
 */
public class BonusPointsGoods extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String goods_name;
	private int reference_price;// 参考价格
	private int real_price;
	private int score;// 消耗积分
	private int goods_type;// 商品类型 关联表BonusPointsGoodsType
	private String goods_desc;// 商品描述
	private String goods_info;// 商品信息
	private String goods_format;// 商品规格
	private int stock_type;// 库存类型，1无限制，0有限制
	private int stock;// 库存数量
	private String goods_pic;// 商品图片
	private int dis_order;// 排序规则，越大越靠前
	private int state;// 0下架1上架
	private String operator;// 操作员
	private int flag;// 标志，0无，1热门，2新，3火爆，4特惠
	private int itemId;
	private transient ReentrantLock redisLock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public int getReal_price() {
		return real_price;
	}

	public void setReal_price(int real_price) {
		this.real_price = real_price;
	}

	public int getReference_price() {
		return reference_price;
	}

	public void setReference_price(int reference_price) {
		this.reference_price = reference_price;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(int goods_type) {
		this.goods_type = goods_type;
	}

	public String getGoods_info() {
		return goods_info;
	}

	public void setGoods_info(String goods_info) {
		this.goods_info = goods_info;
	}

	public String getGoods_desc() {
		return goods_desc;
	}

	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}

	public String getGoods_format() {
		return goods_format;
	}

	public void setGoods_format(String goods_format) {
		this.goods_format = goods_format;
	}

	public int getStock_type() {
		return stock_type;
	}

	public void setStock_type(int stock_type) {
		this.stock_type = stock_type;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getGoods_pic() {
		return goods_pic;
	}

	public void setGoods_pic(String goods_pic) {
		this.goods_pic = goods_pic;
	}

	public int getDis_order() {
		return dis_order;
	}

	public void setDis_order(int dis_order) {
		this.dis_order = dis_order;
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

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public ReentrantLock getRedisLock() {
		if (redisLock == null) {
			redisLock = new ReentrantLock();
		}

		return redisLock;
	}

	public void setRedisLock(ReentrantLock redisLock) {
		this.redisLock = redisLock;
	}
}
