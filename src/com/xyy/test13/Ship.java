package com.xyy.test13;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Random;

import com.xyy.tools.Generator;

class Cargo {
	private final int id;
	private String description;
	private double weight;
	public Cargo(int IDnumber, String descr, double weight) {
		id = IDnumber;
		description = descr;
		this.weight = weight;
		print(toString());
	}
	public String toString() {
		return id + ": " + description + ", weight: " + weight + "t";
	}
	public void weightChange(double change) {
		weight += change;
	}
	public static Generator<Cargo> generator = new Generator<Cargo>() {
		private Random rand = new Random(47);
		public Cargo next() {
			return new Cargo(rand.nextInt(10000), "Steel", Math.round(rand.nextDouble() * 10000) + 0.99);
		}
	};
}

class Container extends ArrayList<Cargo> {
	public Container(int nCargo) {
		Generators.fill(this, Cargo.generator, nCargo);
	}
}

class Deck extends ArrayList<Container> {
	public Deck(int nContainer, int nCargo) {
		for (int i = 0; i < nContainer; i++) {
			add(new Container(nCargo));
		}
	}
}

class Port {}
class Dock {}

public class Ship extends ArrayList<Deck> {

	private ArrayList<Port> ports = new ArrayList<Port>();
	private Dock dock = new Dock();
	public Ship(int nDeck, int nContainer, int nCargo) {
		for (int i = 0; i < nDeck; i++) {
			add(new Deck(nContainer, nCargo));
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Deck d : this) {
			for (Container c : d) {
				for (Cargo cargo : c) {
					result.append(cargo);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Ship(3, 14, 200));
	}

}
