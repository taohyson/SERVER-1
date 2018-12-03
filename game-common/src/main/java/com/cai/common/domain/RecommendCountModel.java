package com.cai.common.domain;

import java.util.Date;

/**
 * 统计结果model
 * @author tang
 *
 */
public class RecommendCountModel implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long accountId;
	private long down_recharge_total;//直属代理总充值
	
	private long self_recharge_total;//推广员本身总充值
	
	private long sub_recharge_total;//下级推广员总充值
	
	private long sub_other_total;//下级推广员带来的总充值
	
	private long down_receive_total;//直属代理返利
	
	private long sub_receive_total;//下级推广员带来的返利
	
	private long total_income;//累计总充值
	
	private long total_receive;//累计总返利
	
	private long total_draw_cash;//累计提现
	
	private long remain_cash;//剩余返利
	
	private String nickeName;
	
	private int recommendLevel ;//推广员级别
	
	private Date create_time;//成为推广员时间
	
	private int promoter;
	private int proxy;
	private int newPromoter;
	private int newProxy;
	private int paybackReceive;//退返利
	private int paybackRecharge;//退单金额
	private int promoterOpenAgent;//推广员开通代理数（包括直属代理与下级推广员）
	
	public int getPromoter() {
		return promoter;
	}

	public void setPromoter(int promoter) {
		this.promoter = promoter;
	}

	public int getProxy() {
		return proxy;
	}

	public void setProxy(int proxy) {
		this.proxy = proxy;
	}

	public int getNewPromoter() {
		return newPromoter;
	}

	public void setNewPromoter(int newPromoter) {
		this.newPromoter = newPromoter;
	}

	public int getNewProxy() {
		return newProxy;
	}

	public void setNewProxy(int newProxy) {
		this.newProxy = newProxy;
	}

	public long getSub_other_total() {
		return sub_other_total;
	}

	public void setSub_other_total(long sub_other_total) {
		this.sub_other_total = sub_other_total;
	}

	public int getRecommendLevel() {
		return recommendLevel;
	}

	public void setRecommendLevel(int recommendLevel) {
		this.recommendLevel = recommendLevel;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getNickeName() {
		return nickeName;
	}

	public void setNickeName(String nickeName) {
		this.nickeName = nickeName;
	}

	public long getDown_receive_total() {
		return down_receive_total;
	}

	public void setDown_receive_total(long down_receive_total) {
		this.down_receive_total = down_receive_total;
	}

	public long getSub_receive_total() {
		return sub_receive_total;
	}

	public void setSub_receive_total(long sub_receive_total) {
		this.sub_receive_total = sub_receive_total;
	}

	public long getDown_recharge_total() {
		return down_recharge_total;
	}

	public void setDown_recharge_total(long down_recharge_total) {
		this.down_recharge_total = down_recharge_total;
	}

	public long getSelf_recharge_total() {
		return self_recharge_total;
	}

	public void setSelf_recharge_total(long self_recharge_total) {
		this.self_recharge_total = self_recharge_total;
	}

	public long getSub_recharge_total() {
		return sub_recharge_total;
	}

	public void setSub_recharge_total(long sub_recharge_total) {
		this.sub_recharge_total = sub_recharge_total;
	}

	public long getTotal_receive() {
		return total_receive;
	}

	public void setTotal_receive(long total_receive) {
		this.total_receive = total_receive;
	}

	public long getTotal_draw_cash() {
		return total_draw_cash;
	}

	public void setTotal_draw_cash(long total_draw_cash) {
		this.total_draw_cash = total_draw_cash;
	}

	public long getRemain_cash() {
		return remain_cash;
	}

	public void setRemain_cash(long remain_cash) {
		this.remain_cash = remain_cash;
	}

	public long getTotal_income() {
		return total_income;
	}

	public void setTotal_income(long total_income) {
		this.total_income = total_income;
	}

	public int getPaybackReceive() {
		return paybackReceive;
	}

	public void setPaybackReceive(int paybackReceive) {
		this.paybackReceive = paybackReceive;
	}

	public int getPaybackRecharge() {
		return paybackRecharge;
	}

	public void setPaybackRecharge(int paybackRecharge) {
		this.paybackRecharge = paybackRecharge;
	}

	public int getPromoterOpenAgent() {
		return promoterOpenAgent;
	}

	public void setPromoterOpenAgent(int promoterOpenAgent) {
		this.promoterOpenAgent = promoterOpenAgent;
	}
	
}
