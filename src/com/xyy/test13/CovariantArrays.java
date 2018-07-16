package com.xyy.test13;

class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] fruits = new Apple[10];
		fruits[0] = new Apple(); // OK
		fruits[1] = new Jonathan();	// OK
		// Runtime type is Apple[], not Fruit[] or Orange[]:
		try {
			// Compiler allows you to add Fruit:
			fruits[0] = new Fruit();	// ArrayStoreException
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			// Compiler allows you to add Oranges:
			fruits[0] = new Orange();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
