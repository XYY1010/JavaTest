package com.xyy.test1;

public class Bitop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1 = 0xaaaa;
		int l2 = 0x5555;
		System.out.println(Integer.toBinaryString(l1));
		System.out.println(Integer.toBinaryString(l2));
		System.out.println(Integer.toBinaryString(l1 & l2));
		System.out.println(Integer.toBinaryString(l1 | l2));
		System.out.println(Integer.toBinaryString(l1 ^ l2));
		System.out.println(Integer.toBinaryString(~l2));
	}

}
