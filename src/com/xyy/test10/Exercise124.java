package com.xyy.test10;

import static com.xyy.tools.Print.*;

class MyNewException extends Exception {
	private String myStr;
	public MyNewException(String msg) {
		super(msg);
		this.myStr = msg;
	}
}

public class Exercise124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyNewException("This is a MyNewExcepion Error!");
		} catch (MyNewException e) {
			// TODO: handle exception
			print(e);
		}
	}

}
