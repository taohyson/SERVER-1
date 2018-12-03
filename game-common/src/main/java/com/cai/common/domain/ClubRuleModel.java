package com.cai.common.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import com.alibaba.fastjson.JSON;
import com.cai.common.constant.Symbol;
import com.cai.common.util.DescParams;
import com.cai.common.util.GameDescUtil;
import com.google.common.primitives.Ints;
import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import protobuf.clazz.ClubMsgProto.ClubRuleProto;
import protobuf.clazz.Common.CommonGameRuleProto;
import protobuf.clazz.Common.CommonGameRulesProto;

import static protobuf.clazz.ClubMsgProto.WelfareBigWinCost;

/**
 * @author demon date: 2017年7月21日 下午5:14:56 <br/>
 */
public class ClubRuleModel implements Serializable {

	public static final Logger logger = LoggerFactory.getLogger(ClubRuleModel.class);

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private int game_type_index;

	private int game_round;

	private volatile int club_id;

	private byte[] data;

	private transient CommonGameRulesProto rules;

	private transient String game_name;
	private transient int game_id;

	private DescParams ruleParams;

	// 设置状态，32个状态位
	private int settingStatus;

	// 非数据库字段
	private transient StatusModule setsModel;

	// 包间备注
	private String remark;

	/**
	 * 疲劳值门槛
	 */
	private int tireValue;

	/**
	 * 桌子密码
	 */
	private String tablePassports;

	/**
	 * 包间限制局数
	 */
	private int limitRound;

	/**
	 * 客户端展示字段(0-局数 1-积分)
	 */
	private int showType;

	/**
	 * 大赢家抽奖消耗
	 */
	private int lotteryCost;

	/**
	 * 福卡入桌门槛
	 */
	private int limitWelfare;

	/**
	 * 福卡消耗类型 1-大赢家抽奖 2-所有人抽奖
	 */
	private int welfareCostType;

	/**
	 * 福卡大赢家抽奖消耗配置
	 */
	private String bigWinCost;

	/**
	 * 所有人抽奖消耗
	 */
	private int allPeopleCost;

	private transient Map<Integer, Integer> tablePassportMap;

	private transient List<ClubWelfareBigWinCostModel> welfareBigWinCostList;

	public int getGame_type_index() {
		return game_type_index;
	}

	public void setGame_type_index(int game_type_index) {
		this.game_type_index = game_type_index;
	}

	public int getGame_round() {
		return game_round;
	}

	public void setGame_round(int game_round) {
		this.game_round = game_round;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void decodeRule() throws InvalidProtocolBufferException {
		ruleParams = new DescParams();
		if (data != null && data.length >= 0) {
			rules = CommonGameRulesProto.parseFrom(data);
			init();
		} else {
			rules = CommonGameRulesProto.newBuilder().build();
		}
		try {
			if (StringUtils.isNotEmpty(tablePassports)) {
				if (tablePassportMap == null) {
					tablePassportMap = new HashMap<>();
				}
				String[] strArr = tablePassports.split(Symbol.VERTICAL_LINE);
				if (strArr != null && strArr.length > 0) {
					for (String str : strArr) {
						String[] tmp = str.split(Symbol.COMMA);
						if (tmp != null && tmp.length == 2) {
							Integer index = Ints.tryParse(tmp[0]);
							Integer pass = Ints.tryParse(tmp[1]);
							if (index != null && pass != null) {
								tablePassportMap.put(index, pass);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			logger.error("tablePassports parse error", e);
		}

		try {
			if (StringUtils.isNotEmpty(bigWinCost)) {
				welfareBigWinCostList = JSON.parseArray(bigWinCost, ClubWelfareBigWinCostModel.class);
			}
		} catch (Exception e) {
			logger.error("welfareBigWinCost parse error", e);
		}
	}

	public void encodeRule() {
		data = rules.toByteArray();
		settingStatus = setsModel.getStatus();
	}

	public void init() {
		ruleParams = new DescParams();
		ruleParams._game_type_index = game_type_index;
		for (CommonGameRuleProto rule : rules.getRulesList()) {
			ruleParams.put(rule.getRuleId(), rule.getValue());
			if (rule.getRuleId() < 32) {
				ruleParams._game_rule_index = ruleParams._game_rule_index | (1 << rule.getRuleId());
			}
			int mod = rule.getRuleId() % 32;
			int index = (rule.getRuleId() - mod) / 32;
			if (index < ruleParams.game_rules.length) {
				ruleParams.game_rules[index] = ruleParams.game_rules[index] | (1 << mod);
			}
		}
		setsModel = StatusModule.newWithStatus(settingStatus);
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public String getGame_name() {
		return game_name;
	}

	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	public ClubRuleProto.Builder encodeProto(GameGroups gameGroups) {
		ClubRuleProto.Builder b = ClubRuleProto.newBuilder();
		b.setRules(rules);
		b.setGameRound(this.getGame_round());
		b.setGameTypeIndex(this.getGame_type_index());
		b.setId(this.getId());
		b.setRuleDesc(GameDescUtil.getGameDesc(this, gameGroups));
		return b;
	}

	public String getGameDesc(GameGroups gameGroups) {
		return GameDescUtil.getGameDesc(this, gameGroups);
	}

	public CommonGameRulesProto getRules() {
		return rules;
	}

	public void setRules(CommonGameRulesProto rules) {
		this.rules = rules;
	}

	public DescParams getRuleParams() {
		return ruleParams;
	}

	public void setRuleParams(DescParams ruleParams) {
		this.ruleParams = ruleParams;
	}

	public int getSettingStatus() {
		return settingStatus;
	}

	public void setSettingStatus(int settingStatus) {
		this.settingStatus = settingStatus;
	}

	public StatusModule getSetsModel() {
		return setsModel;
	}

	public void setSetsModel(StatusModule setsModel) {
		this.setsModel = setsModel;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getTireValue() {
		return tireValue;
	}

	public void setTireValue(int tireValue) {
		this.tireValue = tireValue;
	}

	public int getTablePassport(int index) {
		if (tablePassportMap != null && tablePassportMap.containsKey(index)) {
			return tablePassportMap.get(index);
		}
		return 0;
	}

	public void setTablePassport(int index, int passport) {
		if (tablePassportMap == null) {
			tablePassportMap = new HashMap<>();
		}
		tablePassportMap.put(index, passport);
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Integer, Integer> entry : tablePassportMap.entrySet()) {
			sb.append(entry.getKey()).append(",").append(entry.getValue()).append("|");
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		this.tablePassports = sb.toString();
	}

	public void setWelfareBigWinCost(List<WelfareBigWinCost> bigWinCostList) {
		welfareBigWinCostList = new CopyOnWriteArrayList<>();
		if (bigWinCostList != null) {
			for (WelfareBigWinCost costProto : bigWinCostList) {
				ClubWelfareBigWinCostModel model = new ClubWelfareBigWinCostModel();
				model.setMinValue(costProto.getMinValue());
				model.setMaxValue(costProto.getMaxValue());
				model.setCost(costProto.getCost());
				welfareBigWinCostList.add(model);
			}
		}
		try {
			bigWinCost = JSON.toJSON(welfareBigWinCostList).toString();
		} catch (Exception e) {
			logger.error("setWelfareBigWinCost error", e);
		}
	}

	public List<ClubWelfareBigWinCostModel> getWelfareBigWinCostList() {
		return welfareBigWinCostList;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public int getLimitRound() {
		return limitRound;
	}

	public void setLimitRound(int limitRound) {
		this.limitRound = limitRound;
	}

	public int getShowType() {
		return showType;
	}

	public void setShowType(int showType) {
		this.showType = showType;
	}

	public int getLotteryCost() {
		return lotteryCost;
	}

	public void setLotteryCost(int lotteryCost) {
		this.lotteryCost = lotteryCost;
	}

	public int getLimitWelfare() {
		return limitWelfare;
	}

	public void setLimitWelfare(int limitWelfare) {
		this.limitWelfare = limitWelfare;
	}

	public int getWelfareCostType() {
		return welfareCostType;
	}

	public void setWelfareCostType(int welfareCostType) {
		this.welfareCostType = welfareCostType;
	}

	public String getBigWinCost() {
		return bigWinCost;
	}

	public void setBigWinCost(String bigWinCost) {
		this.bigWinCost = bigWinCost;
	}

	public int getAllPeopleCost() {
		return allPeopleCost;
	}

	public void setAllPeopleCost(int allPeopleCost) {
		this.allPeopleCost = allPeopleCost;
	}

	public int getBigWinLotteryCost(int maxScore) {
		if (welfareBigWinCostList == null || welfareBigWinCostList.size() < 1) {
			logger.error("club={} ruleId={} getBigWinLotteryCost error,no cost setting!", club_id, id);
			return -1;
		}
		for (ClubWelfareBigWinCostModel model : welfareBigWinCostList) {
			if (maxScore >= model.getMinValue() && maxScore <= model.getMaxValue()) {
				return model.getCost();
			}
		}

		return -1;
	}
}
