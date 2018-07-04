package com.xyy.test13;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
	
	public final E fifth;
	
	public FiveTuple(A a, B b, C c, D d, E e) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
		fifth = e;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " +  third + ", " + fourth + ", " + fifth + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
