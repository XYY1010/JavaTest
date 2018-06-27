package com.xyy.test10;

import static com.xyy.tools.Print.*;

class OneException extends Exception {
	public OneException(String s) { super(s); }
}

class TwoException extends Exception {
	public TwoException(String s) { super(s); }
}

public class RethrowNew {

	public static void f() throws OneException {
		print("originating the exception in f()");
		throw new OneException("thrown from f()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				f();
			} catch (Exception e) {
				// TODO: handle exception
				print("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (Exception e) {
			// TODO: handle exception
			print("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}
