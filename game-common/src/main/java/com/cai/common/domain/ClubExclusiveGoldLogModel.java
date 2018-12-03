package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.define.EGoldOperateType;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 俱乐部专属豆增减日志
 *
 * @author wu_hc date: 2018年4月8日 下午2:53:08 <br/>
 */
@Document(collection = "club_exclusive_gold_log")
@CompoundIndexes({ @CompoundIndex(name = "index_crate_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'account_id': 1}", background = true),
		@CompoundIndex(name = "index_appId", def = "{'appId': 1}", background = true),
		@CompoundIndex(name = "index_operateType", def = "{'operateType': 1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}", background = true),
		@CompoundIndex(name = "index_gameTypeIndex", def = "{'gameTypeIndex': 1}", background = true) })
public class ClubExclusiveGoldLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private String _id;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date create_time;

	/**
	 * 玩家id
	 */
	@Indexed
	private long account_id;

	/**
	 * 描述消息
	 */
	private String msg;

	/**
	 * 
	 */
	private long v1;
	private long v2;
	private long v3;

	/**
	 * 游戏id
	 */
	private int appId;

	/**
	 * 小游戏id
	 */
	private int gameTypeIndex;

	/**
	 * 房间id
	 */
	private int roomId;

	/**
	 * @see EGoldOperateType
	 */
	private int operateType;

	/**
	 * 俱乐部id ，消耗或者返还的时候是哪个俱乐部房间下的
	 * 
	 */
	private int clubId;

	/**
	 * 目标玩家，送豆的时候记录
	 */
	private long targetAccountId;
	
	//辅助字段
	private String gameTypeStr;

	/**
	 * 开房方式
	 */
	private int openRoomWay;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getV1() {
		return v1;
	}

	public void setV1(long v1) {
		this.v1 = v1;
	}

	public long getV2() {
		return v2;
	}

	public void setV2(long v2) {
		this.v2 = v2;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getOperateType() {
		return operateType;
	}

	public void setOperateType(int operateType) {
		this.operateType = operateType;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public long getTargetAccountId() {
		return targetAccountId;
	}

	public void setTargetAccountId(long targetAccountId) {
		this.targetAccountId = targetAccountId;
	}

	public long getV3() {
		return v3;
	}

	public void setV3(long v3) {
		this.v3 = v3;
	}

	public String getGameTypeStr() {
		return gameTypeStr;
	}

	public void setGameTypeStr(String gameTypeStr) {
		this.gameTypeStr = gameTypeStr;
	}

	public int getOpenRoomWay() {
		return openRoomWay;
	}

	public void setOpenRoomWay(int openRoomWay) {
		this.openRoomWay = openRoomWay;
	}
}
