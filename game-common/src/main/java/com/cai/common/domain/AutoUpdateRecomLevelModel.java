package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * 自动更新推广员等级记录表
 *
 * @author tang 
 * date: 2018年5月2日 下午6:11:58 <br/>
 */
@Document(collection="auto_update_level_log")
@CompoundIndexes({
	@CompoundIndex(name = "index_create_time", def = "{'create_time': -1}"),
    @CompoundIndex(name = "index_account_id", def = "{'account_id': 1}")
})
public class AutoUpdateRecomLevelModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	@Indexed
	private Long account_id;
	
	private int curLevel;//当前等级
	
	private int oldLevel;//之前的等级
	
	private int type;//1晋升，2降级
	
	private String desc;//描述

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

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public int getCurLevel() {
		return curLevel;
	}

	public void setCurLevel(int curLevel) {
		this.curLevel = curLevel;
	}

	public int getOldLevel() {
		return oldLevel;
	}

	public void setOldLevel(int oldLevel) {
		this.oldLevel = oldLevel;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
