package com.xyy.test13;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

	public final C third;
	
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		third = c;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
