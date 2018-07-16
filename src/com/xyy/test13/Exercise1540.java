package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class Exercise1540 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Pet> pets = new ArrayList<Pet>();
		for (int i = 0; i < 10; i++) {
			pets.add(new Pet());
		}
		Apply.apply(pets, Pet.class.getMethod("speak"));
		Apply.apply(pets, Pet.class.getMethod("rename", String.class), "Light");
		List<Cat> cats = new ArrayList<Cat>();
		for (int i = 0; i < 10; i++) {
			cats.add(new Cat());
		}
		Apply.apply(cats, Cat.class.getMethod("speak"));
		Apply.apply(cats, Pet.class.getMethod("rename", String.class), "Coffee");
		Apply.apply(new FilledList<Pet>(Pet.class, 10), Pet.class.getMethod("speak"));
		Apply.apply(new FilledList<Pet>(Cat.class, 10), Pet.class.getMethod("speak"));
		
		SimpleQueue<Pet> petQ = new SimpleQueue<Pet>();
		for (int i = 0; i < 5; i++) {
			petQ.add(new Pet());
			petQ.add(new Cat());
		}
		Apply.apply(petQ, Pet.class.getMethod("speak"));
	}

}
