package com.cai.common.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cai.common.domain.log.BaseLogModel;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/10/10 19:59
 */
@Document(collection = "club_area_protect_log")
@CompoundIndexes({ @CompoundIndex(name = "index_gameId", def = "{'gameId': 1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}", background = true),
		@CompoundIndex(name = "index_applyAccountId", def = "{'applyAccountId': 1}", background = true),
		@CompoundIndex(name = "index_areaAccountId", def = "{'areaAccountId': 1}", background = true),
		@CompoundIndex(name = "index_state", def = "{'state': 1}", background = true),
		@CompoundIndex(name = "index_applyTime", def = "{'applyTime': 1}", background = true),
		@CompoundIndex(name = "index_bindTime", def = "{'bindTime': 1}", background = true) })
public class ClubAreaProtectLogModel extends BaseLogModel {

	private static final long serialVersionUID = 5244000836838044952L;
	private String _id;
	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING, background = true)
	private Date create_time;

	/**
	 * 游戏Id
	 */
	private int gameId;

	/**
	 * 游戏名称
	 */
	private String gameName;

	/**
	 * 申请人ID
	 */
	private long applyAccountId;

	/**
	 * 申请人昵称
	 */
	private String applyNickname;

	/**
	 * 联系手机
	 */
	private String applyPhone;

	/**
	 * 联系人称呼
	 */
	private String applyName;

	private int clubId;

	private String clubName;

	/**
	 * 区域代理Id
	 */
	private long areaAccountId;

	/**
	 * 区域代理手机号
	 */
	private String areaPhone;

	/**
	 * 申请时间
	 */
	private Date applyTime;

	/**
	 * 绑定时间
	 */
	private Date bindTime;

	/**
	 * 状态 1-申请 2-同意 3-拒绝 4-解除绑定
	 */
	private int state;

	/**
	 * 操作人
	 */
	private String operator;

	/**
	 * 操作时间
	 */
	private Date operateTime;

	private int gameTypeIndex;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public long getApplyAccountId() {
		return applyAccountId;
	}

	public void setApplyAccountId(long applyAccountId) {
		this.applyAccountId = applyAccountId;
	}

	public String getApplyNickname() {
		return applyNickname;
	}

	public void setApplyNickname(String applyNickname) {
		this.applyNickname = applyNickname;
	}

	public String getApplyPhone() {
		return applyPhone;
	}

	public void setApplyPhone(String applyPhone) {
		this.applyPhone = applyPhone;
	}

	public String getApplyName() {
		return applyName;
	}

	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public long getAreaAccountId() {
		return areaAccountId;
	}

	public void setAreaAccountId(long areaAccountId) {
		this.areaAccountId = areaAccountId;
	}

	public String getAreaPhone() {
		return areaPhone;
	}

	public void setAreaPhone(String areaPhone) {
		this.areaPhone = areaPhone;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public Date getBindTime() {
		return bindTime;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
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

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}
}
