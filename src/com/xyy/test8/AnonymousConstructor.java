package com.xyy.test8;

import static com.xyy.tools.Print.*;

abstract class Base {
	public Base(int i) {
		print("Base constructor, i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{ print("Inside instance initializer"); }
		public void f() {
			print("In anonymous f()");
		}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = getBase(47);
		base.f();
	}

}
