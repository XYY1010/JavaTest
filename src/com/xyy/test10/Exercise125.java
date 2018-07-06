package com.xyy.test10;

import static com.xyy.tools.Print.*;

class ResumerException extends Exception {}

class Resumer {
	static int cnt = 3;
	static void f() throws ResumerException {
		if (--cnt > 0) {
			throw new ResumerException();
		}
	}
}

public class Exercise125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Resumer.f();
			} catch (Exception e) {
				// TODO: handle exception
				print("Caught" + e);
				continue;
			}
			print("Got through...");
			break;
		}
		print("Successful excution");
	}

}
