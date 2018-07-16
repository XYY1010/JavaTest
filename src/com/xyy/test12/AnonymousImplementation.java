package com.xyy.test12;

import static com.xyy.tools.Print.*;

import com.xyy.example.HiddenImplementation;

class AnonymousA {
	public static A makeA() {
		return new A() {
			public void f() { print("public C.f()"); }
			public void g() { print("public C.h()"); }
			void u() { print("package C.u()"); }
			protected void v() { print("protected C.v()"); }
			protected void w() { print("protected C.w()"); }
		};
	}
}

public class AnonymousImplementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A a = AnonymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Reflection still gets into the anonymous class:
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
		
	}

}
