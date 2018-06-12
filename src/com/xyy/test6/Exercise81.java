package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Cycle {
	public void ride() {
		print("Cycle.ride()");
	}
	public int wheels() {
		return 4;
	}
}

class Unicycle extends Cycle {
	public void ride() {
		print("Unicycle.ride()");
	}
	public int wheels() {
		return 1;
	}
}

class Bicycle extends Cycle {
	public void ride() {
		print("Bicycle.ride()");
	}
	public int wheels() {
		return 2;
	}
}

class Tricycle extends Cycle {
	public void ride() {
		print("Tricycle.ride()");
	}
	public int wheels() {
		return 3;
	}
}

public class Exercise81 {

	public static void ride(Cycle i) {
		i.ride();
		print(i.wheels());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle unicycle = new Unicycle();
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
		ride(unicycle);
		ride(bicycle);
		ride(tricycle);
	}

}
