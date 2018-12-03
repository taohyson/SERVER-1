package com.cai.common.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @author demon date: 2017年7月20日 下午6:59:15 <br/>
 */
public class ClubModel extends DBBaseModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private volatile int club_id;

	private String club_name;

	private long account_id;

	private Date date;

	private String desc;

	/**
	 * 每个游戏的独立玩法,ruleId,ruleModel
	 */
	private Map<Integer, ClubRuleModel> rules = null;

	// 非数据库字段
	private String avatar = "";

	// 成员数
	private int membersCount;

	// 对局数
	private int gameCount;

	// 消耗的钱
	private long consumeGold;

	// protobuf 数据 不重要的数据放在这 clubServerProto
	private byte[] datas;

	// 设置状态，32个状态位
	private int settingStatus;

	// 俱乐部公告
	private String notice;

	// 俱乐部聊天
	private String chatMsgs;

	/**
	 * 专属豆总扣豆数
	 */
	private long exclusiveGold;

	/**
	 * 亲友圈福卡
	 */
	private long totalClubWelfare;

	/**
	 * 亲友圈福卡每日已领取次数
	 */
	private int clubWelfareGetCount;

	/**
	 * 亲友圈上次活跃时间
	 */
	private Date lastActiveTime;

	public Map<Integer, ClubRuleModel> getRules() {
		return rules;
	}

	public ClubRuleModel getRule(int id) {
		return rules.get(id);
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		if (this.club_id == club_id) {
			return;
		}
		this.setNeedDB(true);
		this.club_id = club_id;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		if (this.account_id == account_id) {
			return;
		}
		setNeedDB(true);
		this.account_id = account_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		setNeedDB(true);
	}

	public String getClub_name() {
		return club_name;
	}

	public void setClub_name(String club_name) {

		if (Objects.equals(this.club_name, club_name)) {
			return;
		}
		setNeedDB(true);
		this.club_name = club_name;
	}

	public void setRules(Map<Integer, ClubRuleModel> rules) {
		this.rules = rules;
		setNeedDB(true);
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		if (Objects.equals(this.avatar, avatar)) {
			return;
		}
		setNeedDB(true);
		this.avatar = avatar;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		if (Objects.equals(this.desc, desc)) {
			return;
		}
		this.desc = desc;
		setNeedDB(true);
	}

	public int getMembersCount() {
		return membersCount;
	}

	public void setMembersCount(int membersCount) {
		if (this.membersCount == membersCount) {
			return;
		}
		this.membersCount = membersCount;
		setNeedDB(true);
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		if (this.gameCount == gameCount) {
			return;
		}
		this.gameCount = gameCount;
		setNeedDB(true);
	}

	public long getConsumeGold() {
		return consumeGold;
	}

	public void setConsumeGold(long consumeGold) {
		if (this.consumeGold == consumeGold) {
			return;
		}
		this.consumeGold = consumeGold;
		setNeedDB(true);
	}

	public byte[] getDatas() {
		return datas;
	}

	public void setDatas(byte[] datas) {
		if (Arrays.equals(this.datas, datas)) {
			return;
		}
		this.datas = datas;
		setNeedDB(true);
	}

	public int getSettingStatus() {
		return settingStatus;
	}

	public void setSettingStatus(int settingStatus) {
		if (this.settingStatus == settingStatus) {
			return;
		}
		this.settingStatus = settingStatus;
		setNeedDB(true);
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		if (Objects.equals(this.notice, notice)) {
			return;
		}
		this.notice = notice;
		setNeedDB(true);
	}

	public String getChatMsgs() {
		return chatMsgs;
	}

	public void setChatMsgs(String chatMsgs) {
		if (Objects.equals(this.chatMsgs, chatMsgs)) {
			return;
		}
		this.chatMsgs = chatMsgs;
		setNeedDB(true);
	}

	public long getExclusiveGold() {
		return exclusiveGold;
	}

	public void setExclusiveGold(long exclusiveGold) {
		if (this.exclusiveGold == exclusiveGold) {
			return;
		}
		setNeedDB(true);
		this.exclusiveGold = exclusiveGold;
	}

	public long getTotalClubWelfare() {
		return totalClubWelfare;
	}

	public void setTotalClubWelfare(long totalClubWelfare) {
		if (this.totalClubWelfare == totalClubWelfare) {
			return;
		}
		setNeedDB(true);
		this.totalClubWelfare = totalClubWelfare;
	}

	public int getClubWelfareGetCount() {
		return clubWelfareGetCount;
	}

	public void setClubWelfareGetCount(int clubWelfareGetCount) {
		if (this.clubWelfareGetCount == clubWelfareGetCount) {
			return;
		}
		setNeedDB(true);
		this.clubWelfareGetCount = clubWelfareGetCount;
	}

	public Date getLastActiveTime() {
		return lastActiveTime;
	}

	public void setLastActiveTime(Date lastActiveTime) {
		if (lastActiveTime != null && lastActiveTime.equals(this.lastActiveTime)) {
			return;
		}
		setNeedDB(true);
		this.lastActiveTime = lastActiveTime;
	}
}
