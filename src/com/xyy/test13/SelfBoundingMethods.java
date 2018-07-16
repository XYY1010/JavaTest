package com.xyy.test13;

public class SelfBoundingMethods {

	static <T extends SelfBounded<T>> T f(T arg) {
		return arg.set(arg).get();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = f(new A());
	}

}
