package com.cai.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;

/**
 * 线下比赛桌子安排
 */
public class MatchTableModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupInfo;// 群组信息[{groupId:1,state:1},{groupId:2,state:1}]
	private int totalPersons;// 总人数
	private int personNum;// 每桌人数
	private String tables;// 桌子序号 [{min:1,max:2},{min:3,max:4}]
	private int size;// 桌子总数
	private int itemId;//参赛券id
	private int match_type;// 匹配类型 ，0随机配桌，1瑞士移位制
	private Date create_time;
	
	
	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(String groupInfo) {
		this.groupInfo = groupInfo;
	}

	public int getTotalPersons() {
		return totalPersons;
	}

	public void setTotalPersons(int totalPersons) {
		this.totalPersons = totalPersons;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getPersonNum() {
		return personNum;
	}

	public void setPersonNum(int personNum) {
		this.personNum = personNum;
	}

	public String getTables() {
		return tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMatch_type() {
		return match_type;
	}

	public void setMatch_type(int match_type) {
		this.match_type = match_type;
	}

	class Groups {
		private int groupId;
		private int state;

		public int getGroupId() {
			return groupId;
		}

		public void setGroupId(int groupId) {
			this.groupId = groupId;
		}

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

	}

	class Tables {
		private int min;
		private int max;

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}

	}

	class Seats {
		private int tableNum;
		private int seatNum;

		public int getTableNum() {
			return tableNum;
		}

		public void setTableNum(int tableNum) {
			this.tableNum = tableNum;
		}

		public int getSeatNum() {
			return seatNum;
		}

		public void setSeatNum(int seatNum) {
			this.seatNum = seatNum;
		}

	}

	// 组群筛选
	private List<Groups> groupList = new ArrayList<Groups>();
	// 牌桌安排，value为1到personNum;超过就不能处理
	private Map<Integer, Integer> tableMap = new ConcurrentHashMap<Integer, Integer>();

	public List<Groups> getGroupList() {
		return groupList;
	}
	//保存好桌子的配置后，给组群随机分配桌子
	public void dispatchTables(){
		if(groupList.size()==0){
			return;
		}
		for(Groups groups:groupList){
			MatchGroupModel group = MatchOffLineModel.groupMap.get(groups.getGroupId());
			if(group.getGroup_state()!=groups.getState()){
				//组群的状态跟分配桌子的状态不一致，不处理
				continue;
			}
			for(MatchPlayerModel model:MatchGroupModel.playerMap.values()){
				if(model.getCur_area()!=groups.getState()){
					//成员的状态跟分配桌子的状态不一致，不处理
					continue;
				}
				if(model.getSeat_state()==1){
					break;//当前群组此状态的座位已经分配过了，无需再分配
				}
				List<MatchUpgradeModel>  upmodelList = JSON.parseArray(model.getUpdate_state(),MatchUpgradeModel.class);
				MatchUpgradeModel upmodel = new MatchUpgradeModel();
				upmodelList.add(upmodel);
				Seats seat = getSeatByRandom();
				upmodel.setSeatNum(seat.getSeatNum());
				upmodel.setTableNum(seat.getTableNum());
				upmodel.setArea(group.getGroup_state());
				model.setSeat_state(1);//表示分配了座位
				model.setUpgradeList(upmodelList);
				model.setUpdate_state(JSON.toJSONString(upmodelList));
			}
		}
//		todo;//座位号更新数据库
	}
	
	public Seats getSeatByRandom() {
		Seats seat = new Seats();
		if (tableMap.size() == 0) {
			return seat;
		}
		for (Integer a : tableMap.keySet()) {
			int value = tableMap.get(a);
			seat.setTableNum(a);
			seat.setSeatNum(value);
			value = value + 1;
			if (value > personNum) {
				tableMap.remove(a);
			}else{
				tableMap.put(a, value);
			}
			return seat;
		}
		return seat;
	}

	public boolean initGroupTables() {
		if(totalPersons>size*personNum||totalPersons<=(size-1)*personNum){
			//桌子数不够,或者剩余桌子超过了一张
			return false;
		}
		try{
			if (StringUtils.isNotBlank(groupInfo)) {
				List<Groups> groupList = JSON.parseArray(groupInfo, Groups.class);
				this.groupList = groupList;
			}else{
				return false;
			}
			if (StringUtils.isNotBlank(tables)) {
				List<Tables> tableList = JSON.parseArray(tables, Tables.class);
				for (Tables table : tableList) {
					for (int i = table.getMin(); i <= table.getMax(); i++) {
						tableMap.put(i, 1);
					}
				}
			}else{
				return false;
			}
		}catch(Exception e){
			return false;
		}
		try{
			dispatchTables();
		}catch(Exception e){
			return false;
		}
		return true;
	}

}
