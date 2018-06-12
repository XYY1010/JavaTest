package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Component1{
	public Component1() { print("Component1 Constructor."); }
	public void dispose() {
		print("Component1 dispose()");
	}
}

class Component2{
	public Component2() { print("Component2 Constructor."); }
	public void dispose() {
		print("Component2 dispose()");
	}
}

class Component3{
	public Component3() { print("Component3 Constructor."); }
	public void dispose() {
		print("Component3 dispose()");
	}
}

class Root{
	public Root() { print("Root Constructor."); }
	public void dispose() {
		print("Root dispose()");
	}
	Component1 component1 = new Component1();
	Component2 component2 = new Component2();
	Component3 component3 = new Component3();
}

class Stem extends Root{
	public Stem() { 
		print("Stem Constructor."); 
	}
	public void dispose() {
		print("Stem dispose()");
		super.dispose();
	}
	Component1 component1 = new Component1();
	Component2 component2 = new Component2();
	Component3 component3 = new Component3();
}

public class RootTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem stem = new Stem();
		try{
			
		}finally{
			stem.dispose();
		}
	}

}
