package com.xyy.test14;

import static com.xyy.tools.Print.*;

class CTest {
	private int num;
	public CTest(int num) { this.num = num; }
	public static boolean equals(CTest[] c1, CTest[] c2) {
		if (c1.length != c2.length) {
			return false;
		}
		for (int i = 0; i < c1.length; i++) {
			if (c1[i].num != c2[i].num) {
				return false;
			}
		}
		return true;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		return "CTest " + num;
	}
}

public class Exercise1619 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest[] c1 = new CTest[5];
		CTest[] c3 = new CTest[5];
		for (int i = 0; i < c1.length; i++) {
			c1[i] = new CTest(5);
			c3[i] = new CTest(6);
		}
		CTest[] c2 = new CTest[7];
		for (int i = 0; i < c2.length; i++) {
			c2[i] = new CTest(5);
		}
		print(CTest.equals(c1, c2));
		print(CTest.equals(c1, c3));
	}

}
