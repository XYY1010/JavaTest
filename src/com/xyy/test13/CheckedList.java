package com.xyy.test13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

public class CheckedList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Cat());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> dogs1= new ArrayList<Dog>();
		oldStyleMethod(dogs1);
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
		try {
			oldStyleMethod(dogs2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		// Derived types work fine:
		List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}

}
