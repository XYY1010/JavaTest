package com.xyy.test7;

import static com.xyy.tools.Print.*;

interface Interface1 {
	void a();
	void b();
}

interface Interface2 extends Interface1 {
	void c();
}

interface Interface3 extends Interface1 {
	void d();
}

interface Interface4 extends Interface2, Interface3 {
	void e();
}

class InterfaceClass implements Interface4 {
	@Override
	public void c() {
		// TODO Auto-generated method stub
		print("c()");
	}

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
	public void d() {
		// TODO Auto-generated method stub
		print("d()");
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		print("e()");
	}
	
}

public class Exercise913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.a();
		interfaceClass.c();
	}

	

}
