package com.xyy.test13;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

// Doesn't work with "anything that has an add()." There is
// no "Addable" interface so we are narrowed to using a 
// Collection. We cannot generalize using generics in
// this case

class Fill {
	public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
		for (int i = 0; i < size; i++) {
			// Assumes default constructor:
			try {
				collection.add(classToken.newInstance());
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}
	}
}

class Contract {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getName() + " " + id;
	}
}

class TitleTransfer extends Contract {
	
}

public class FillTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, TitleTransfer.class, 2);
		for (Contract c : contracts) {
			System.out.println(c);
		}
		SimpleQueue<Contract> contractQueue = new SimpleQueue<Contract>();
		// Won't work. fill() is not generic enough:
		// Fill.fill(contractQueue, Contract.class, 3);
	}

}
