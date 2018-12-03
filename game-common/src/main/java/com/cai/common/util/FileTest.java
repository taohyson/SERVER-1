package com.cai.common.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileTest {
	public static void main(String[] args) throws IOException {
		List<String> list = getFileString("D:/a.txt");
		List<String> bList = getFileString("D:/b.txt");
		HashMap<String,String> map = new HashMap<String,String>();
		for(String str:bList) {
			map.put(str, str);
		}
		int count = 0;
		for(String str:list) {
			if(map.get(str)!=null) {
				count++;
			}
		}
		System.out.println("count finish= "+count);
	}
	
	
	
	public static List<String> getFileString(String path) throws IOException {
		File file = new File(path);
		return FileUtils.readLines(file);
	}
}
