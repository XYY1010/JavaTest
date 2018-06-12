package com.xyy.test5;

import static com.xyy.tools.Print.*;


public class Longhorned extends Beetle{
	private int l = printInit("Longhorned.l initialized");
	public Longhorned() {
		print("l = " + l);
		print("k = " + k);
		print("j = " + j);
	}
	private static int x3 = printInit("static Longhorned.x3 initialized");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			print("Longhorned constructor");
			Longhorned longhorned = new Longhorned();
	}

}
