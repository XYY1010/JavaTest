package com.xyy.test12;

class B implements A {
	public void f() {}
	public void g() {}
}

public class InterfaceViolation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.f();
		//a.g(); //Compile error
		System.out.println(a.getClass().getSimpleName());
		if (a instanceof B) {
			B b = (B) a;
			b.g();
		}
	}

}
