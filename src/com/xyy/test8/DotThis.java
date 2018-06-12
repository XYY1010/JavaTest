package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class DotThis {
	void f() { 
		print("DotThis.f()");
	}
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain "this" would be Inner's "this"
		}
	}
	public Inner inner() {
		return new Inner();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}

}
