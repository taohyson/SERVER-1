/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 
 *
 * @author wu date: 2017年8月22日 下午3:43:35 <br/>
 */
public final class GameRecommendIndexModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private int appId;

	private int game_type;

	/**
	 * 推荐位
	 */
	private int recommend_index;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the appId
	 */
	public int getAppId() {
		return appId;
	}

	/**
	 * @param appId
	 *            the appId to set
	 */
	public void setAppId(int appId) {
		this.appId = appId;
	}

	/**
	 * @return the game_type
	 */
	public int getGame_type() {
		return game_type;
	}

	/**
	 * @param game_type
	 *            the game_type to set
	 */
	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}

	/**
	 * @return the recommend_index
	 */
	public int getRecommend_index() {
		return recommend_index;
	}

	/**
	 * @param recommend_index
	 *            the recommend_index to set
	 */
	public void setRecommend_index(int recommend_index) {
		this.recommend_index = recommend_index;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameRecommendIndex [id=" + id + ", appId=" + appId + ", game_type=" + game_type + ", recommend_index=" + recommend_index + "]";
	}

}
