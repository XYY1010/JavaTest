package com.xyy.test8;

import static com.xyy.tools.Print.*;

class OuterClass {
	public void method() {
		Exercise105 ex = new Exercise105();
		Exercise105.PrintClass p = ex.new PrintClass();
		p.printFunc();
	}
}

public class Exercise105 {
	
	class PrintClass {
		public void printFunc(){
			print("PrintClass.printFunc()");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerClass = new OuterClass();
		outerClass.method();
	}

}
