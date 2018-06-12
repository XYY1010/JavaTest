package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Based {
	public void component(int i) {
		print("component(int)");
	}
	public void component(float f) {
		print("component(float)");
	}
	public void component(char c) {
		print("component(char)");
	}
}

class Derive extends Based {
	public void component(String s){
		print("component(String)");
	}
}

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derive derive = new Derive();
		derive.component(1);
		derive.component(1.1f);
		derive.component('a');
		derive.component("string");
	}

}
