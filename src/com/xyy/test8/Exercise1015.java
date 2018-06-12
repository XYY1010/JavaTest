package com.xyy.test8;

import static com.xyy.tools.Print.*;

class Class1 {
	private String str = "";
	public Class1(String str) {
		this.str = str;
	}
	public void f() {
		print("extends " + str);
	}
}

class Class2 {
	public Class1 getClass1(String str) {
		return new Class1(str);
	}
}


public class Exercise1015 {
	
	public Class1 getClass1(String str) {
		return new Class1(str) {
			public void f() {
				print("extends " + str);
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1015 exercise1015 = new Exercise1015();
		exercise1015.getClass1("Class1").f();
	}

}
