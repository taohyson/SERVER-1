package com.cai.common.domain;

import java.io.Serializable;

/**
 * @author admin date: 2017年7月24日 上午10:52:12 <br/>
 */
public class ClubRoomModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int status;

	private final int roomId;

	private int logicId;

	private ClubRuleModel clubRule;

	private long account_id;

	private String club_name;

	private String desc;

	// 微信群开房分享链接
	private String url;

	private Object attament;

	public int getMaxNumber() {
		return maxNumber;
	}

	public ClubRoomModel setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
		return this;
	}

	public String getGameDesc() {
		return gameDesc;
	}

	public ClubRoomModel setGameDesc(String gameDesc) {
		this.gameDesc = gameDesc;
		return this;
	}

	private int maxNumber;

	private String gameDesc;

	public ClubRoomModel(int status) {
		this(status, null, 0);
	}

	public ClubRoomModel(int status, ClubRuleModel clubRule) {
		this(status, clubRule, 0);
	}

	public ClubRoomModel(int status, ClubRuleModel clubRule, int roomId) {
		this(status, clubRule, roomId, 0, 0, "");
	}

	public ClubRoomModel(int status, ClubRuleModel clubRule, int roomId, int logicId, long account_id, String url) {
		this.status = status;
		this.roomId = roomId;
		this.clubRule = clubRule;
		this.logicId = logicId;
		this.setAccount_id(account_id);
		this.setUrl(url);
	}

	public int getStatus() {
		return status;
	}

	public ClubRuleModel getClubRule() {
		return clubRule;
	}

	public int getRoomId() {
		return roomId;
	}

	public int getLogicId() {
		return logicId;
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

	public String getClub_name() {
		return club_name;
	}

	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}

	public void setClubRule(ClubRuleModel clubRule) {
		this.clubRule = clubRule;
	}

	public String getDesc() {
		return desc;
	}

	public ClubRoomModel setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public Object getAttament() {
		return attament;
	}

	public ClubRoomModel setAttament(Object attament) {
		this.attament = attament;
		return this;
	}

	public ClubRoomModel setLogicId(int logicId) {
		this.logicId = logicId;
		return this;
	}

}
