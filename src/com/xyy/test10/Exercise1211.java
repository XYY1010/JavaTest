package com.xyy.test10;

import javax.management.RuntimeErrorException;

class MyNewException3 extends Exception {
	private static final long serialVersionUID = 1L;
}

class MyNewException4 extends Exception {
	private static final long serialVersionUID = 1L;
}

public class Exercise1211 {

	public static void g() throws MyNewException3 {
		throw new MyNewException3();
	}
	
	public static void f() throws RuntimeException, MyNewException4 {
		try {
			try {
				g();
			}
			catch (MyNewException3 e) {
				// TODO: handle exception
				e.printStackTrace(System.out);
				throw new RuntimeException();
			}
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
			throw new MyNewException4();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
