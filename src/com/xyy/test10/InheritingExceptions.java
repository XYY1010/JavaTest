package com.xyy.test10;

import static com.xyy.tools.Print.*;

class SimpleException extends Exception {}

public class InheritingExceptions {

	public void f() throws SimpleException {
		print("Trow SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			// TODO: handle exception
			print("Caught it!");
		}
	}

}
