package com.xyy.test13;

import static com.xyy.tools.Print.*;

import typeinfo.pets.Dog;

class PerformingDog extends Dog implements Performs {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		print("Woof!");
	}

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		print("Sitting");
	}
	public void reproduce() {}
	
}

class Robot implements Performs {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		print("Click!");
	}

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		print("Clank");
	}
	public void oilChange() {}
}

class Communicate {
	public static <T extends Performs> void perform(T performer) {
		performer.speak();
		performer.sit();
	}
}

public class DogsAndRobots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformingDog pd = new PerformingDog();
		Robot r = new Robot();
		Communicate.perform(pd);
		Communicate.perform(r);
	}

}
