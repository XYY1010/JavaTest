package com.xyy.test13;

import java.util.List;
import java.util.Map;

import com.xyy.tools.New;

import generics.coffee.Americano;
import generics.coffee.Coffee;
import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Person;

class TestNew3 {
	static void f(Map<Person, List<Cat>> catPeople) {}
}

class TestNew4 {
	static void f(Map<Person, List<Dog>> dogPeople) {}
}

class TestNew5 {
	static void f(Map<Coffee, List<Americano>> AmericanoCoffee) {}
}

public class Exercise1512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNew3.f(New.<Person, List<Cat>>map());
		TestNew4.f(New.<Person, List<Dog>>map());
		TestNew5.f(New.<Coffee, List<Americano>>map());
	}

}
