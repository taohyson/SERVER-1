package com.cai.common.domain.json;


public class AccountGroupModel {
	private String groupId;
	private String groupName;
	private int groupMemberNum;
	
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getGroupMemberNum() {
		return groupMemberNum;
	}
	public void setGroupMemberNum(int groupMemberNum) {
		this.groupMemberNum = groupMemberNum;
	}
	
//	
//	@Override
//	public int hashCode() {
//		return id;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AccountGroupModel other = (AccountGroupModel) obj;
//		if (!groupId.equals(other.groupId))
//			return false;
//		return true;
//	}
	
}
