package com.xyy.test13;

import java.awt.Color;

interface HasColor { java.awt.Color getColor();}

class Colored<T extends HasColor> {
	T item;
	public Colored(T item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}
	T getItem() { return item; }
	// The bound allows you to call a method:
	java.awt.Color color() { return item.getColor(); }
}

class Dimension { public int x, y, z; }

// This won't work -- class must be first, then interfaces:
// class ColoredDimension<T extends HasColor & Dimension> {}

// Mutiple bounds:
class ColoredDimension<T extends Dimension & HasColor> {
	T item;
	public ColoredDimension(T item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color color() { return item.getColor(); }
	int getX() { return item.x; }
	int getY() { return item.y; }
	int getZ() { return item.z; }
}

interface Weight { int weight(); }

// As with inheritance, you can have only one
// concrete class but multiple interface:
class Solid<T extends Dimension & HasColor & Weight> {
	T item;
	public Solid(T item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color color() { return item.getColor(); }
	int getX() { return item.x; }
	int getY() { return item.y; }
	int getZ() { return item.z; }
	int weight() { return item.weight(); }
}

class Bounded extends Dimension implements HasColor, Weight {
	public java.awt.Color getColor() { return null; }
	public int weight() { return 0; }
}

public class BasicBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getX();
		solid.weight();
	}

}
