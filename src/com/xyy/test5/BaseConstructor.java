package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Base{
	public Base() { print("Base Constructor"); }
}

class Derived1 extends Base{
	public Derived1() { print("Derived1 Constructor"); }
}

class Derived2 extends Derived1{
	public Derived2() {
		print("Derived2 Constructor");
	}
}

public class BaseConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 derived2 = new Derived2();
	}

}
