package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Base1{
	Base1(String str){ print("Base1 Constructor" + str); }
}

class Derived extends Base1{
	Derived() { super(" str"); }
	Derived(String str){
		super(str);
	}
}

public class Detergent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived derived = new Derived();
		new Derived(" superman");
	}

}
