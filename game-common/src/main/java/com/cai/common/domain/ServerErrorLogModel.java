/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 服务器错误日志
 * @author run
 *
 */
@Document(collection="server_error_log")
@CompoundIndexes({
	@CompoundIndex(name = "index_crate_time", def = "{'create_time': 1}"),
	@CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"),
    @CompoundIndex(name = "index_room_id", def = "{'room_id': 1}")
	
})
public class ServerErrorLogModel implements Serializable{

	private String _id;
	private Date create_time;
	private Integer center_id;
	private Integer proxy_id;
	private Integer logic_id;
	private String log_type;
	private String msg;
	private Integer roomId;
	private Long accountId;
	
	private String extractMsg;
	
	private Integer appId;
	
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getExtractMsg() {
		return extractMsg;
	}
	public void setExtractMsg(String extractMsg) {
		this.extractMsg = extractMsg;
	}
	
	public Integer getCenter_id() {
		return center_id;
	}
	public void setCenter_id(Integer center_id) {
		this.center_id = center_id;
	}
	public Integer getProxy_id() {
		return proxy_id;
	}
	public void setProxy_id(Integer proxy_id) {
		this.proxy_id = proxy_id;
	}
	
	public Integer getLogic_id() {
		return logic_id;
	}
	public void setLogic_id(Integer logic_id) {
		this.logic_id = logic_id;
	}
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	

	
	
	
}
