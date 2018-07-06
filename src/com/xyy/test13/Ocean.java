package com.xyy.test13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.xyy.tools.Generator;

class BigFish {
	private static long counter = 1;
	private final long id = counter++;
	private BigFish() {}
	public String toString() {
		return "BigFish " + id;
	}
	public static Generator<BigFish> generator() {
		return new Generator<BigFish>() {
			public BigFish next() {
				return new BigFish();
			}
		};
	}
}

class LittleFish {
	private static long counter = 1;
	private final long id = counter++;
	private LittleFish() {}
	public String toString() {
		return "LittleFish " + id;
	}
	public static Generator<LittleFish> generator() {
		return new Generator<LittleFish>() {
			public LittleFish next() {
				return new LittleFish();
			}
		};
	}
}

public class Ocean {

	public static void eat(BigFish b, LittleFish l) {
		System.out.println(b + " eats " + l);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Set<LittleFish> littlefish = new HashSet<LittleFish>();
		Generators.fill(littlefish, LittleFish.generator(), 10);
		List<BigFish> bigfish = new ArrayList<BigFish>();
		Generators.fill(bigfish, BigFish.generator(), 3);
		for (LittleFish lf : littlefish) {
			eat(bigfish.get(rand.nextInt(bigfish.size())), lf);
		}
	}

}
