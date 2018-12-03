package com.cai.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LimitQueue<E> implements Queue<E> {
	 /**
     * 队列长度，实例化类的时候指定 
     */
    private int limit;  
       
    Queue<E> queue = new LinkedList<E>();  
    
    Iterator<E> ite = null;
    
    private boolean isDirty = false;
    
    public LimitQueue(int limit){  
        this.limit = limit;  
    }  
       
    /**
     * 入队
     */
    @Override 
    public synchronized boolean offer(E e){  
        if(queue.size() >= limit){  
            //如果超出长度,入队时,先出队  
            queue.poll();  
        }
        isDirty = true;
        return queue.offer(e);  
    }  
       
    /**
     * 出队 
     */
    @Override 
    public synchronized E poll() {  
    	 isDirty = true;
        return queue.poll();  
    }  
       
       
    /**
     * 获取限制大小
     * 
     * @return
     * @author SHANHY
     * @date   2015年11月9日
     */
    public int getLimit(){  
        return limit;  
    }  
   
    @Override 
    public boolean add(E e) {  
    	throw new RuntimeException();
    }  
   
    @Override 
    public E element() {  
    	throw new RuntimeException();
    }  
   
    @Override 
    public E peek() {  
    	throw new RuntimeException();
    }  
   
    @Override 
    public boolean isEmpty() {  
        return queue.size() <=0;  
    }  
   
    @Override 
    public int size() {  
        return queue.size();  
    }  
   
    @Override 
    public E remove() {  
    	throw new RuntimeException();
    }  
   
    @Override 
    public boolean addAll(Collection<? extends E> c) {  
    	isDirty = true;
        return queue.addAll(c);  
    }  
   
    @Override 
    public synchronized void clear() {  
    	isDirty = true;
        queue.clear();  
    }  
   
    @Override 
    public boolean contains(Object o) {  
        return queue.contains(o);  
    }  
   
    @Override 
    public boolean containsAll(Collection<?> c) {  
        return queue.containsAll(c);  
    }  
   
    @Override 
    public synchronized Iterator<E> iterator() {  
    	if( isDirty || ite == null){
    		isDirty = false;
    		ite = new ArrayList<>(queue).iterator();  
    	}
        return ite;
    }  
   
    @Override 
    public boolean remove(Object o) {  
        return queue.remove(o);  
    }  
   
    @Override 
    public boolean removeAll(Collection<?> c) {  
        return queue.removeAll(c);  
    }  
   
    @Override 
    public boolean retainAll(Collection<?> c) {  
        return queue.retainAll(c);  
    }  
   
    @Override 
    public Object[] toArray() {  
        return queue.toArray();  
    }  
   
    @Override 
    public <E> E[] toArray(E[] a) {  
        return queue.toArray(a);  
    }  

}
