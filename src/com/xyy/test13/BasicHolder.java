package com.xyy.test13;

public class BasicHolder<T> {

	T element;
	void set(T arg) { element = arg; }
	T get() { return element; }
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicHolder<String> bhs = new BasicHolder<String>();
		bhs.set("abc");
		bhs.f();
	}

}
