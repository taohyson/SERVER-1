/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
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
 *
 * @author DIY 
 * date: 2018年8月7日 下午5:21:59 <br/>
 */
@Document(collection = "client_up")
@CompoundIndexes({ @CompoundIndex(name = "index_upquery", def = "{'create_time': 1, 'upType':1}", background = true) })
public class ClientUpModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _id;
	
	@Indexed(direction=IndexDirection.DESCENDING,expireAfterSeconds=60*60*24*7)
	private Date create_time;
	
	
	private long playerId;
	
	
	private int upType;
	
	
	private String upString;


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


	public long getPlayerId() {
		return playerId;
	}


	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}


	public int getUpType() {
		return upType;
	}


	public void setUpType(int upType) {
		this.upType = upType;
	}


	public String getUpString() {
		return upString;
	}


	public void setUpString(String upString) {
		this.upString = upString;
	}
}
