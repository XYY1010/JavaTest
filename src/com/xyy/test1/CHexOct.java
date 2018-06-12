package com.xyy.test1;

public class CHexOct {
	
	public static void main(String[] args){
		long l1 = 0x2f;
		long l2 = 0xff;
		System.out.println("l1: " + l1 + "; LongToBinary: " + Long.toBinaryString(l1));
		System.out.println("l2: " + l2 + "; LongToBinary: " + Long.toBinaryString(l2));
		long l3 = 017;
		long l4 = 052;
		System.out.println("l3: " + l3 + "; LongToBinary: " + Long.toBinaryString(l3));
		System.out.println("l4: " + l4 + "; LongToBinary: " + Long.toBinaryString(l4));
	}
	
}
