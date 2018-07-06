package com.xyy.test13;

import static com.xyy.tools.Print.*;

public class Exercise1530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder<Integer> holderi = new Holder<Integer>();
		int num = 4;
		holderi.set(num);
		print(holderi.get().getClass().getSimpleName());
		
		Holder<Float> holderf = new Holder<Float>();
		float f = 4.4f;
		holderf.set(f);
		print(holderf.get().getClass().getSimpleName());
	}

}
