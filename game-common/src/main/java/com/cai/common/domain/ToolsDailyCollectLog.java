/**
 * 
 */
package com.cai.common.domain;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 道具统计日报
 */
@Document(collection = "tools_daily_collect")

public class ToolsDailyCollectLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;
	@Indexed(name = "index_notes_date", unique = false)
	private int notes_date;
	
	private int toolsId;//道具id
	
	private long count;//消耗道具数
	
	private long cost;//消耗金币数
	
	//辅助字段
	private String toolsName;	//道具字段

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getNotes_date() {
		return notes_date;
	}

	public void setNotes_date(int notes_date) {
		this.notes_date = notes_date;
	}

	public int getToolsId() {
		return toolsId;
	}

	public void setToolsId(int toolsId) {
		this.toolsId = toolsId;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public String getToolsName() {
		return toolsName;
	}

	public void setToolsName(String toolsName) {
		this.toolsName = toolsName;
	}

	public ToolsDailyCollectLog(){
		
	}
	public ToolsDailyCollectLog(HashMap map,int notes_date){
		if(map.containsKey("_id"))
			this.toolsId = map.get("_id") == null ? 0 : (int)map.get("_id");
		if(map.containsKey("count"))
			this.count = map.get("count") == null ? 0 : (int)map.get("count");
		if(map.containsKey("cost"))
			this.cost = map.get("cost") == null ? 0 : (long)map.get("cost");
		this.notes_date = notes_date;
	}
	
}
