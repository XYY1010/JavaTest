package com.xyy.test10;

import java.util.ArrayList;

import static com.xyy.tools.Print.*;

class ExceptionThrow extends Exception {
	private String s;
	public ExceptionThrow(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		this.s = s;
	}
	public void f() {
		print("s = " + s);
	}
}

public class Exercise128 {

	public static void f() throws ExceptionThrow {
		throw new ExceptionThrow("Java");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			print(e.getMessage());
			e.printStackTrace();
		}
	}

}
