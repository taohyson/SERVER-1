package com.cai.common.domain;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 留存率(mongodb)
 * 
 * @author run
 *
 */
@Document(collection = "keep_rate")

public class KeepRateModel implements Serializable {
	/**
	 * 日期
	 */
	@Indexed(name = "index_notes_date", unique = true)
	private Integer notes_date;
	/**
	 * 注册数量
	 */
	private int register;
	/**
	 * 隔一天登录人数
	 */
	private int day1;
	private int day2;
	private int day3;
	private int day4;
	private int day5;
	private int day6;
	private int day7;
	public Integer getNotes_date() {
		return notes_date;
	}
	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}
	public int getRegister() {
		return register;
	}
	public void setRegister(int register) {
		this.register = register;
	}
	public int getDay1() {
		return day1;
	}
	public void setDay1(int day1) {
		this.day1 = day1;
	}
	public int getDay2() {
		return day2;
	}
	public void setDay2(int day2) {
		this.day2 = day2;
	}
	public int getDay3() {
		return day3;
	}
	public void setDay3(int day3) {
		this.day3 = day3;
	}
	public int getDay4() {
		return day4;
	}
	public void setDay4(int day4) {
		this.day4 = day4;
	}
	public int getDay5() {
		return day5;
	}
	public void setDay5(int day5) {
		this.day5 = day5;
	}
	public int getDay6() {
		return day6;
	}
	public void setDay6(int day6) {
		this.day6 = day6;
	}
	public int getDay7() {
		return day7;
	}
	public void setDay7(int day7) {
		this.day7 = day7;
	}


}
