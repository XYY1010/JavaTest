package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class WithFinally {

	static Switch sw = new Switch();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sw.on();
			OnOffSwitch.f();
			//throw new RuntimeException();
		} catch (OnOffException1 e) {
			// TODO: handle exception
			print("OnOffException1");
		} catch (OnOffException2 e) {
			// TODO: handle exception
			print("OnOffException2");
		} finally {
			sw.off();
		}
	}

}
