package com.xyy.test5;

import static com.xyy.tools.Print.*;

class WithFinals {
	private final void f() { print("WithFinals.f()"); }
	private void g() { print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}
	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}
	public void g() {
		print("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods:
		//! op.f();
		//! op.g();
		// same here:
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
	}

}
