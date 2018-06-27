package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class ExceptionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			// TODO: handle exception
			print("Caught Exception");
			print("getMessage(): " + e.getMessage());
			print("getLocalizedMessage(): " + e.getLocalizedMessage());
			print("toString(): " + e);
			print("printStackTrace(): ");
			e.printStackTrace(System.out);
		}
	}

}
