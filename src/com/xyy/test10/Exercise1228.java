package com.xyy.test10;

class MyNewRuntimeException extends RuntimeException {
	private String myStr;
	public MyNewRuntimeException(String msg) {
		super(msg);
		this.myStr = msg;
	}
}

public class Exercise1228 {

	public static void main(String[] args) throws RuntimeException {
		// TODO Auto-generated method stub
		MyNewRuntimeException m = new MyNewRuntimeException("MyNewRuntimeException");
	}

}
