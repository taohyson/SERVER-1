package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 活动背包领取记录
 * 
 * @author tang date: 2018年4月20日 上午11:26:33 <br/>
 */
@Document(collection = "activity_reward_record_log")
@CompoundIndexes({ @CompoundIndex(name = "index_activity_id", def = "{'activity_id': 1}"),
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}") })
public class ActivityRewarlRecordLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;

	private Date create_time;

	private int activity_id;

	private long account_id;

	// 玩家头像
	private String url;

	private String nick;

	private List<Integer> item_ids;// 背包id

	private int type;// 1,道具，2闲逸豆，3金币，4其他 随机奖励类型

	private String rewardName;

	private int count;// 领取的数量default_activity_reward_record_log
	private int activity_type;// ActivityTypeEnum
	private Integer index;// 序列号

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	// 辅助字段(页面使用)
	@Transient
	private String activity_name;
	@Transient
	private String bag_item_name;

	private int top;// 1奖励领取记录置顶，0不需置顶

	public ActivityRewarlRecordLogModel() {
	}

	public ActivityRewarlRecordLogModel(long account_id, int activity_id, String nick, int activity_type, int top) {
		this.create_time = new Date();
		this.account_id = account_id;
		this.activity_id = activity_id;
		this.nick = nick;
		this.activity_type = activity_type;
		this.top = top;
	}

	public int getActivity_type() {
		return activity_type;
	}

	public void setActivity_type(int activity_type) {
		this.activity_type = activity_type;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

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

	public int getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public List<Integer> getItem_ids() {
		return item_ids;
	}

	public void setItem_ids(List<Integer> item_ids) {
		this.item_ids = item_ids;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	public String getBag_item_name() {
		return bag_item_name;
	}

	public void setBag_item_name(String bag_item_name) {
		this.bag_item_name = bag_item_name;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

}
