package com.xyy.test13;

import static com.xyy.tools.Print.*;

public class Exercise1506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomList<Integer> ri = new RandomList<Integer>();
		RandomList<Character> rc = new RandomList<Character>();
		for (int i = 0; i < 10; i++) {
			ri.add(i * 3);
		}
		for (char c : "qwertyuiopasdfghjkl".toCharArray()) {
			rc.add(c);
		}
		
		for (int i = 0; i < 20; i++) {
			printnb(ri.select() + " ");
			printnb(rc.select() + " ");
		}
		
	}

}
