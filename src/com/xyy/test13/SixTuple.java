package com.xyy.test13;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

	public final F sixth;
	
	public SixTuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		// TODO Auto-generated constructor stub
		sixth = f;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ", " +  fifth + ", " + sixth + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
