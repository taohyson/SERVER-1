package com.cai.common.domain.sdk;

import java.io.Serializable;
import java.util.Date;

/**
 * sdk cp上传数据
 * @author chansonyan
 *
 */
public class SdkCpData implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long openId;
	private Long appId;
	private String roleId; 
	private String nickName;
	private String zone;
	private String level;
	private Date createTime;
	private Date updateTime;
	
	public Long getOpenId() {
		return openId;
	}
	public void setOpenId(Long openId) {
		this.openId = openId;
	}
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
