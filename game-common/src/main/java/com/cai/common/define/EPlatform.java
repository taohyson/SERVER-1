/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 *
 * @author wu_hc date: 2018年7月23日 下午12:03:03 <br/>
 */
public enum EPlatform {

	/**
	 * 闲逸大厅
	 */
	XY_DT(1, EGameType.DT.getId()),

	/**
	 * 闲逸
	 */
	XY_PH(2, EGameType.DTPH.getId()),

	/**
	 * 玩一局
	 */
	XY_WYJ(3, EGameType.DT.getId());

	private final int platId;
	private final int gameId;

	/**
	 * @param gameId
	 */
	private EPlatform(int platId, int gameId) {
		this.platId = platId;
		this.gameId = gameId;
	}

	public int getPlatId() {
		return platId;
	}

	public int getGameId() {
		return gameId;
	}

	public static final EPlatform of(int platId) {
		for (EPlatform f : EPlatform.values()) {
			if (f.platId == platId) {
				return f;
			}
		}

		return null;
	}
}
