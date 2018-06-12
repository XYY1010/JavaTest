package com.xyy.test1;

public class URShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		long l = -1;
		System.out.println(Long.toBinaryString(l));
		l>>>=10;
		System.out.println(Long.toBinaryString(l));
		short s = -1;
		System.out.println(Integer.toBinaryString(s));
		s>>>=10;
		System.out.println(Integer.toBinaryString(s));
		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		i = 100;
		System.out.println(Integer.toBinaryString(i));
		
	}

}
