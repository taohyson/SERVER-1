package com.cai.common.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rule")
public class GameGroupRuleModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int game_rule;

	private String description;

	private int line;

	private String mode;

	private String status;

	private String based;

	private String value;

	private String excludes;

	private String tips;

	private int isClubRuleHide;

	@XmlElement(name = "id")
	public int getGame_rule() {
		return game_rule;
	}

	public void setGame_rule(int game_rule) {
		this.game_rule = game_rule;
	}

	@XmlElement(name = "des")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@XmlElement(name = "switch")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@XmlElement(name = "based")
	public String getBased() {
		return based;
	}

	public void setBased(String based) {
		this.based = based;
	}

	@XmlElement(name = "excludes")
	public String getExcludes() {
		return excludes;
	}

	public void setExcludes(String excludes) {
		this.excludes = excludes;
	}

	@XmlElement(name = "tips")
	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	@XmlElement(name = "isClubRuleHide")
	public int getIsClubRuleHide() {
		return isClubRuleHide;
	}

	public void setIsClubRuleHide(int isClubRuleHide) {
		this.isClubRuleHide = isClubRuleHide;
	}

}
