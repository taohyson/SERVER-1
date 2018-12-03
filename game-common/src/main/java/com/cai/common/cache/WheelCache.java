package com.cai.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class WheelCache<K, V>{
	
	private final int TIME_UNIT = 60; 
	private Map<K, Node<K,V>> cacheMap = null;
	private List<Set<Node<K,V>>> wheelList = null;
	
	private int staleTime = 1;  //过期时间(单位为分钟)
	private int curIndex = 0;
	ReentrantReadWriteLock readWriteLock = null;
	ReadLock readLock = null;
	WriteLock writeLock = null;
	
	public WheelCache(int staleTime){
		this.staleTime = staleTime;
		this.readWriteLock = new ReentrantReadWriteLock();
		this.readLock = this.readWriteLock.readLock();
		this.writeLock = this.readWriteLock.writeLock();
		this.cacheMap = new HashMap<K, Node<K,V>>();
		Set<Node<K,V>> valueSet = null;
		this.wheelList = new ArrayList<Set<Node<K,V>>>();
		for(int index=0;index<=TIME_UNIT;index++){
			valueSet = new HashSet<Node<K,V>>();
			wheelList.add(valueSet);
		}
	}
	
	/**
	 * @param staleTime 失效时间(单位分钟)
	 */
	public WheelCache(){
		this(1);
	}
	
	public void addValue(K key,V value){
		writeLock.lock();
		try{
			removeValue0(key);
			
			Node<K,V> node = new Node<K,V>(key,value, staleTime);
			addWheelSet(node);
			addWheelCache(node);
		}catch(Exception e){
		}finally{
			writeLock.unlock();
		}
	}
	
	public V getValue(K key){
		V value = null;
		Node<K,V> node = null;
		readLock.lock();
		try{
			node = cacheMap.get(key);
			if(node != null){
				removeWheelSet(node);
				addWheelSet(node);
				value = node.getValue();
			}
		}catch(Exception e){
		}finally{
			readLock.unlock();
		}
		return value;
	}
	
	public boolean isContain(K key){
		boolean isCon = false;
		readLock.lock();
		try{
			Node<K,V> node = cacheMap.get(key);
			if(node != null){
				removeWheelSet(node);
				addWheelSet(node);
				isCon = true;
			}
		}catch(Exception e){
		}finally{
			readLock.unlock();
		}
		return isCon;
	}
	
	public void removeValue(K key){
		writeLock.lock();
		try{
			removeValue0(key);
		}catch(Exception e){
		}finally{
			writeLock.unlock();
		}
	}
	
	private void removeValue0(K key){
		if(!cacheMap.containsKey(key)){
			return;
		}
		Node<K,V> node = cacheMap.get(key);
		removeWheelSet(node);
		removeWheelCache(node);
	}
	
	public int clearWheelAndNum(){
		List<V> clearList = clearWheel();
		int size = clearList.size();
		return size;
	}
	
	public List<V> clearWheel(){
		List<V> clearList = new ArrayList<V>();
		readLock.lock();
		try{
			List<Node<K,V>> list = getWheelStaleList();
			clearList = clearWheel0(list);
			addCurIndex();
		}catch(Exception e){
		}finally{
			readLock.unlock();
		}
		return clearList;
	}
	
	public List<K> getAllKeys(){
		List<K> list = null;
		readLock.lock();
		try{
			list = new ArrayList<K>();
			list.addAll(cacheMap.keySet());
		}catch(Exception e){
		}finally{
			readLock.unlock();
		}
		return list;
	}
	
	public List<V> getAllValues(){
		List<V> list = null;
		readLock.lock();
		try{
			list = new ArrayList<V>();
			V v = null;
			for(Node<K,V> node : cacheMap.values()){
				v = node.getValue();
				list.add(v);
			}
		}catch(Exception e){
		}finally{
			readLock.unlock();
		}
		return list;
	}
	
	public int size() {
		List<K> list = getAllKeys();
		int size = list.size();
		return size;
	}
	
	public void clearAllValue(){
		cacheMap.clear();
		wheelList.clear();
	}
	
	private List<V> clearWheel0(List<Node<K,V>> list){
		List<V> clearList = new ArrayList<V>();
		for(Node<K,V> node : list){
			removeWheelSet(node);
			removeWheelCache(node);
			clearList.add(node.getValue());
		}
		return clearList;
	}
	
	private List<Node<K,V>> getWheelStaleList(){
		int index = getCurIndex();
		Set<Node<K,V>> set = getSetByIndex(index);
		List<Node<K,V>> list = new ArrayList<Node<K,V>>();
		for(Node<K,V> node : set){
			node.decreaseStaleTime();
			if(node.isStale()){
				list.add(node);
			}
		}
		return list;
	}
	
	private int getCurIndex(){
		return curIndex;
	}
	
	private void addCurIndex(){
		curIndex++;
		if(curIndex > TIME_UNIT){
			curIndex = 0;
		}
	}
	
	private int getLastIndex(){
		int index = curIndex - 1;
		if(index < 0){
			index = TIME_UNIT;
		}
		return index;
	}
	
	private Set<Node<K,V>> getSetByIndex(int index){
		Set<Node<K,V>> set = wheelList.get(index);
		return set;
	}
	
	private void addWheelCache(Node<K,V> node){
		if(node == null){
			return;
		}
		cacheMap.put(node.getKey(), node);
	}
	
	private void removeWheelCache(Node<K,V> node){
		if(node == null){
			return;
		}
		K key = node.getKey();
		if(cacheMap.containsKey(key)){
			cacheMap.remove(key);
		}
	}
	
	private void removeWheelSet(Node<K,V> node){
		if(node == null){
			return;
		}
		int wIndex = node.getWheelIndex();
		Set<Node<K,V>> set = getSetByIndex(wIndex);
		if(set.contains(node)){
			set.remove(node);
		}
	}
	
	private void addWheelSet(Node<K,V> node){
		if(node == null){
			return;
		}
		int lastIndex = getLastIndex();
		Set<Node<K,V>> set = getSetByIndex(lastIndex);
		set.add(node);
		node.setWheelIndex(lastIndex);
		node.updateStaleTime();
	}
	
	public static class Node<K,V>{
		private K key;
		private V value;
		private int staleTime;
		private int maxStaleTime;
		private int wheelIndex;
		
		public Node(K key,V value,int staleTime){
			this.key = key;
			this.value = value;
			this.staleTime = staleTime;
			this.maxStaleTime = staleTime;
		}

		public int getWheelIndex() {
			return wheelIndex;
		}

		public void setWheelIndex(int wheelIndex) {
			this.wheelIndex = wheelIndex;
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public int getStaleTime() {
			return staleTime;
		}

		public void updateStaleTime() {
			this.staleTime = maxStaleTime;
		}
		
		public void decreaseStaleTime() {
			this.staleTime --;
		}
		
		public boolean isStale(){
			if(this.staleTime <= 0){
				return true;
			}
			return false;
		}
		
		public String printInfo(){
			StringBuffer sb = new StringBuffer();
			sb.append("key=").append(key).append(",");
			sb.append("staleTime=").append(staleTime).append(",");
			sb.append("wheelIndex=").append(wheelIndex);
			return sb.toString();
		}
	}
	
}
