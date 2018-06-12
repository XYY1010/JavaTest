package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Useful {
	public void f() { print("Useful.f()"); }
	public void g() { print("Useful.g()"); }
}

class MoreUseful extends Useful {
	public void f() { print("MoreUseful.f()"); }
	public void g() { print("MoreUseful.g()"); }
	public void u() { print("MoreUseful.u()"); }
	public void v() {}
	public void w() {}
}

public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		//x[1].u();  基类中无u()方法，无法调用
		((MoreUseful)x[1]).u();	//向下转型
		//((MoreUseful)x[0]).u();	//抛出异常
	}

}
