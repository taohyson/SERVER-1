package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.esotericsoftware.kryo.Kryo;

/**
 * 活动全局奖励 涉及并发领奖，需要单独处理
 * 
 * @author chansonyan 2018年4月19日
 */
@Document(collection = "activity_global_reward")
@CompoundIndexes({ @CompoundIndex(name = "index_activityId", def = "{'activityId': 1}") })
public class ActivityGlobalRewardModel implements Serializable {

	private static final long serialVersionUID = 1L;

	// 领取加锁
	@Transient
	private transient ReentrantLock redisLock = new ReentrantLock();

	@Indexed
	private String id;

	private int activityId;
	// 主奖品个数
	private int mainPrizeCount;


	// 主奖励
	private List<MainPrizes> mainPrizeList;

	// 辅助奖励
	private List<RandomPrizes> randomPrizeList;

	// 活动奖励随机抽样奖励
	private List<NewActivityPrizeModel> activityPrizeList;

	// 任务组奖励
	private Map<Integer, List<NewActivityPrizeModel>> missionGroupPrizeMap;

	private Map<Integer, ActivityDaysReward> activityDaysRewardMap;

	public void resetMissionGroupPrize(int group, List<NewActivityPrizeModel> prizeList) {
		Kryo kryo = new Kryo();
		List<NewActivityPrizeModel> temp = kryo.copy(prizeList);
		if (null == this.missionGroupPrizeMap) {
			this.missionGroupPrizeMap = new HashMap<>();
		}
		this.missionGroupPrizeMap.put(group, temp);
	}

	public List<MainPrizes> getMainPrizeList() {
		return mainPrizeList;
	}

	public void setMainPrizeList(List<MainPrizes> mainPrizeList) {
		this.mainPrizeList = mainPrizeList;
	}

	public List<RandomPrizes> getRandomPrizeList() {
		return randomPrizeList;
	}

	public void setRandomPrizeList(List<RandomPrizes> randomPrizeList) {
		this.randomPrizeList = randomPrizeList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public ReentrantLock getRedisLock() {
		return redisLock;
	}

	public void setRedisLock(ReentrantLock redisLock) {
		this.redisLock = redisLock;
	}

	public int getMainPrizeCount() {
		return mainPrizeCount;
	}

	public void setMainPrizeCount(int mainPrizeCount) {
		this.mainPrizeCount = mainPrizeCount;
	}

	public List<NewActivityPrizeModel> getActivityPrizeList() {
		return activityPrizeList;
	}

	public Map<Integer, List<NewActivityPrizeModel>> getMissionGroupPrizeMap() {
		return missionGroupPrizeMap;
	}

	public void setMissionGroupPrizeMap(Map<Integer, List<NewActivityPrizeModel>> missionGroupPrizeMap) {
		this.missionGroupPrizeMap = missionGroupPrizeMap;
	}

	public Map<Integer, ActivityDaysReward> getActivityDaysRewardMap() {
		return activityDaysRewardMap;
	}

	public void setActivityDaysRewardMap(Map<Integer, ActivityDaysReward> activityDaysRewardMap) {
		this.activityDaysRewardMap = activityDaysRewardMap;
	}

	public void setActivityPrizeList(List<NewActivityPrizeModel> activityPrizeList) {
		Kryo kryo = new Kryo();
		List<NewActivityPrizeModel> temp = kryo.copy(activityPrizeList);
		this.activityPrizeList = temp;
	}

	public boolean reduceCount() {
		ReentrantLock lock = this.getRedisLock();
		lock.lock();
		try {
			if (mainPrizeCount <= 0) {
				return false;
			} else {
				mainPrizeCount--;
				return true;
			}
		} finally {
			lock.unlock();
		}
	}
}
