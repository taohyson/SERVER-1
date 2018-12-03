package com.cai.common.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="brand_day_model")
public class BrandDayModel implements Serializable{

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
	
	private int eight;
	
	private int sixteen;
	
	private int total;
	
	private int four;
	
	private int twenty_four;
	
	private int ten;
	
	private int twenty;
	
	private int thirty;
	
	private int wait;
	
	private int allTotal;

	/**
	 * 6局
	 */
	private int six;
	
	/**
	 * 9局
	 */
	private int nine;
	/**
	 * 15局
	 */
	private int fifteen;
	
	private long gold_count;
	@Transient
	private int diff_one_days_ago;//牌局总数一天前的差异
	@Transient
	private int diff_two_days_ago;//两天前的差异
	@Transient
	private int diff_three_days_ago;//三天前的差异
	
	/******************************************下面为新增************************************************/
	
	private int two;//2
	
	private int three;//3
	
	private int five;//5
	
	private int twelve;//12
	
	private int eighteenth;//18
	
	@Transient
	private int brand_date_total;	//查询日期内总局数
	@Transient
	private long gold_date_count;	//查询日期内扣豆数
	@Transient
	private int total_small_brand_count;	//小局数
	
	public int getTotal_small_brand_count() {
		return total_small_brand_count;
	}
	public void setTotal_small_brand_count(int total_small_brand_count) {
		this.total_small_brand_count = total_small_brand_count;
	}
	
	
	public int getBrand_date_total() {
		return brand_date_total;
	}
	public void setBrand_date_total(int brand_date_total) {
		this.brand_date_total = brand_date_total;
	}

	public long getGold_date_count() {
		return gold_date_count;
	}
	public void setGold_date_count(long gold_date_count) {
		this.gold_date_count = gold_date_count;
	}

	/**
	 * 页面显示---暂未归类
	 * */
	private int nokind;
	
	
	public int getNokind() {
		return nokind;
	}

	public void setNokind(int nokind) {
		this.nokind = nokind;
	}

	public int getSix() {
		return six;
	}

	public void setSix(int six) {
		this.six = six;
	}

	public int getNine() {
		return nine;
	}

	public void setNine(int nine) {
		this.nine = nine;
	}
	
	public int getFifteen() {
		return fifteen;
	}

	public void setFifteen(int fifteen) {
		this.fifteen = fifteen;
	}
	
	public long getGold_count() {
		return gold_count;
	}

	public void setGold_count(long gold_count) {
		this.gold_count = gold_count;
	}

	public int getTen() {
		return ten;
	}

	public void setTen(int ten) {
		this.ten = ten;
	}

	public int getTwenty() {
		return twenty;
	}

	public void setTwenty(int twenty) {
		this.twenty = twenty;
	}

	public int getThirty() {
		return thirty;
	}

	public void setThirty(int thirty) {
		this.thirty = thirty;
	}

	public int getWait() {
		return wait;
	}

	public void setWait(int wait) {
		this.wait = wait;
	}

	public int getTwenty_four() {
		return twenty_four;
	}

	public void setTwenty_four(int twenty_four) {
		this.twenty_four = twenty_four;
	}

	public int getFour() {
		return four;
	}

	public void setFour(int four) {
		this.four = four;
	}

	public Integer getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(Integer notes_date) {
		this.notes_date = notes_date;
	}

	public String getMjName() {
		return mjName;
	}

	public void setMjName(String mjName) {
		this.mjName = mjName;
	}

	public int getEight() {
		return eight;
	}

	public void setEight(int eight) {
		this.eight = eight;
	}

	public int getSixteen() {
		return sixteen;
	}

	public void setSixteen(int sixteen) {
		this.sixteen = sixteen;
	}

	public int getTotal() {
		return sixteen+eight+four+twenty_four+ten+twenty+wait+thirty+six+nine+fifteen+two+three+five+twelve+eighteenth;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMjtype() {
		return mjtype;
	}

	public void setMjtype(int mjtype) {
		this.mjtype = mjtype;
	}

	public int getAllTotal() {
		return allTotal;
	}

	public void setAllTotal(int allTotal) {
		this.allTotal = allTotal;
	}

	public int getDiff_one_days_ago() {
		return diff_one_days_ago;
	}

	public void setDiff_one_days_ago(int diff_one_days_ago) {
		this.diff_one_days_ago = diff_one_days_ago;
	}

	public int getDiff_two_days_ago() {
		return diff_two_days_ago;
	}

	public void setDiff_two_days_ago(int diff_two_days_ago) {
		this.diff_two_days_ago = diff_two_days_ago;
	}

	public int getDiff_three_days_ago() {
		return diff_three_days_ago;
	}

	public void setDiff_three_days_ago(int diff_three_days_ago) {
		this.diff_three_days_ago = diff_three_days_ago;
	}

	
	/**
	 * @param total2
	 */
	public void setThree(Integer three) {
		this.three=three;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public int getFive() {
		return five;
	}

	public void setFive(int five) {
		this.five = five;
	}

	public int getTwelve() {
		return twelve;
	}

	public void setTwelve(int twelve) {
		this.twelve = twelve;
	}

	public int getEighteenth() {
		return eighteenth;
	}

	public void setEighteenth(int eighteenth) {
		this.eighteenth = eighteenth;
	}

}
