package com.cai.common.domain;

import java.util.List;

public class ClubMemberPageModel {
	private int page;
	private int maxCount;
	private int maxPage;
	private int clubId;
	private int status = -1;
	
	private List<ClubMemberModel> members;

	public int getPage() {
		return page;	
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public List<ClubMemberModel> getMembers() {
		return members;
	}

	public void setMembers(List<ClubMemberModel> members) {
		this.members = members;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
