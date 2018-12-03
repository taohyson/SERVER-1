package com.cai.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;
import com.cai.common.domain.MatchTableModel.Groups;
/**
 * 比赛分组
 */
public class MatchNoticeModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String groupInfo;// 群组信息[{groupId:1,state:1},{groupId:2,state:1}]
	private Date create_time;
	private String operator;//操作人
	private int notice_state;//通知状态，0未发送，1邮件，2短信，3邮件+短信
	private Date operate_time;//
	private String title;//
	private String email_content;//
	private String msg_content;
	
	
	private List<Groups> groupList = new ArrayList<Groups>();
	
	public void initGroupTable() {
		if (StringUtils.isNotBlank(groupInfo)) {
			List<Groups> groupList = JSON.parseArray(groupInfo, Groups.class);
			this.groupList = groupList;
		}
	}
	
	public boolean sendPhoneMsg(){
		if(notice_state!=2&&notice_state!=3){
			//无需发短信
			return true;
		}
		if(groupList.size()==0){
			return false;
		}
		for(Groups groups:groupList){
			MatchGroupModel group = MatchOffLineModel.groupMap.get(groups.getGroupId());
			if(group.getGroup_state()!=groups.getState()){
				continue;
			}
			for(int key:MatchGroupModel.playerMap.keySet()){
				MatchPlayerModel model = MatchGroupModel.playerMap.get(key);
				if(model.getCur_area()==groups.getState()){
					
				}
			}
		}
		return true;
	}
	public boolean sendEmail(){
		if(notice_state==2){
			//无需发邮件
			return true;
		}
		if(groupList.size()==0){
			return false;
		}
		for(Groups groups:groupList){
			MatchGroupModel group = MatchOffLineModel.groupMap.get(groups.getGroupId());
			if(group.getGroup_state()!=groups.getState()){
				//组群的状态跟分配桌子的状态不一致，不处理
				continue;
			}
			for(int key:MatchGroupModel.playerMap.keySet()){
				MatchPlayerModel model = MatchGroupModel.playerMap.get(key);
			}
		}
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupInfo() {
		return groupInfo;
	}
	public void setGroupInfo(String groupInfo) {
		this.groupInfo = groupInfo;
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
	public int getNotice_state() {
		return notice_state;
	}
	public void setNotice_state(int notice_state) {
		this.notice_state = notice_state;
	}
	public Date getOperate_time() {
		return operate_time;
	}
	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail_content() {
		return email_content;
	}
	public void setEmail_content(String email_content) {
		this.email_content = email_content;
	}
	public String getMsg_content() {
		return msg_content;
	}
	public void setMsg_content(String msg_content) {
		this.msg_content = msg_content;
	}
}
