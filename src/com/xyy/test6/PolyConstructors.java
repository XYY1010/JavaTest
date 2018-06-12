package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Glyph {
	void draw() { print("Glyph.draw()"); }
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int width = 10;
	private int length = 20;
	RectangularGlyph(int width, int length) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
		print("RectangularGlyph.RectangularGlyph(), width = " + width + ", length = " + length);
	}
	void draw() {
		print("RectangularGlyph.draw, width = " + width + ", length = " + length);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
		new RectangularGlyph(5, 90);
	}

}
