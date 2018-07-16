package com.xyy.test12;

import static com.xyy.tools.Print.*;

import com.xyy.tools.TypeCounter;

import generics.coffee.Coffee;
import generics.coffee.Coffees;

public class Exercise1412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCounter counter = new TypeCounter(Coffee.class);
		for (Coffee coffee : Coffees.createArray(20)) {
			printnb(coffee.getClass().getSimpleName() + " ");
			counter.count(coffee);
		}
		print();
		print(counter);
	}

}
