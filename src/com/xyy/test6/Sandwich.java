package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Meal {
	Meal() { print("Meal()"); }
}

class Bread {
	Bread() { print("Bread()"); }
}

class Cheese {
	Cheese() { print("Cheese()"); }
}

class Lettuce {
	Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal{ 
	Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { print("PortableLunch()"); }
}

class Pickle extends PortableLunch {
	Pickle() {
		// TODO Auto-generated constructor stub
		print("Pickle()");
	}
}

public class Sandwich extends Pickle {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private PortableLunch p = new PortableLunch();
	public Sandwich() { print("Sandwich()"); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sandwich();
	}

}
