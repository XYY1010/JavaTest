package com.xyy.test10;

class MyNewException1 extends Exception {
	private static final long serialVersionUID = 1L;
}

class MyNewException2 extends Exception {
	private static final long serialVersionUID = 1L;
}

public class Exercise1210 {
 
	public static void g() throws MyNewException1 {
		throw new MyNewException1();
	}
	
	public static void f() throws MyNewException2 {
		try {
			g();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
			throw new MyNewException2();
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
