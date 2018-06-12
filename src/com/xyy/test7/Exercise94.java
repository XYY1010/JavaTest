package com.xyy.test7;

import static com.xyy.tools.Print.*;

abstract class A {
	public abstract void printFuc(A a);
}

class C extends A {
	public void printFuc(A a) { 
		((C)a).printFuc(a);
	}
}

public class Exercise94 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
