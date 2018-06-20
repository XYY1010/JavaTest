package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class WhoCalled {

	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			for (StackTraceElement ste : e.getStackTrace()) {
				print(ste.getMethodName());
			}
		}
	}
	
	static void g() { f(); }
	static void h() { g(); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		print("--------------------------------");
		g();
		print("--------------------------------");
		h();
	}

}
