package com.cai.common.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVUtil {
	public static List<String> readDirtyCSVFile(String path) throws IOException {

		InputStreamReader fr = new InputStreamReader(new FileInputStream(path));
		BufferedReader br = new BufferedReader(fr);
		String rec = null;// 一行
		List<String> listFile = new ArrayList<>();
		try {
			// 读取一行
			while ((rec = br.readLine()) != null) {	
//				Pattern pCells = Pattern.compile("(\"[^\"]*(\"{2})*[^\"]*\")*[^,]*,");
//				Matcher mCells = pCells.matcher(rec);
				
				listFile.add(rec.trim());
//				// 读取每个单元格
//				while (mCells.find()) {
//					str = mCells.group();
//					str = str.replaceAll("(?sm)\"?([^\"]*(\"{2})*[^\"]*)\"?.*,", "$1");
//					str = str.replaceAll("(?sm)(\"(\"))", "$2");
//					listFile.add(str);
//				}
			
			}
		}  finally {
			if (fr != null) {
				fr.close();
			}
			if (br != null) {
				br.close();
			}
		}
		return listFile;
	}
}
