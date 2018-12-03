package com.cai.common.domain;

import java.util.Date;
import protobuf.clazz.match.MatchClientRsp.MatchUnionSideConfigProto;

/**
 * 棋牌联赛配置
 */
public class MatchUnionSideModel extends DBBaseModel {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String side_title;
	private int side_title_sort;
	private String match_bg_image;
	private int side_type;
	private Date start_time;
	private Date end_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatch_bg_image() {
		return match_bg_image;
	}
	public void setMatch_bg_image(String match_bg_image) {
		this.match_bg_image = match_bg_image;
	}
	public String getSide_title() {
		return side_title;
	}
	public void setSide_title(String side_title) {
		this.side_title = side_title;
	}
	public int getSide_title_sort() {
		return side_title_sort;
	}
	public void setSide_title_sort(int side_title_sort) {
		this.side_title_sort = side_title_sort;
	}
	public int getSide_type() {
		return side_type;
	}
	public void setSide_type(int side_type) {
		this.side_type = side_type;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	
	public MatchUnionSideConfigProto.Builder encode(){
		MatchUnionSideConfigProto.Builder b = MatchUnionSideConfigProto.newBuilder();
		b.setId(id);
		b.setImage(match_bg_image);
		b.setName(side_title);
		b.setSort(side_title_sort);
		b.setSideType(side_type);
		b.setStartTime(start_time == null ? 0 : start_time.getTime());
		b.setEndTime(end_time == null ? 0 : end_time.getTime());
	    return b;
	}
	
}
