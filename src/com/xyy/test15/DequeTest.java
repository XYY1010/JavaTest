package com.xyy.test15;

import com.xyy.tools.Deque;
import static com.xyy.tools.Print.*;

public class DequeTest {
	static void fillTest(Deque<Integer> deque) {
		for (int i = 20; i < 27; i++) {
			deque.addFirst(i);
		}
		for (int i = 50; i < 55; i++) {
			deque.addLast(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> di = new Deque<Integer>();
		fillTest(di);
		print(di);
		while (di.size() != 0) {
			printnb(di.removeFirst() + " ");
		}
		print();
		fillTest(di);
		while (di.size() != 0) {
			printnb(di.removeLast() + " ");
		}
	}

}
