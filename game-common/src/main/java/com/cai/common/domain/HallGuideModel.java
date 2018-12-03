package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class HallGuideModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;						//主键
	private int guide_type;				//指引区域(1亲友圈2比赛场3金币场)
	private String guide_text;				//指引文本
	private String propagate_icon;			//宣传图
	private Date start_time;				//生效时间
	private Date end_time;					//过期时间
	private int ui_type;					//客户端ui类型(1通用UI2河南UI)
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getGuide_type() {
		return guide_type;
	}
	public void setGuide_type(int guide_type) {
		this.guide_type = guide_type;
	}
	public String getGuide_text() {
		return guide_text;
	}
	public void setGuide_text(String guide_text) {
		this.guide_text = guide_text;
	}
	public String getPropagate_icon() {
		return propagate_icon;
	}
	public void setPropagate_icon(String propagate_icon) {
		this.propagate_icon = propagate_icon;
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
	public int getUi_type() {
		return ui_type;
	}
	public void setUi_type(int ui_type) {
		this.ui_type = ui_type;
	}
	
}
