package com.xyy.test12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


class Pet {
	public String toString() {
		return getClass().getSimpleName();
	}
		
	static List<Factory<? extends Pet>> petFactories = new ArrayList<Factory<? extends Pet>>();
	
	static {
		petFactories.add(new Cat.Factory());
		petFactories.add(new Dog.Factory());
		petFactories.add(new Rodent.Factory());
		petFactories.add(new Cymric.Factory());
		petFactories.add(new EgyptianMau.Factory());
		petFactories.add(new Hamster.Factory());
		petFactories.add(new Manx.Factory());
		petFactories.add(new Mutt.Factory());
		petFactories.add(new Mouse.Factory());
		petFactories.add(new Rat.Factory());
		petFactories.add(new Pug.Factory());
	}
	
	private static Random rand = new Random(47);
	public static Pet createRandom() {
		int n = rand.nextInt(petFactories.size());
		return petFactories.get(n).create();
	}
	
}

class Cat extends Pet {
	public static class Factory implements com.xyy.test12.Factory<Cat> {
		public Cat create() {
			return new Cat();
		}
	}
}

class Dog extends Pet {
	public static class Factory implements com.xyy.test12.Factory<Dog> {
		public Dog create() {
			return new Dog();
		}
	}
}

class Rodent extends Pet {
	public static class Factory implements com.xyy.test12.Factory<Rodent> {
		public Rodent create() {
			return new Rodent();
		}
	}
}

class Manx extends Cat {
	public static class Factory implements com.xyy.test12.Factory<Manx> {
		public Manx create() {
			return new Manx();
		}
	}
}

class EgyptianMau extends Cat {
	public static class Factory implements com.xyy.test12.Factory<EgyptianMau> {
		public EgyptianMau create() {
			return new EgyptianMau();
		}
	}
}

class Cymric extends Manx {
	public static class Factory implements com.xyy.test12.Factory<Cymric> {
		public Cymric create() {
			return new Cymric();
		}
	}
}

class Pug extends Dog {
	public static class Factory implements com.xyy.test12.Factory<Pug> {
		public Pug create() {
			return new Pug();
		}
	}
}

class Mutt extends Dog {
	public static class Factory implements com.xyy.test12.Factory<Mutt> {
		public Mutt create() {
			return new Mutt();
		}
	}
}

class Mouse extends Rodent {
	public static class Factory implements com.xyy.test12.Factory<Mouse> {
		public Mouse create() {
			return new Mouse();
		}
	}
}

class Hamster extends Rodent {
	public static class Factory implements com.xyy.test12.Factory<Hamster> {
		public Hamster create() {
			return new Hamster();
		}
	}
}

class Gerbil extends Rodent {
	public static class Factory implements com.xyy.test12.Factory<Gerbil> {
		public Gerbil create() {
			return new Gerbil();
		}
	}
}

class Rat extends Rodent {
	public static class Factory implements com.xyy.test12.Factory<Rat> {
		public Rat create() {
			return new Rat();
		}
	}
} 

public class PetCreator {
	
	public Pet randomPet() {
		return Pet.createRandom();
	}
	
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++) {
			result[i] = randomPet();
		}
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(Pet.createRandom());
		}
	}

}
