package com.xyy.test12;

import java.util.HashMap;
import java.util.List;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.ForNameCreator;
import typeinfo.pets.Gerbil;
import typeinfo.pets.Hamster;
import typeinfo.pets.Manx;
import typeinfo.pets.Mouse;
import typeinfo.pets.Mutt;
import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;
import typeinfo.pets.Pug;
import typeinfo.pets.Rat;
import typeinfo.pets.Rodent;

import static com.xyy.tools.Print.*;

public class PetCount {
	static class PetCountor extends HashMap<String, Integer> {
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null) {
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}
	
	public static void countPets(PetCreator creator) {
		PetCountor counter = new PetCountor();
		for (Pet pet : creator.createArray(20)) {
			printnb(pet.getClass().getSimpleName() + " ");
			if (pet instanceof Pet) {
				counter.count("Pet");
			}
			if (pet instanceof Dog) {
				counter.count("Dog");
			}
			if (pet instanceof Mutt) {
				counter.count("Mutt");
			}
			if (pet instanceof Pug) {
				counter.count("Pug");
			}
			if (pet instanceof Cat) {
				counter.count("Cat");
			}
			if (pet instanceof Manx) {
				counter.count("EgyptianMau");
			}
			if (pet instanceof Manx) {
				counter.count("Manx");
			}
			if (pet instanceof Manx) {
				counter.count("Cymric");
			}
			if (pet instanceof Rodent) {
				counter.count("Rodent");
			}
			if (pet instanceof Rat) {
				counter.count("Rat");
			}
			if (pet instanceof Mouse) {
				counter.count("Mouse");
			}
			if (pet instanceof Hamster) {
				counter.count("Hamster");
			}
			if (pet instanceof Gerbil) {
				counter.count("Gerbil");
			}
		}

		// Show the counts:
		print();
		print(counter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPets(new ForNameCreator());
	}

}
