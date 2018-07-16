package com.xyy.test14;

import java.util.Arrays;

import com.xyy.tools.ConvertTo;
import com.xyy.tools.CountingGenerator;

public class PrimitiveConversionDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
		int[] b = ConvertTo.primitive(a);
		System.out.println(Arrays.toString(b));
		boolean[] c = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), 7));
		System.out.println(Arrays.toString(c));
	}

}
