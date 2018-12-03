package com.cai.common.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * @author wu_hc date: 2017年7月21日 下午5:14:56 <br/>
 */
public final class CoinCornucopiaRankModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int gameTypeIndex;

	private byte[] data;

	private Date refreshDate;

	public int getGameTypeIndex() {
		return gameTypeIndex;
	}

	public void setGameTypeIndex(int gameTypeIndex) {
		this.gameTypeIndex = gameTypeIndex;
	}

	public byte[] getData() {
		return data;
	}

	public void setDate(byte[] data) {
		if (Arrays.equals(this.data, data)) {
			return;
		}
		this.data = data;
		this.setNeedDB(true);
	}

	public Date getRefreshDate() {
		return refreshDate;
	}

	public void setRefreshDate(Date refreshDate) {
		if (Objects.equals(refreshDate, this.refreshDate)) {
			return;
		}
		this.refreshDate = refreshDate;
		setNeedDB(true);
	}
}
