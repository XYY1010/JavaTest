package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Cycle1 {
	public void ride() {
		print("Cycle1.ride()");
	}
	public int wheels() {
		return 4;
	}
}

class Unicycle1 extends Cycle1 {
	public void ride() {
		print("Unicycle1.ride()");
	}
	public int wheels() {
		return 1;
	}
	public void balance() { print("Unicycle1.balance()"); }
}

class Bicycle1 extends Cycle1 {
	public void ride() {
		print("Bicycle1.ride()");
	}
	public int wheels() {
		return 2;
	}
	public void balance() { print("Bicycle1.balance()"); }
}

class Tricycle1 extends Cycle1 {
	public void ride() {
		print("Tricycle1.ride()");
	}
	public int wheels() {
		return 3;
	}
}

public class Exercise817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle1[] cycles = new Cycle1[] {
				new Unicycle1(), new Bicycle1(),
				new Tricycle1()
		};
		//cycles[0].balance();	//基类无此方法，向上转型失败
		//cycles[1].balance();
		//cycles[2].balance();
		((Unicycle1)cycles[0]).balance();	//向下转型
		((Bicycle1)cycles[1]).balance();
		//((Tricycle1)cycles[0]).balance();	//向下转型无此方法
	}

}
