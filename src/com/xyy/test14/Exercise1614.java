package com.xyy.test14;

import com.xyy.tools.CountingGenerator;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;

public class Exercise1614 {

	public static <T> T[] fill(T[] a, Generator<T> gen) {
		for (int i = 0; i < a.length; i++) {
			a[i] = gen.next();
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = fill(new String[7], new CountingGenerator.String(5));
		for (String string : strings) {
			printnb(string + " ");
		}
		print();
		Boolean[] booleans = fill(new Boolean[7], new CountingGenerator.Boolean());
		for (Boolean b : booleans) {
			printnb(b + " ");
		}
		print();
		Byte[] bytes = fill(new Byte[7], new CountingGenerator.Byte());
		for (Byte b : bytes) {
			printnb(b + " ");
		}
		print();
		Short[] shorts = fill(new Short[7], new CountingGenerator.Short());
		for (Short s : shorts) {
			printnb(s + " ");
		}
		print();
		Integer[] integers = fill(new Integer[7], new CountingGenerator.Integer());
		for (Integer i : integers) {
			printnb(i + " ");
		}
		print();
		Long[] longs = fill(new Long[7], new CountingGenerator.Long());
		for (Long l : longs) {
			printnb(l + " ");
		}
		print();
		Float[] floats = fill(new Float[7], new CountingGenerator.Float());
		for (Float f : floats) {
			printnb(f + " ");
		}
		print();
		Double[] doubles = fill(new Double[7], new CountingGenerator.Double());
		for (Double d : doubles) {
			printnb(d + " ");
		}
	}

}
