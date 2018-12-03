/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 
 *
 * @author wu_hc date: 2017年12月28日 下午9:09:41 <br/>
 */
public final class UpdateClubIdVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int oldClubId;
	private final int newClubId;

	private int status;
	private String desc;

	public static final UpdateClubIdVo newVo(int oldClubId, int newClubId) {
		return new UpdateClubIdVo(oldClubId, newClubId);
	}

	private UpdateClubIdVo(int oldClubId, int newClubId) {
		this.oldClubId = oldClubId;
		this.newClubId = newClubId;
	}

	public int getStatus() {
		return status;
	}

	public UpdateClubIdVo setStatus(int status) {
		this.status = status;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public UpdateClubIdVo setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public int getOldClubId() {
		return oldClubId;
	}

	public int getNewClubId() {
		return newClubId;
	}

	@Override
	public String toString() {
		return "UpdateClubIdVo [oldClubId=" + oldClubId + ", newClubId=" + newClubId + ", status=" + status + ", desc=" + desc + "]";
	}

}
