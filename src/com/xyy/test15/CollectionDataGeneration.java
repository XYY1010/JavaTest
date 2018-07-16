package com.xyy.test15;

import java.util.ArrayList;
import java.util.HashSet;

import com.xyy.tools.CollectionData;
import com.xyy.tools.RandomGenerator;

public class CollectionDataGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(), 10))); // Convenience method
		System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));
		
	}

}
