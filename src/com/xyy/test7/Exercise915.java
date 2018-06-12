package com.xyy.test7;

import static com.xyy.tools.Print.*;

abstract class CCat {
	void scream() {};
	void eat() {};
}

class Cat extends CCat {
	public void scream() {
		print("miaow~miaow~");
	}
	public void eat() {
		print("Cat eats fish");
	}
}

public class Exercise915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.eat();
		cat.scream();
	}

}
