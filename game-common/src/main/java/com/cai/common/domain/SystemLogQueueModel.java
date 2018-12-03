/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.domain;

/**
 * 
 *
 * @author DIY 
 * date: 2018年1月16日 下午4:25:14 <br/>
 */

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 系统日志
 * @author run
 *
 */
@Document(collection="system_log_queue")
@CompoundIndexes({
	@CompoundIndex(name = "index_log_type", def = "{'log_type': 1}"),
	@CompoundIndex(name = "index_center_id", def = "{'center_id': 1}"),
	@CompoundIndex(name = "index_proxy_id", def = "{'proxy_id': 1}"),
    @CompoundIndex(name = "index_logic_id", def = "{'logic_id': 1}")
	
})
public class SystemLogQueueModel implements Serializable{

	private String _id;
	@Indexed(direction = IndexDirection.DESCENDING, expireAfterSeconds=60*60*10, background=true)
	private Date create_time;
	private Integer center_id;
	private Integer proxy_id;
	private Integer logic_id;
	private String log_type;
	private String msg;
	private Long v1;
	private Long v2;
	private String local_ip;
	/**
	 * 消息级别 
	 */
	private String level;
	
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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
	public Long getV1() {
		return v1;
	}
	public void setV1(Long v1) {
		this.v1 = v1;
	}
	public Long getV2() {
		return v2;
	}
	public void setV2(Long v2) {
		this.v2 = v2;
	}
	public String getLocal_ip() {
		return local_ip;
	}
	public void setLocal_ip(String local_ip) {
		this.local_ip = local_ip;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	

	
	
	
}
