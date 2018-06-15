package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

	public static void printQ(Queue q) {
		while(q.peek() != null) {
			printnb(q.remove() + " ");
		}
		print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "Brontosaurus".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}

}
