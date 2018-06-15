package com.xyy.test9;

import static com.xyy.tools.Print.*;
import java.util.Iterator;
import java.util.Random;

class RandomShapeGenerator implements Iterable<Shape> {

	private int len;
	private Random rand = new Random(47);
	public RandomShapeGenerator(int len) {
		// TODO Auto-generated constructor stub
		this.len = len;
	}
	
	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Shape>() {
			private int index = 0;
			@Override
			public Shape next() {
				// TODO Auto-generated method stub
				index++;
				switch(rand.nextInt(3)) {
			      default:
			      case 0: return new Circle();
			      case 1: return new Square();
			      case 2: return new Triangle();
			    }
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < len;
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
}

class Circle extends Shape {
	  public void draw() { print("Circle.draw()"); }
	  public void erase() { print("Circle.erase()"); }
}

class Square extends Shape {
	  public void draw() { print("Square.draw()"); }
	  public void erase() { print("Square.erase()"); }
}

class Triangle extends Shape {
	  public void draw() { print("Triangle.draw()"); }
	  public void erase() { print("Triangle.erase()"); }
}

public class Exercise1131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Shape s : new RandomShapeGenerator(10)) {
			s.draw();
			s.erase();
		}
	}

}
