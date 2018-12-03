package com.cai.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.cai.common.constant.S2CCmd;
import com.cai.common.constant.TurntableCmd;
import com.cai.common.util.PBUtil;

import protobuf.clazz.Protocol.Response;
import protobuf.clazz.activity.ActivityTurntableProto.TurntableConfigProto;
import protobuf.clazz.activity.ActivityTurntableProto.TurntableRsp;

/**
 * 账号
 * 
 * @author tang
 *
 */
public class TurntableActiveModel extends DBBaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// `id` int(20) NOT NULL AUTO_INCREMENT ,
	// `active_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL
	// DEFAULT NULL COMMENT '活动名字' ,
	// `active_desc` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci
	// NULL DEFAULT NULL COMMENT '活动描述' ,
	// `start_time` datetime NULL DEFAULT NULL ,
	// `end_time` datetime NULL DEFAULT NULL ,
	// `state` int(5) NULL DEFAULT 0 COMMENT '活动状态' ,
	// `active_type` int(8) NULL DEFAULT 0 COMMENT '活动类型' ,
	private int id;
	private int state;
	private int active_type;
	private String active_name;
	private String active_desc;
	private int game_id;
	private Date start_time;
	private Date end_time;
	private Date deadline;
	private String prizeUrl;
	private String bg_url;
	private int new_user_times;
	private int all_user_times;
	private String task_info;

	private List<TurntablePrizeModel> prizes = new ArrayList<>();

	private Map<Integer, TurntableTaskInfo> taskInfoMap = new HashMap<>();

	public boolean isActivityTime() {
		long current = System.currentTimeMillis();
		if (start_time == null || end_time == null) {
			return false;
		}
		if (this.start_time.getTime() <= current && this.end_time.getTime() >= current) {
			// 更新对应的任务项
			return true;
		}
		return false;
	}

	/**
	 * 以领奖结束为准
	 * 
	 * @return
	 */
	public boolean isActivityDuration() {
		if (start_time == null || deadline == null) {
			return false;
		}
		long current = System.currentTimeMillis();
		if (this.start_time.getTime() <= current && this.deadline.getTime() >= current) {
			// 更新对应的任务项
			return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getActive_type() {
		return active_type;
	}

	public void setActive_type(int active_type) {
		this.active_type = active_type;
	}

	public String getActive_name() {
		return active_name;
	}

	public void setActive_name(String active_name) {
		this.active_name = active_name;
	}

	public String getActive_desc() {
		return active_desc;
	}

	public void setActive_desc(String active_desc) {
		this.active_desc = active_desc;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public List<TurntablePrizeModel> getPrizes() {
		return prizes;
	}

	public void setPrizes(List<TurntablePrizeModel> prizes) {
		this.prizes = prizes;
	}

	public Response encode() {
		TurntableRsp.Builder b = TurntableRsp.newBuilder();

		b.setCmd(TurntableCmd.S2C_SEND_CONFIG);
		b.setId(id);

		TurntableConfigProto.Builder configB = TurntableConfigProto.newBuilder();

		configB.setEndTime(end_time.getTime());
		configB.setName(active_name);
		configB.setStartTime(start_time.getTime());
		configB.setId(id);
		configB.setBgUrl(bg_url);
		configB.setPrizeUrl(prizeUrl);

		prizes.forEach((prize) -> {
			configB.addPrizes(prize.encode());
		});
		configB.setDesc(active_desc);
		b.setProtos(configB.build().toByteString());

		return PBUtil.toS2CCommonRsp(S2CCmd.TURNTABLE, b).build();
	}

	public String getPrizeUrl() {
		return prizeUrl;
	}

	public void setPrizeUrl(String prizeUrl) {
		this.prizeUrl = prizeUrl;
	}

	public String getBg_url() {
		return bg_url;
	}

	public void setBg_url(String bg_url) {
		this.bg_url = bg_url;
	}

	public int getNew_user_times() {
		return new_user_times;
	}

	public void setNew_user_times(int new_user_times) {
		this.new_user_times = new_user_times;
	}

	public int getAll_user_times() {
		return all_user_times;
	}

	public void setAll_user_times(int all_user_times) {
		this.all_user_times = all_user_times;
	}

	public Map<Integer, TurntableTaskInfo> getTaskInfoMap() {
		return taskInfoMap;
	}

	public void setTaskInfoMap(Map<Integer, TurntableTaskInfo> taskInfoMap) {
		this.taskInfoMap = taskInfoMap;
	}

	public String getTask_info() {
		return task_info;
	}
	
	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public void setTask_info(String task_info) {
		this.task_info = task_info;
		if (null != task_info && task_info.length() > 0) {
			List<TurntableTaskInfo> jsonArray = JSONArray.parseArray(task_info, TurntableTaskInfo.class);
			for (TurntableTaskInfo temp : jsonArray) {
				this.taskInfoMap.put(temp.getMissionId(), temp);
			}
		}
	}

}
