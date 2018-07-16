package com.xyy.test11;

import java.io.PrintStream;
import java.util.Formatter;

public class Exercise1303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream outAlians = System.err;
		Turtle tommaso = new Turtle("Tommaso", new Formatter(System.err));
		Turtle tt = new Turtle("TT", new Formatter(System.err));
		tommaso.move(0, 0);
		tt.move(4, 8);
		tommaso.move(3, 4);
		tt.move(2, 5);
		tommaso.move(3, 3);
		tt.move(3, 3);
	}

}
