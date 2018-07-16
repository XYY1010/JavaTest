package com.xyy.test15;

import com.xyy.test13.*;

class TupleTest {
	public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
		return new TwoTuple<A, B>(a, b);
	}
	
	public static <A, B, C>  ThreeTuple<A, B, C> tuple(A a, B b, C c) {
		return new ThreeTuple<A, B, C>(a, b, c);
	}
	
	public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
		return new FourTuple<A, B, C, D>(a, b, c, d);
	}  
	
	public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
		return new FiveTuple<A, B, C, D, E>(a, b, c, d, e);
	}
	
	public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f) {
		return new SixTuple<A, B, C, D, E, F>(a, b, c, d, e, f);
	}
}

public class Exercise1728 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
