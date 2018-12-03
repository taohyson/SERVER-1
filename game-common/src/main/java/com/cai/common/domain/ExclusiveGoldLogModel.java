/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 专属豆售卖记录
 */
@Document(collection = "exclusive_gold_sale_log")

public class ExclusiveGoldLogModel implements Serializable{
	/**
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date create_time;
	private long account_id;
	private long target_account_id;
	private String orderSeq;
	private int salePrice;
	private int exclusive_gold;
	private int game_type_index;
	private String exattr;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public long getTarget_account_id() {
		return target_account_id;
	}
	public void setTarget_account_id(long target_account_id) {
		this.target_account_id = target_account_id;
	}
	public String getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getExclusive_gold() {
		return exclusive_gold;
	}
	public void setExclusive_gold(int exclusive_gold) {
		this.exclusive_gold = exclusive_gold;
	}
	public int getGame_type_index() {
		return game_type_index;
	}
	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}
	public String getExattr() {
		return exattr;
	}
	public void setExattr(String exattr) {
		this.exattr = exattr;
	}
	
	
	
}
