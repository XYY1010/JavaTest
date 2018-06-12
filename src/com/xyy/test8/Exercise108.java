package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Exercise108 {

	class Inner {
		private void printFunc() {
			print("Inner.printFunc");
		}
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise108 exercise108 = new Exercise108();
		Inner inner = exercise108.getInner();
		inner.printFunc();
	}

}
