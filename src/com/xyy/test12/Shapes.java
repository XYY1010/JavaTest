package com.xyy.test12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

abstract class Shape {
	void draw() { System.out.println(this + ".draw()"); }
	void rotate() { System.out.println(this + ".rotate()"); }
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() { return "Circle"; }
}

class Square extends Shape {
	public String toString() { return "Square"; }
}

class Triangle extends Shape {
	public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
	public String toString() { return "Rhomboid"; }
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		for (Shape shape: shapes) {
			shape.draw();
		}
		((Rhomboid)shapes.get(3)).draw();
		// ((Circle)shapes.get(3)).draw();  // Cannot transform from Shape to Circle
		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				((Circle)shape).draw();
			}
			if (shape instanceof Square) {
				((Square)shape).draw();
			}
			if (shape instanceof Triangle) {
				((Triangle)shape).draw();
			}
			if (shape instanceof Rhomboid) {
				((Rhomboid)shape).draw();
			}
		}
		
		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				continue;
			}
			shape.rotate();
		}
	}

}
