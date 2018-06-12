package com.xyy.test7;

import static com.xyy.tools.Print.print;

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

interface FastFood {
	void printFuc();
}

public class Sandwich extends Pickle implements FastFood {

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private PortableLunch p = new PortableLunch();
	public Sandwich() { print("Sandwich()"); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich s = new Sandwich();
		s.printFuc();
	}

	@Override
	public void printFuc() {
		// TODO Auto-generated method stub
		print("All above are FastFood which do harm to your health.");
	}

}
