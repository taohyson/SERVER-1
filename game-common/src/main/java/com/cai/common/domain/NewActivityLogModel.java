package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cai.common.domain.activity.LivenessState;
import com.cai.common.domain.activity.MissionDaysRewardStatus;
import com.cai.common.domain.activity.MissionGroupRewardStatus;

/**
 * 活动背包领取记录
 * 
 * @author tang date: 2018年4月20日 上午11:26:33 <br/>
 */
@Document(collection = "activity_reward_log")
@CompoundIndexes({ @CompoundIndex(name = "index_activity_id", def = "{'activity_id': 1}"),
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}") })
public class NewActivityLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;

	private Date create_time;

	private int activity_id;

	private int activity_type;// ActivityTypeEnum

	private long account_id;

	private List<Integer> item_ids;// 背包id

	private int type;// 1,道具，2闲逸豆，3金币，4其他 随机奖励类型,5福卡

	private int count;// 领取的数量

	private int take_today;// 今日是否领取

	private int total_count;// 总领奖数

	// 某些活动需要手动开启，其他情况为空
	private Date manualStartTime;

	private Date manualEndTime;

	// 重置时间
	private Date resetTime;

	private List<MissionGroupRewardStatus> mgs;
	// 按天领取奖励
	private List<MissionDaysRewardStatus> dayReward;

	private List<LivenessState> liveness;
	// 辅助字段
	@Transient
	private String activity_name;
	@Transient
	private String bag_item_name;

	public int getActivity_type() {
		return activity_type;
	}

	public void setActivity_type(int activity_type) {
		this.activity_type = activity_type;
	}

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	@Transient
	private transient boolean isNeedDb;

	public boolean isNeedDb() {
		return isNeedDb;
	}

	public void setNeedDb(boolean isNeedDb) {
		this.isNeedDb = isNeedDb;
	}

	@Transient
	private transient ReentrantLock reenLock;

	public NewActivityLogModel() {
	}

	public NewActivityLogModel(long account_id, int activity_id, int activity_type) {
		this.create_time = new Date();
		this.account_id = account_id;
		this.activity_id = activity_id;
		this.activity_type = activity_type;
		this.resetTime = new Date();
	}

	public ReentrantLock getReenLock() {
		if (reenLock == null) {
			reenLock = new ReentrantLock();
		}
		return reenLock;
	}

	public void setReenLock(ReentrantLock reenLock) {
		this.reenLock = reenLock;
	}

	public int getTake_today() {
		return take_today;
	}

	public void setTake_today(int take_today) {
		this.take_today = take_today;
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

	public List<Integer> getItem_ids() {
		return item_ids;
	}

	public void setItem_ids(List<Integer> item_ids) {
		this.item_ids = item_ids;
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

	public Date getManualStartTime() {
		return manualStartTime;
	}

	public void setManualStartTime(Date manualStartTime) {
		this.manualStartTime = manualStartTime;
	}

	public Date getManualEndTime() {
		return manualEndTime;
	}

	public void setManualEndTime(Date manualEndTime) {
		this.manualEndTime = manualEndTime;
	}

	public Date getResetTime() {
		return resetTime;
	}

	public void setResetTime(Date resetTime) {
		this.resetTime = resetTime;
	}

	public List<MissionGroupRewardStatus> getMgs() {
		return mgs;
	}

	public void setMgs(List<MissionGroupRewardStatus> mgs) {
		this.mgs = mgs;
	}

	public List<MissionDaysRewardStatus> getDayReward() {
		return dayReward;
	}

	public void setDayReward(List<MissionDaysRewardStatus> dayReward) {
		this.dayReward = dayReward;
	}

	public List<LivenessState> getLiveness() {
		return liveness;
	}

	public void setLiveness(List<LivenessState> liveness) {
		this.liveness = liveness;
	}

}
