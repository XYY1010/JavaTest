package com.xyy.test12;

import static com.xyy.tools.Print.*;

import com.xyy.example.HiddenImplementation;

class InnerA {
	private static class C implements A {
		public void f() { print("public C.f()"); }
		public void g() { print("public C.g()"); }
		void u() { print("package C.u()"); }
		protected void v() { print("protected C.v()"); }
		protected void w() { print("private C.w()"); }
	}
	public static A makeA() { return new C(); }
}

public class InnerImplementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Reflection still get into the private class:
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}

}
