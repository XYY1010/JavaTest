package com.xyy.test5;

class WithFinalMethod {
	final void f() {}
}

public class Exercise721 extends WithFinalMethod {
	// Cannot override the final method from WithFinalMethod
	//void f(){}
}
