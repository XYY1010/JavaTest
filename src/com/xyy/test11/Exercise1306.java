package com.xyy.test11;

import static com.xyy.tools.Print.*;

public class Exercise1306 {

	private int i;
	private long l;
	private float f;
	private double d;
	
	public String toString() {
		return String.format("i = %d, l = %d, f = %f, d = %f\n", i, l, f, d);
	}
	
	public Exercise1306(int i, long l, float f, double d) {
		this.i = i;
		this.l = l;
		this.f = f;
		this.d = d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1306 exercise = new Exercise1306(10, 10002, 1.1f, 2.2f);
		print(exercise.toString());
	}

}
