package com.cai.common.domain;

import java.util.Date;

/**
 * 账号
 * 
 * @author run
 *
 */
public class AccountModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 账号id
	 */
	private long account_id;

	/**
	 * 平台标识, WX=微信，SELF=自有
	 */
	private String pt;
	/**
	 * 账号名
	 */
	private String account_name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 登录次数
	 */
	private int login_times;
	/**
	 * 注册时间
	 */
	private Date create_time;
	/**
	 * 最后登录时间
	 */
	private Date last_login_time;
	/**
	 * 手机号
	 */
	private String mobile_phone;
	/**
	 * 历史充值总额
	 */
	private long history_pay_gold;
	/**
	 * 房卡数量
	 */
	private long gold;

	/**
	 * 铜钱数量
	 */
	private long money;
	
	/**
	 * 钻石（SDK货币）
	 */
	private int diamond;

	/**
	 * 最后登录的ip,服务端获取的
	 */
	private String client_ip;

	/**
	 * 最后登录ip,客户端传的
	 */
	private String client_ip2;

	/**
	 * 1-封禁 0-不封禁
	 */
	private int banned;

	/**
	 * 是否代理(1-是 0-否)
	 */
	private int is_agent;

	/**
	 * 今日在线时长(秒)
	 */
	private int today_online;

	/**
	 * 历史在线时长(秒)
	 */
	private int history_online;

	/**
	 * 最后登录的设备
	 */
	private String last_client_flag;

	/**
	 * 客户端最后登录版本
	 */
	private String client_version;

	/**
	 * 推荐人账号id
	 */
	private long recommend_id;

	/**
	 * 代理级别
	 */
	private int proxy_level;

	/**
	 * 是否内部人员(1-是 0-否)
	 */
	private int is_inner;

	/**
	 * 推广员级别
	 */
	private int promote_level;

	/**
	 * 可提现RMB-分为单位
	 */
	private double rmb;

	/**
	 * 已经提现RMB -分为单位
	 */
	private double receive_rmb;

	/**
	 * 总收益RMB-分为单位
	 */
	private double history_rmb;

	/**
	 * 累计消耗--福禄寿用于 统计消耗
	 */
	private int consum_total;

	/**
	 * 上级代理--暂时福禄寿用
	 */
	private long up_proxy;

	/**
	 * 1-开通返利 0-不开通-河南麻将用
	 */
	private int is_rebate;

	/**
	 * 已经领取的登录奖励 领取的天数
	 */
	private int login_reward;
	/**
	 * 推广员总收益记录
	 */
	private double recommend_history_income;
	/**
	 * 推广员可提现余额
	 */
	private double recommend_remain_income;
	/**
	 * 推广员已经提现的金额
	 */
	private double recommend_receive_income;
	/**
	 * 推广员昨日收益
	 */
	private double recommend_yesterday_income;
	/**
	 * 推广员级别
	 */
	private int recommend_level;
	/**
	 * 钻石黄金推广员设置推荐代理id
	 */
	private long recommend_agent_id;

	/**
	 * 玩家签名
	 */
	private String signature;

	/**
	 * 最后拉取数据ID
	 */
	private int email_id;

	/**
	 * 真实姓名
	 */
	private String real_name;

	/**
	 * 身份证号
	 */
	private String identity_card;

	/**
	 * 福卡数量
	 */
	private long welfare;

	private Date coin_play_time;

	/**
	 * 最后登陆的渠道Id
	 */
	private int last_channel;

	private Date firstJoinClubTime;
	
	private String honor_msg;

	/**
	 * 是否绑过手机号
	 */
	private int binded_mobile;

	/**
	 * 更新客户端包奖励 格式:版本号,是否已发放奖励(0-否 1-是)
	 */
	private String package_update_reward;

	/**
	 * 俱乐部身份(1-创建人 2-管理员 3-创建人&管理员)
	 */
	private int clubIdentity;

	/**
	 * 上次充值时间
	 */
	private Date lastPayTime;

	/**
	 * 上次参与比赛时间
	 */
	private Date lastMatchTime;

	/**
	 * 亲友圈禁止邀请(1-禁止 0-不禁止)
	 */
	private int banClubInvite;

	public int getLogin_reward() {
		return login_reward;
	}

	public void setLogin_reward(int login_reward) {
		this.login_reward = login_reward;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public int getBinded_mobile() {
		return binded_mobile;
	}

	public void setBinded_mobile(int binded_mobile) {
		this.binded_mobile = binded_mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public int getLogin_times() {
		return login_times;
	}

	public void setLogin_times(int login_times) {
		this.login_times = login_times;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public long getHistory_pay_gold() {
		return history_pay_gold;
	}

	public void setHistory_pay_gold(long history_pay_gold) {
		this.history_pay_gold = history_pay_gold;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public String getClient_ip() {
		return client_ip;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public int getBanned() {
		return banned;
	}

	public void setBanned(int banned) {
		this.banned = banned;
	}

	public int getIs_agent() {
		return is_agent;
	}

	public void setIs_agent(int is_agent) {
		this.is_agent = is_agent;
	}

	public int getToday_online() {
		return today_online;
	}

	public void setToday_online(int today_online) {
		this.today_online = today_online;
	}

	public int getHistory_online() {
		return history_online;
	}

	public double getHistory_rmb() {
		return history_rmb;
	}

	public void setHistory_rmb(double history_rmb) {
		this.history_rmb = history_rmb;
	}

	public int getPromote_level() {
		return promote_level;
	}

	public void setPromote_level(int promote_level) {
		this.promote_level = promote_level;
	}

	public int getIs_inner() {
		return is_inner;
	}

	public void setIs_inner(int is_inner) {
		this.is_inner = is_inner;
	}

	public void setHistory_online(int history_online) {
		this.history_online = history_online;
	}

	public String getLast_client_flag() {
		return last_client_flag;
	}

	public void setLast_client_flag(String last_client_flag) {
		this.last_client_flag = last_client_flag;
	}

	public String getClient_version() {
		return client_version;
	}

	public void setClient_version(String client_version) {
		this.client_version = client_version;
	}

	public long getRecommend_id() {
		return recommend_id;
	}

	public void setRecommend_id(long recommend_id) {
		this.recommend_id = recommend_id;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public String getClient_ip2() {
		return client_ip2;
	}

	public void setClient_ip2(String client_ip2) {
		this.client_ip2 = client_ip2;
	}

	public int getProxy_level() {
		return proxy_level;
	}

	public void setProxy_level(int proxy_level) {
		this.proxy_level = proxy_level;
	}

	public double getRmb() {
		return rmb;
	}

	public void setRmb(double rmb) {
		this.rmb = rmb;
	}

	public double getReceive_rmb() {
		return receive_rmb;
	}

	public void setReceive_rmb(double receive_rmb) {
		this.receive_rmb = receive_rmb;
	}

	public int getConsum_total() {
		return consum_total;
	}

	public void setConsum_total(int consum_total) {
		this.consum_total = consum_total;
	}

	public long getUp_proxy() {
		return up_proxy;
	}

	public int getIs_rebate() {
		return is_rebate;
	}

	public void setIs_rebate(int is_rebate) {
		this.is_rebate = is_rebate;
	}

	public void setUp_proxy(long up_proxy) {
		this.up_proxy = up_proxy;
	}

	public double getRecommend_history_income() {
		return recommend_history_income;
	}

	public void setRecommend_history_income(double recommend_history_income) {
		this.recommend_history_income = recommend_history_income;
	}

	public double getRecommend_remain_income() {
		return recommend_remain_income;
	}

	public void setRecommend_remain_income(double recommend_remain_income) {
		this.recommend_remain_income = recommend_remain_income;
	}

	public double getRecommend_yesterday_income() {
		return recommend_yesterday_income;
	}

	public void setRecommend_yesterday_income(double recommend_yesterday_income) {
		this.recommend_yesterday_income = recommend_yesterday_income;
	}

	public double getRecommend_receive_income() {
		return recommend_receive_income;
	}

	public void setRecommend_receive_income(double recommend_receive_income) {
		this.recommend_receive_income = recommend_receive_income;
	}

	public int getRecommend_level() {
		return recommend_level;
	}

	public void setRecommend_level(int recommend_level) {
		this.recommend_level = recommend_level;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public long getRecommend_agent_id() {
		return recommend_agent_id;
	}

	public void setRecommend_agent_id(long recommend_agent_id) {
		this.recommend_agent_id = recommend_agent_id;
	}

	/**
	 * @return the email_id
	 */
	public int getEmail_id() {
		return email_id;
	}

	/**
	 * @param email_id
	 *            the email_id to set
	 */
	public void setEmail_id(int email_id) {
		this.email_id = email_id;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getIdentity_card() {
		return identity_card;
	}

	public void setIdentity_card(String identity_card) {
		this.identity_card = identity_card;
	}

	public long getWelfare() {
		return welfare;
	}

	public void setWelfare(long welfare) {
		this.welfare = welfare;
	}

	public int getLast_channel() {
		return last_channel;
	}

	public void setLast_channel(int last_channel) {
		this.last_channel = last_channel;
	}

	public Date getCoin_play_time() {
		return coin_play_time;
	}

	public void setCoin_play_time(Date coin_play_time) {
		this.coin_play_time = coin_play_time;
	}

	public Date getFirstJoinClubTime() {
		return firstJoinClubTime;
	}

	public void setFirstJoinClubTime(Date firstJoinClubTime) {
		this.firstJoinClubTime = firstJoinClubTime;
	}

	public int getDiamond() {
		return diamond;
	}

	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}

	public String getHonor_msg() {
		return honor_msg;
	}

	public void setHonor_msg(String honor_msg) {
		this.honor_msg = honor_msg;
	}

	public String getPackage_update_reward() {
		return package_update_reward;
	}

	public void setPackage_update_reward(String package_update_reward) {
		this.package_update_reward = package_update_reward;
	}

	public int getClubIdentity() {
		return clubIdentity;
	}

	public void setClubIdentity(int clubIdentity) {
		this.clubIdentity = clubIdentity;
	}

	public Date getLastPayTime() {
		return lastPayTime;
	}

	public void setLastPayTime(Date lastPayTime) {
		this.lastPayTime = lastPayTime;
	}

	public Date getLastMatchTime() {
		return lastMatchTime;
	}

	public void setLastMatchTime(Date lastMatchTime) {
		this.lastMatchTime = lastMatchTime;
	}

	public int getBanClubInvite() {
		return banClubInvite;
	}

	public void setBanClubInvite(int banClubInvite) {
		this.banClubInvite = banClubInvite;
	}
}
