package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class Rethrowing {

	public static void f() throws Exception {
		print("Originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			print("Inside g().e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			print("Inside h().e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		} catch (Exception e) {
			// TODO: handle exception
			print("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			// TODO: handle exception
			print("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}
