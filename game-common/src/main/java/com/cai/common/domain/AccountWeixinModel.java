package com.cai.common.domain;

import java.util.Date;

/**
 * 账号的微信
 * 
 * @author run
 *
 */
public class AccountWeixinModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 账号id
	 */
	private long account_id;
	/**
	 * 接口调用凭证
	 */
	private String access_token;
	/**
	 * 用户刷新access_token
	 */
	private String refresh_token;
	/**
	 * 授权用户唯一标识
	 */
	private String openid;
	/**
	 * 用户授权的作用域，使用逗号（,）分隔
	 */
	private String scope;
	/**
	 * 户统一标识。针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
	 */
	private String unionid;
	/**
	 * 普通用户昵称
	 */
	private String nickname;
	/**
	 * 普通用户性别，1为男性，2为女性
	 */
	private String sex;
	/**
	 * 普通用户个人资料填写的省份
	 */
	private String province;
	/**
	 * 普通用户个人资料填写的城市
	 */
	private String city;
	/**
	 * 国家，如中国为CN
	 */
	private String country;
	/**
	 * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空
	 */
	private String headimgurl;
	/**
	 * 用户特权信息，json数组，如微信沃卡用户为（chinaunicom）
	 */
	private String privilege;
	/**
	 * 最后刷新的时间，调用wx的
	 */
	private Date last_flush_time;

	/**
	 * 本游戏的安全登录码
	 */
	private String self_token;

	/**
	 * 最后刷新的本游戏登录码
	 */
	private Date last_false_self_token;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		if(sex != null && ("1".equals(sex.trim()) || "2".equals(sex.trim()))){
			return sex;
		}
		return "2";
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public Date getLast_flush_time() {
		return last_flush_time;
	}

	public void setLast_flush_time(Date last_flush_time) {
		this.last_flush_time = last_flush_time;
	}

	public String getSelf_token() {
		return self_token;
	}

	public void setSelf_token(String self_token) {
		this.self_token = self_token;
	}

	public Date getLast_false_self_token() {
		return last_false_self_token;
	}

	public void setLast_false_self_token(Date last_false_self_token) {
		this.last_false_self_token = last_false_self_token;
	}

}
