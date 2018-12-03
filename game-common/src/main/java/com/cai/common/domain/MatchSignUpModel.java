package com.cai.common.domain;

import java.util.Date;

/**
 * 比赛报名
 */
public class MatchSignUpModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private int itemId;//参赛券id
	private int match_id;
	private Date create_time;
	private int match_type;// 1线上比赛，2线下比赛
	private int sign_type;// 报名方式，1线上报名，2线下报名
	private int sign_seq;// 报名序号
	private String nick_name;// 游戏昵称
	private long account_id;// 游戏账号id
	private String name;// 姓名
	private String mobile;// 手机号
	private String id_card;// 身份证号
	private String headUrl;// 照片
	private int upgrade_state;// 进阶状态，0未开始，1，2，3阶级
	private String upgrade_desc;// 进阶描述,area阶段，grade得分[{area:1,grade:10}]
	private int sendMsg;// 0未发送，1邮件，2短信，3邮件+短信

	private Date operate_time;// 后台操作时间
	

	public int getMatch_type() {
		return match_type;
	}

	public void setMatch_type(int match_type) {
		this.match_type = match_type;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Date getOperate_time() {
		return operate_time;
	}

	public void setOperate_time(Date operate_time) {
		this.operate_time = operate_time;
	}

	public int getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(int sendMsg) {
		this.sendMsg = sendMsg;
	}

	public int getSign_seq() {
		return sign_seq;
	}

	public void setSign_seq(int sign_seq) {
		this.sign_seq = sign_seq;
	}

	public int getSign_type() {
		return sign_type;
	}

	public void setSign_type(int sign_type) {
		this.sign_type = sign_type;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public int getUpgrade_state() {
		return upgrade_state;
	}

	public void setUpgrade_state(int upgrade_state) {
		this.upgrade_state = upgrade_state;
	}

	public String getUpgrade_desc() {
		return upgrade_desc;
	}

	public void setUpgrade_desc(String upgrade_desc) {
		this.upgrade_desc = upgrade_desc;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

}
