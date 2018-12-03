package com.cai.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;
/**
 * 比赛分组
 */
public class MatchGroupModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//组id
	private int itemId;//所属比赛场,以参赛券为单位
	private int group_name;//组名称
	private Date create_time;
	private String operator;//操作人
	private String sign_users;//报名序号
	private int group_num;//本组人数
	private int group_state;//分组状态
	private Date operate_time;//
	//保存比赛信息
	public static HashMap<Integer,MatchPlayerModel> playerMap = new  HashMap<Integer,MatchPlayerModel> ();
	//保存报名序号信息
	public Set<Integer> signUpSet = new  HashSet<Integer> ();
	
	
	public void initMatchPlayerMap(){
		if (StringUtils.isNotBlank(sign_users)) {
			List<Signs> signList = JSON.parseArray(sign_users, Signs.class);
			Date now = new Date();
			
			List<MatchUpgradeModel> list = new ArrayList<MatchUpgradeModel>();
			String update = JSON.toJSONString(list);
			for (Signs sign : signList) {
				for (int i = sign.getMin(); i <= sign.getMax(); i++) {
					MatchSignUpModel signUp = MatchOffLineModel.allSignUpMap.get(i);
					if(signUp==null){
						continue;
					}
					signUpSet.add(i);
					MatchPlayerModel model = new MatchPlayerModel();
					model.setAccountId((int)signUp.getAccount_id());
					model.setCur_area(0);
					model.setGroupId(id);
					model.setItemId(itemId);
					model.setSeat_state(0);
					model.setCreate_time(now);
					model.setUpdate_state(update);
					model.setUpgradeList(list);
					playerMap.put(i, model);
				}
			}
		}
	}
	class Signs {
		private int min;
		private int max;

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}

	}
	public void initGroupTables(){//初始化桌子，按阶段初始化
		
		
	}
	public void initSignUpMap(){
		
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getGroup_state() {
		return group_state;
	}
	public void setGroup_state(int group_state) {
		this.group_state = group_state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroup_name() {
		return group_name;
	}
	public void setGroup_name(int group_name) {
		this.group_name = group_name;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getSign_users() {
		return sign_users;
	}
	public void setSign_users(String sign_users) {
		this.sign_users = sign_users;
	}
	public int getGroup_num() {
		return group_num;
	}
	public void setGroup_num(int group_num) {
		this.group_num = group_num;
	}
	public Date getOperate_time() {
		return operate_time;
	}
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}
	
	
}
