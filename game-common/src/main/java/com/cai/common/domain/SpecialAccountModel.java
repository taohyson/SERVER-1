package com.cai.common.domain;

/**
 * 账号
 * 
 * @author tang
 *
 */
public class SpecialAccountModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String privilege_allow_subId;         //允许查看所有下级成员数据
	private String privilege_allow_gameDetail;    //允许查看单款游戏详情  格式 userId#gameId,userId#gameId
	private String sub_limit;    				  //下级最大代理成员数量限制userId#max,userId#max
	private String recommend_receive_percent;     //指定推广员获取下级推广员的返利比，userId#percent,userId#percent,不超过30%
	private String recommend_agent_receive_percent;//指定推广员获取直属代理的返利比
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getRecommend_agent_receive_percent() {
		return recommend_agent_receive_percent;
	}
	public void setRecommend_agent_receive_percent(String recommend_agent_receive_percent) {
		this.recommend_agent_receive_percent = recommend_agent_receive_percent;
	}
	public String getPrivilege_allow_subId() {
		return privilege_allow_subId;
	}
	public void setPrivilege_allow_subId(String privilege_allow_subId) {
		this.privilege_allow_subId = privilege_allow_subId;
	}
	public String getPrivilege_allow_gameDetail() {
		return privilege_allow_gameDetail;
	}
	public void setPrivilege_allow_gameDetail(String privilege_allow_gameDetail) {
		this.privilege_allow_gameDetail = privilege_allow_gameDetail;
	}
	public String getSub_limit() {
		return sub_limit;
	}
	public void setSub_limit(String sub_limit) {
		this.sub_limit = sub_limit;
	}
	public String getRecommend_receive_percent() {
		return recommend_receive_percent;
	}
	public void setRecommend_receive_percent(String recommend_receive_percent) {
		this.recommend_receive_percent = recommend_receive_percent;
	}
	
	

}
