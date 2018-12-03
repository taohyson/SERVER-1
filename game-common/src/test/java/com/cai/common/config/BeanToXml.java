/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.cai.common.config.struct.GlobalStruct;
import com.cai.common.config.struct.RedisStruct;

public class BeanToXml {

	/**
	 * java对象转换为xml文件
	 * 
	 * @param xmlPath
	 *            xml文件路径
	 * @param load
	 *            java对象.Class
	 * @return xml文件的String
	 * @throws JAXBException
	 */
	public static String beanToXml(Object obj, Class<?> load) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(load);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		StringWriter writer = new StringWriter();
		marshaller.marshal(obj, writer);
		return writer.toString();
	}

	public static void main(String[] args) throws Exception {
		 studentXMl();
//		globalXML();
	}

	public static void globalXML() throws JAXBException, IOException {
		GlobalStruct global = new GlobalStruct();
		RedisStruct struct = new RedisStruct();
		struct.setHostNode("xxxxxxxxxxx");
		struct.setMaxActive(23);
		struct.setMaxIdle(434);
		struct.setMaxWait(5434);
		struct.setPasswd("233333333333");
		struct.setTestOnBorrow(true);
		global.setRedisStruct(struct);
		String str = BeanToXml.beanToXml(global, GlobalStruct.class);

		// 写入到xml文件中
		String xmlPath = "src/test/resources/myglobal.xml";
		BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
		bfw.write(str);
		bfw.close();
	}

	public static void studentXMl() throws Exception {
		List<String> hobby = new ArrayList<>();
		hobby.add("篮球");
		hobby.add("音乐");
		hobby.add("乒乓球");

		List<Student> studentList = new ArrayList<>();

		Student st = new Student("张三", "男", 10001, "尖子班", hobby);
		studentList.add(st);
		Student st1 = new Student("李四", "男", 10002, "普通班", hobby);
		studentList.add(st1);
		Student st2 = new Student("莉莉", "女", 10003, "普通班", hobby);
		studentList.add(st2);

		StudentList students = new StudentList();
		students.setStudents(studentList);
		String str = BeanToXml.beanToXml(students, StudentList.class);

		// 写入到xml文件中
		String xmlPath = "src/test/resources/testConfig.xml";
		BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
		bfw.write(str);
		bfw.close();
	}
}