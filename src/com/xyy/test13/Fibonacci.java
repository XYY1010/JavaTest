package com.xyy.test13;

import com.xyy.tools.Generator;

public class Fibonacci implements Generator<Integer> {

	private int count = 0;
	
	private int fib(int n) {
		if (n < 2) {
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci gen = new Fibonacci();
		for (int i = 0; i < 10; i++) {
			System.out.print(gen.next() + " ");
		}
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}

}
