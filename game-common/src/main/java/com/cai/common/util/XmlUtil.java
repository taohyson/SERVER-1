package com.cai.common.util;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T toObject(String content, Class<T> clazz) throws JAXBException  {
		JAXBContext jc = JAXBContext.newInstance(clazz);  
	    Unmarshaller unmar = jc.createUnmarshaller();  
	    return (T) unmar.unmarshal(new StringReader(content));
	}


}
