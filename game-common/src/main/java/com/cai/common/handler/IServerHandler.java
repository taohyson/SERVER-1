/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cai.common.util.PBUtil;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Parser;
import com.xianyi.framework.core.transport.netty.session.S2SSession;

import protobuf.clazz.Protocol.S2SCommonProto;

/**
 * 
 *
 * @author wu_hc date: 2017年7月24日 下午6:31:39 <br/>
 */
public abstract class IServerHandler<T extends GeneratedMessage> {

	/**
	 * 
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	private Parser<? extends GeneratedMessage> parser;

	public void doExecute(S2SCommonProto commProto, S2SSession session) throws Exception {
		
		this.execute(toObject(commProto), session);
	}

	/**
	 * 
	 * @param message
	 * @param topRequest
	 * @param session
	 * @throws Exception
	 */
	public abstract void execute(T resp, S2SSession session) throws Exception;
	
	@SuppressWarnings("unchecked")
	public T toObject(S2SCommonProto commProto) {
		// TODO Auto-generated method stub
		return (T) PBUtil.toObject(commProto.getByte(), parser, GeneratedMessage.class);
	}

	public void setParse(Parser<? extends GeneratedMessage> parser) {
		this.parser = parser;
	}

}
