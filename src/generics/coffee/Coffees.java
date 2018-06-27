package generics.coffee;

import java.util.ArrayList;

public class Coffees {

	public static final CoffeeCreator creator = new LiteralCoffeeCreator();
	
	public static Coffee randomCoffee() {
		return creator.randomCoffee();
	}
	
	public static Coffee[] createArray(int size) {
		return creator.createArray(size);
	}
	
	public static ArrayList<Coffee> arrayList(int size) {
		return creator.arrayList(size);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
