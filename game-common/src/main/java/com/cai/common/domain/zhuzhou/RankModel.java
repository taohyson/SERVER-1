package com.cai.common.domain.zhuzhou;

import java.util.Date;
import java.util.TreeSet;

/**
 * 充值排行榜
 * 
 *
 * @author Tang date: 2018年9月25日 下午4:53:38 <br/>
 */
public class RankModel {
	private TreeSet<RechargeRankModel> rankSet;
	private Date updateDate;

	public TreeSet<RechargeRankModel> getRankSet() {
		return rankSet;
	}

	public void setRankSet(TreeSet<RechargeRankModel> rankSet) {
		this.rankSet = rankSet;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
