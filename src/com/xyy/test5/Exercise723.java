package com.xyy.test5;

import static com.xyy.tools.Print.*;

class LoadTest {
	static {
		print("Loading LoadTest");
	}
	static void staticMember(){}
}

public class Exercise723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Creating an object");
		new LoadTest();
		print("Calling static member");
		LoadTest.staticMember();
	}

}
