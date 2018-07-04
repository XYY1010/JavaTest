package com.xyy.test10;

import static com.xyy.tools.Print.*;

class Shape {
	Shape(int i) { print("Shape constructor"); }
	void dispose() { print("Shape dispose"); }
}

class Circle extends Shape {

	Circle(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		print("Drawing Circle");
	}
	
	void dispose() {
		print("Erasing Circle");
		super.dispose();
	}
	
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		print("Drawing Triangle");
	}
	void dispose() {
		print("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end) {
		super(start);
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
		print("Drawing Line: " + start + ", " + end);
	}
	void dispose() {
		print("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}


public class Exercise1216 extends Shape {

	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	public Exercise1216(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j * j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		print("Combine constructor");
	}
	
	public void dispose() {
		print("CADSystem.dispose()");
		t.dispose();
		c.dispose();
		for (int i = 0; i < lines.length; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1216 exercise = new Exercise1216(47);
		try {
			return;
		} finally {
			exercise.dispose();
		}
	}

}
