package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="exclusive_brand_day_model")
public class ExclusiveGoldBrandDayModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4693038570025786426L;
	
	
	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date")
	private Integer notes_date;
	
	private int mjtype;
	
	private String mjName;
	
	private int brandTotal;
	
	private long cost;

	public Integer getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}

	public int getMjtype() {
		return mjtype;
	}

	public void setMjtype(int mjtype) {
		this.mjtype = mjtype;
	}

	public int getBrandTotal() {
		return brandTotal;
	}

	public void setBrandTotal(int brandTotal) {
		this.brandTotal = brandTotal;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public String getMjName() {
		return mjName;
	}

	public void setMjName(String mjName) {
		this.mjName = mjName;
	}
	
	
}
