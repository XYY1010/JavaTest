package com.xyy.test10;

import static com.xyy.tools.Print.*;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class ThirdTestException extends Exception {
	public String toString() {
		return "A third test exception";
	}
}

public class LostMessage {
	
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	
	void clean() throws ThirdTestException {
		throw new ThirdTestException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} finally {
					lm.clean();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			print(e);
		}
	}

}
