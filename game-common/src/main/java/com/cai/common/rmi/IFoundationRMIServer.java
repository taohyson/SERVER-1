/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.rmi;

import java.util.List;

import com.cai.common.rmi.vo.InviteMissionDataVo;

/**
 * 基础服RMI
 * 
 * @author chansonyan 2018年4月25日
 */
public interface IFoundationRMIServer {

	/**
	 * 触发充值任务
	 * 
	 * @param account_id
	 * @param amount
	 * @return
	 */
	public boolean rechargeMission(long account_id, int amount);

	/**
	 * 代理缺豆的时候推送
	 * 
	 * @param account_id
	 */
	public void lackGoldPush(long account_id);

	public boolean rechargeMission(long account_id, int amount, int rechargeType);
	
	/**
	 * 邀请下载
	 * @param 
	 */
	public void recommendMissionNotify(List<InviteMissionDataVo> missionDataList);
	
}
