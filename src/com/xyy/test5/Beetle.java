package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		print(s);
		return 47;
	}
}

public class Beetle extends Insect {

	protected int k = printInit("Bettle.k initialized");
	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Beetle constructor");
		Beetle b = new Beetle();
	}

}
