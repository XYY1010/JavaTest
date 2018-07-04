package com.xyy.test12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Coffee {
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Factory<? extends Coffee>> coffeeFactories = new ArrayList<Factory<? extends Coffee>>();
	
	static {
		coffeeFactories.add(new Americano.Factory());
		coffeeFactories.add(new Breve.Factory());
		coffeeFactories.add(new Cappuccino.Factory());
		coffeeFactories.add(new Latte.Factory());
		coffeeFactories.add(new Mocha.Factory());
	}
	
	private static Random rand = new Random();
	public static Coffee createRandom() {
		int n = rand.nextInt(coffeeFactories.size());
		return coffeeFactories.get(n).create();
	}
}

class Americano extends Coffee {
	public static class Factory implements com.xyy.test12.Factory<Americano> {
		public Americano create() {
			return new Americano();
		}
	}
}

class Breve extends Coffee {
	public static class Factory implements com.xyy.test12.Factory<Breve> {
		public Breve create() {
			return new Breve();
		}
	}
}

class Cappuccino extends Coffee {
	public static class Factory implements com.xyy.test12.Factory<Cappuccino> {
		public Cappuccino create() {
			return new Cappuccino();
		}
	}
}

class Latte extends Coffee {
	public static class Factory implements com.xyy.test12.Factory<Latte> {
		public Latte create() {
			return new Latte();
		}
	}
}

class Mocha extends Coffee {
	public static class Factory implements com.xyy.test12.Factory<Mocha> {
		public Mocha create() {
			return new Mocha();
		}
	}
}

public class Exercise1416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(Coffee.createRandom());
		}
	}

}
