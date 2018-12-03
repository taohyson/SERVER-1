package com.cai.common.domain;

/**
 * @author wu_hc date: 2018年08月10日 下午4:13:27 <br/>
 */
public final class CoinJackpotModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子游戏id
	 */
	private int gameTypeIndex;

	/**
	 * 奖池余量
	 */
	private long remainder;

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public long getRemainder() {
		return remainder;
	}

	public void setRemainder(long remainder) {
		if (this.remainder == remainder) {
			return;
		}
		this.remainder = remainder;
		setNeedDB(true);
	}
}
