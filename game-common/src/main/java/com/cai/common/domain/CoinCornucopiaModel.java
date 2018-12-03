package com.cai.common.domain;

/**
 * @author wu_hc date: 2018年08月10日 下午4:13:27 <br/>
 */
public final class CoinCornucopiaModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子游戏id
	 */
	private int gameTypeIndex;

	/**
	 * 场次类型
	 */
	private int roundLevel;

	/**
	 * 条件Id，对应coin_excite的id
	 */
	private int exciteId;

	/**
	 * 描述
	 */
	private String description;

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public int getRoundLevel() {
		return roundLevel;
	}

	public void setRoundLevel(int roundLevel) {
		this.roundLevel = roundLevel;
	}

	public int getExciteId() {
		return exciteId;
	}

	public void setExciteId(int exciteId) {
		this.exciteId = exciteId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
