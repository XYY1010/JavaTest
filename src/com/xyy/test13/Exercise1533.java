package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

class FixedSizeStackTest<T> {
	private int index = 0;
	private List<Object> storage;
	public FixedSizeStackTest(int size) {
		storage = new ArrayList<Object>(size);
	}
	public void push(T item) { storage.add(item); }
	@SuppressWarnings("unchecked")
	public T pop() {
		return (T)storage.remove(storage.size() - 1);
	}
}

public class Exercise1533 {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedSizeStackTest<String> strings = new FixedSizeStackTest<String>(SIZE);
		for (String string : "A B C D E F G H I J".split(" ")) {
			strings.push(string);
		}
		for (int i = 0; i < SIZE; i++) {
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}

}
