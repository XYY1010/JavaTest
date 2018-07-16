package com.xyy.test13;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.List;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

public class Exercise1528 {

	static List<Dog> dogs = Arrays.asList(new Dog());
	static List<Pet> pets = Arrays.asList(new Pet());
	
	static class Generic1<T> {
		static <T> void f(List<T> list) {
			print(list.get(0).getClass().getSimpleName());		
		}
	}
	
	static class Generic2<T> {
		static <T> T readExact(List<T> list) {
			return list.get(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic1<Cat> gp = new Generic1<Cat>();
		Generic2<Dog> gd = new Generic2<Dog>();
		List<Pet> plist = Arrays.asList(new Pet());
		List<Dog> dlist = Arrays.asList(new Dog());
		gp.f(plist);
		Pet d = gd.readExact(dlist);
	}

}
