/**
 * 
 */
package com.cai.common.rmi.vo;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;

import protobuf.clazz.ClubMsgProto.ClubSimple;

/**
 * 
 * 
 *
 * @author wu_hc date: 2018年4月9日 上午11:32:38 <br/>
 */
public class ClubMiniVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Type {
		ACCOUNT_ID, CLUB_ID;
	}

	private long accountId;
	private int clubId;
	private boolean myCreate;
	private final Type type;

	private List<ClubSimple> clubs = null;

	public static ClubMiniVo newVO(Type type) {
		return new ClubMiniVo(type).setMyCreate(false);
	}

	private ClubMiniVo(Type type) {
		this.type = type;
	}

	public long getAccountId() {
		return accountId;
	}

	public ClubMiniVo setAccountId(long accountId) {
		this.accountId = accountId;
		return this;
	}

	public boolean isMyCreate() {
		return myCreate;
	}

	public ClubMiniVo setMyCreate(boolean myCreate) {
		this.myCreate = myCreate;
		return this;
	}

	public List<ClubSimple> getClubs() {
		if (null == clubs) {
			clubs = Lists.newArrayList();
		}
		return clubs;
	}

	public Type getType() {
		return type;
	}

	public int getClubId() {
		return clubId;
	}

	public ClubMiniVo setClubId(int clubId) {
		this.clubId = clubId;
		return this;
	}

}
