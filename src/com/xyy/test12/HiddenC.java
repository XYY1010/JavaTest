package com.xyy.test12;

import static com.xyy.tools.Print.*;

class C implements A {
	public void f() { print("public C.f()"); }
	public void g() { print("public C.g()"); }
	void u() { print("package C.u()"); }
	protected void v() {
		print("protected C.v()");
	}
	protected void w() {
		print("protected C.w()");
	}
}

public class HiddenC {

	public static A makeA() { return new C(); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = makeA();
		a.f();
		C c = (C) a;
		c.f();
		c.g();
		c.w();
		c.v();
	}

}
