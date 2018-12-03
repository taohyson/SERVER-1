/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.cai.common.config.struct.GlobalStruct;

public class XmlToBean {

	/**
	 * xml文件配置转换为对象
	 * 
	 * @param xmlPath
	 *            xml文件路径
	 * @param load
	 *            java对象.Class
	 * @return java对象
	 * @throws JAXBException
	 * @throws IOException
	 */
	public static Object xmlToBean(String xmlPath, Class<?> load) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(load);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new File(xmlPath));
		return object;
	}

	public static void main(String[] args) throws IOException, JAXBException {
		// studentBean();
		globalBean();
	}

	public static void globalBean() throws JAXBException, IOException {
		String xmlPath = "src/test/resources/myglobal.xml";
		Object object = XmlToBean.xmlToBean(xmlPath, GlobalStruct.class);
		GlobalStruct glboal = (GlobalStruct) object;
		System.out.println(glboal);
	}

	public static void studentBean() throws JAXBException, IOException {
		String xmlPath = "src/test/resources/testConfig.xml";
		Object object = XmlToBean.xmlToBean(xmlPath, StudentList.class);
		StudentList students = (StudentList) object;
		List<Student> studentList = students.getStudents();

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).name);
			System.out.println(studentList.get(i).sex);
			System.out.println(studentList.get(i).number);
			System.out.println(studentList.get(i).className);
			for (String str : studentList.get(i).hobby) {
				System.out.print(str + " ");
			}
			System.out.println("-------------");
		}
	}
}