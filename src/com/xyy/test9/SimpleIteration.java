package com.xyy.test9;

import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.xyy.tools.Print.*;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class SimpleIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			printnb(p.id() + ":" + p + " ");
		}
		print();
		for (Pet p : pets) {
			printnb(p.id() + ":" + p + " ");
		}
		print();
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		print(pets);
	}

}
