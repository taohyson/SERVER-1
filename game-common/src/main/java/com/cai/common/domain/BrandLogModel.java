package com.cai.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

/**
 * 牌局记录
 * 
 * @author run
 *
 */
@Document(collection = "brand_log")
@CompoundIndexes({ @CompoundIndex(name = "index_crate_time", def = "{'create_time': 1}", background = true),
		@CompoundIndex(name = "index_account", def = "{'account_id': 1}"), @CompoundIndex(name = "index_game_id", def = "{'game_id': 1}"),
		@CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"), @CompoundIndex(name = "index_brand_id", def = "{'brand_id': 1}"),
		@CompoundIndex(name = "index_v1", def = "{'v1': 1}"), @CompoundIndex(name = "index_room_id", def = "{'v3': 1}", background = true),
		@CompoundIndex(name = "index_create_account_id", def = "{'create_account_id': 1}", background = true),
		@CompoundIndex(name = "index_club_id", def = "{'club_id': 1}", background = true),
		@CompoundIndex(name = "index_groupID", def = "{'groupID': 1}", background = true),
		@CompoundIndex(name = "index_createType", def = "{'createType': 1}", background = true),
		@CompoundIndex(name = "index_match_id", def = "{'match_id': 1}", background = true),
		@CompoundIndex(name = "index_randomNum", def = "{'randomNum': 1}", background = true),
		@CompoundIndex(name = "index_accountIds", def = "{'accountIds': 1}", background = true),
		@CompoundIndex(name = "index_real_cost_time", def = "{'real_cost_time': 1}", background = true),
		@CompoundIndex(name = "index_clubMatchId", def = "{'clubMatchId': 1}", background = true),
		@CompoundIndex(name = "index_clubbrandquery", def = "{'create_time': 1, 'log_type':1, 'club_id':1, 'isRealKouDou':1, 'clubMatchId':1}", background = true) })
public class BrandLogModel implements Serializable {
	private String _id;

	/**
	 * 日志创建时间，即开局时间
	 */
	private Date create_time;
	private Long account_id;

	private Integer game_id;
	private Integer logic_id;
	private String log_type;
	@JSONField(serializeUsing = ToStringSerializer.class)
	private Long brand_id;// 牌局id
	@JSONField(serializeUsing = ToStringSerializer.class)
	private String brand_child_id;// 牌局子id
	@JSONField(serializeUsing = ToStringSerializer.class)
	private Long brand_parent_id;// 牌局父id
	private String msg;
	private Long v1;
	private Long v2;
	private String v3;
	private String v4;
	private String local_ip;
	private String account_ip;
	private int club_id;

	private int match_id;
	/**
	 * 是否压缩回放数据 gzip -1=否 1=是
	 */
	private int compress_video;
	/**
	 * 回放数据
	 */
	private byte[] video_record;

	/**
	 * 房间创建者
	 */
	private Long create_account_id;

	private Long gold_count;

	/**
	 * 创建类型
	 */
	private int createType;

	/**
	 * 微信群
	 */
	private String groupID;

	/**
	 * 俱乐部名字或者微信群名字
	 */
	private String name;

	private boolean isRealKouDou = false;

	private Integer randomNum = 0;

	/**
	 * 回放码
	 */
	private String video_code;

	/**
	 * 是否专属豆
	 */
	private boolean isExclusiveGold;

	/**
	 * 
	 */
	private int upvote;

	private List<Long> accountIds = new ArrayList<>();
	/**
	 * 起始牌数组
	 */
	@JSONField(serializeUsing = ToStringSerializer.class)
	private String beginArray;

	// 辅助字段
	private String createTypeName; // 开房方式名称

	// 俱乐部相关，规则/玩法id
	private int ruleId;

	// 俱乐部比赛相关
	private long clubMatchId;

	// 真实扣都时间
	private Date real_cost_time;

	// 游戏结束时间
	private Date game_end_time;

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_id() {
		return _id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Integer getGame_id() {
		return game_id;
	}

	public void setGame_id(Integer game_id) {
		this.game_id = game_id;
	}

	public Integer getLogic_id() {
		return logic_id;
	}

	public void setLogic_id(Integer logic_id) {
		this.logic_id = logic_id;
	}

	public String getLog_type() {
		return log_type;
	}

	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}

	public Long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_child_id() {
		return brand_child_id;
	}

	public void setBrand_child_id(String brand_child_id) {
		this.brand_child_id = brand_child_id;
	}

	public Long getBrand_parent_id() {
		return brand_parent_id;
	}

	public void setBrand_parent_id(Long brand_parent_id) {
		this.brand_parent_id = brand_parent_id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getV1() {
		return v1;
	}

	public void setV1(Long v1) {
		this.v1 = v1;
	}

	public Long getV2() {
		return v2;
	}

	public void setV2(Long v2) {
		this.v2 = v2;
	}

	public String getV3() {
		return v3;
	}

	public void setV3(String v3) {
		this.v3 = v3;
	}

	public String getV4() {
		return v4;
	}

	public void setV4(String v4) {
		this.v4 = v4;
	}

	public String getLocal_ip() {
		return local_ip;
	}

	public void setLocal_ip(String local_ip) {
		this.local_ip = local_ip;
	}

	public Long getCreate_account_id() {
		return create_account_id;
	}

	public void setCreate_account_id(Long create_account_id) {
		this.create_account_id = create_account_id;
	}

	public String getAccount_ip() {
		return account_ip;
	}

	public String getBeginArray() {
		return beginArray;
	}

	public void setBeginArray(String beginArray) {
		this.beginArray = beginArray;
	}

	public void setAccount_ip(String account_ip) {
		this.account_ip = account_ip;
	}

	public int getCompress_video() {
		return compress_video;
	}

	public void setCompress_video(int compress_video) {
		this.compress_video = compress_video;
	}

	public byte[] getVideo_record() {
		return video_record;
	}

	public void setVideo_record(byte[] video_record) {
		this.video_record = video_record;
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public Long getGold_count() {
		return gold_count;
	}

	public void setGold_count(Long gold_count) {
		this.gold_count = gold_count;
	}

	public int getCreateType() {
		return createType;
	}

	public void setCreateType(int createType) {
		this.createType = createType;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRealKouDou() {
		return isRealKouDou;
	}

	public void setRealKouDou(boolean isRealKouDou) {
		this.isRealKouDou = isRealKouDou;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public Integer getRandomNum() {
		return randomNum;
	}

	public void setRandomNum(Integer randomNum) {
		this.randomNum = randomNum;
	}

	public String getVideo_code() {
		return video_code;
	}

	public void setVideo_code(String video_code) {
		this.video_code = video_code;
	}

	public boolean isExclusiveGold() {
		return isExclusiveGold;
	}

	public void setExclusiveGold(boolean isExclusiveGold) {
		this.isExclusiveGold = isExclusiveGold;
	}

	public int getUpvote() {
		return upvote;
	}

	public void setUpvote(int upvote) {
		this.upvote = upvote;
	}

	public List<Long> getAccountIds() {
		return accountIds;
	}

	public void setAccountIds(List<Long> accountIds) {
		this.accountIds = accountIds;
	}

	public String getCreateTypeName() {
		return createTypeName;
	}

	public void setCreateTypeName(String createTypeName) {
		this.createTypeName = createTypeName;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public long getClubMatchId() {
		return clubMatchId;
	}

	public void setClubMatchId(long clubMatchId) {
		this.clubMatchId = clubMatchId;
	}

	public Date getReal_cost_time() {
		return real_cost_time;
	}

	public void setReal_cost_time(Date real_cost_time) {
		this.real_cost_time = real_cost_time;
	}

	public Date getGame_end_time() {
		return game_end_time;
	}

	public void setGame_end_time(Date game_end_time) {
		this.game_end_time = game_end_time;
	}

	@Override
	public String toString() {
		return "BrandLogModel [_id=" + _id + ", create_time=" + create_time + ", account_id=" + account_id + ", game_id=" + game_id + ", logic_id="
				+ logic_id + ", log_type=" + log_type + ", brand_id=" + brand_id + ", brand_child_id=" + brand_child_id + ", brand_parent_id="
				+ brand_parent_id + ", msg=" + msg + ", v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ", v4=" + v4 + ", local_ip=" + local_ip
				+ ", account_ip=" + account_ip + ", club_id=" + club_id + ", match_id=" + match_id + ", create_account_id=" + create_account_id
				+ ", gold_count=" + gold_count + ", createType=" + createType + ", groupID=" + groupID + ", name=" + name + ", isRealKouDou="
				+ isRealKouDou + ", randomNum=" + randomNum + ", video_code=" + video_code + ", isExclusiveGold=" + isExclusiveGold + ", upvote="
				+ upvote + ", accountIds=" + accountIds + ", beginArray=" + beginArray + ", createTypeName=" + createTypeName + ", ruleId=" + ruleId
				+ ", clubMatchId=" + clubMatchId + ", real_cost_time=" + real_cost_time + ", game_end_time=" + game_end_time + "]";
	}

}
