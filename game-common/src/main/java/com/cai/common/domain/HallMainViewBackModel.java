package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

public class HallMainViewBackModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;						//主键
	private int city;						//适用城市(只包含全国,省和直辖市)
	private String back_image;				//背景图
	private String person_image;			//人物图
	private Date start_time;				//生效时间
	private Date end_time;					//过期时间
	private int ui_type;					//客户端显示UI类型(1通用UI,2河南UI)
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public String getBack_image() {
		return back_image;
	}
	public void setBack_image(String back_image) {
		this.back_image = back_image;
	}
	public String getPerson_image() {
		return person_image;
	}
	public void setPerson_image(String person_image) {
		this.person_image = person_image;
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
