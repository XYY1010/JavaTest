package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.PriorityQueue;
import java.util.Random;

public class Exercise1128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		PriorityQueue<Double> doublePQ = new PriorityQueue<Double>();
		for (int i = 0; i < 20; i++) {
			doublePQ.offer(rand.nextDouble() + 13);
		}
		for (int i = 0; i < 20; i++) {
			print(doublePQ.remove());
		}
	}

}
