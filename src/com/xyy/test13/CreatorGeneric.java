package com.xyy.test13;

abstract class GenericWithCreate<T> {
	final T element;
	public GenericWithCreate() {
		// TODO Auto-generated constructor stub
		element = create();
	}
	abstract T create();
}

class X {}

class Creator extends GenericWithCreate<X> {

	@Override
	X create() {
		// TODO Auto-generated method stub
		return new X();
	}
	
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
	
}

public class CreatorGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator c = new Creator();
		c.f();
	}

}
