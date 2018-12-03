package com.cai.common.domain;

/**
 * 棋牌联赛配置
 */
public class MatchUnionAdminModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int match_union_id;
	private long admin_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatch_union_id() {
		return match_union_id;
	}
	public void setMatch_union_id(int match_union_id) {
		this.match_union_id = match_union_id;
	}
	public long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
	}
	
}
