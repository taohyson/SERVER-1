/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config.struct;

import com.cai.common.config.EnumConfig;
import com.cai.common.config.IConfig;

/**
 *
 * @author wu_hc
 */
@IConfig(tag = EnumConfig.MYSQL)
public final class MysqlStruct implements Config {
	private String url;
	private String userName;
	private String passWord;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "MysqlStruct [url=" + url + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
