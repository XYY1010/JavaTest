package com.xyy.test13;

class Other {}
class BasicOther extends BasicHolder<Other> {}

public class Unconstrained {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicOther b = new BasicOther(), b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}

}
