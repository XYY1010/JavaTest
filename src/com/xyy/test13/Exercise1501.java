package com.xyy.test13;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;
import static com.xyy.tools.Print.*;

public class Exercise1501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder3<Pet> a = new Holder3<Pet>(new Pet());
		Holder3<Pet> b = new Holder3<Pet>(new Cat());
		print(a.getClass().getSimpleName());
		print(b.getClass().getSimpleName());
		print(a.get().getClass().getSimpleName());
		print(a.get().getClass().getSimpleName());
	}

}
