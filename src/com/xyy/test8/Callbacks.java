package com.xyy.test8;

import static com.xyy.tools.Print.*;

interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;
	public void increment() {
		i++;
		print(i);
	}
}

class MyIncrement {
	public void increment() { print("Other operation"); }
	static void f(MyIncrement mi) { mi.increment(); }
}

// If your class must implement increment() in
// some other way, you must use an inner class:
class Callee2 extends MyIncrement {
	private int i = 0;
	public void increment() {
		super.increment();
		i++;
		print(i);
	}
	private class Closure implements Incrementable {
		public void increment() {
			// 一定要指明是外部类的increment()方法，否则
			// 将会无限递归循环
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller {
	private Incrementable callbackReference;
	Caller(Incrementable cbh) { callbackReference = cbh; }
	void go() { callbackReference.increment(); }
}

public class Callbacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}

}
