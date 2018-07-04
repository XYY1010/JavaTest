package com.xyy.test13;

import com.xyy.tools.Generator;

public class BasicGeneratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for (int i = 0; i < 10; i++) {
			System.out.println(gen.next());
		}
		Generator<CountedObject> gen1 = new BasicGenerator(CountedObject.class);
		for (int i = 0; i < 10; i++) {
			System.out.println(gen1.next());
		}
	}

}
