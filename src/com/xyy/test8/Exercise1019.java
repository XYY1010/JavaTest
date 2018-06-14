package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Exercise1019 {

	static class Inner {
		public void printFunc() {
			print("level1");
		}
		static class Inner1 {
			public void printFunc1() {
				print("level2");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner inner = new Inner();
		inner.printFunc();
		Inner.Inner1 inner1 = new Inner.Inner1();
		inner1.printFunc1();
	}

}
