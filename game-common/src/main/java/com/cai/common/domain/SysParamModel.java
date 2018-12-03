package com.cai.common.domain;

import java.util.Date;

/**
 * 系统参数
 * @author run
 *
 */
public class SysParamModel extends DBBaseModel {

	private static final long serialVersionUID = -8057462497762511957L;

	/**
	 * 游戏id
	 */
	private int id;

	/**
	 * 参数说明
	 */
	private int game_id;

	private String param_desc;

	private Integer val1;
	
	private Integer val2;
	
	private Integer val3;
	
	private Integer val4;
	
	private Integer val5;

	private String str1;

	private String str2;

	/**
	 * 是否发送客户端
	 */
	private int send_client;
	/**
	 * 结束时间
	 */
	private Date finish_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public String getParam_desc() {
		return param_desc;
	}

	public void setParam_desc(String param_desc) {
		this.param_desc = param_desc;
	}

	public Integer getVal1() {
		return val1;
	}

	public void setVal1(Integer val1) {
		this.val1 = val1;
	}

	public Integer getVal2() {
		return val2;
	}

	public void setVal2(Integer val2) {
		this.val2 = val2;
	}

	public Integer getVal3() {
		return val3;
	}

	public void setVal3(Integer val3) {
		this.val3 = val3;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public int getSend_client() {
		return send_client;
	}

	public void setSend_client(int send_client) {
		this.send_client = send_client;
	}

	public Integer getVal4() {
		return val4;
	}

	public void setVal4(Integer val4) {
		this.val4 = val4;
	}

	public Integer getVal5() {
		return val5;
	}

	public void setVal5(Integer val5) {
		this.val5 = val5;
	}

	public Date getFinish_time() {
		return finish_time;
	}

	public void setFinish_time(Date finish_time) {
		this.finish_time = finish_time;
	}

	
	
	
	
	

}
