package com.xyy.test6;

import static com.xyy.tools.Print.*;

public class PrivateOverride {

	private void f() { print("private f()"); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride po = new PrivateOverride();
		po.f();
	}

}

class Derived1 extends PrivateOverride {
	public void f() { print("public f()"); }
}
