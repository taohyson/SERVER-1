/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.cai.common.config.struct.GlobalStruct;

/**
 *
 * @author wu_hc
 */
public final class GlobalParseJaxb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(GlobalStruct.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			GlobalStruct struct = (GlobalStruct) unmarshaller.unmarshal(new File("src/main/resources/global.xml"));
			System.out.println(struct);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取公共配置
	 * 
	 * @return
	 */
	public static GlobalStruct getGolbalStruct() {
		try {
			JAXBContext context = JAXBContext.newInstance(GlobalStruct.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			GlobalStruct struct = (GlobalStruct) unmarshaller.unmarshal(new File("src/main/resources/global.xml"));
			return struct;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

}
