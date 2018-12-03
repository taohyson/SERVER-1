package com.cai.common.domain.json;

import java.io.Serializable;

public class ClubRoomJsonModel implements Serializable {
	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private final int status;
	
	private final String groupId;
	
	private final int clubId;
	
	private final String clubName;
	
	private final RoomJsonModel room;
	
	public ClubRoomJsonModel(int status,String groupId,int clubId,String clubName,RoomJsonModel room){
		this.status = status;
		this.groupId = groupId;
		this.clubId = clubId;
		this.clubName = clubName;
		this.room = room;
	}
	
	public String getGroupId() {
		return groupId;
	}

	public int getStatus() {
		return status;
	}

	public String getClubName() {
		return clubName;
	}

	public int getClubId() {
		return clubId;
	}

	public RoomJsonModel getRoom() {
		return room;
	}

	public static class RoomJsonModel{
		private final String type;
		private String desc;
		private String url;
		private String title;
		private String content;
		
		public RoomJsonModel(String type){
			this.type = type;
		}
		
		public String getType() {
			return type;
		}
	
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		
		
	}
}
