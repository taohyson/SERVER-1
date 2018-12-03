package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 *
 * @author zhanglong date: 2018年5月29日 上午11:30:33
 */
@Document(collection = "voice_chat_log")
@CompoundIndexes({ @CompoundIndex(name = "index_type", def = "{'type': 1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': 1}", background = true),
		@CompoundIndex(name = "index_uniqueId", def = "{'uniqueId': 1}", background = true) })
public class VoiceChatLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 日志时间
	 */
	@Indexed(direction = IndexDirection.DESCENDING, expireAfterSeconds = 60 * 60 * 24 * 7, background = true)
	private Date create_time;

	/**
	 * 语音类型 1-俱乐部聊天
	 */
	private int type;

	private int clubId;

	private long uniqueId;

	private long accountId;

	private byte[] content;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

}
