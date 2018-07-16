package com.xyy.test14;

import com.xyy.tools.ConvertTo;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.Random;

class SkipGenerator implements Generator<java.lang.Integer> {
	private static Random rand = new Random();
	private int init;
	public SkipGenerator(int init) {
		// TODO Auto-generated constructor stub
		this.init = init;
	}
	
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return init += rand.nextInt(47);
	}
	
}

public class Exercise1616 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = ConvertTo.primitive(Generated.array(Integer.class, new SkipGenerator(11), 16));
		print("a = " + Arrays.toString(a));
	}

}
