package com.cai.common.domain.sdk;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * SDK访问日志
 * @author chansonyan
 *
 */
@Document(collection = "sdk_access_log")
public class SdkAccessLogModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	//访问资源地址
	private String uri;
	
	//HTTP参数
	private String param;
	
	//请求最终完成耗时
	private long lapse;
	
	@Indexed(expireAfterSeconds=7*24*60*60)
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public long getLapse() {
		return lapse;
	}

	public void setLapse(long lapse) {
		this.lapse = lapse;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
