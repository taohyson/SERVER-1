/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.config;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.cai.common.constant.Symbol;
import com.cai.common.util.TimeUtil;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

/**
 * 
 *
 * @author wu_hc date: 2017年11月7日 下午2:34:03 <br/>
 */
public final class ExclusiveGoldCfg {

	private static final ExclusiveGoldCfg cfg = new ExclusiveGoldCfg();

	private Map<Integer, StatusEntry> exclisiveEntrys = Maps.newConcurrentMap();

	public static ExclusiveGoldCfg get() {
		return cfg;
	}

	/**
	 * 机器人开房是否扣专属豆
	 */
	private volatile boolean isRobotCreateRoomCostExclusiveGold = false;

	/**
	 * 专属豆转让功能开关
	 */
	private volatile boolean transferActive = true;

	/**
	 * 是否开放专属豆扣豆
	 */
	private volatile boolean useExclusiveGold = true;

	public boolean isRobotCreateRoomCostExclusiveGold() {
		return isRobotCreateRoomCostExclusiveGold;
	}

	public void setRobotCreateRoomCostExclusiveGold(boolean isRobotCreateRoomCostExclusiveGold) {
		this.isRobotCreateRoomCostExclusiveGold = isRobotCreateRoomCostExclusiveGold;
	}

	public boolean isTransferActive() {
		return transferActive;
	}

	public void setTransferActive(boolean transferActive) {
		this.transferActive = transferActive;
	}

	public boolean isUseExclusiveGold() {
		return useExclusiveGold;
	}

	public void setUseExclusiveGold(boolean useExclusiveGold) {
		this.useExclusiveGold = useExclusiveGold;
	}

	@Override
	public String toString() {
		return "ExclusiveGoldCfg [isRobotCreateRoomCostExclusiveGold=" + isRobotCreateRoomCostExclusiveGold + ", transferActive=" + transferActive
				+ ", useExclusiveGold=" + useExclusiveGold + "]";
	}

	/**
	 * 是否必须扣专属豆
	 * 
	 * @param gameId
	 * @param cur
	 * @return
	 */
	public boolean isMustCostExclusive(int gameId) {
		StatusEntry entry = exclisiveEntrys.get(gameId);
		if (null == entry)
			return false;
		return entry.isVaild();
	}

	public String lackExclusiveTip(int gameId) {
		StatusEntry entry = exclisiveEntrys.get(gameId);
		if (null != entry && StringUtils.isNotEmpty(entry.tip)) {
			return entry.tip;
		}
		return "专属豆不足，开局失败（此游戏仅可使用专属豆开房），如需帮助请在大厅点击“客服”咨询。";
	}

	/**
	 * 
	 * @param gameId
	 * @param text
	 */
	public void loadExclusiveGameStatus(final int gameId, boolean mustCostExclusive, String text, String tip) {
		if (Strings.isNullOrEmpty(text) || !mustCostExclusive) {
			exclisiveEntrys.remove(gameId);
			return;
		}

		try {
			String[] dateS = text.split(Symbol.COMMA);
			Date s = TimeUtil.getParsedDate(dateS[0]);
			Date e = TimeUtil.getParsedDate(dateS[1]);
			exclisiveEntrys.put(gameId, new StatusEntry(gameId, true, s, e, tip));
		} catch (Exception e) {
			exclisiveEntrys.remove(gameId);
		}
	}

	final static class StatusEntry {
		public final int gameId;
		public final boolean mustCostExclusive;
		public final Date bDate;
		public final Date eDate;
		public final String tip;

		public StatusEntry(int gameId, boolean mustCostExclusive, Date bDate, Date eDate, String tip) {
			this.gameId = gameId;
			this.mustCostExclusive = mustCostExclusive;
			this.bDate = bDate;
			this.eDate = eDate;
			if (null != tip && !"0".equals(tip)) {
				this.tip = tip;
			} else {
				this.tip = null;
			}
		}

		public boolean isVaild() {
			return TimeUtil.inTimeRange(bDate, eDate);
		}

		@Override
		public String toString() {
			return "StatusEntry [gameId=" + gameId + ", mustCostExclusive=" + mustCostExclusive + ", bDate=" + bDate + ", eDate=" + eDate + ", tip="
					+ tip + "]";
		}

	}
}
