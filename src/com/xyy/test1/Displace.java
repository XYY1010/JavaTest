package com.xyy.test1;

class CharToBinary{
	public static String toBinaryString(char c){
		return Integer.toBinaryString((int) c);
	}
}

public class Displace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0xaaaaaaaa;
		System.out.println(Integer.toBinaryString(i));
		for(int a = 0; a<32; a++){
			i>>=1;
			System.out.println(Integer.toBinaryString(i));
		}
		
		int j = 0xffffffff;
		System.out.println(Integer.toBinaryString(j));
		j<<=1;
		System.out.println(Integer.toBinaryString(j));
		for(int a = 0; a < 32; a++){
			j>>>=1;
			System.out.println(Integer.toBinaryString(j));
		}
		
		char c1 = 'a';
		char c2 = '@';
		char c3 = '+';
		System.out.println("c1 = " + CharToBinary.toBinaryString(c1));
		System.out.println("c2 = " + CharToBinary.toBinaryString(c2));
		System.out.println("c3 = " + CharToBinary.toBinaryString(c3));
	}

	
}
