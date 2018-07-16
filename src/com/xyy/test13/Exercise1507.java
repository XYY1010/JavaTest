package com.xyy.test13;

import java.util.Iterator;

public class Exercise1507 implements Iterable<Integer> {

	private int n;
	private int cnt = 0;
	public Exercise1507(int count) {
		// TODO Auto-generated constructor stub
		this.n = count;
	}
	
	private int fib(int i) {
		if (i < 2) {
			return 1;
		}
		return fib(i - 1) + fib(i - 2);
	}
	
	public Integer next() {
		return fib(cnt++);
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n > 0;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return Exercise1507.this.next();
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i : new Exercise1507(18)) {
			System.out.print(i + " ");
		}
	}
}
