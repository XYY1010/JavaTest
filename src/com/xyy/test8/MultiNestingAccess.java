package com.xyy.test8;

class MNA {
	private void f() {}
	class A {
		private void g() {}
		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}


public class MultiNestingAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}

}
