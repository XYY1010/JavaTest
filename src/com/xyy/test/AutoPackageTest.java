package com.xyy.test;

public class AutoPackageTest {
	private int i = 1;
	private float f = 1.1f;
	private double d = 1.11;
	private boolean b = false;
	private char c = 'a';
	private short s = 16;
	private byte bt = 2;
	private long l = 32;
	
	Integer I = i;
	Float F = f;
	Double D = d;
	Boolean B = b;
	Character C = c;
	Short S = s;
	Byte BT = bt;
	Long L = l;
	
	public void printRes(){
		System.out.println("i = "+i+", I = "+I);
		System.out.println("f = "+f+", F = "+F);
		System.out.println("d = "+d+", D = "+D);
		System.out.println("b = "+b+", B = "+B);
		System.out.println("c = "+c+", C = "+C);
		System.out.println("s = "+s+", S = "+S);
		System.out.println("bt = "+bt+", BT = "+BT);
		System.out.println("l = "+l+", L = "+L);
	}
}
