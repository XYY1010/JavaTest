package com.xyy.test11;

import java.util.ArrayList;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

public class ArrayListDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		for(Coffee c : new CoffeeGenerator(10)) {
			coffees.add(c);
		}
		System.out.println(coffees);
	}

}
