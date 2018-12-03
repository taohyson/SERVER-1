package com.cai.common.domain;

/**
 * @author wu_hc date: 2018年08月10日 下午4:13:27 <br/>
 */
public final class CoinExciteModel extends DBBaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 条件id
	 */
	private int id;

	/**
	 * 触发类型(1起手 3结束),一般只有起手和结束触发,中途只是上报过程
	 */
	private int triggerType;

	/**
	 * 类型Id，对应card_category的id，CardCategoryModel#id
	 */
	private int categoryId;

	/**
	 * 可变参数1()
	 */
	private int var1;

	/**
	 * 可变参数2
	 */
	private int var2;

	/**
	 * 产出数值
	 */
	private int output;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 所属类型1特殊玩法 2聚宝盆
	 */
	private int belong;

	/**
	 * 场次类型限制,0无限制,1初级场,2中级场,3高级场,4刺激场
	 */
	private int roundLevel;

	/**
	 * 产出类型1百分比2实际数值
	 */
	private int outputType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(int triggerType) {
		this.triggerType = triggerType;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBelong() {
		return belong;
	}

	public void setBelong(int belong) {
		this.belong = belong;
	}

	public int getRoundLevel() {
		return roundLevel;
	}

	public void setRoundLevel(int roundLevel) {
		this.roundLevel = roundLevel;
	}

	public int getOutputType() {
		return outputType;
	}

	public void setOutputType(int outputType) {
		this.outputType = outputType;
	}
}
