package com.xyy.test10;

import static com.xyy.tools.Print.*;

class FourException extends Exception {}

public class AlwaysFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Entering first try block");
		try {
			print("Entering second try block");
			try {
				throw new FourException();
			} finally {
				print("finally in 2nd try block");
			}
		} catch (FourException e) {
			// TODO: handle exception
			print("Caught FourException in 1st try block");
		} finally {
			print("finally in 1st try block");
		}
	}

}