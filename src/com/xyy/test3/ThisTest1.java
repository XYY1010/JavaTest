package com.xyy.test3;

class TestThis{
	
	int i = 0;
	String s = "";
	
	TestThis(int i, String s){
		this(i);
		this.s = s;
		System.out.println(i + " : " + s);
	}
	
	TestThis(int i){
		i = 5;
	}
}

public class ThisTest1 {
	
	public static void main(String[] args){
		TestThis test = new TestThis(2, "string");
	}
}
