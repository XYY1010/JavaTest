package com.xyy.test13;

import static com.xyy.tools.Print.*;

interface FactoryIP<T> {
	T create(int i);
}

class Foo2P<T> {
	private T x;
	public <F extends FactoryIP<T>> Foo2P(F factory) {
		x = factory.create(47);
		print("Foo2P.create(47)");
	}
}

class IntegerFactoryP implements FactoryIP<Integer> {
	public Integer create(int i) {
		print("IntegerFactoryP.create("+ i +")");
		return new Integer(i);
	}
}

class WidgetP {
	public static class FactoryP implements FactoryIP<WidgetP> {
		public WidgetP create(int i) {
			print("WidgetP.create(" + i + ")");
			return new WidgetP();
		}
	}
}

public class Exercise1523 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Foo2P<Integer>(new IntegerFactoryP());
		new Foo2P<WidgetP>(new WidgetP.FactoryP());
	}

}
