package com.cai.common.domain.json;

import java.io.Serializable;

import protobuf.clazz.activity.InviteRedpacketProto.PrizeData;

public class PrizeJsonModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String pic;
	private int rank;
	private String title;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public PrizeData encode(){
		PrizeData.Builder builder = PrizeData.newBuilder();
		builder.setName(this.name);
		builder.setPic(this.pic);
		builder.setRank(this.rank);
		builder.setTitle("第"+this.title+"名");
		return builder.build();
	}
	
}
