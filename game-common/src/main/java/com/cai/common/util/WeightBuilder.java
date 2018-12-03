package com.cai.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright@2015-2016 Hunan Qisheng Network Technology Co. Ltd.[SHEN-ZHEN]
 * <p>
 * 权重类
 *
 * @author zhanglong 2018/9/10 14:38
 */
public class WeightBuilder<T> {

	/**
	 * 日志
	 */
	private static final Logger logger = LoggerFactory.getLogger(WeightBuilder.class);

	private Map<T, WeightData<T>> weightDatas = new HashMap<>();

	private int totalWeight = 0;

	/**
	 * <pre>
	 * 是否权重累加。
	 * 累加的意思是：假如有 2个data为 “test” 的值，他们的权重分别是1，2。那么累加的话，他们的权重合计是3。
	 * 不累加的情况：后面的权重会顶掉前面的。默认不累加。
	 * </pre>
	 */
	private boolean accumulation = false;

	private WeightBuilder(boolean accumulation) {
		this.accumulation = accumulation;
	}

	public static <T> WeightBuilder<T> newBuilder() {
		return new WeightBuilder<T>(false);
	}

	public static <T> WeightBuilder<T> newBuilder(boolean accumulation) {
		return new WeightBuilder<T>(accumulation);
	}

	/**
	 * 初始化权重信息
	 */
	public static WeightBuilder<Integer> initWeightBuilder(String str) {
		WeightBuilder<Integer> weightBuilder = WeightBuilder.newBuilder();
		int[][] arryInfo = StringSplitUtil.splitToInt2(str);
		for (int[] info : arryInfo) {
			weightBuilder.append(info[1], info[0]);
		}
		return weightBuilder;
	}

	/**
	 * @param weight
	 * @param data   应该唯一
	 * @return
	 */
	public WeightBuilder<T> append(int weight, T data) {
		if (accumulation) {
			WeightData<T> weightData = this.weightDatas.get(data);
			if (weightData != null) {
				weightData.setWeight(weightData.getWeight() + weight);
			} else {
				this.weightDatas.put(data, new WeightData<T>(weight, data));
			}
		} else {
			this.weightDatas.put(data, new WeightData<T>(weight, data));
		}
		return this;
	}

	/**
	 * 是否已经包含data
	 */
	public boolean isContainsData(T data) {
		return weightDatas.get(data) != null;
	}

	/**
	 * 计算，返回期望的Data。
	 */
	public T calculateAndGet() {
		calculate();
		return get();
	}

	/**
	 * 获取权重值列表
	 */
	public List<T> calculateAndGetGroup(int randomNum, boolean isRepeat) {
		List<T> l = new ArrayList<>();
		if (randomNum <= 0 || randomNum > this.weightDatas.size()) {
			logger.error("[WeightBuilder]randomNum illegality randomNum:{},sourcesNum:{}", randomNum, this.weightDatas.size());
			return l;
		}

		// 1， 如果传进来的和要获取的
		if (randomNum == this.weightDatas.size()) {
			Collection<WeightData<T>> datas = weightDatas.values();
			for (WeightData<T> data : datas)
				l.add(data.getData());
			return l;
		}

		// 2，按权重取到命中物品
		while (randomNum-- > 0) {
			T data = calculateAndGet();
			if (!isRepeat)
				this.weightDatas.remove(data);
			l.add(data);
		}
		return l;
	}

	/**
	 * 返回Data，不计算，注意：如果在上次get与这次调用之间有调用append，那么调用calculateAndGet
	 */
	public T get() {
		// 计算得到的结果
		T result = null;
		WeightData<T> weightData = null;
		int ranWeight = RandomUtil.next(1, totalWeight + 1);
		for (Map.Entry<T, WeightData<T>> entry : weightDatas.entrySet()) {
			weightData = entry.getValue();
			if (weightData.getMin() <= ranWeight && ranWeight <= weightData.getMax()) {
				result = weightData.getData();
				break;
			}
		}
		return result;
	}

	/**
	 * @param str            权重
	 * @param count          随机的个数
	 * @param isRemoveHadGet 是否移除已随机到的
	 * @return
	 */
	public static List<Integer> initAndGet(String str, int count, boolean isRemoveHadGet) {
		List<Integer> result = null;
		WeightBuilder<Integer> weightBuilder = initWeightBuilder(str);
		if (!weightBuilder.getWeightDatas().isEmpty()) {
			result = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				Integer t = weightBuilder.calculateAndGet();
				result.add(t);
				if (isRemoveHadGet)
					weightBuilder.remove(t);
			}
		}
		return result;
	}

	public static Integer initAndGetInt(String str) {
		Integer result = null;
		WeightBuilder<Integer> weightBuilder = initWeightBuilder(str);
		if (!weightBuilder.getWeightDatas().isEmpty()) {
			result = weightBuilder.calculateAndGet();
		}
		return result;
	}

	public Map<T, WeightData<T>> getWeightDatas() {
		return weightDatas;
	}

	public void setWeightDatas(Map<T, WeightData<T>> weightDatas) {
		this.weightDatas = weightDatas;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	/**
	 * 计算，返回期望的Data。
	 */
	public void calculate() {
		totalWeight = 0;
		WeightData<T> weightData = null;
		for (Map.Entry<T, WeightData<T>> entry : weightDatas.entrySet()) {
			weightData = entry.getValue();
			int minValue = totalWeight + 1;
			int maxValue = totalWeight + weightData.getWeight();
			weightData.setMin(minValue);
			weightData.setMax(maxValue);
			totalWeight = maxValue;
		}
	}

	/**
	 * @param id
	 */
	public void remove(T id) {
		this.weightDatas.remove(id);
	}

	/**
	 * 重置
	 */
	public void reset() {
		this.weightDatas.clear();
		totalWeight = 0;
	}

	/**
	 * 权重数据
	 *
	 * @param <T> 数据类型
	 */
	private static class WeightData<T> {
		/**
		 * 权重
		 */
		private int weight = 0;
		/**
		 *
		 */
		private T data;

		/**
		 * 下限
		 */
		private int min = 0;

		/**
		 * 上限
		 */
		private int max = 0;

		/**
		 * @param weight
		 * @param data
		 */
		WeightData(int weight, T data) {
			this.weight = weight;
			this.data = data;
		}

		/**
		 * @param min the min to set
		 */
		void setMin(int min) {
			this.min = min;
		}

		/**
		 * @param max the max to set
		 */
		void setMax(int max) {
			this.max = max;
		}

		/**
		 * @return the weight
		 */
		int getWeight() {
			return weight;
		}

		/**
		 * @return the data
		 */
		T getData() {
			return data;
		}

		/**
		 * @return the min
		 */
		int getMin() {
			return min;
		}

		/**
		 * @return the max
		 */
		int getMax() {
			return max;
		}

		/**
		 * @param weight the weight to set
		 */
		void setWeight(int weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "WeightData [weight=" + weight + ", data=" + data + ", min=" + min + ", max=" + max + "]";
		}
	}
}
