package com.xyy.test12;

import java.util.ArrayList;

import static com.xyy.tools.Print.*;

public class Pets {

	public static final PetCreator creator = new PetCreator();
	
	public static Pet randomPet() {
		return creator.randomPet();
	}
	
	public static Pet[] createArray(int size) {
		return creator.createArray(size);
	}
	
	public static ArrayList<Pet> arrayList(int size) {
		return creator.arrayList(size);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pets = arrayList(10);
		print(pets);
	}

}
