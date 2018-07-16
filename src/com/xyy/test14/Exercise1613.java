package com.xyy.test14;

import com.xyy.tools.CountingGenerator;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;

public class Exercise1613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 20;
		String s;
		char[] buf;
		Generator<java.lang.Character> cg = new CountingGenerator.Character();
		buf = new char[length];
		for (int i = 0; i < length; i++) {
			buf[i] = cg.next();
		}
		s = new String(buf);
		print(s);
		
	}

}
