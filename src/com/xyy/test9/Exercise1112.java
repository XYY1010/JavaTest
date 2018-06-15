package com.xyy.test9;


import static com.xyy.tools.Print.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++) {
			list.add(i * 8);
		}
		
		List<Integer> listReverse = new ArrayList<Integer>(list);
		ListIterator<Integer> li1 = list.listIterator();
		ListIterator<Integer> li2 = listReverse.listIterator(list.size());
		while (li2.hasPrevious()) {
			int num = li1.next();
			li2.previous();
			li2.set(num);
		}
		print(list);
		print(listReverse);
	}

}
