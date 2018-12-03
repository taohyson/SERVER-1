package com.cai.common.domain.common;

import java.util.HashMap;
import java.util.Map;

import com.cai.common.util.JsonUtil;

public class AccountHonorMsgs {
	
	private Map<Integer, AccountHonorMsg> honorMap = new HashMap<>();
	
	public Map<Integer, AccountHonorMsg> getHonorMap() {
		return honorMap;
	}

	public void setHonorMap(Map<Integer, AccountHonorMsg> honorMap) {
		this.honorMap = honorMap;
	}
	
	public AccountHonorMsg getHonorMsg(int honorId){
		AccountHonorMsg msg = honorMap.get(honorId);
		return msg;
	}
	
	public void removeHonorMsg(int honorId){
		if(honorMap.containsKey(honorId)){
			honorMap.remove(honorId);
		}
	}
	
	public void addHonorMsg(AccountHonorMsg msg){
		AccountHonorMsg sameAppIdMsg = null;
		for(AccountHonorMsg myMsg : honorMap.values()){
			if(myMsg.getAppId() == msg.getAppId()){
				sameAppIdMsg = myMsg;
				break;
			}
		}
		if(sameAppIdMsg != null){
			honorMap.remove(sameAppIdMsg.getId());
		}
		honorMap.put(msg.getId(), msg);
	}
	
	public static AccountHonorMsgs transfer(String honorMsg){
		AccountHonorMsgs msgs = null;
		if(honorMsg == null || "".equals(honorMsg.trim())){
			return msgs;
		}
		try{
			msgs = JsonUtil.parseJsonObject(honorMsg, AccountHonorMsgs.class);
		}catch (Exception e) {
			msgs = null;
		}
		return msgs;
	}
	
	public static String getString(AccountHonorMsgs msgs){
		if(msgs == null){
			msgs = new AccountHonorMsgs();
		}
		String msg = JsonUtil.toJsonString(msgs);
		return msg;
	}

}
