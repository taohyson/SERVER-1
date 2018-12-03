package com.cai.common.domain.activity.dice;

import java.io.Serializable;

/**
 * 骰子活动网格布局
 * @author chansonyan
 * 2018年11月23日
 */
public class DiceGridModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;

	private int dice_activity_id;
	
	private int grid;
	
	private int grid_type;
	
	private String grid_icon;
	
	private int grid_mission;
	
	private int is_show_remain;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDice_activity_id() {
		return dice_activity_id;
	}

	public void setDice_activity_id(int dice_activity_id) {
		this.dice_activity_id = dice_activity_id;
	}

	public int getGrid() {
		return grid;
	}

	public void setGrid(int grid) {
		this.grid = grid;
	}

	public int getGrid_type() {
		return grid_type;
	}

	public void setGrid_type(int grid_type) {
		this.grid_type = grid_type;
	}

	public String getGrid_icon() {
		return grid_icon;
	}

	public void setGrid_icon(String grid_icon) {
		this.grid_icon = grid_icon;
	}

	public int getGrid_mission() {
		return grid_mission;
	}

	public void setGrid_mission(int grid_mission) {
		this.grid_mission = grid_mission;
	}

	public int getIs_show_remain() {
		return is_show_remain;
	}

	public void setIs_show_remain(int is_show_remain) {
		this.is_show_remain = is_show_remain;
	}
	
}
