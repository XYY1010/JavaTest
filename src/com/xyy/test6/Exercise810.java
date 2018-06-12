package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Base {
	private int i = 0;
	private int j = 10;
	public void printFuc() { print("Base i + j = " + toString()); }
	public String toString() { return String.valueOf(i + j); }
}

class Derived extends Base{
	private int i = 100;
	private int j = 102;
	public void printFuc() { print("Derived i * j = " + toString()); }
	public String toString() { return String.valueOf(i * j); }
}

public class Exercise810 {

	public static void printMain(Base b){
		b.printFuc();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived derived = new Derived();
		printMain(derived);
	}

}
