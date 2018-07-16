package com.xyy.test14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import com.xyy.tools.Generator;

class BerylliumSphereGenerator implements Generator<BerylliumSphere>, Iterable<BerylliumSphere> {
	private static Random rand = new Random(47);
	public BerylliumSphereGenerator() {}
	private int size;
	public BerylliumSphereGenerator(int size) { this.size = size; }
	
	class BerylliumSphereIterator implements Iterator<BerylliumSphere> {
		int count = size;
		public boolean hasNext() { return count > 0; }
		public BerylliumSphere next() {
			count--;
			return BerylliumSphereGenerator.this.next();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	@Override
	public Iterator<BerylliumSphere> iterator() {
		// TODO Auto-generated method stub
		return new BerylliumSphereIterator();
	}
	@Override
	public BerylliumSphere next() {
		// TODO Auto-generated method stub
		try {
			return BerylliumSphere.class.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}

public class Exercise1615 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphereGenerator gen = new BerylliumSphereGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for (BerylliumSphere b : new BerylliumSphereGenerator(5)) {
			System.out.println(b);
		}
		BerylliumSphere[] b = Generated.array(BerylliumSphere.class, gen, 5);
		System.out.println(Arrays.toString(b));
	}

}
