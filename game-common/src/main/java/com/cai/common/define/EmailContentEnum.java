/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 */
package com.cai.common.define;

/**
 * 
 * 邮件内容模板
 * 
 * @author WalkerGeek date: 2017年10月25日 上午10:00:33 <br/>
 */
public enum EmailContentEnum {
	Bag(1, "您收到来自好友的赠送", "赠送了一件礼物给您，请注意查收！"), //
	DISBAND_CLUB(2, "亲友圈解散", "您加入的亲友圈[%s]已经被创建人[%s]解散!"),
	MATCH_PRIZE(3, "比赛奖励", "恭喜您在【%s】中获得第%s名"),
	MATCH_INTERRUPT(4, "比赛取消", "您报名的【%s】因%s，比赛取消。报名费已经返还，请留意"),
	CLUB_MATCH_START_FAIL_MANAGER(5, "亲友圈开赛失败",
			"您亲友圈 [%s]创建的比赛 [%s]由于报名人数不足或者报名玩家未能及时参赛，开赛失败。开赛手续费已返还，请留意"),
	CLUB_MATCH_START_FAIL_PLAYER(6, "亲友圈开赛失败",
			"您亲友圈 [%s]所报名的自建赛[%s]由于报名人数不足或者报名玩家未能及时参赛，开赛失败。"),
	CLUB_MATCH_CANCEL(7, "亲友圈比赛取消", "您亲友圈 [%s]所报名的自建赛[%s]由于管理员取消了该赛事，已为您自动退赛。"),

	CLUB_PARTNER_INVITE_JOIN(8,"%s邀请您加入%s亲友圈","operatorId:%s,operatorName:%s,clubName:%s,creatorName:%s,clubId:%s,memberCount:%s"),

	GAME_PACKAGE_UPDATE_REWARD(9,"游戏更新奖励","您已经更新到最新版本，感谢对闲逸麻将的支持");

	/**
	 * @param type
	 * @param title
	 * @param content
	 */
	private EmailContentEnum(int type, String title, String content) {
		this.type = type;
		this.title = title;
		this.content = content;
	}

	private int type; // 邮件类型
	private String title; // 邮件标题
	private String content; // 邮件内容

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
