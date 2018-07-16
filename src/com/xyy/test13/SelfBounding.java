package com.xyy.test13;

class SelfBounded<T extends SelfBounded<T>> {
	T element;
	SelfBounded<T> set(T arg) {
		element = arg;
		return this;
	}
	T get() { return element; }
}

class A extends SelfBounded<A> {}
class B extends SelfBounded<A> {}	// Also OK

class C extends SelfBounded<C> {
	C SetAndGet(C arg) { set(arg); return get(); }
}

class D {}
// Can't do this:
// class E extends SelfBounded<D> {}
// Compile error: Type parameter D is not within its bound

// Alas, you can do this, so you can't force the idiom:
class F extends SelfBounded {}

public class SelfBounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.set(new A());
		a = a.set(new A()).get();
		a = a.get();
		C c = new C();
		c = c.SetAndGet(new C());
	}

}
