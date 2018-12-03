/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.cai.common.config.struct.Config;
import com.cai.common.config.struct.MysqlStruct;
import com.cai.common.util.LoadPackageClasses;
import com.google.common.collect.Lists;

/**
 *
 * @author wu_hc
 */
public class GlobalParseDom4j {

	private final Map<EnumConfig, Config> map = new EnumMap<>(EnumConfig.class);

	public static final GlobalParseDom4j INSTANCE = new GlobalParseDom4j();

	public static GlobalParseDom4j getInstance() {
		return GlobalParseDom4j.INSTANCE;
	}

	private GlobalParseDom4j() {
	}

	@SuppressWarnings("unchecked")
	public void parse() {
		try {
			LoadPackageClasses loader = new LoadPackageClasses(new String[] { "com.cai.common.config.struct" },
					IConfig.class);
			Set<Class<?>> classSets = loader.getClassSet();

			File f = new File("src/main/resources/global.xml");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			for (final Class<?> cls : classSets) {
				Object instance = cls.newInstance();
				IConfig configAnnotation = cls.getAnnotation(IConfig.class);
				EnumConfig enumConfig = configAnnotation.tag();
				Element element = root.element(enumConfig.tag());
				Field[] fields = cls.getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					Element value = element.element(field.getName());
					field.set(instance, transformField(field.getType(), value, field));
					field.setAccessible(false);
				}
				map.put(enumConfig, (Config) instance);
			}
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 转换
	 * 
	 * @param clz
	 * @param element
	 * @param field
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Object transformField(Class<?> clz, Element element, Field field) {
		if (clz == String.class) {
			return element.getTextTrim();
		} else if (clz == int.class || clz == Integer.class) {
			return Integer.parseInt(element.getTextTrim());
		} else if (clz == boolean.class || clz == Boolean.class) {
			return Boolean.parseBoolean(element.getText());
		} else if (clz == java.util.List.class) { // 要求泛型必须为基础类型(stringintboolean)
			Type genericType = field.getGenericType();
			if (genericType == null)
				return null;
			// 如果是泛型参数的类型
			if (genericType instanceof ParameterizedType) {
				ParameterizedType pt = (ParameterizedType) genericType;
				// 得到泛型里的class类型对象
				Class<?> genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
				List<Object> retList = Lists.newArrayList();
				List<Element> eles = element.elements();
				for (final Element e : eles) {
					Object o = transformField(genericClazz, e, null);
					if (null != o) {
						retList.add(o);
					}
				}
				return retList;
			}
		} else {
			throw new UnsupportedOperationException("暂时不支持的参数类型，是否需要添加支持!!" + field.getType());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> T getConfig(EnumConfig tag) {
		return (T) map.get(tag);
	}

	public static void main(String[] args) {
		GlobalParseDom4j global = GlobalParseDom4j.getInstance();
		global.parse();
		MysqlStruct mysqlStruct = global.getConfig(EnumConfig.MYSQL);
		System.err.println(mysqlStruct);
	}
}
