/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 */
package com.cai.common.config.struct;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * global 配置
 *
 * @author wu_hc
 */
@XmlRootElement(name = "global")
public class GlobalStruct {
	private RedisStruct redisStruct;
	private MongoStruct mongosStruct;
	private MysqlStruct mysqlStruct;
	private CenterRmiStruct centerRmiStruct;
	private ClubServerStruct clubServerStruct;

	@XmlElement(name = "redis")
	public RedisStruct getRedisStruct() {
		return redisStruct;
	}

	public void setRedisStruct(RedisStruct redisStruct) {
		this.redisStruct = redisStruct;
	}

	@XmlElement(name = "mongo")
	public MongoStruct getMongosStruct() {
		return mongosStruct;
	}

	public void setMongosStruct(MongoStruct mongosStruct) {
		this.mongosStruct = mongosStruct;
	}

	@XmlElement(name = "mysql")
	public MysqlStruct getMysqlStruct() {
		return mysqlStruct;
	}

	public void setMysqlStruct(MysqlStruct mysqlStruct) {
		this.mysqlStruct = mysqlStruct;
	}

	@XmlElement(name = "centerRmi")
	public CenterRmiStruct getCenterRmiStruct() {
		return centerRmiStruct;
	}

	public void setCenterRmiStruct(CenterRmiStruct centerRmiStruct) {
		this.centerRmiStruct = centerRmiStruct;
	}

	@XmlElement(name = "clubServer")
	public ClubServerStruct getClubServerStruct() {
		return clubServerStruct;
	}

	/**
	 * @param clubServerStruct
	 *            the clubServerStruct to set
	 */
	public void setClubServerStruct(ClubServerStruct clubServerStruct) {
		this.clubServerStruct = clubServerStruct;
	}

	@Override
	public String toString() {
		return "GlobalStruct [redisStruct=" + redisStruct + ", mongosStruct=" + mongosStruct + ", mysqlStruct=" + mysqlStruct + ", centerRmiStruct="
				+ centerRmiStruct + ", clubServerStruct=" + clubServerStruct + "]";
	}

}
