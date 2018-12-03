package com.cai.common.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

@Component
public class WRSystem {

	private static final String CONFIG = "config.txt";

	public static String HOME;

	static {
		File configFile = new File(RuntimeOpt.getUsrDir() + File.separatorChar + WRSystem.CONFIG);
		try {
			String whichCfg = FileUtils.readFileToString(configFile, "utf-8").trim();
			HOME = RuntimeOpt.getUsrDir() + File.separatorChar + "global_config" + File.separatorChar + whichCfg + File.separatorChar;
			System.out.println("确定配置文件位置:" + HOME);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("##########配置相关有错误，请检查确认!###################");
//			System.exit(0);
		}
	}
}
