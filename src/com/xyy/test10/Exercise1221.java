package com.xyy.test10;

import static com.xyy.tools.Print.*;

class Base1 {
	public Base1() throws Exception {
		throw new Exception("Base1 construction");
	}
}

class Derived1 extends Base1 {
	public Derived1() throws Exception {
		super();
		throw new Exception("Derived1 construction");
	}
}

public class Exercise1221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Derived1 d = new Derived1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
