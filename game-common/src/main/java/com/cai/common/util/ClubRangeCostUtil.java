/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.util;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.constant.Symbol;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * {@link https://baike.baidu.com/item/%E5%8C%BA%E9%97%B4/1273117?fr=aladdin}
 * 
 * 区间扣豆,rangeDesc:[1,40]:3|[41,56):60
 * 
 * @author wu_hc date: 2018年2月5日 下午4:06:14 <br/>
 */
public final class ClubRangeCostUtil {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(ClubRangeCostUtil.class);

	public static final ClubRangeCostUtil INSTANCE = new ClubRangeCostUtil();

	/**
	 * <gameTypeIndex,round>,costRange ,用list保证顺序
	 */
	private volatile Map<Pair<Integer, Integer>, List<XYRange>> rangeMaps = Maps.newConcurrentMap();

	/**
	 * 是否启用
	 */
	private volatile boolean active = false;

	/**
	 * 语音
	 */
	private volatile boolean includeVoice = false;

	private ClubRangeCostUtil() {
	}

	/**
	 * 
	 * @param rangeDescGroup
	 */
	public void load(int gameTypeIndex, int round, String rangeDescGroup) {
		if (StringUtils.isEmpty(rangeDescGroup) || "0".equals(rangeDescGroup)) {
			rangeMaps.remove(Pair.of(gameTypeIndex, round));
			return;
		}

		List<XYRange> list = Lists.newArrayList();

		if (StringUtils.isNotEmpty(rangeDescGroup)) {
			try {
				String[] arr = rangeDescGroup.split(Symbol.VERTICAL_LINE);
				for (final String rangeDesc : arr) {
					list.add(new XYRange(rangeDesc));
				}
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("俱乐部人数区间扣豆配置错误[gameTypeIndex:{},round:{},desc:{}],请确认! ", gameTypeIndex, round, rangeDescGroup, e);
			}
		}

		rangeMaps.put(Pair.of(gameTypeIndex, round), list);
	}

	/**
	 * 
	 * @param pair
	 * @param num
	 * @return
	 */
	public long getValue(Pair<Integer, Integer> pair, int num) {
		List<XYRange> rangeGroup = rangeMaps.get(pair);
		if (null != rangeGroup) {
			for (final XYRange range : rangeGroup) {
				if (range.inRange(num)) {
					return range.getValue();
				}
			}
		}
		return Long.MIN_VALUE;
	}

	/**
	 * 
	 * @param gameTypeIndex
	 * @param round
	 * @param num
	 * @return
	 */
	public long getValue(int gameTypeIndex, int round, int num) {
		return getValue(Pair.of(gameTypeIndex, round), num);
	}

	public void debugInfo() {
		logger.info("clubrangeCost:" + rangeMaps);
	}

	public boolean isActive() {
		return active;
	}

	public ClubRangeCostUtil setActive(boolean active) {
		this.active = active;
		return this;
	}

	public boolean isIncludeVoice() {
		return includeVoice;
	}

	public ClubRangeCostUtil setIncludeVoice(boolean includeVoice) {
		this.includeVoice = includeVoice;
		return this;
	}

}
