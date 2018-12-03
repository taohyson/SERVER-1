package com.cai.common.domain;

import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.cai.common.domain.json.MatchBaseScoreJsonModel;
import com.cai.common.util.TimeUtil;
/**
 * 比赛基数配置
 */
public class MatchBaseScoreModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int match_id;
	//比赛基数详情k
	private String base_detail;//包含内容[{time:1,base:10,outScore:20,baseScore:20,times:20}]
	
	private Date create_time;
	
	private List<MatchBaseScoreJsonModel> details;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getBase_detail() {
		return base_detail;
	}

	public void setBase_detail(String base_detail) {
		setDetails(JSON.parseArray(base_detail, MatchBaseScoreJsonModel.class));
		this.base_detail = base_detail;
	}
	
	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public MatchBaseScoreModel(MatchModel model) {
		super();
		this.id = 0;
		this.match_id = model.getMatch_id();
		this.base_detail = model.getBase_detail();
		setDetails(JSON.parseArray(model.getBase_detail(), MatchBaseScoreJsonModel.class));
		this.create_time = model.getCreate_time();
	}
	public MatchBaseScoreModel(){}

	public List<MatchBaseScoreJsonModel> getDetails() {
		return details;
	}

	public void setDetails(List<MatchBaseScoreJsonModel> details) {
		this.details = details;
	}

	public MatchBaseScoreJsonModel getConfig(long startTime) {
		double second = (System.currentTimeMillis() - startTime) /1.0 / TimeUtil.SECOND;
		
		for (MatchBaseScoreJsonModel model : details) {
			if(model.getTime() > second){
				return model;
			}
		}

		return details.get(details.size() - 1);
	}
}
