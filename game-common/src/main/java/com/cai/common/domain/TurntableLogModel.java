package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.google.protobuf.InvalidProtocolBufferException;

import protobuf.clazz.activity.ActivityTurntableProto.TurntableLogProto;
import protobuf.clazz.activity.ActivityTurntableProto.TurntablePrizeConfigProto;

@Document(collection = "turntable_log")
@CompoundIndexes({ @CompoundIndex(name = "index_crate_time", def = "{'create_time': 1}", background = true),
		@CompoundIndex(name = "index_activityId", def = "{'activityId': 1}"), 
		@CompoundIndex(name = "index_isGet", def = "{'isGet': 1}"), 
		@CompoundIndex(name = "index_accountId", def = "{'accountId': 1}"), })
public class TurntableLogModel implements Serializable {
	/**
	 */
	private static final long serialVersionUID = 1L;
	private String _id;

	private int activityId;
	
	private String activityName;

	private long accountId;
	
	private String nickName;

	private Date create_time;

	private byte[] prizes;
	
    // 是否已领奖
	private boolean isGet;
	
	//辅助字段
	@Transient
	private String prizeDesc;
	
	//是否置顶
	private int top;
	
	//是否显示
	private int isShow;
	
	private int type;	//0真实中奖1虚拟中奖,后台添加

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

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public byte[] getPrizes() {
		return prizes;
	}

	public void setPrizes(byte[] prizes) {
		this.prizes = prizes;
	}

	public TurntableLogProto encode() {
		TurntableLogProto.Builder b = TurntableLogProto.newBuilder();
		b.setAccountId(accountId);
		b.setNickName(nickName);
		b.setCreateTime(create_time.getTime());
		if(prizes != null && prizes.length > 0){
			try {
				b.setPrizes(TurntablePrizeConfigProto.parseFrom(prizes));
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}
		}
	
		return b.build();
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public boolean isGet() {
		return isGet;
	}

	public void setGet(boolean isGet) {
		this.isGet = isGet;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getPrizeDesc() {
		return prizeDesc;
	}
	
	public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getIsShow() {
		return isShow;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
