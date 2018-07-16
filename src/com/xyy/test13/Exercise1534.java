package com.xyy.test13;

abstract class ATest<T extends ATest<T>> {
	abstract T f(T t);
	T g(T t) { return f(t); }
}

class BTest extends ATest<BTest> {

	@Override
	BTest f(BTest t) {
		// TODO Auto-generated method stub
		return t;
	}
	
}

public class Exercise1534 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTest b = new BTest();
		b.f(new BTest());
	}

}
