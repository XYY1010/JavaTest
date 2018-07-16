package com.xyy.test13;

import static com.xyy.tools.Print.*;
import static com.xyy.tools.Tuple.*;

public class Exercise1515 {

	static TwoTuple f2() {
		return tuple("A", 111);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple<String, Integer> ttsi = f2();
		print(ttsi);
	}

}
