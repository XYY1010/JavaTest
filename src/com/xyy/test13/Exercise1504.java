package com.xyy.test13;

interface Selector<T> {
	boolean end();
	T current();
	void next();
}

class Sequence<T> {
	private T[] items;
	private int next = 0;
	public Sequence(int size) { items = (T[]) new Object[size]; }
	public void add(T x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector<T> implements Selector {

		private int i = 0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.length) {
				i++;
			}
		}
		
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
}

public class Exercise1504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence<Integer> sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(i);
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}

}
