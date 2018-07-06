package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class OnOffSwitch {

	private static Switch sw = new Switch();
	
	public static void f() throws OnOffException1, OnOffException2 {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			f();
			sw.off();
			//throw new RuntimeException();
		} catch (OnOffException1 e) {
			// TODO: handle exception
			print("OnOffException1");
			sw.off();
		} catch (OnOffException2 e) {
			// TODO: handle exception
			print("OnOffException2");
			sw.off();
		}
	}

}
