package com.xyy.test10;

import static com.xyy.tools.Print.*;
class ThreeException extends Exception {}

public class FinallyWorks {
	
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			try {
				if (count++ == 0) {
					throw new ThreeException();
				}
				print("No exception");
			} catch (ThreeException e) {
				// TODO: handle exception
				print("ThreeException");
			} finally {
				print("In finally clause");
				if (count == 2) {
					break;
				}
			}
		}
	}

}
