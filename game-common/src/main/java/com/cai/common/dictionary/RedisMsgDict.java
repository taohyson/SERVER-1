package com.cai.common.dictionary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.domain.Account;

import protobuf.redis.ProtoRedis.RedisResponse;
import protobuf.redis.ProtoRedis.RedisResponse.RsResponseType;
import protobuf.redis.ProtoRedis.RsAccountResponse;


/**
 * redis消息
 * 
 * @author run
 *
 */
public class RedisMsgDict {

	private Logger logger = LoggerFactory.getLogger(RedisMsgDict.class);

	/**
	 * 单例
	 */
	private static RedisMsgDict instance;

	/**
	 * 私有构造
	 */
	private RedisMsgDict() {
	}

	/**
	 * 单例模式
	 * 
	 * @return 字典单例
	 */
	public static RedisMsgDict getInstance() {
		if (null == instance) {
			instance = new RedisMsgDict();
		}

		return instance;
	}

	public void load() {

	}


	public RedisResponse updateAccountByLogin(Account account){
		RedisResponse.Builder redisResponseBuilder = RedisResponse.newBuilder();
		redisResponseBuilder.setRsResponseType(RsResponseType.ACCOUNT_UP);
		
		RsAccountResponse.Builder rsAccountResponseBuilder = RsAccountResponse.newBuilder();
		rsAccountResponseBuilder.setAccountId(account.getAccount_id());
//		rsAccountResponseBuilder.setLastGameIndex(value);
//		rsAccountResponseBuilder.setLastGameStatus(value);
//		rsAccountResponseBuilder.setLastLogicIndex(value);
//		rsAccountResponseBuilder.setLastProxyIndex(value);
//		rsAccountResponseBuilder.setGameId(value);
//		rsAccountResponseBuilder.setLastLoginIp(value);
		return redisResponseBuilder.build();
	}



















}
