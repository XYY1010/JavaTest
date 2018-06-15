package com.xyy.test9;

import java.util.LinkedList;
import java.util.ListIterator;

import static com.xyy.tools.Print.*;

public class Exercise1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			ListIterator<Integer> it = list.listIterator(list.size()/2);
			it.add(i*2);
			print(list);
		}
	}

}
