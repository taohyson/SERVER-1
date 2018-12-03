
package com.cai.common.util;

import java.io.Serializable;

/**
 * 
 * 
 * @author wu_hc
 */
public class Pair<First, Second> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private First first;
	private Second second;

	/**
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
		return new Pair<>(first, second);
	}

	private Pair(First first, Second second) {
		this.first = first;
		this.second = second;
	}

	public First getFirst() {
		return first;
	}

	public void setFirst(First first) {
		this.first = first;
	}

	public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Pair<First, Second> other = (Pair<First, Second>) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pair{" + "first=" + first + ", second=" + second + '}';
	}
}
