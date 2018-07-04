package com.xyy.test13;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

	public final D fourth;
	
	public FourTuple(A a, B b, C c, D d) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
		fourth = d;
	}

	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ")";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
