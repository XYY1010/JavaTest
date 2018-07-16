package com.xyy.test10;

import static com.xyy.tools.Print.*;

class A extends Exception {
	public void f() throws Exception {
		throw new Exception();
	}
}

class B extends A {
	public void f() throws NullPointerException {
		throw new NullPointerException();
	}
}

class C extends B {
	public void f() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
}

public class Exercise1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		try {
			a.f();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
