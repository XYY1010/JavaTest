package com.xyy.test5;

import static com.xyy.tools.Print.*;

class A{
	A(){ print("A Constructor"); }
}

class B{
	B(){ print("B Constructor"); }
}

class C extends A{
	B b = new B();
}

public class Detergent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
