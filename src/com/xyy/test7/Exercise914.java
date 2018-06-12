package com.xyy.test7;

import static com.xyy.tools.Print.*;

interface InterfaceA {
	void a();
	void b();
}

interface InterfaceB {
	void c();
	void d();
}

interface InterfaceC {
	void e();
	void f();
}

interface InterfaceD extends InterfaceA, InterfaceB, InterfaceC {
	void g();
}

class Test {
	public void printFuc() { print("Concrete Class"); }
}

class AchieveClass extends Test implements InterfaceD {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		print("a()");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		print("b()");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		print("c()");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		print("d()");
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		print("e()");
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		print("f()");
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		print("g()");
	}
	
}

public class Exercise914 {
	
	public static void u(InterfaceA ia) {
		ia.a();
		ia.b();
	}
	
	public static void v(InterfaceB ib) {
		ib.c();
		ib.d();
	}
	
	public static void w(InterfaceC ic) {
		ic.e();
		ic.f();
	}
	
	public static void x(InterfaceD id) {
		id.g();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AchieveClass achieveClass = new AchieveClass();
		u(achieveClass);
		v(achieveClass);
		w(achieveClass);
		x(achieveClass);
	}

}
