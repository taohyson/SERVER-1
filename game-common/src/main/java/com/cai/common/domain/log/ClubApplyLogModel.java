package com.cai.common.domain.log;

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
 * @author zhanglong date: 2018年5月8日 上午10:45:58
 */
@Document(collection = "club_apply_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_account_id", def = "{'accountId': 1}", background = true),
		@CompoundIndex(name = "index_type", def = "{'type': 1}", background = true) })
public class ClubApplyLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * 申请类型 1-加入 2-退出
	 */
	private int type;

	/**
	 * 俱乐部Id
	 */
	private int clubId;

	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 申请时间
	 */
	private Date applyTime;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 申请描述
	 */
	private String content;
	/**
	 * 已审核列表用,true 表示同意 ,false表示拒绝
	 */
	private boolean isAgree;

	/**
	 * 是否处理
	 */
	private boolean isHandle;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isAgree() {
		return isAgree;
	}

	public void setAgree(boolean isAgree) {
		this.isAgree = isAgree;
	}

	public boolean isHandle() {
		return isHandle;
	}

	public void setHandle(boolean isHandle) {
		this.isHandle = isHandle;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

}
