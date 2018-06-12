package com.xyy.test7;

import java.util.Random;

public class RandomDoubles {
	
	private static Random rand = new Random(47);
	public double next() { return rand.nextDouble(); }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.print(rd.next() + " ");
		}
	}

}
