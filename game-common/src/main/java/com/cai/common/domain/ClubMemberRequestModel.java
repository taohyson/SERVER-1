package com.cai.common.domain;

import protobuf.clazz.ClubMsgProto.ClubApplyJoinProto;

public class ClubMemberRequestModel{
	
	private int id;
	
	private long account_id;
	private String nickname;
	private long gold;
	private String avatar;
	// 0 未审核 1已审核
	private int status;
	
	private long create_time;
	
	private long apply_time;
	
	private String content;
	
	public long getGold() {
		return gold;
	}
	public void setGold(long gold) {
		this.gold = gold;
	}
	public String getAvatar() {
		return avatar;
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
		return nickname;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCreate_time() {
		return create_time;
	}
	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}
	public long getApply_time() {
		return apply_time;
	}
	public void setApply_time(long apply_time) {
		this.apply_time = apply_time;
	}
	
	public static ClubMemberRequestModel decode(ClubApplyJoinProto proto){
		ClubMemberRequestModel m = new ClubMemberRequestModel();
		m.setAccount_id(proto.getAccountId());
		m.setApply_time(proto.getJoinTime());
		m.setCreate_time(proto.getCreateTime());
		m.setAvatar(proto.getAvatar());
		m.setContent(proto.getContent());
		return m;
	}

	public ClubApplyJoinProto.Builder encode(){
		ClubApplyJoinProto.Builder b = ClubApplyJoinProto.newBuilder();
		b.setAccountId(account_id);
		b.setAvatar(getAvatar());
		b.setContent(getContent());
		b.setNickname(getNickname());
		b.setCreateTime(create_time);
		b.setJoinTime(apply_time);
		return b;
	}

}