package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

public class ListOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			li.add(i);
		}
		for (Integer integer : li) {
			System.out.print(integer + " ");
		}
	}

}
