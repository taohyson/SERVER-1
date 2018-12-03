package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 活动背包领取记录
 * 
 * @author tang date: 2018年4月20日 上午11:26:33 <br/>
 */
@Document(collection = "activity_default_reward_record_log")
@CompoundIndexes({ @CompoundIndex(name = "index_activity_id", def = "{'activity_id': 1}"),
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}") })
public class ActivityDefaultRewarlRecordLogModel implements Serializable {

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

	private String rewardName;

	private int count;// 领取的数量default_activity_reward_record_log

	public ActivityDefaultRewarlRecordLogModel() {
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
