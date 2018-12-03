package com.cai.common.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class GameGroupModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String description;
	
	private int type;
	
	private String selectedIds;
	
	
	private List<GameGroupRuleModel> ruleModels; 
	
	@XmlAttribute(name="selectedIds")
	public String getSelectedIds() {
		return selectedIds;
	}
	public void setSelectedIds(String selectedIds) {
		this.selectedIds = selectedIds;
	}
	
	@XmlAttribute(name="type")
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@XmlAttribute(name="des")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement(name = "rule")
	public List<GameGroupRuleModel> getRuleModels() {
		return ruleModels;
	}
	public void setRuleModels(List<GameGroupRuleModel> ruleModels) {
		this.ruleModels = ruleModels;
	}
}
