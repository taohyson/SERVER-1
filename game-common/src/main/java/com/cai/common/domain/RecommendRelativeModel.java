package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.time.DateFormatUtils;

/**
 * 
 * 
 * 推荐相关条件属性
 * @author tang 
 * date: 2017年9月18日 下午3:25:25 <br/>
 */
public class RecommendRelativeModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String formateDate;//当前日期
	
	private AtomicInteger recommendCount;//
	
	private int yesterDayRecommendCount;
	
	
	public RecommendRelativeModel(){
		formateDate = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
		recommendCount = new AtomicInteger(0);
	}
	public void initModel(){
		formateDate = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
		yesterDayRecommendCount = recommendCount.get();
		recommendCount = new AtomicInteger(0);
		
	}
	public int incre(){
		return recommendCount.incrementAndGet();
	}
	public int get(){
		return recommendCount.get();
	}
	public String getFormateDate(){
		return formateDate;
	}
	public int getYesterDayRecommendCount(){
		return yesterDayRecommendCount;
	}
}
