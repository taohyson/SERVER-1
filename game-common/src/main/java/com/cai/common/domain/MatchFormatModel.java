package com.cai.common.domain;

import java.util.Date;
import java.util.List;

import com.cai.common.domain.json.MatchReviveJsonModel;
import com.cai.common.domain.json.OutDetailJsonModel;
import com.cai.common.domain.json.RsShiftDetailJsonModel;
import com.cai.common.domain.json.UpgradeDetailJsonModel;
/**
 * 比赛赛制配置
 */
public class MatchFormatModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int match_id;//比赛id
	private Date create_time;
	//赛制选择，1打立出局,选了这个必须要配置定局赛规则
	private int out_right_type;
	
	//base_times打立出局初始倍数
	private String out_detail;//根据总人数范围确定晋级人数{base_score:10,upgrade:[{area:"1,120",num:18},{area:"120,500",num:72}{}]}
	
	//定局赛
	private int static_type;
	//定局赛局数配置
	private String upgrade_detail;//包含内容[{round:1,upgrade:[{area:"1,120",num:18},{}]},{}]
	
	//瑞士移位配置
	private String rs_shift_detail;
	
	//复活配置
	private String revive_detail;
	
	private OutDetailJsonModel outDetailJsonModel;
	private MatchReviveJsonModel reviveJsonModel;
	
	// 定局赛轮数配置
	private List<UpgradeDetailJsonModel> upgradeDetailJsonModelList;
	
	// 瑞士移位轮数配置
	private List<RsShiftDetailJsonModel> rsDetailJsonModelList;
	
	public OutDetailJsonModel getOutDetailJsonModel() {
		return outDetailJsonModel;
	}
	public void setOutDetailJsonModel(OutDetailJsonModel outDetailJsonModel) {
		this.outDetailJsonModel = outDetailJsonModel;
	}
	public List<UpgradeDetailJsonModel> getUpgradeDetailJsonModelList() {
		return upgradeDetailJsonModelList;
	}
	public void setUpgradeDetailJsonModelList(List<UpgradeDetailJsonModel> upgradeDetailJsonModelList) {
		this.upgradeDetailJsonModelList = upgradeDetailJsonModelList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getOut_right_type() {
		return out_right_type;
	}
	public void setOut_right_type(int out_right_type) {
		this.out_right_type = out_right_type;
	}
	public String getOut_detail() {
		return out_detail;
	}
	public void setOut_detail(String out_detail) {
		this.out_detail = out_detail;
	}
	public int getStatic_type() {
		return static_type;
	}
	public void setStatic_type(int static_type) {
		this.static_type = static_type;
	}
	public String getUpgrade_detail() {
		return upgrade_detail;
	}
	public void setUpgrade_detail(String upgrade_detail) {
		this.upgrade_detail = upgrade_detail;
	}
	public int getMatch_id() {
		return match_id;
	}
	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	public MatchFormatModel(MatchModel model) {
		super();
		this.id = 0;
		this.match_id = model.getMatch_id();
		this.create_time = model.getCreate_time();
		this.out_right_type = model.getOut_right_type();
		this.out_detail = model.getOut_detail();
		this.static_type = model.getStatic_type();
		this.upgrade_detail = model.getUpgrade_detail();
		this.rs_shift_detail = model.getRs_shift_detail();
		this.revive_detail = model.getRevive_detail();
	}

	public MatchFormatModel(){}
	
	public UpgradeDetailJsonModel getUpgradeDetail(int curRound) {
		for (UpgradeDetailJsonModel upgrade : upgradeDetailJsonModelList) {
			if(upgrade.getRound() == curRound){
				return upgrade;
			}
		}
		// TODO Auto-generated method stub
		return upgradeDetailJsonModelList.get(0);
	}
	public String getRs_shift_detail() {
		return rs_shift_detail;
	}
	public void setRs_shift_detail(String rs_shift_detail) {
		this.rs_shift_detail = rs_shift_detail;
	}
	public List<RsShiftDetailJsonModel> getRsDetailJsonModelList() {
		return rsDetailJsonModelList;
	}
	public void setRsDetailJsonModelList(List<RsShiftDetailJsonModel> rsDetailJsonModelList) {
		this.rsDetailJsonModelList = rsDetailJsonModelList;
	}
	public String getRevive_detail() {
		return revive_detail;
	}
	public void setRevive_detail(String revive_detail) {
		this.revive_detail = revive_detail;
	}
	public MatchReviveJsonModel getReviveJsonModel() {
		return reviveJsonModel;
	}
	public void setReviveJsonModel(MatchReviveJsonModel reviveJsonModel) {
		this.reviveJsonModel = reviveJsonModel;
	}
}
