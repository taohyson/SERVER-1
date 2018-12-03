package com.cai.common.domain;

/**
 * 比赛场
 */
public class MatchCmdModel extends DBBaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cmd;
	private boolean isMust;
	
	public MatchCmdModel(int cmd, boolean isMust){
		this.cmd = cmd;
		this.isMust = isMust;
	}
	
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public boolean isMust() {
		return isMust;
	}
	public void setMust(boolean isMust) {
		this.isMust = isMust;
	}
	
}
