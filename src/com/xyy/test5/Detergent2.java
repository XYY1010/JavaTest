package com.xyy.test5;

import static com.xyy.tools.Print.*;

class A1{
	A1(int i) { print("A1 constructor" + i); }
}

class B1{
	B1(int i) { print("B1 constructor" + i); }
}

class C1 extends A1{
	C1(int i){
		super(i);
		B1 b = new B1(11);
	}
}

public class Detergent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1(110);
	}

}
