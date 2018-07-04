package com.xyy.test13;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	private int n;
	public IterableFibonacci(int count) {
		// TODO Auto-generated constructor stub
		this.n = count;
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
				return IterableFibonacci.this.next();
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i : new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}

	}

}
