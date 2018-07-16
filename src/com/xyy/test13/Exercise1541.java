package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

import static com.xyy.tools.Print.*;

import typeinfo.pets.Dog;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;

public class Exercise1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> carrier = new ArrayList<Pet>();
		Fill2.fill(new AddableCollectionAdapter<Pet>(carrier), Pet.class, 3);
		Fill2.fill(Adapter.collectionAdapter(carrier), Dog.class, 2);
		for (Pet pet : carrier) {
			print(pet);
		}
		print("--------------------");
		AddableSimpleQueue<Pet> petQueue = new AddableSimpleQueue<Pet>();
		Fill2.fill(petQueue, Pug.class, 4);
		Fill2.fill(petQueue, Dog.class, 1);
		for (Pet pet : carrier) {
			print(pet);
		}
	}

}
