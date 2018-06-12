package com.xyy.test5;

import static com.xyy.tools.Print.print;

class Component11{
	public Component11(int i) { print("Component11 Constructor"+ i + "."); }
}

class Component21{
	public Component21(int i) { print("Component21 Constructor" + i + "."); }
}

class Component31{
	public Component31(int i) { print("Component31 Constructor" + i + "."); }
}

class Root1{
	public Root1(int i) { print("Root1 Constructor" + i + "."); }
	Component11 component11 = new Component11(1);
	Component21 component21 = new Component21(11);
	Component31 component31 = new Component31(110);
}

class Stem1 extends Root1{
	public Stem1(int i) { 
		super(111);
		print("Stem1 Constructor" + i + "."); 
	}
}

public class RootTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem1 stem1 = new Stem1(1111);
	}

}
