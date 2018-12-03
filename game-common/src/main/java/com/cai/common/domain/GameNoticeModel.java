package com.cai.common.domain;

import java.io.Serializable;
import java.util.Date;

import com.cai.common.domain.json.NoticeDetailJsonModel;
import com.cai.common.util.JsonUtil;

/**
 * 游戏公告
 * @author run
 *
 */
public class GameNoticeModel implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 公告id
	 */
	private int id;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**
	 * 游戏类型
	 */
	private int game_type;
	
	/**
	 * 播放间隔
	 */
	private int delay;
	
	/**
	 * 创建时间
	 */
	private Date create_time;
	
	/**
	 * 公告结束时间
	 */
	private Date end_time;
	
	/**
	 * 播放类型 1=普通 2=全局
	 */
	private int play_type;
	
	private Date task_excute_time; //定时任务执行时间
	private int trigger_type; //触发类型
	private String attach_msg;
	private NoticeDetailJsonModel detailMode;
	
	public void init(){
		try{
			if(attach_msg != null && attach_msg.length() > 0){
				detailMode = JsonUtil.parseJsonObject(attach_msg, NoticeDetailJsonModel.class);
			}
		}catch (Exception e) {
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGame_type() {
		return game_type;
	}

	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public int getPlay_type() {
		return play_type;
	}

	public void setPlay_type(int play_type) {
		this.play_type = play_type;
	}

	public Date getTask_excute_time() {
		return task_excute_time;
	}

	public void setTask_excute_time(Date task_excute_time) {
		this.task_excute_time = task_excute_time;
	}

	public int getTrigger_type() {
		return trigger_type;
	}

	public void setTrigger_type(int trigger_type) {
		this.trigger_type = trigger_type;
	}

	public String getAttach_msg() {
		return attach_msg;
	}

	public void setAttach_msg(String attach_msg) {
		this.attach_msg = attach_msg;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public GameNoticeModel copy(){
		GameNoticeModel model = null;
		try{
			model = (GameNoticeModel) clone();
		}catch (Exception e) {
			model = null;
			System.err.println("game notice copy error !!");
		}
		return model;
	}

	public NoticeDetailJsonModel getDetailMode() {
		return detailMode;
	}
	
	public boolean isClose(){
		long now = System.currentTimeMillis();
		if(now > getEnd_time().getTime()){
			return true;
		}
		return false;
	}
	
}
