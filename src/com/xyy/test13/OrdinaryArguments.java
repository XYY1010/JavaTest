package com.xyy.test13;

class OrdinarySetter {
	void set(Base base) {
		System.out.println("OrdinarySetter.set(Base)");
	}
}

class DerivedSetter extends OrdinarySetter {
	void set(Derived derived) {
		System.out.println("DerivedSetter.set(Derived)");
	}
}

public class OrdinaryArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
		ds.set(derived);
		ds.set(base);	// Compiles: overloaded. not overridden!
	}

}
