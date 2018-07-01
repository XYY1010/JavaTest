package com.xyy.test12;

import static com.xyy.tools.Print.*;

import com.xyy.tools.TypeCounter;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class PetCount4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCounter counter = new TypeCounter(Pet.class);
		for (Pet pet : Pets.createArray(20)) {
			printnb(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		print();
		print(counter);
	}

}
