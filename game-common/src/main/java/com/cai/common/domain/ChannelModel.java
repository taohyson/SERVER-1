/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 
 *
 * @author wu_hc date: 2018年5月14日 上午11:37:04 <br/>
 */
public final class ChannelModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int channelId;
	private int gameId;
	private String channelAppId;
	private String channelAppSecret;
	private String channelPaySecret;
	private String channelAppCode;
	private String channelPayCBUrl;
	private String channelPayDesc;

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getChannelAppId() {
		return channelAppId;
	}

	public void setChannelAppId(String channelAppId) {
		this.channelAppId = channelAppId;
	}

	public String getChannelAppSecret() {
		return channelAppSecret;
	}

	public void setChannelAppSecret(String channelAppSecret) {
		this.channelAppSecret = channelAppSecret;
	}

	public String getChannelPaySecret() {
		return channelPaySecret;
	}

	public void setChannelPaySecret(String channelPaySecret) {
		this.channelPaySecret = channelPaySecret;
	}

	public String getChannelAppCode() {
		return channelAppCode;
	}

	public void setChannelAppCode(String channelAppCode) {
		this.channelAppCode = channelAppCode;
	}

	public String getChannelPayCBUrl() {
		return channelPayCBUrl;
	}

	public void setChannelPayCBUrl(String channelPayCBUrl) {
		this.channelPayCBUrl = channelPayCBUrl;
	}

	public String getChannelPayDesc() {
		return channelPayDesc;
	}

	public void setChannelPayDesc(String channelPayDesc) {
		this.channelPayDesc = channelPayDesc;
	}

	@Override
	public String toString() {
		return "ChannelModel [channelId=" + channelId + ", gameId=" + gameId + ", channelAppId=" + channelAppId + ", channelAppSecret="
				+ channelAppSecret + ", channelPaySecret=" + channelPaySecret + ", channelAppCode=" + channelAppCode + ", channelPayCBUrl="
				+ channelPayCBUrl + ", channelPayDesc=" + channelPayDesc + "]";
	}

}
