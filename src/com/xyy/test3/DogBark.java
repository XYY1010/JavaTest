package com.xyy.test3;

class Dog{
	public void bark(int i){
		System.out.println("Dog " + i + " : barking!");
	}
	public void bark(char c){
		System.out.println("Dog " + c + " : howling!");
	}
	public void bark(int i, char c){
		System.out.println("Dog " + i + " and Dog " + c);
	}
	public void bark(char c, int i){
		System.out.println("Dog " + c + " and Dog " + i);
	}
}

public class DogBark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog();
		spot.bark(1);
		spot.bark('a');
		spot.bark(1, 'a');
		spot.bark('a', 1);
	}

}
