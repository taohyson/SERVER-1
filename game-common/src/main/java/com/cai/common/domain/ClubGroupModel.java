package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cai.common.domain.json.ClubRuleBaseModel;

/**
 * @author demon
 * date: 2017年7月20日 下午6:59:15 <br/>
 */
public class ClubGroupModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int club_id;
	
	private String group_id;
	
	private int status;
	
	private Date date;
	
	private String club_name;
	
	private List<ClubRuleBaseModel> rules;

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getClub_name() {
		return club_name;
	}

	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}

	public List<ClubRuleBaseModel> getRules() {
		return rules;
	}

	public void setRules(List<ClubRuleBaseModel> rules) {
		this.rules = rules;
	}

	

}
