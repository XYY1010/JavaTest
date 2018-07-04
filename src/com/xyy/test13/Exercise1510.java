package com.xyy.test13;

import static com.xyy.tools.Print.print;

public class Exercise1510 {
	
	public <T, U, String> void f(T x, U y, String s) {
		print(x.getClass().getSimpleName() + " " + y.getClass().getSimpleName() + " " + s.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1510 e = new Exercise1510();
		e.f(1, false, "ertyuiop");
	}

}
