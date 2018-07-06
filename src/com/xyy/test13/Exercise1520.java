package com.xyy.test13;

import static com.xyy.tools.Print.*;

interface DoubleMethod {
	void f();
	void g();
}

class Achieve implements DoubleMethod {

	@Override
	public void f() {
		// TODO Auto-generated method stub
		print("Achieve.f()");
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		print("Achieve.g()");
	}
	
	public void h() {
		print("Achieve.h()");
	}
}

public class Exercise1520 {
	
	public static <T extends DoubleMethod> void k(T a) {
		a.f();
		a.g();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Achieve a = new Achieve();
		k(a);
	}

}
