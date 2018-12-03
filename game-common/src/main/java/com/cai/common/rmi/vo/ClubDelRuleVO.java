/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

/**
 * 
 *
 * @author wu_hc date: 2018年5月22日 下午2:17:36 <br/>
 */
public final class ClubDelRuleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 必填
	 */
	private final Set<Integer> gameTypeIndexs = Sets.newHashSet();

	/**
	 * 
	 * @param gameTypeIndex
	 * @return
	 */
	public final ClubDelRuleVO addGameTypeIndex(int... gameTypeIndex) {
		for (int i = 0; i < gameTypeIndex.length; i++) {
			gameTypeIndexs.add(gameTypeIndex[i]);
		}
		return this;
	}

	public Set<Integer> getGameTypeIndexs() {
		return gameTypeIndexs;
	}

}
