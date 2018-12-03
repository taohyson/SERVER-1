package com.cai.common.util;

public class Tuple<K, V, T> {
	private K left;
	private V center;
	private T right;

	public Tuple() {

	}

	public Tuple(K _left, V _center, T _right) {
		left = _left;
		center = _center;
		right = _right;
	}

	public K getLeft() {
		return left;
	}

	public void setLeft(K left) {
		this.left = left;
	}

	public V getCenter() {
		return center;
	}

	public void setCenter(V center) {
		this.center = center;
	}

	public T getRight() {
		return right;
	}

	public void setRight(T right) {
		this.right = right;
	}
}
