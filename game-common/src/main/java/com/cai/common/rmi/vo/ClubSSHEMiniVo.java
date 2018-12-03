/**
 * 
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;

/**
 * 
 * 
 * 单纯给后台用
 * 
 * @author wu_hc date: 2018年4月9日 上午11:32:38 <br/>
 */
public class ClubSSHEMiniVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int clubId;

	private final long clubOwnerId;

	private final String clubName;

	public static ClubSSHEMiniVo newVO(int clubId, long clubOwnerId, String clubName) {
		return new ClubSSHEMiniVo(clubId, clubOwnerId, clubName);
	}

	/**
	 * @param clubId
	 * @param clubOwerName
	 * @param clubName
	 */
	private ClubSSHEMiniVo(int clubId, long clubOwnerId, String clubName) {
		super();
		this.clubId = clubId;
		this.clubOwnerId = clubOwnerId;
		this.clubName = clubName;
	}

	public int getClubId() {
		return clubId;
	}


	public long getClubOwnerId() {
		return clubOwnerId;
	}

	public String getClubName() {
		return clubName;
	}

}
