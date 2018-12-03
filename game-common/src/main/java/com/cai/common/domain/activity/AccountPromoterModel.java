package com.cai.common.domain.activity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cai.common.util.MyDateUtil;

/**
 * 
 * 活动推广用户
 *
 * @author tang date: 2018年8月18日 下午2:15:28 <br/>
 */
@Document(collection = "activity_promote_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"), @CompoundIndex(name = "index_activityId", def = "{'activityId': 1}") })
public class AccountPromoterModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String _id;
	private long accountId;
	private int activityId;
	private long targetId;
	private Date create_time;
	private boolean isTakeReward;
	private int totalDays;
	private int complementDays;
	private int itemId;
	private int count;
	private String icon;
	private String nick;
	private boolean valid;

	private Date takeRewardDate;

	public Date getTakeRewardDate() {
		return takeRewardDate;
	}

	public void setTakeRewardDate(Date takeRewardDate) {
		this.takeRewardDate = takeRewardDate;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getTargetId() {
		return targetId;
	}

	public void setTargetId(long targetId) {
		this.targetId = targetId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public boolean isTakeReward() {
		return isTakeReward;
	}

	public void setTakeReward(boolean isTakeReward) {
		this.isTakeReward = isTakeReward;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public int getComplementDays() {
		return complementDays;
	}

	public void setComplementDays(int complementDays) {
		this.complementDays = complementDays;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	private static long oneDaysms = 24 * 60 * 60000L;

	public int queryRegisterDays() {
		if (create_time == null) {// 异常账号不处理
			return 8;
		}
		Date tomorrow = MyDateUtil.getTomorrowZeroDate(new Date());
		Date createZero = MyDateUtil.getZeroDate(create_time);
		int days = (int) ((tomorrow.getTime() - createZero.getTime()) / oneDaysms);
		return days;
	}
}
