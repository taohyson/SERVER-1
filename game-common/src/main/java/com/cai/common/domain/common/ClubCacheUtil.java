package com.cai.common.domain.common;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cai.common.constant.AccountConstant;
import com.cai.common.domain.ClubMemberModel;
import com.cai.common.util.MyStringUtil;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 *
 * @author zhanglong 2018/11/13 12:24
 */
public class ClubCacheUtil {

	/**
	 * 俱乐部玩家对象信息
	 */
	private static Map<Long, ClubCommonPlayer> playerMap = new ConcurrentHashMap<>();

	public static void initPlayerMap(List<ClubMemberModel> allMembers) {
		allMembers.forEach((memberModel -> {
			if (!playerMap.containsKey(memberModel.getAccount_id())) {
				ClubCommonPlayer player = new ClubCommonPlayer();
				player.setAccountId(memberModel.getAccount_id());
				String name = memberModel.getInitNickname();
				player.setNickname(name);
				if (name != null && name.contains("SELF_")) {
					String name2 = name.split("SELF_")[1];
					name2 = MyStringUtil.substringByLength(name2, AccountConstant.NICK_NAME_LEN);
					player.setNickname(name2);
				}
				player.setAvatar(memberModel.getInitAvatar());
				player.setLastLoginDate(memberModel.getInitLastLoginDate());
				playerMap.put(memberModel.getAccount_id(), player);
			}
			memberModel.setNickname(null);
			memberModel.setAvatar(null);
			memberModel.setLastLoginDate(null);
		}));
	}

	public static Map<Long, ClubCommonPlayer> getPlayerMap() {
		return playerMap;
	}

	public static String getClubPlayerNickname(long accountId) {
		ClubCommonPlayer player = playerMap.get(accountId);
		if (player == null || player.getNickname() == null) {
			return " ";
		}
		return player.getNickname();
	}

	public static String getClubPlayerAvatar(long accountId) {
		ClubCommonPlayer player = playerMap.get(accountId);
		if (player == null || player.getAvatar() == null) {
			return "";
		}
		return player.getAvatar();
	}

	public static Date getClubPlayerLastLoginDate(long accountId) {
		ClubCommonPlayer player = playerMap.get(accountId);
		if (player == null) {
			return null;
		}
		return player.getLastLoginDate();
	}

	public static void setPlayerNicknameOrAvatar(long accountId, String nickname, String avatar) {
		ClubCommonPlayer player = playerMap.get(accountId);
		if (player == null) {
			player = new ClubCommonPlayer();
			playerMap.put(accountId, player);
		}
		if (nickname != null) {
			player.setNickname(nickname);
		}
		if (avatar != null) {
			player.setAvatar(avatar);
		}
	}

	public static void setPlayerLastLoginDate(long accountId, Date date) {
		ClubCommonPlayer player = playerMap.get(accountId);
		if (player != null) {
			player.setLastLoginDate(date);
		}
	}

	public static void setPlayerAgent(long accountId, boolean isAgent) {
		ClubCommonPlayer player = playerMap.get(accountId);
		if (player != null) {
			player.setAgent(isAgent);
		}
	}
}
