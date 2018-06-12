package com.xyy.test6;

import static com.xyy.tools.Print.*;

import java.util.Random;

class Shape {
	public void draw() {}
	public void erase() {}
	public void printFuc() {
		print("Shape.Print()");
	}
}

class Circle extends Shape {
	@Override
	public void draw() { print("Circle.draw()"); }
	@Override
	public void erase() { print("Circle.erase()"); }
	@Override
	public void printFuc() {
		print("Circle.Print()");
	}
} 

class Square extends Shape {
	@Override
	public void draw() { print("Square.draw()"); }
	@Override
	public void erase() { print("Square.erase()"); }
	@Override
	public void printFuc() {
		print("Square.Print()");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() { print("Triangle.draw()"); }
	@Override
	public void erase() { print("Triangle.erase()"); }
	@Override
	public void printFuc() {
		print("Triangle.Print()");
	}
}

class Diamond extends Shape {
	public void draw() { print("Diamond.draw()"); }
	public void erase() { print("Diamond.erase()"); }
	public void printFuc() { print("Diamond.printFuc"); }
}

class RandomShapeGenerator{
	private Random rand = new Random(47);
	public Shape next() {
		switch(rand.nextInt(4)){
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
			case 3:
				return new Diamond();
		}
	}
}

public class Shapes {

	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[16];
		for (int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		for (Shape shp : s){
			shp.draw();
		}
	}

}
