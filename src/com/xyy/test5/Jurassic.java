package com.xyy.test5;

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

//! class Further extends Dinosaur {}
// Error: Cannot extend final class 'Dinosaur'

public class Jurassic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}

}
