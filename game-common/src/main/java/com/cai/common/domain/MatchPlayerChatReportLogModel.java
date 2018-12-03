/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 比赛场聊天举报日志
 */
@Document(collection = "match_player_chat_report_log")
@CompoundIndexes({ 
	@CompoundIndex(name = "index_timeFlag", def = "{'timeFlag': 1}"),
		@CompoundIndex(name = "index_matchId", def = "{'matchId': 1}"),
		@CompoundIndex(name = "index_mId", def = "{'mId': 1}"),
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}")
		})
public class MatchPlayerChatReportLogModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	
	private Date timeFlag; //日期
	
	private int matchId; //对应比赛
	private int mId; //比赛唯一ID
	private Date reportTime; //举报时间
	private long accountId; //账号ID
	private String nickName; //昵称
	private String headUrl; //头像
	private String content; //举报内容
	private long reportAccountId; //举报人账号ID
	
	private String chatMsg; //json格式   对应common项目中MatchChatConet_Json
	
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public Date getTimeFlag() {
		return timeFlag;
	}

	public void setTimeFlag(Date timeFlag) {
		this.timeFlag = timeFlag;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getReportTime() {
		return reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChatMsg() {
		return chatMsg;
	}

	public void setChatMsg(String chatMsg) {
		this.chatMsg = chatMsg;
	}

	public long getReportAccountId() {
		return reportAccountId;
	}

	public void setReportAccountId(long reportAccountId) {
		this.reportAccountId = reportAccountId;
	}
	
}
