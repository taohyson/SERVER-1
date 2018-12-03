package com.cai.common.constant;

/**
 * 活动二级协议
 * @author demon 
 * date: 2018年1月22日 下午5:20:35 <br/>
 */
public interface TurntableCmd {
	public final static int C2S_GET_TURNTABLE_LIST = 0;	//加载正在生效的转盘活动
	public final static int C2S_GET_GET_INFO  = 1; // 获取活动基本信息
	public final static int C2S_GET_CONFIG = 2; // 获取活动配置
	public final static int C2S_GET_AWARD = 3; // 领取奖励
	public final static int C2S_GET_SELF_LOG = 4; // 查看个人获奖记录
	public final static int C2S_GET_LOG = 5; // 查看获奖记录
	public final static int C2S_TAKE_MISSION_REWARD = 10;	//领取任务奖励请求
	
	public final static int C2S_GET_TURNTABLE_RESPONSE = 0;	//加载正在生效的转盘活动响应
	public final static int S2C_SEND_INFO = 1;  // 基本信息
	public final static int S2C_SEND_CONFIG = 2; // 配置
	public final static int S2C_SEND_AWARD = 3; // 领奖反馈
	public final static int S2C_RED_POINT = 4;  // 红点
	public final static int S2C_GET_SELF_LOG = 5; // 查看个人获奖记录
	public final static int S2C_GET_LOG = 6; // 查看获奖记录
	public final static int S2C_CONFIG_CHANGE = 7; // 配置重加载
	public final static int S2C_NOTIFY_MISSION = 8;	//通知任务进度
	public final static int S2C_TAKE_MISSION_REWARD = 10;	//领取任务奖励响应
}
