/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import com.cai.common.define.EClubEventType;
import com.google.common.collect.Maps;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 俱乐部操作日志
 *
 * @author wu_hc date: 2018年4月4日 上午9:50:08 <br/>
 */
@Document(collection = "club_event_log")
@CompoundIndexes({ @CompoundIndex(name = "index_create_time", def = "{'create_time': -1}", background = true),
		@CompoundIndex(name = "index_operatorId", def = "{'operatorId': 1}"), @CompoundIndex(name = "index_targetId", def = "{'targetId': 1}"),
		@CompoundIndex(name = "index_category", def = "{'category': -1}", background = true),
		@CompoundIndex(name = "index_clubId", def = "{'clubId': -1}", background = true), })
public class ClubEventLogModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	static transient final Map<EClubEventType, Function<ClubEventLogModel, String>> fuc = Maps.newHashMap();

	static {
		fuc.put(EClubEventType.CREATE, (m) -> String.format("俱乐部[%d]，玩家[%d] 创建俱乐部!", m.getClubId(), m.getOperatorId()));
		fuc.put(EClubEventType.DELETE, (m) -> String.format("俱乐部[%d]，玩家[%d] 删除俱乐部,当前人数[%d]!", m.getClubId(), m.getOperatorId(), m.getVal1()));
		fuc.put(EClubEventType.RULE_A,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 添加玩法[id:%d,gameTypeIndex:%d]!", m.getClubId(), m.getOperatorId(), m.getVal1(), m.getVal2()));
		fuc.put(EClubEventType.RULE_D,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 删除玩法[id:%d,gameTypeIndex:%d]!", m.getClubId(), m.getOperatorId(), m.getVal1(), m.getVal2()));
		fuc.put(EClubEventType.RULE_U,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 修改玩法[id:%d,gameTypeIndex:%d]!", m.getClubId(), m.getOperatorId(), m.getVal1(), m.getVal2()));
		fuc.put(EClubEventType.SETS_U,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 修改设置[%d]->[%d]!", m.getClubId(), m.getOperatorId(), m.getVal1(), m.getVal2()));
		fuc.put(EClubEventType.JOIN, (m) -> String.format("俱乐部[%d]，玩家[%d] 加入俱乐部，操作者[%d]!", m.getClubId(), m.getTargetId(), m.getOperatorId()));
		fuc.put(EClubEventType.OUT, (m) -> String.format("俱乐部[%d]，玩家[%d] 离开俱乐部，操作者[%d]!", m.getClubId(), m.getTargetId(), m.getOperatorId()));
		fuc.put(EClubEventType.KICK, (m) -> String
				.format("俱乐部[%d]，玩家[%d] 被踢出桌子[ruleId:%d,table:%d]，操作者[%d]，踢出类型[%s]!", m.getClubId(), m.getTargetId(), m.getVal1(), m.getVal2(),
						m.getOperatorId(), getTableKickOutType(m.getVal3())));
		fuc.put(EClubEventType.DISBAND, (m) -> String
				.format("俱乐部[%d]，玩家[%d] 解散桌子[ruleId:%d,table:%d,roomId:%d]!", m.getClubId(), m.getOperatorId(), m.getVal1(), m.getVal2(),
						m.getVal3()));
		fuc.put(EClubEventType.TIRE_U, (m) -> String
				.format("俱乐部[%d]，玩家[%d] 将玩家 [%d] day= [%d]的疲劳值从 [%d]修改为 [%d]!", m.getClubId(), m.getOperatorId(), m.getTargetId(), m.getVal3(),
						m.getVal1(), m.getVal2()));
		fuc.put(EClubEventType.TIRE_SWITCH_U,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 修改疲劳值开关状态为 [%s]!", m.getClubId(), m.getOperatorId(), (m.getVal1() == 1) ? "打开" : "关闭"));
		fuc.put(EClubEventType.TIRE_RESET_SWITCH_U,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 修改疲劳值每日重置开关状态为 [%s]!", m.getClubId(), m.getOperatorId(), (m.getVal1() == 1) ? "打开" : "关闭"));
		fuc.put(EClubEventType.CLUB_MATCH_BLACKLIST_U,
				(m) -> String.format("俱乐部[%d]，后台修改为 [%s] 自建赛黑名单!", m.getClubId(), (m.getVal1() == 1) ? "加入" : "删除"));
		fuc.put(EClubEventType.CLUB_MATCH_WHITELIST_U,
				(m) -> String.format("俱乐部[%d]，后台修改为 [%s] 自建赛白名单!", m.getClubId(), (m.getVal1() == 1) ? "加入" : "删除"));

		fuc.put(EClubEventType.ADD_PARTNER, (m) -> String.format("俱乐部[%d]，创建人[%d] 添加合伙人[%d]!", m.getClubId(), m.getOperatorId(), m.getTargetId()));
		fuc.put(EClubEventType.DEL_PARTNER, (m) -> String.format("俱乐部[%d]，创建人[%d] 删除合伙人[%d]!", m.getClubId(), m.getOperatorId(), m.getTargetId()));
		fuc.put(EClubEventType.ADD_CHILD,
				(m) -> String.format("俱乐部[%d]，创建人[%d] 给合伙人[%d] 添加子成员[%d]!", m.getClubId(), m.getOperatorId(), m.getTargetId(), m.getParam1()));
		fuc.put(EClubEventType.DEL_CHILD,
				(m) -> String.format("俱乐部[%d]，创建人[%d] 移除合伙人[%d] 的子成员[%d]!", m.getClubId(), m.getOperatorId(), m.getTargetId(), m.getParam1()));
		fuc.put(EClubEventType.MODIFY_WELFARE,
				(m) -> String.format("俱乐部[%d]，玩家[%d] 将玩家[%d]福卡由[%d]修改为[%d]!", m.getClubId(), m.getOperatorId(), m.getTargetId(), m.getParam1(), m.getParam2()));

		fuc.put(EClubEventType.AREA_PROTECT,
				(m) -> String.format("俱乐部[%d]，gameId[%d]，gameName[%s] 区域保护状态变化为[%s]!", m.getClubId(), m.getVal1(), m.getParamStr1(), getAreaProtectType(m.getVal2())));

		fuc.put(EClubEventType.SET_TABLE_BAN_PLAYER,
				(m) -> String.format("俱乐部[%d]，玩家[%d]设置玩家[%d]的禁止同桌玩家[%s]!", m.getClubId(), m.getOperatorId(), m.getTargetId(), m.getParamStr1()));

		fuc.put(EClubEventType.SET_DEFRIEND,
				(m) -> String.format("俱乐部[%d]，玩家[%d]设置玩家[%d]禁止娱乐状态为[%s]!", m.getClubId(), m.getOperatorId(), m.getTargetId(), m.getParamStr1()));

		fuc.put(EClubEventType.RULE_SWITCH,
				(m) -> String.format("俱乐部[%d]，包间[%d]修改了开关状态[%s]!", m.getClubId(), m.getVal1(), m.getParamStr1()));
	}

	private String _id;
	/**
	 * 俱乐部id
	 */
	private int clubId;

	/**
	 * 日志创建时间
	 */
	private Date create_time;

	/**
	 * 操作者
	 */
	private long operatorId;

	/**
	 * 目标者
	 */
	private long targetId;

	/**
	 * 操作类型
	 */
	private int category;

	/**
	 * 描述
	 */
	private String desc;

	private int val1;
	private int val2;
	private int val3;

	private long param1;
	private long param2;

	private String paramStr1;

	@Transient private EClubEventType eClubEventType;

	/**
	 *
	 */
	public ClubEventLogModel() {
	}

	/**
	 * @param clubId
	 * @param operatorId
	 * @param eCategory  {@link EClubEventType}
	 */
	public ClubEventLogModel(int clubId, long operatorId, EClubEventType eCategory) {
		this.clubId = clubId;
		this.operatorId = operatorId;
		this.category = eCategory.category();
		create_time = new Date();
		this.eClubEventType = eCategory;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getClubId() {
		return clubId;
	}

	public ClubEventLogModel setClubId(int clubId) {
		this.clubId = clubId;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public ClubEventLogModel setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public long getOperatorId() {
		return operatorId;
	}

	public ClubEventLogModel setOperatorId(long operatorId) {
		this.operatorId = operatorId;
		return this;
	}

	public long getTargetId() {
		return targetId;
	}

	public ClubEventLogModel setTargetId(long targetId) {
		this.targetId = targetId;
		return this;
	}

	public int getCategory() {
		return category;
	}

	public ClubEventLogModel setCategory(int category) {
		this.category = category;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public ClubEventLogModel buildDesc() {
		if (null != desc) {
			return this;
		}
		desc = fuc.get(this.eClubEventType).apply(this);
		return this;
	}

	public int getVal1() {
		return val1;
	}

	public ClubEventLogModel setVal1(int val1) {
		this.val1 = val1;
		return this;
	}

	public int getVal2() {
		return val2;
	}

	public ClubEventLogModel setVal2(int val2) {
		this.val2 = val2;
		return this;
	}

	public int getVal3() {
		return val3;
	}

	public ClubEventLogModel setVal3(int val3) {
		this.val3 = val3;
		return this;
	}

	public long getParam1() {
		return param1;
	}

	public ClubEventLogModel setParam1(long param1) {
		this.param1 = param1;
		return this;
	}

	public long getParam2() {
		return param2;
	}

	public ClubEventLogModel setParam2(long param2) {
		this.param2 = param2;
		return this;
	}

	public String getParamStr1() {
		return paramStr1;
	}

	public ClubEventLogModel setParamStr1(String str) {
		this.paramStr1 = str;
		return this;
	}

	private static String getTableKickOutType(int type) {
		String desc = type + "";
		switch (type) {
		case 1:
			desc = "主动踢出";
			break;
		case 2:
			desc = "切换包间模式时踢出";
			break;
		case 3:
			desc = "多包间模式下未准备自动踢出";
			break;
		}
		return desc;
	}

	private static String getAreaProtectType(int state) { //state see ClubAreaProtectType
		String desc = state + "";
		switch (state) {
		case 1:
			desc = "申请";
			break;
		case 2:
			desc = "同意";
			break;
		case 3:
			desc = "拒绝";
			break;
		case 4:
			desc = "解除绑定";
			break;
		}
		return desc;
	}

}
