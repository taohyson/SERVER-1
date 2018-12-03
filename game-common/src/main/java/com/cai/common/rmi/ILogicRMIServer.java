package com.cai.common.rmi;

import java.util.List;
import java.util.Map;

import com.cai.common.domain.LogicRoomInfo;
import com.cai.common.domain.LogicStatusModel;
import com.cai.common.domain.RmiDTO;
import com.cai.common.util.DescParams;

public interface ILogicRMIServer extends IRMIServer {

	public String sayHello();

	public Long getCurDate();

	/**
	 * 状态
	 * 
	 * @return
	 */
	public LogicStatusModel getLogicStatus();

	/**
	 * 测试是否通
	 * 
	 * @return
	 */
	public boolean test();

	/**
	 * 后台测试牌型
	 * 
	 * @param cards
	 */
	public String testCard(String cards);

	public boolean createRobotRoom(long accountID, int roomID, int game_type_index, int game_rule_index, int game_round, String nickName,
			String groupID, String groupName, int isInner);

	public boolean createRoomByBobotExtend(long accountID, int roomID, int game_type_index, int game_rule_index, int game_round, String nickName,
			String groupID, String groupName, int isInner, int exRule, int fanshu, int baseScore, int gangScore, int ciScore,int WcTimes);
	public boolean createRoomByBobotExtend(long accountID, int roomID, int game_type_index, int game_rule_index, int game_round, String nickName,
			String groupID, String groupName, int isInner, int exRule, int fanshu, int baseScore, int gangScore, int ciScore);
	public boolean createRoomByBobotExtend(long accountID, int roomID, int game_type_index, int game_round, String nickName,
			String groupID, String groupName, int isInner, Map<Integer,Integer> map);
	
	public String getGameDesc(DescParams descParams);

	public RmiDTO getGameDescAndPeopleNumber(DescParams descParams);
	
	

	/**
	 * 
	 * @param cmd
	 *            协议id
	 * @param message
	 *            消息体
	 * @return
	 */
	<T, R> R rmiInvoke(final int cmd, T message);
	
	
	
	public List<LogicRoomInfo> getLogicRoomInfos();
	
	public LogicRoomInfo getLogicRoomInfo(int roomID);

}
