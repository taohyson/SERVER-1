package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
	
@Document(collection = "city_report_log")
public class CityLogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	
	private Date create_time;
	
	private int  city_code;
	
	private String city_name;
	
	private int person_counts;
	
	private Integer up_city_code;
	
	private String up_city_name;
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getCity_code() {
		return city_code;
	}

	public void setCity_code(int city_code) {
		this.city_code = city_code;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public int getPerson_counts() {
		return person_counts;
	}

	public void setPerson_counts(int person_counts) {
		this.person_counts = person_counts;
	}

	public Integer getUp_city_code() {
		return up_city_code;
	}

	public void setUp_city_code(Integer up_city_code) {
		this.up_city_code = up_city_code;
	}

	public String getUp_city_name() {
		return up_city_name;
	}

	public void setUp_city_name(String up_city_name) {
		this.up_city_name = up_city_name;
	}
	
	
}
