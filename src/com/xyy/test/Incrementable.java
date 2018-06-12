package com.xyy.test;

public class Incrementable {
	static void increment(){
		StaticTest.i++;
	}
	
	public int getI(){
		return StaticTest.i;
	}
}
