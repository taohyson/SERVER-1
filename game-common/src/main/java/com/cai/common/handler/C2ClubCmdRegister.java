/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.handler;

import java.util.Set;

import com.cai.common.constant.C2SCmd;
import com.google.common.collect.Sets;

/**
 * 
 * client->club
 *
 * @author wu_hc date: 2017年10月19日 下午1:29:40 <br/>
 */
public final class C2ClubCmdRegister {

	public static final Set<Integer> C2Club_cmds = Sets.newHashSet();

	static {
		C2Club_cmds.add(C2SCmd.SECNE_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MINI_INFO);
		C2Club_cmds.add(C2SCmd.CLUB_RECORD_UPVOTE);
		C2Club_cmds.add(C2SCmd.CLUB_SETTINGS_INFO);
		C2Club_cmds.add(C2SCmd.CLUB_CREATE_ACTIVITY);
		C2Club_cmds.add(C2SCmd.CLUB_DEL_ACTIVITY);
		C2Club_cmds.add(C2SCmd.CLUB_ACTIVITY_INFO);
		C2Club_cmds.add(C2SCmd.CLUB_ACTIVITY_RANK_SNAPSHOT);
		C2Club_cmds.add(C2SCmd.CLUB_HAS_ACTIVITY);
		C2Club_cmds.add(C2SCmd.CLUB_ASSIGNMENT);
		C2Club_cmds.add(C2SCmd.CLUB_MEMBER_AVATAR);
		C2Club_cmds.add(C2SCmd.CLUB_APPLY_JOIN_MSG);
		C2Club_cmds.add(C2SCmd.CLUB_DAILY_COST);
		C2Club_cmds.add(C2SCmd.CLUB_INVITE_JOIN_TABLE);
		C2Club_cmds.add(C2SCmd.CLUB_SCENE_TAG);
		C2Club_cmds.add(C2SCmd.CLUB_RULE_OL_MEMBERS);
		C2Club_cmds.add(C2SCmd.CLUB_SET_BULLETIN);
		C2Club_cmds.add(C2SCmd.CLUB_BULLETIN_INFO);
		
		C2Club_cmds.add(C2SCmd.MODIFY_CLUB_MEMBER_RECORD);
		C2Club_cmds.add(C2SCmd.CLUB_MEMBER_RECORD_LIST_REQUEST);
		C2Club_cmds.add(C2SCmd.CLUB_MODIFY_TIRE_MSG_REQUEST);
		C2Club_cmds.add(C2SCmd.CLUB_APPLY_QUIT_MSG_REQUEST);
		C2Club_cmds.add(C2SCmd.CLUB_QUIT_APPLY_REJECT);
		C2Club_cmds.add(C2SCmd.CLUB_INGORE_INVITE);
		C2Club_cmds.add(C2SCmd.CLUB_TABLE_SET_PASSPORT);
		
		C2Club_cmds.add(C2SCmd.CLUB_BAN_PLAYER_SET);
		C2Club_cmds.add(C2SCmd.CLUB_BAN_PLAYER_LIST_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_CHAT_GET_UNIQUE_ID_REQ);
		
		C2Club_cmds.add(C2SCmd.CLUB_SET_PLAYER_ROUND_LIMIT);
		C2Club_cmds.add(C2SCmd.CLUB_PLAYER_LIMIT_ROUND_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_PLAYER_LEFT_ROUND_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_CLEAR_PLAYER_ROUND_LIMIT);
		C2Club_cmds.add(C2SCmd.CLUB_BAN_SWITCH_REQ);
		
		C2Club_cmds.add(C2SCmd.CLUB_CREATE_OR_DEL_MATCH);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_ENROLL_OR_EXIT);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_DATA_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_MANAGER_SET_ATTEND);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_SET_ATTEND_LIST_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_TABLE_INFO_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_WILL_START_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_RANK_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_RECORD_REQ);
		
		C2Club_cmds.add(C2SCmd.CLUB_RULE_RECORD_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_TABLE_DISBAND_IN_ROOM_REQ);
		C2Club_cmds.add(C2SCmd.PLAYER_ENTER_CLUB_MATCH_ROOM_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_DEFRIEND_SYNC_REQ);

		C2Club_cmds.add(C2SCmd.CLUB_ADD_PARTNER_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_AGREE_ADD_PARTNER);
		C2Club_cmds.add(C2SCmd.CLUB_DEL_PARTNER_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_AGREE_DEL_PARTNER);
		C2Club_cmds.add(C2SCmd.CLUB_ADD_PARTNER_CHILD_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_REMOVE_PARTNER_CHILD_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_PARTNER_INVITE_JOIN_CLUB_REQ);
		C2Club_cmds.add(C2SCmd.AGREE_CLUB_PARTNER_INVITE_JOIN);

		C2Club_cmds.add(C2SCmd.CLUB_MATCH_BAN_ENROLL_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_MANAGER_CANCEL_ENROLL_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_START_IMMEDIATE_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_TABLE_BRAND_ID_REQ);

		C2Club_cmds.add(C2SCmd.CLUB_RULE_TABLE_DATA_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_TABLES_INFO_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MATCH_DISBAND_TABLE_REQ);

		C2Club_cmds.add(C2SCmd.CLUB_MEMBER_WELFARE_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_WELFARE_GET_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_WELFARE_LOTTERY_MSG_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MEMBER_WELFARE_CHANGE_MSG_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MODIFY_MEMBER_WELFARE_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_WELFARE_LOTTERY_REQ);

		C2Club_cmds.add(C2SCmd.CLUB_AREA_PROTECT_PERMISSION_APPLY_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_MEMBER_INFO_REQ);
		C2Club_cmds.add(C2SCmd.CLUB_OWNER_IS_AGENT_REQ);


		
	}
}
