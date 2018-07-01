package com.xyy.test10;

import static com.xyy.tools.Print.*;

class Exception1 extends Exception {
	private static final long serialVersionUID = 1L;
}
class Exception2 extends Exception {
	private static final long serialVersionUID = 1L;
}
class Exception3 extends Exception {
	private static final long serialVersionUID = 1L;
}

public class Exercise129 {
	
	public static void f(int n) throws Exception1, Exception2, Exception3 {
		if (n == 0) {
			throw new Exception1();
		}
		if (n == 1) {
			throw new Exception2();
		}
		if (n == 2) {
			throw new Exception3();
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			f(1);
		} catch (Exception e) {
			// TODO: handle exception
			if (e instanceof Exception1 || e instanceof Exception2 || e instanceof Exception3) {
				e.printStackTrace();
			} else {
				throw e;
			}
		}
	}

}
