package com.xyy.test13;

class FixedSizeStack<T> {
	private int index = 0;
	private Object[] storage;
	public FixedSizeStack(int size) {
		storage = new Object[size];
	}
	public void push(T item) { storage[index++] = item; }
	@SuppressWarnings("Unchecked")
	public T pop() { return (T)storage[--index]; }
}

public class GenericCast {
	public static final int SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);
		for (String string : "A B C D E F G H I J".split(" ")) {
			strings.push(string);
		}
		for (int i = 0; i < SIZE; i++) {
			String s = strings.pop();
			System.out.print(s + " ");
		}
	}

}
