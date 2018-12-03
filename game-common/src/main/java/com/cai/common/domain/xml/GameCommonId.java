package com.cai.common.domain.xml;

import javax.xml.bind.annotation.XmlElement;

public class GameCommonId{
	private int id;

	
	@XmlElement(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}