package com.xyy.test13;

class GenericBase<T> {

	private T element;
	public void set(T arg) { arg = element; }
	public T get() {
		return element;
	}
	
}

class Derived1<T> extends GenericBase<T> {
	
}

class Derived2 extends GenericBase {}	// No warning

// class Derived3 extends GenericBase<?>{}
// Strange error:
//	unexpected type found : ?
//	required: class or interface without bound

public class ErasureAndInheritance {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		d2.set(obj);	// Warning here!
	}

}
