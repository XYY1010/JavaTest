package com.xyy.test9;

import static com.xyy.tools.Print.*;
import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
			// apples.add(new Orange());
		}
		for (int i = 0; i < apples.size(); i++) {
			print(apples.get(i).id());
		}
		for (Apple c : apples) {
			print(c.id());
		}
	}

}
