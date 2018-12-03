package com.cai.common.domain.log;

import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 俱乐部疲劳值消息日志
 *
 * @author wu_hc date: 2018年4月24日 下午5:19:29 <br/>
 */
@Document(collection = "club_score_msg_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_targetAccountId", def = "{'targetAccountId': 1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}", background = true), })
public class ClubScoreMsgLogModel extends BaseLogModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING)
	private Date create_time;
	/**
	 * 玩家Id
	 */
	@Indexed
	private long accountId;

	/**
	 * 操作者名称
	 */
	private String accountName;

	/**
	 * 目标玩家
	 */
	private long targetAccountId;

	/**
	 * 目标玩家名称
	 */
	private String targetAccountName;

	/**
	 * 旧值
	 */
	private int oldValue;

	/**
	 * 新值
	 */
	private int newValue;
	
	/**
	 * 记录时间
	 */
	private long recordTime;
	
	/**
	 * 记录产生的日期
	 */
	private Date recordDate;
	
	/**
	 * 2-俱乐部疲劳值开关操作消息 3-俱乐部疲劳值清零开关操作信息 4-俱乐部疲劳值每日累计信息
	 */
	private int msgType;
	
	/**
	 * 1-打开 2-关闭
	 */
	private int switchStatus;

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getTargetAccountId() {
		return targetAccountId;
	}

	public void setTargetAccountId(long targetAccountId) {
		this.targetAccountId = targetAccountId;
	}

	public int getOldValue() {
		return oldValue;
	}

	public void setOldValue(int oldValue) {
		this.oldValue = oldValue;
	}

	public int getNewValue() {
		return newValue;
	}

	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getTargetAccountName() {
		return targetAccountName;
	}

	public void setTargetAccountName(String targetAccountName) {
		this.targetAccountName = targetAccountName;
	}

	/**
	 * 返回描述
	 * 
	 * @return
	 */
	public final String description() {
		return String.format("%s[ID:%d]将%s[ID:%d]牌技值由%d调成为%d", accountName, accountId, targetAccountName, targetAccountId, oldValue, newValue);
	}

	public long getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(long recordTime) {
		this.recordTime = recordTime;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public int getSwitchStatus() {
		return switchStatus;
	}

	public void setSwitchStatus(int switchStatus) {
		this.switchStatus = switchStatus;
	}
}
