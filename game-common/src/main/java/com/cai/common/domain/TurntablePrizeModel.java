package com.cai.common.domain;

import java.util.Date;

import protobuf.clazz.activity.ActivityTurntableProto.TurntablePrizeConfigProto;

/**
 * 账号
 * 
 * @author tang
 *
 */
public class TurntablePrizeModel extends DBBaseModel {
//	`id`  int(20) NOT NULL AUTO_INCREMENT ,
//	`prize_name`  varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
//	`icon`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
//	`count`  int(20) NOT NULL DEFAULT 0 COMMENT '奖品数量' ,
//	`weight`  int(20) NOT NULL DEFAULT 0 COMMENT '中奖概率' ,
//	`prize_desc`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物品说明' ,
//	`remark`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '备注' ,
//	`pos`  int(8) NOT NULL DEFAULT 0 COMMENT '奖品位置' ,
//	`prize_type`  int(5) NOT NULL DEFAULT 0 COMMENT '奖品类型' ,
//	`everyday_toplimit`  int(10) NOT NULL DEFAULT 0 COMMENT '每日抽奖数量上线' ,
//	`total_toplimit`  int(20) NOT NULL DEFAULT 0 ,
//	`active_id`  int(20) NOT NULL DEFAULT 0 COMMENT '活动id' ,
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int count;
	private int weight;
	private int pos;
	private int prize_type; // 
	private int total_toplimit;
	private int everyday_toplimit;
	private int active_id;
	private String prize_name;
	private String icon;
	private String prize_desc;
	private String remark;
	private Date start_date;
	private Date end_date;
	private int item_id;
	//是否置顶
	private int is_set_top;
	//是否显示
	private int is_show;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getPrize_type() {
		return prize_type;
	}
	public void setPrize_type(int prize_type) {
		this.prize_type = prize_type;
	}
	public int getTotal_toplimit() {
		return total_toplimit;
	}
	public void setTotal_toplimit(int total_toplimit) {
		this.total_toplimit = total_toplimit;
	}
	public int getEveryday_toplimit() {
		return everyday_toplimit;
	}
	public void setEveryday_toplimit(int everyday_toplimit) {
		this.everyday_toplimit = everyday_toplimit;
	}
	public int getActive_id() {
		return active_id;
	}
	public void setActive_id(int active_id) {
		this.active_id = active_id;
	}
	public String getPrize_name() {
		return prize_name;
	}
	public void setPrize_name(String prize_name) {
		this.prize_name = prize_name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getPrize_desc() {
		return prize_desc;
	}
	public void setPrize_desc(String prize_desc) {
		this.prize_desc = prize_desc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public TurntablePrizeConfigProto encode(){
		TurntablePrizeConfigProto.Builder b = TurntablePrizeConfigProto.newBuilder();
		b.setId(id);
		b.setIcon(icon);
		b.setName(prize_name);
		b.setPos(pos);
		b.setType(prize_type);
		b.setCount(count);
		return b.build();
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getIs_set_top() {
		return is_set_top;
	}
	public void setIs_set_top(int is_set_top) {
		this.is_set_top = is_set_top;
	}
	public int getIs_show() {
		return is_show;
	}
	public void setIs_show(int is_show) {
		this.is_show = is_show;
	}
	
}
