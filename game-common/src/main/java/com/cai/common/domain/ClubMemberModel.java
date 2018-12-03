package com.cai.common.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.fastjson.JSON;
import com.cai.common.constant.Symbol;
import com.cai.common.domain.common.ClubCacheUtil;
import com.cai.common.domain.info.PlayerRoundLimitInfo;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.google.common.primitives.Longs;

import org.apache.commons.lang.StringUtils;
import protobuf.clazz.ClubMsgProto.ClubAccountProto;

public class ClubMemberModel {

	private int club_id;

	private long account_id;
	private String nickname;
	private long gold;
	private String avatar;
	private String clubName;
	private int game_count;
	// 0 未审核 1已审核
	private int status;
	// 大赢家次数
	private int winCount;

	private Date date;

	private String remark;

	private String remark_ext;

	// @see EClubIdentity
	private byte identity;

	private String roundLimitData;

	private int isPartner;

	private long parentId;

	private long clubWelfare;

	// 非DB字段
	private transient Date lastLoginDate;
	private transient Map<Integer, Map<Long, Long>> ignoreInviter;// type,accountId,禁止最终时间

	private transient Map<Integer, ClubMemberRecordModel> recordMap = new ConcurrentHashMap<>();

	private transient Map<Long, Long> memberBanPlayerMap;
	private transient ClubBanPlayerModel clubBanPlayerModel;

	private transient Map<Integer, PlayerRoundLimitInfo> roundLimitInfoMap;

	private transient boolean haveNewClubMatchLog;

	private transient long lastEnterTableTime;

	private transient long lastAutoKickTime;

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public String getAvatar() {
		return ClubCacheUtil.getClubPlayerAvatar(this.account_id);
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNickname() {
		return ClubCacheUtil.getClubPlayerNickname(this.account_id);
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getGame_count() {
		return game_count;
	}

	public void setGame_count(int game_count) {
		this.game_count = game_count;
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ClubAccountProto.Builder encode() {
		return encode(false);
	}

	public ClubAccountProto.Builder encode(boolean isOnline) {
		ClubAccountProto.Builder b = ClubAccountProto.newBuilder();
		b.setAccountId(account_id);
		// b.setAvatar(avatar);
		b.setJoinTime(date.getTime());
		b.setGameTime(game_count);
		b.setWinTime(winCount);
		b.setNickname(getNickname());
		if (StringUtils.isNotEmpty(remark)) {
			b.setRemark(remark);
		}
		if (StringUtils.isNotEmpty(remark_ext)) {
			b.setRemarkExt(remark_ext);
		}
		b.setIdentity(identity);
		b.setOnline(isOnline ? 1 : 0);
		b.setIsPartner(isPartner);
		b.setParentId(parentId);
		b.setPlayerClubWelfare(clubWelfare);

		return b;
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public Date getLastLoginDate() {
		return ClubCacheUtil.getClubPlayerLastLoginDate(this.account_id);
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark_ext() {
		return remark_ext;
	}

	public void setRemark_ext(String remark_ext) {
		this.remark_ext = remark_ext;
	}

	public byte getIdentity() {
		return identity;
	}

	public void setIdentity(byte identity) {
		this.identity = identity;
	}

	public void addIgnoreInviter(long accountId, long expireTime, int type) {
		if (null == ignoreInviter) {
			this.ignoreInviter = Maps.newHashMap();
		}
		Map<Long, Long> typeIgnoreMap = ignoreInviter.get(type);
		if (typeIgnoreMap == null) {
			typeIgnoreMap = Maps.newHashMap();
			this.ignoreInviter.put(type, typeIgnoreMap);
		}
		typeIgnoreMap.put(accountId, expireTime);
	}

	/**
	 * 是否忽略
	 */
	public boolean isIgnoreInvite(long accountId, int type) {
		if (null == ignoreInviter) {
			return false;
		}
		Map<Long, Long> typeIgnoreMap = ignoreInviter.get(type);
		if (typeIgnoreMap == null) {
			return false;
		}
		Long expireTime = typeIgnoreMap.get(accountId);
		if (null == expireTime) {
			return false;
		}
		boolean isExpire = System.currentTimeMillis() > expireTime;
		if (isExpire) {
			typeIgnoreMap.remove(accountId);
		}
		return !isExpire;
	}

	public void initMemberRecord(List<ClubMemberRecordModel> list) {
		for (ClubMemberRecordModel model : list) {
			recordMap.put(model.getDay(), model);
		}
	}

	public Map<Integer, ClubMemberRecordModel> getMemberRecordMap() {
		return recordMap;
	}

	public void initMemberBanPlayers(String banPlayers) {
		if (!StringUtils.isEmpty(banPlayers)) {
			String[] strArr = banPlayers.split(Symbol.COMMA);
			if (strArr.length > 0) {
				Long banPlayerId;
				for (String str : strArr) {
					banPlayerId = Longs.tryParse(str);
					if (banPlayerId != null) {
						addBanPlayer(banPlayerId);
					}
				}
			}
		}
	}

	public void addBanPlayer(long banPlayerId) {
		if (memberBanPlayerMap == null) {
			memberBanPlayerMap = Maps.newHashMap();
		}
		if (clubBanPlayerModel == null) {
			clubBanPlayerModel = new ClubBanPlayerModel();
		}
		memberBanPlayerMap.put(banPlayerId, banPlayerId);
		clubBanPlayerModel.setClubId(this.getClub_id());
		clubBanPlayerModel.setAccountId(this.getAccount_id());
		clubBanPlayerModel.setNeedDB(true);
	}

	public void removeBanPlayer(long banPlayerId) {
		if (memberBanPlayerMap == null) {
			return;
		}
		memberBanPlayerMap.remove(banPlayerId);
		clubBanPlayerModel.setNeedDB(true);
	}

	public ClubBanPlayerModel getClubBanPlayerModel() {
		return this.clubBanPlayerModel;
	}

	public Map<Long, Long> getMemberBanPlayerMap() {
		return this.memberBanPlayerMap;
	}

	public void initLimitRoundData() {
		if (!Strings.isNullOrEmpty(this.roundLimitData)) {
			try {
				if (roundLimitInfoMap == null) {
					roundLimitInfoMap = new HashMap<>();
				}
				List<PlayerRoundLimitInfo> list = JSON.parseArray(this.roundLimitData, PlayerRoundLimitInfo.class);
				if (list != null) {
					for (PlayerRoundLimitInfo info : list) {
						roundLimitInfoMap.put(info.getRuleId(), info);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public PlayerRoundLimitInfo getPlayerRoundLimitInfoByRuleId(int ruleId) {
		if (roundLimitInfoMap == null) {
			return null;
		}
		return roundLimitInfoMap.get(ruleId);
	}

	public void updatePlayRound(int ruleId) {
		if (ruleId > 0) {
			if (roundLimitInfoMap == null) {
				roundLimitInfoMap = new HashMap<>();
			}
			PlayerRoundLimitInfo info = getPlayerRoundLimitInfoByRuleId(ruleId);
			if (info == null) {
				info = new PlayerRoundLimitInfo(ruleId, -1, 0);
				roundLimitInfoMap.put(ruleId, info);
			}
			info.setPlayRound(info.getPlayRound() + 1);
			try {
				this.roundLimitData = JSON.toJSON(roundLimitInfoMap.values()).toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void updatePlayerLimitRound(int ruleId, int value) {
		if (ruleId > 0) {
			if (roundLimitInfoMap == null) {
				roundLimitInfoMap = new HashMap<>();
			}
			PlayerRoundLimitInfo info = getPlayerRoundLimitInfoByRuleId(ruleId);
			if (info == null) {
				info = new PlayerRoundLimitInfo(ruleId, -1, 0);
				roundLimitInfoMap.put(ruleId, info);
			}
			info.setLimitRound(value);
			try {
				this.roundLimitData = JSON.toJSON(roundLimitInfoMap.values()).toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int checkLimitRound(ClubRuleModel ruleModel) {
		// 先判断玩家有没有单独设置限制局数
		int playRound = 0;
		int playerLimitRound = -1;
		int ruleLimitRound = ruleModel.getLimitRound();
		PlayerRoundLimitInfo roundLimitInfo = getPlayerRoundLimitInfoByRuleId(ruleModel.getId());
		if (roundLimitInfo != null) {
			playRound = roundLimitInfo.getPlayRound();
			playerLimitRound = roundLimitInfo.getLimitRound();
		}
		int finalLimitRound = ruleLimitRound;
		if (playerLimitRound > -1) {
			finalLimitRound = playerLimitRound;
		}
		return (finalLimitRound - playRound) < 0 ? 0 : finalLimitRound - playRound;
	}

	public boolean delLimitRound(int ruleId) {
		if (roundLimitInfoMap != null && roundLimitInfoMap.containsKey(ruleId)) {
			roundLimitInfoMap.remove(ruleId);
			try {
				this.roundLimitData = JSON.toJSON(roundLimitInfoMap.values()).toString();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean dailyResetPlayRound() {
		if (roundLimitInfoMap == null || roundLimitInfoMap.size() <= 0) {
			return false;
		}
		boolean isChange = false;
		for (PlayerRoundLimitInfo info : roundLimitInfoMap.values()) {
			if (info.getPlayRound() > 0) {
				info.setPlayRound(0);
				isChange = true;
			}
		}
		if (isChange) {
			try {
				this.roundLimitData = JSON.toJSON(roundLimitInfoMap.values()).toString();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean clearPlayerLimitRound(int ruleId) {
		if (roundLimitInfoMap == null) {
			return false;
		}
		PlayerRoundLimitInfo info = roundLimitInfoMap.get(ruleId);
		if (info != null) {
			info.setLimitRound(-1);
			try {
				this.roundLimitData = JSON.toJSON(roundLimitInfoMap.values()).toString();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean isHaveNewClubMatchLog() {
		return haveNewClubMatchLog;
	}

	public void setHaveNewClubMatchLog(boolean haveNewClubMatchLog) {
		this.haveNewClubMatchLog = haveNewClubMatchLog;
	}

	public int getIsPartner() {
		return isPartner;
	}

	public void setIsPartner(int isPartner) {
		this.isPartner = isPartner;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public boolean isPartner() {
		return isPartner == 1;
	}

	public long getLastEnterTableTime() {
		return lastEnterTableTime;
	}

	public void setLastEnterTableTime(long lastEnterTableTime) {
		this.lastEnterTableTime = lastEnterTableTime;
	}

	public long getLastAutoKickTime() {
		return lastAutoKickTime;
	}

	public void setLastAutoKickTime(long lastAutoKickTime) {
		this.lastAutoKickTime = lastAutoKickTime;
	}

	public long getClubWelfare() {
		return clubWelfare;
	}

	public void setClubWelfare(long clubWelfare) {
		this.clubWelfare = clubWelfare;
	}

	public boolean hasChild(ClubMemberModel memberModel) {
		return memberModel.getParentId() == this.getAccount_id();
	}

	/**
	 * 仅在初始化时使用
	 */
	public String getInitNickname() {
		if (this.nickname == null) {
			return " ";
		}
		return this.nickname;
	}

	/**
	 * 仅在初始化时使用
	 */
	public String getInitAvatar() {
		if (this.avatar == null) {
			return "";
		}
		return this.avatar;
	}

	/**
	 * 仅在初始化时使用
	 */
	public Date getInitLastLoginDate() {
		return this.lastLoginDate;
	}

}