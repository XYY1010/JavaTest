package com.xyy.test13;

public class NotSelfBounded<T> {

	T element;
	public NotSelfBounded<T> set(T arg) {
		// TODO Auto-generated constructor stub
		element = arg;
		return this;
	}
	T get() { return element; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A2 extends NotSelfBounded<A2> {}
class B2 extends NotSelfBounded<A2> {}

class C2 extends NotSelfBounded<C2> {
	C2 setAndGet(C2 arg) { set(arg); return get(); }
}
class D2 {}
//Now this is OK:
class E2 extends NotSelfBounded<D2> {}
