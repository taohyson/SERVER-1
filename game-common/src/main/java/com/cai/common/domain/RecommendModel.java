package com.cai.common.domain;
/**
 * 推广员统计汇总
 * @author tang
 *
 */
public class RecommendModel {
	
	private long down_recharge_total;//推广员直属代理总充值
	
	private long self_recharge_total;//推广员本身总充值
	
	private long sub_recharge_total;//下级推广员总充值
	
	private long total_receive;//推广员总返利
	
	private int zs_num;//钻石推广员个数
	
	private int hj_num;//金推广员个数
	
	private int by_num;//白银推广员个数
	
	private int proxy_num;//直属代理个数
	
	private long draw_cash_total;//累计提现总额
	
	private long remain_cash_total;//剩余提现总额

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

	public long getTotal_receive() {
		return total_receive;
	}

	public void setTotal_receive(long total_receive) {
		this.total_receive = total_receive;
	}

	public long getSub_recharge_total() {
		return sub_recharge_total;
	}

	public void setSub_recharge_total(long sub_recharge_total) {
		this.sub_recharge_total = sub_recharge_total;
	}

	public int getZs_num() {
		return zs_num;
	}

	public void setZs_num(int zs_num) {
		this.zs_num = zs_num;
	}

	public int getHj_num() {
		return hj_num;
	}

	public void setHj_num(int hj_num) {
		this.hj_num = hj_num;
	}

	public int getBy_num() {
		return by_num;
	}

	public void setBy_num(int by_num) {
		this.by_num = by_num;
	}

	public int getProxy_num() {
		return proxy_num;
	}

	public void setProxy_num(int proxy_num) {
		this.proxy_num = proxy_num;
	}

	public long getDraw_cash_total() {
		return draw_cash_total;
	}

	public void setDraw_cash_total(long draw_cash_total) {
		this.draw_cash_total = draw_cash_total;
	}

	public long getRemain_cash_total() {
		return remain_cash_total;
	}

	public void setRemain_cash_total(long remain_cash_total) {
		this.remain_cash_total = remain_cash_total;
	}
	
	
}
