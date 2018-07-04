package com.xyy.test13;

public class Exercise1509 {

	public <T, U, V> void f(T x, U y, V z) {
		System.out.println(x.getClass().getSimpleName() + " " + y.getClass().getSimpleName() + " " + z.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1509 e = new Exercise1509();
		e.f(1, 1.1f, e);
	}

}
