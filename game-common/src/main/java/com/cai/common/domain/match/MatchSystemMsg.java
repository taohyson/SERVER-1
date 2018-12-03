package com.cai.common.domain.match;

import java.io.Serializable;

public class MatchSystemMsg implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int value;
	private int type;
	private String name;
	private String titile;
	private String content;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
