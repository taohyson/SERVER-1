package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.lang.StringUtils;

import com.cai.common.constant.AccountConstant;
import com.cai.common.define.EPtType;
import com.cai.common.define.EWxHeadimgurlType;
import com.cai.common.domain.ej.EJRelativeModel;
import com.cai.common.domain.statistics.AccountDailyBrandStatistics;
import com.cai.common.util.MyStringUtil;
import com.cai.common.util.WxUtil;
import com.google.common.collect.Multiset;
import com.xianyi.framework.core.concurrent.WorkerLoop;

/**
 * 账号
 * 
 * @author run
 *
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 账号
	 */
	private AccountModel accountModel;

	/**
	 * 微信相关
	 */
	private AccountWeixinModel accountWeixinModel;

	/**
	 * 账号参数列表
	 */
	private Map<Integer, AccountParamModel> accountParamModelMap;

	/**
	 * 邀请列表 key=对方玩家的id
	 */
	private Map<Long, AccountRecommendModel> accountRecommendModelMap;

	/**
	 * 下级代理列表 key=对方玩家的id
	 */
	private Map<Long, AccountProxyModel> accountProxyModelMap;

	private Map<String, AccountGroupModel> accountGroupModelMap;
	/**
	 * 钻石黄金推广员玩家下级代理
	 */
	private Map<Long, AgentRecommendModel> agentRecommendModelMap;
	/**
	 * 邀请列表 key=对方玩家的id
	 */
	private Map<Long, HallRecommendModel> hallRecommendModelMap;

	private HallRecommendModel hallRecommendModel;

	/** 红包雨活动发送记录 */
	private RedActivityModel redActivityModel;

	/** 红包雨活动:玩家抽取红包次数 临时数据重启后失效 */
	private Multiset<Integer> RED_PACK_COUNT;

	/**
	 * 缓存创建时间
	 */
	private long cacheCreateTime;

	/**
	 * 上次登录的游戏
	 */
	private int lastGameIndex;

	/**
	 * 上一次游戏状态
	 */
	private int lastGameStatus;

	/**
	 * 上一次链接的逻辑计算服
	 */
	private int lastLogicIndex;

	/**
	 * 上一次链接的代理服
	 */
	private int lastProxyIndex;

	/**
	 * 当前游戏id
	 */
	private int game_id;

	/**
	 * 每日打的总大局数
	 */
	private AtomicInteger day_all_round = new AtomicInteger();

	/**
	 * redis数据刷新锁
	 */
	private transient ReentrantLock redisLock;

	/**
	 * 执行器
	 */
	private volatile transient WorkerLoop workerLoop;

	/**
	 * 普通开房，加入房间 ，比赛场报名，俱乐部开房等时间戳，防止进入多个房间
	 */
	private long nextEnterRoomTime;

	/**
	 * 积分值
	 */
	private int integral;
	/**
	 * 推荐相关条件属性
	 */
	private RecommendRelativeModel recommendRelativeModel;
	/**
	 * 分享时间
	 */
	private long shareTime;

	// 记录玩家每日牌局数，只做为临时统计，不入库
	private Map<Integer, AccountDailyBrandStatistics> accountDailyBrandMap = new ConcurrentHashMap<>(10);

	public long lastRefreshRoom;

	// 生成第三方token，用于登录其他游戏校验使用
	private String thridToken;

	// 易接登录
	private EJRelativeModel ejr;

	public EJRelativeModel getEjr() {
		return ejr;
	}

	public void setEjr(EJRelativeModel ejr) {
		this.ejr = ejr;
	}

	public void addAccoundBrand(long accountId, int createType, int notes_date, Date registerTime) {
		AccountDailyBrandStatistics temp = this.accountDailyBrandMap.get(createType);
		if (null == temp) {
			temp = new AccountDailyBrandStatistics();
			temp.setAccount_id(accountId);
			temp.setCount(1);
			temp.setRegisterTime(registerTime);
			temp.setType(createType);
			temp.setNotes_date(notes_date);
			this.accountDailyBrandMap.put(createType, temp);
		} else {
			temp.setCount(temp.getCount() + 1);
		}
	}

	// private AccountGamesModel accountGamesModel;

	// /**
	// * 当前代理房间列表 key=room_id
	// */
	// private Map<Integer,PrxoyPlayerRoomModel> proxRoomMap =
	// Maps.newConcurrentMap();
	//
	public Account() {
		redisLock = new ReentrantLock();
	}

	public AccountModel getAccountModel() {
		return accountModel;
	}

	public void setAccountModel(AccountModel accountModel) {
		this.accountModel = accountModel;
	}

	public long getShareTime() {
		return shareTime;
	}

	public void setShareTime(long shareTime) {
		this.shareTime = shareTime;
	}

	public long getCacheCreateTime() {
		return cacheCreateTime;
	}

	public void setCacheCreateTime(long cacheCreateTime) {
		this.cacheCreateTime = cacheCreateTime;
	}

	public int getLastGameIndex() {
		return lastGameIndex;
	}

	public void setLastGameIndex(int lastGameIndex) {
		this.lastGameIndex = lastGameIndex;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public int getLastGameStatus() {
		return lastGameStatus;
	}

	public AtomicInteger getDay_all_round() {
		return day_all_round;
	}

	public void setDay_all_round(AtomicInteger day_all_round) {
		this.day_all_round = day_all_round;
	}

	public void setLastGameStatus(int lastGameStatus) {
		this.lastGameStatus = lastGameStatus;
	}

	public int getLastLogicIndex() {
		return lastLogicIndex;
	}

	public void setLastLogicIndex(int lastLogicIndex) {
		this.lastLogicIndex = lastLogicIndex;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public int getLastProxyIndex() {
		return lastProxyIndex;
	}

	public void setLastProxyIndex(int lastProxyIndex) {
		this.lastProxyIndex = lastProxyIndex;
	}

	public AccountWeixinModel getAccountWeixinModel() {
		return accountWeixinModel;
	}

	public void setAccountWeixinModel(AccountWeixinModel accountWeixinModel) {
		this.accountWeixinModel = accountWeixinModel;
	}

	public Map<Integer, AccountParamModel> getAccountParamModelMap() {
		return accountParamModelMap;
	}

	public void setAccountParamModelMap(Map<Integer, AccountParamModel> accountParamModelMap) {
		this.accountParamModelMap = accountParamModelMap;
	}

	public Map<String, AccountGroupModel> getAccountGroupModelMap() {
		return accountGroupModelMap;
	}

	public void setAccountGroupModelMap(Map<String, AccountGroupModel> accountGroupModelMap) {
		this.accountGroupModelMap = accountGroupModelMap;
	}

	public Map<Long, AccountProxyModel> getAccountProxyModelMap() {
		return accountProxyModelMap;
	}

	public void setAccountProxyModelMap(Map<Long, AccountProxyModel> accountProxyModelMap) {
		this.accountProxyModelMap = accountProxyModelMap;
	}

	public Map<Long, AgentRecommendModel> getAgentRecommendModelMap() {
		return agentRecommendModelMap;
	}

	public void setAgentRecommendModelMap(Map<Long, AgentRecommendModel> agentRecommendModelMap) {
		this.agentRecommendModelMap = agentRecommendModelMap;
	}

	// ==========
	public long getAccount_id() {
		return accountModel.getAccount_id();
	}

	public String getAccount_name() {
		return accountModel.getAccount_name();
	}

	public Map<Long, HallRecommendModel> getHallRecommendModelMap() {
		return hallRecommendModelMap;
	}

	public void setHallRecommendModelMap(Map<Long, HallRecommendModel> hallRecommendModelMap) {
		this.hallRecommendModelMap = hallRecommendModelMap;
	}

	public String getNickName() {

		if (accountModel.getPt().equals(EPtType.SELF.getId())) {
			String name = accountModel.getAccount_name();
			if (name.indexOf("SELF_") != -1) {
				String name2 = name.split("SELF_")[1];
				name2 = MyStringUtil.substringByLength(name2, AccountConstant.NICK_NAME_LEN);
				return name2;
			}
			// String name = "游客" + this.getAccount_id();
			// return name;
		} else if (accountModel.getPt().equals(EPtType.WX.getId())) {
			String nickname = accountWeixinModel.getNickname();
			return MyStringUtil.substringByLength(nickname, AccountConstant.NICK_NAME_LEN);
		} else if (accountModel.getPt().equals(EPtType.EJ.getId())) {
			String nickname = StringUtils.isBlank(ejr.getNickname()) ? accountModel.getAccount_name().split("_")[0] + "@oppo" : ejr.getNickname();
			return MyStringUtil.substringByLength(nickname, AccountConstant.NICK_NAME_LEN);
		}

		return accountModel.getAccount_name();

	}

	public String getIcon() {
		if (accountWeixinModel != null) {
			String icon = WxUtil.changHeadimgurl(accountWeixinModel.getHeadimgurl(), EWxHeadimgurlType.S46);
			return icon;
		}
		return "1.png";
	}

	public ReentrantLock getRedisLock() {
		if (redisLock == null) {
			redisLock = new ReentrantLock();
		}

		return redisLock;
	}

	public void setRedisLock(ReentrantLock redisLock) {
		this.redisLock = redisLock;
	}

	/**
	 * @return the rED_PACK_COUNT
	 */
	public Multiset<Integer> getRED_PACK_COUNT() {
		return RED_PACK_COUNT;
	}

	/**
	 * @param rED_PACK_COUNT
	 *            the rED_PACK_COUNT to set
	 */
	public void setRED_PACK_COUNT(Multiset<Integer> rED_PACK_COUNT) {
		RED_PACK_COUNT = rED_PACK_COUNT;
	}

	public Map<Long, AccountRecommendModel> getAccountRecommendModelMap() {
		return accountRecommendModelMap;
	}

	public void setAccountRecommendModelMap(Map<Long, AccountRecommendModel> accountRecommendModelMap) {
		this.accountRecommendModelMap = accountRecommendModelMap;
	}

	public HallRecommendModel getHallRecommendModel() {
		return hallRecommendModel;
	}

	public void setHallRecommendModel(HallRecommendModel hallRecommendModel) {
		this.hallRecommendModel = hallRecommendModel;
	}

	/**
	 * @return the redActivityModel
	 */
	public RedActivityModel getRedActivityModel() {
		return redActivityModel;
	}

	/**
	 * @param redActivityModel
	 *            the redActivityModel to set
	 */
	public void setRedActivityModel(RedActivityModel redActivityModel) {
		this.redActivityModel = redActivityModel;
	}

	/**
	 * @return the workerLoop
	 */
	public WorkerLoop getWorkerLoop() {
		return workerLoop;
	}

	/**
	 * @param workerLoop
	 *            the workerLoop to set
	 */
	public void setWorkerLoop(WorkerLoop workerLoop) {
		this.workerLoop = workerLoop;
	}

	@Override
	public String toString() {
		return String.format("Account [accountid:%s,nickname:%s],pt:%s,gold:%d,money%d]", accountModel.getAccount_id(),
				null == accountWeixinModel ? accountModel.getAccount_name() : accountWeixinModel.getNickname(), accountModel.getPt(),
				accountModel.getGold(), accountModel.getMoney());
	}

	public long getNextEnterRoomTime() {
		return nextEnterRoomTime;
	}

	public void resetNextEnterRoomTime() {
		this.nextEnterRoomTime = System.currentTimeMillis() + 1000;
	}

	public void resetEnterRoomTime() {
		this.nextEnterRoomTime = System.currentTimeMillis() + 5;
	}

	public RecommendRelativeModel getRecommendRelativeModel() {
		return recommendRelativeModel;
	}

	public void setRecommendRelativeModel(RecommendRelativeModel recommendRelativeModel) {
		this.recommendRelativeModel = recommendRelativeModel;
	}

	// public AccountGamesModel getAccountGamesModel() {
	// return accountGamesModel;
	// }
	//
	// public void setAccountGamesModel(AccountGamesModel accountGamesModel) {
	// this.accountGamesModel = accountGamesModel;
	// }

	// public Map<Integer, PrxoyPlayerRoomModel> getProxRoomMap() {
	// return proxRoomMap;
	// }
	//
	// public void setProxRoomMap(Map<Integer, PrxoyPlayerRoomModel>
	// proxRoomMap) {
	// this.proxRoomMap = proxRoomMap;
	// }
	public int getSex() {
		int sex = 2;
		if (accountWeixinModel != null) {
			String sSex = accountWeixinModel.getSex();
			sex = Integer.parseInt(sSex);
		}
		return sex;
	}

	public int getLastChannelId() {
		return accountModel.getLast_channel();
	}

	public Map<Integer, AccountDailyBrandStatistics> getAccountDailyBrandMap() {
		return accountDailyBrandMap;
	}

	public String getThridToken() {
		return thridToken;
	}

	public void setThridToken(String thridToken) {
		this.thridToken = thridToken;
	}

}
