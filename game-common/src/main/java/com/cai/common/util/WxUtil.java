package com.cai.common.util;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.cai.common.define.EWxHeadimgurlType;
import com.cai.common.domain.AccountWeixinModel;

public class WxUtil {
	
	/**
	 * 获取不同大小的头像
	 * @param headimgurl
	 * @param eWxHeadimgurlType
	 * @return
	 */
	public static String changHeadimgurl(String headimgurl,EWxHeadimgurlType eWxHeadimgurlType){
		if(headimgurl==null || StringUtils.isEmpty(headimgurl))
			return "";
		headimgurl = headimgurl.replaceAll("/0$", "/"+eWxHeadimgurlType.getId());
		return headimgurl;
	}
	
	
	/**
	 * 从微信玩家接口刷新微信对象
	 * @param jsonObject
	 */
	public static void flushAccountWeixinModel(JSONObject jsonObject,AccountWeixinModel accountWeixinModel){
		
//		String openid = jsonObject.getString("openid");
//		String nickname = jsonObject.getString("nickname");
//		// nickname转码，过滤mysql识别不了的
//		nickname = EmojiFilter.filterEmoji(nickname);
//		// 长度控制
//		nickname = MyStringUtil.substringByLength(nickname, 12);
//
//		String sex = jsonObject.getString("sex");
//		String province = jsonObject.getString("province");
//		String city = jsonObject.getString("city");
//		String country = jsonObject.getString("country");
//		String headimgurl = jsonObject.getString("headimgurl");
//		String privilege = jsonObject.getString("privilege");
//		String unionid = jsonObject.getString("unionid");// 全平台唯一id
//		
//		// 微信相关的
//		accountWeixinModel.setAccess_token(access_token);
//		accountWeixinModel.setRefresh_token(refresh_token);
//		accountWeixinModel.setOpenid(openid);
//		accountWeixinModel.setScope(scope);
//		accountWeixinModel.setUnionid(unionid);
//		accountWeixinModel.setNickname(nickname);
//		accountWeixinModel.setSex(sex);
//		accountWeixinModel.setProvince(province);
//		accountWeixinModel.setCity(city);
//		accountWeixinModel.setCountry(country);
//		accountWeixinModel.setHeadimgurl(headimgurl);
//		accountWeixinModel.setPrivilege(privilege);
//		accountWeixinModel.setLast_flush_time(new Date());
//		accountWeixinModel.setSelf_token(accountWeixinModel.getAccount_id() + "-" + RandomUtil.getRandomString(20));
//		accountWeixinModel.setLast_false_self_token(new Date());
		
		
	}
	
	
	
	public static void main(String[] args) {
		String s = "http://wx.qlogo.cn/mmopen/cd9Pjv8Wbfia1p22fdkibDewVOboOgtFqZ8ibxtFEsEkP6jDHyNrkIQMuWQJAqEibpX6Olj0kepgGxiafRb1UwW5jI73UkLyPyEXL/0";
		System.out.println(changHeadimgurl(s,EWxHeadimgurlType.S132));
	}

}
