package com.xyy.test11;

import static com.xyy.tools.Print.*;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

class CContainer {
	private int i;
	private long l;
	private float f;
	private double d;
	private String s;
	public CContainer(String str) {
		Scanner input = new Scanner(str);
		this.i = input.nextInt();
		this.l = input.nextLong();
		this.f = input.nextFloat();
		this.d = input.nextDouble();
		this.s = input.next();
	}
	
	public String toString() {
		return "int: " + i + "\nlong: " + l + "\nfloat: " + f + "\ndouble: " + d + "\nString: " + s;
	}
}

public class Exercise1320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "11 123122312312433 1.12 1.234 shadshdas";
		CContainer c = new CContainer(str);
		print(c);
	}

}
