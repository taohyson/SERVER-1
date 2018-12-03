/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.List;

import com.cai.common.domain.ClubBulletinModel;
import com.google.common.collect.Lists;

/**
 * 
 *
 * @author wu_hc date: 2018年4月28日 下午12:27:45 <br/>
 */
public final class SSHEBulletinVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int CATEGORY_ALL = 1;
	public static final int CATEGORY_APPOINT = 2;

	/**
	 * 类型，1全部，2指定俱乐部
	 */
	private final int category;

	/**
	 * 指定俱乐部ID列表，在category==2的时候有意义
	 */
	private List<Integer> clubIds;

	/**
	 * 公告内容
	 */
	private final ClubBulletinModel bulletin;

	/**
	 * @param category
	 * @param bulletin
	 */
	public SSHEBulletinVO(int category, ClubBulletinModel bulletin) {
		this.category = category;
		this.bulletin = bulletin;
	}

	public SSHEBulletinVO addClubId(int... clubIds_) {
		if (this.category != 2) {
			return this;
		}

		if (null == this.clubIds) {
			this.clubIds = Lists.newArrayListWithCapacity(clubIds_.length);
			for (int i = 0; i < clubIds_.length; i++) {
				this.clubIds.add(clubIds_[i]);
			}
		}

		return this;
	}

	public List<Integer> getClubIds() {
		return clubIds;
	}

	public void setClubIds(List<Integer> clubIds) {
		this.clubIds = clubIds;
	}

	public int getCategory() {
		return category;
	}

	public ClubBulletinModel getBulletin() {
		return bulletin;
	}

}
