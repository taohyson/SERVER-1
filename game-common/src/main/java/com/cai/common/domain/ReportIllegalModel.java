package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 每日账号数据统计
 * 
 * @author run
 *
 */

@Document(collection = "report_illegal_info")
public class ReportIllegalModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(direction=IndexDirection.DESCENDING)
	private Date create_time;
	private String email ; //邮件地址
	private String content ; //举报内容
	private String imgUrlList ;//举报的图
	private int state;//处理状态，默认 0未处理，1已处理
	
	
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImgUrlList() {
		return imgUrlList;
	}
	public void setImgUrlList(String imgUrlList) {
		this.imgUrlList = imgUrlList;
	}
	
}
