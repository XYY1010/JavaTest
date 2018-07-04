package com.xyy.test10;

import static com.xyy.tools.Print.*;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0: throw new FileNotFoundException();
			case 1: throw new IOException();
			case 2: throw new RuntimeException("Where am I");
			default:
				return;
			}	
		} catch (Exception e) {	// Adapt to unchecked:
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception {}

public class TurnOffChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeExceptions() without a try
		// block, and let RuntimeExceptions leave the method:
		wce.throwRuntimeException(3);
		// Or you can choose to catch exceptions:
		for (int i = 0; i < 4; i++) {
			try {
				if (i < 3) {
					wce.throwRuntimeException(i);
				} else {
					throw new SomeOtherException();
				}
			} catch (SomeOtherException e) {
				// TODO: handle exception
				print("SomeOtherException: " + e);
			} catch (RuntimeException re) {
				// TODO: handle exception
				try {
					throw re.getCause();
				} catch (FileNotFoundException e) {
					// TODO: handle exception
					print("FileNotFoundException: " + e);
				} catch (IOException e) {
					// TODO: handle exception
					print("IOException: " + e);
				} catch (Throwable e) {
					// TODO: handle exception
					print("Throwable: " + e);
				}
			}
		}
	}

}
