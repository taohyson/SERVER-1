package com.cai.common.domain.xml;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cai.common.domain.GameGroupModel;


@XmlRootElement(name = "rules")
public class GameGroupList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<GameGroupModel> groups;
	
	private String fun;
	
	private GameCommonGroupSet set;

	@XmlElement(name = "group")
	public List<GameGroupModel> getGroups() {
		return groups;
	}

	public void setGroups(List<GameGroupModel> groups) {
		this.groups = groups;
	}

	public String getFun() {
		return fun;
	}
	
	@XmlElement(name="fun")
	public void setFun(String fun) {
		this.fun = fun;
	}

	@XmlElement(name="commonId")
	public GameCommonGroupSet getSet() {
		return set;
	}

	public void setSet(GameCommonGroupSet set) {
		this.set = set;
	}
}
