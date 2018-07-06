package com.xyy.test13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IllformedLocaleException;
import java.util.List;

import generics.coffee.Americano;
import generics.coffee.Coffee;
import generics.coffee.Latte;

public class Exercise1535 {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyLattes) {
		probablyLattes.add(new Americano());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Latte> lattes1 = new ArrayList<Latte>();
		oldStyleMethod(lattes1);
		List<Latte> lattes2 = Collections.checkedList(new ArrayList<Latte>(), Latte.class);
		try {
			oldStyleMethod(lattes2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		// Derived types work fine:
		List<Coffee> coffees = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
		coffees.add(new Latte());
		coffees.add(new Americano());
	}

}
