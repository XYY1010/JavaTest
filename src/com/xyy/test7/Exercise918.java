package com.xyy.test7;

import static com.xyy.tools.Print.*;

interface Cycle {
	void ride();
	int wheels();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void ride() {
		print("Unicycle.ride()");
	}
	public int wheels() { return 1; }
}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	public void ride() {
		print("Bicycle.ride()");
	}
	public int wheels() { return 2; }
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	public void ride() {
		print("Tricycle.ride()");
	}
	public int wheels() { return 3; }
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class Exercise918 {

	public static void rideCycle(CycleFactory cf) {
		Cycle c = cf.getCycle();
		c.ride();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}

}
