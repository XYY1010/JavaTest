package com.xyy.test13;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleQueue<T> implements Iterable<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void add(T t) { storage.offer(t); }
	public T get() { return storage.poll(); }
	public Iterator<T> iterator() {
		return storage.iterator();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
