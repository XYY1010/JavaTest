package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.List;

interface Fruit { void name(); }

class Banana implements Fruit {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		print(this);
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}

class Peel<T extends Fruit> {
	public void f(T a) {
		print("Peeling " + a.toString());
	}
}

public class Exercise1609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Peel<Banana>>[] pbs = new ArrayList<Peel<Banana>>();
		
	}

}
