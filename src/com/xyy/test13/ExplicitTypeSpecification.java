package com.xyy.test13;

import java.util.List;
import java.util.Map;

import com.xyy.tools.New;

import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class ExplicitTypeSpecification {

	static void f(Map<Person, List<Pet>> petPeople) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(New.<Person, List<Pet>>map());
	}

}
