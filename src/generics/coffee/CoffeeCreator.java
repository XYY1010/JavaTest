package generics.coffee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class CoffeeCreator {

	private Random rand = new Random(47);
	public abstract List<Class<? extends Coffee>> types();
	
	public Coffee randomCoffee() {
		int n = rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	public Coffee[] createArray(int size) {
		Coffee[] result = new Coffee[size];
		for (int i = 0; i < size; i++) {
			result[i] = randomCoffee();
		}
		return result;
	}
	
	public ArrayList<Coffee> arrayList(int size) {
		ArrayList<Coffee> result = new ArrayList<Coffee>(size);
		Collections.addAll(result, createArray(size));
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
