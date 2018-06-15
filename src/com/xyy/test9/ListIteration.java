package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.List;
import java.util.ListIterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while (it.hasNext()) {
			print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + ";");
		}
		print(pets);
		it = pets.listIterator(3);
		while (it.hasNext()) {
			it.next();
			it.set(Pets.randomPet());
		}
		print(pets);
	}

}
